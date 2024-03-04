package sample.camel.routes.service2;

import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;
import org.apache.camel.builder.RouteBuilder;

@Component
public class ResponseRestRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        restConfiguration().component("servlet").bindingMode(RestBindingMode.json);

        // Маршрут для второго REST сервиса
        rest("/service2")
                .get("/{guid}")
                .routeId("2 service")
                .to("direct:validateGuid");

    }

}
