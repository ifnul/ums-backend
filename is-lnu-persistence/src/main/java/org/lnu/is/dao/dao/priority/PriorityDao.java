package org.lnu.is.dao.dao.priority;

import org.lnu.is.dao.persistence.PersistenceManager;
import org.lnu.is.domain.priority.PriorityStat;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class PriorityDao {

    @PersistenceContext
    private EntityManager entityManager;

    private PersistenceManager<PriorityStat, Integer> persistenceManager;

    public List<PriorityStat> getPriorityStat() {
        TypedQuery<PriorityStat> query = entityManager.createQuery("SELECT NEW org.lnu.is.domain.priority.PriorityStat(e.priority, COUNT(e)) FROM Enrolment e GROUP BY e.priority", PriorityStat.class);
        return query.getResultList();
    }
}
