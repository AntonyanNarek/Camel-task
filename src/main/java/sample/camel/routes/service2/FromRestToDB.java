package sample.camel.routes.service2;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sample.camel.processors.GetSessionDateProcessor;
import sample.camel.processors.SessionSelectProcessor;
import sample.camel.processors.TrainSelectProcessor;

@Component
public class FromRestToDB extends RouteBuilder {

    private final SessionSelectProcessor sessionSelectProcessor;
    private final TrainSelectProcessor trainSelectProcessor;

    private final GetSessionDateProcessor getSessionDateProcessor;

    @Autowired
    public FromRestToDB(SessionSelectProcessor sessionSelectProcessor, TrainSelectProcessor trainSelectProcessor, GetSessionDateProcessor getSessionDateProcessor) {
        this.sessionSelectProcessor = sessionSelectProcessor;
        this.trainSelectProcessor = trainSelectProcessor;
        this.getSessionDateProcessor = getSessionDateProcessor;
    }

    @Override
    public void configure() throws Exception {

        // Валидация GUID и запросы к БД
        from("direct:validateGuid")
                .routeId("validateGuid")
                .process(sessionSelectProcessor)
                .to("log:result")
                .log(body().toString())
                .process(getSessionDateProcessor)
                .choice()
                .when(body().isNotNull())
                .log(body().toString())
                .process(trainSelectProcessor)
                .to("log:result")
                .otherwise()
                .setBody(constant("No session found for provided GUID"))
                .end()
                .log(body().toString())
                .to("direct:processData");

    }

}
