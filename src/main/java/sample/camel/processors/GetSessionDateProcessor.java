package sample.camel.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;
import sample.camel.dto.RequestOuterClass;
import sample.camel.dto.Session;

import java.sql.Timestamp;
import java.util.List;

@Component
public class GetSessionDateProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        List<Session> sessions = exchange.getIn().getBody(List.class);
        if (!sessions.isEmpty()) {
            Session session = sessions.get(0);
            Timestamp date = session.getDate();
            exchange.getIn().setBody(date);
            System.out.println(date);
        } else {
            exchange.getIn().setBody(null);
        }
    }
}