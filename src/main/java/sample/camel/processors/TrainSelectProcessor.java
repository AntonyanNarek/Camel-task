package sample.camel.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;
import sample.camel.dto.Train;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Component
public class TrainSelectProcessor implements Processor {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void process(Exchange exchange) throws Exception {
        Timestamp date = exchange.getIn().getBody(Timestamp.class);
        List<?> result = entityManager.createQuery("SELECT t FROM Train t WHERE t.dt_start > :dtStart ORDER BY t.dt_start", Train.class)
                .setParameter("dtStart", date)
                .getResultList();
        exchange.getIn().setBody(result);
    }
}
