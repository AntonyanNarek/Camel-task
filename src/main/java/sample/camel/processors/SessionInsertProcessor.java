package sample.camel.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;
import sample.camel.dto.RequestOuterClass;
import sample.camel.dto.Session;

import java.sql.Timestamp;

@Component
public class SessionInsertProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        RequestOuterClass.Request requestInfo = exchange.getIn().getBody(RequestOuterClass.Request.class);
        Session session = new Session();
        session.setGuid(requestInfo.getGuid());
        session.setDate(Timestamp.valueOf(requestInfo.getRequestTime()));
        session.setName(requestInfo.getRequestData());
        exchange.getIn().setBody(session);
    }
}
