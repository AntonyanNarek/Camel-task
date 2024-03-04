package sample.camel.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;
import sample.camel.dto.Session;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class SessionSelectProcessor implements Processor {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void process(Exchange exchange) throws Exception {
        String guid = exchange.getIn().getHeader("guid", String.class);
        List<?> result = entityManager.createQuery("select s from Session s where s.guid = :guid", Session.class)
                .setParameter("guid", guid)
                .getResultList();
        exchange.getIn().setBody(result);
    }
}
