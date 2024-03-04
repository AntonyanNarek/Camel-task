package sample.camel.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;
import sample.camel.dto.Request;
import sample.camel.dto.RequestOuterClass;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@Component
public class BuildRequestInfoProcessor implements Processor {


    @Override
    public void process(Exchange exchange) throws Exception {
        String clientIp = exchange.getIn().getHeader(Exchange.HTTP_SERVLET_REQUEST, HttpServletRequest.class).getRemoteAddr();
        String guid = UUID.randomUUID().toString();
        exchange.getIn().setHeader("guid", guid);
        Request requestData = exchange.getIn().getBody(Request.class); // Извлечение даты из запроса

        // Создание объекта protobuf
        RequestOuterClass.Request requestInfo = RequestOuterClass.Request.newBuilder()
                .setClientIp(clientIp)
                .setRequestTime(requestData.getDate())
                .setGuid(guid)
                .setRequestData(requestData.getName())
                .build();

        exchange.getIn().setBody(requestInfo);
    }

}
