package sample.camel.routes.service1;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;
import sample.camel.dto.Request;
/**
 * A Camel route that calls the REST service using a timer
 * <p/>
 * Use <tt>@Component</tt> to make Camel auto detect this route when starting.
 */
@Component
public class RequestRestRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		restConfiguration().component("servlet").bindingMode(RestBindingMode.json);
		
		rest()
				.path("/service1")
				.consumes("application/json")
				.post("/post")
				.type(Request.class)
				.routeId("1 service")
				.to("direct:processRequest");

	}
}
