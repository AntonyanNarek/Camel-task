package sample.camel.routes.service1;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.ProtobufDataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sample.camel.processors.SessionInsertProcessor;

/**
 * A Camel route that calls the REST service using a timer
 * <p/>
 * Use <tt>@Component</tt> to make Camel auto detect this route when starting.
 */
@Component
public class FromKafkaToDB extends RouteBuilder {

	private final SessionInsertProcessor sessionInsertProcessor;

	@Autowired
	public FromKafkaToDB(SessionInsertProcessor sessionInsertProcessor) {
		this.sessionInsertProcessor = sessionInsertProcessor;
	}

	@Override
	public void configure() throws Exception {
		ProtobufDataFormat protobufFormat = new ProtobufDataFormat("sample.camel.dto.RequestOuterClass$Request");

		from("kafka:test_topic?brokers=localhost:9092")
				.unmarshal(protobufFormat)
				.process(sessionInsertProcessor)
				.to("jpa:sample.camel.dto.SessionEntity");
		}

}
