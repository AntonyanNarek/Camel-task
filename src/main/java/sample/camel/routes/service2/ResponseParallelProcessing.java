package sample.camel.routes.service2;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import sample.camel.dto.Train;

@Component
public class ResponseParallelProcessing extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("direct:processData")
                .routeId("processDataRoute")
                .split(body())
                .streaming()
                .parallelProcessing()
                .threads(5)
                .process(exchange -> {
                    Train train = exchange.getIn().getBody(Train.class);
                    train.setTrain_name(train.getTrain_name().toUpperCase());
                    exchange.getIn().setBody(train);
                });

    }

}
