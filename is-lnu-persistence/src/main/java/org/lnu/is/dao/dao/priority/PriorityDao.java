package org.lnu.is.dao.dao.priority;

import org.lnu.is.dao.utils.DaoUtils;
import org.lnu.is.domain.priority.PriorityStat;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PriorityDao {

    private static final String TIME_PERIOD_ID_PLACEHOLDER = "$$TIME_PERIOD_ID$$";

    @PersistenceContext
    private EntityManager entityManager;

    public List<PriorityStat> getPriorityStat(long timePeriodId) {
        String sql = DaoUtils.getQuery("priority_stat.sql").replace(TIME_PERIOD_ID_PLACEHOLDER, String.valueOf(timePeriodId));
        List<Object[]> destinationEntries = entityManager.createNativeQuery(sql).getResultList();

        return destinationEntries.stream()
                .map(arr -> new PriorityStat(arr[0] != null ? Integer.parseInt(arr[0].toString()) : 0,
                        arr[1] != null ? Long.parseLong(arr[1].toString()) : 0))
                .collect(Collectors.toList());
    }
}
