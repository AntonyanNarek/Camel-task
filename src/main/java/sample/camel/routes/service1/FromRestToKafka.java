package sample.camel.routes.service1;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.ProtobufDataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sample.camel.processors.BuildRequestInfoProcessor;

/**
 * A Camel route that calls the REST service using a timer
 * <p/>
 * Use <tt>@Component</tt> to make Camel auto detect this route when starting.
 */
@Component
public class FromRestToKafka extends RouteBuilder {

	private final BuildRequestInfoProcessor buildRequestInfoProcessor;

	@Autowired
	public FromRestToKafka(BuildRequestInfoProcessor buildRequestInfoProcessor) {
		this.buildRequestInfoProcessor = buildRequestInfoProcessor;
	}

	@Override
	public void configure() throws Exception {
		ProtobufDataFormat protobufFormat = new ProtobufDataFormat("sample.camel.dto.RequestOuterClass$Request");

		// Обработка запроса и отправка в Kafka
		from("direct:processRequest")
				.routeId("toKafka")
				.log(body().toString())
				.process(buildRequestInfoProcessor)
				.marshal(protobufFormat) // Сериализация данных в формат protobuf
				.to("kafka:test_topic?brokers=localhost:9092")
				.process(exchange -> {
					// Получение и возвращение GUID запроса
					exchange.getIn().setBody(exchange.getIn().getHeader("guid"));
				});
		}

}
