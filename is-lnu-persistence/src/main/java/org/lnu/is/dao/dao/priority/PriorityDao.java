package org.lnu.is.dao.dao.priority;

import com.lambdista.util.Try;
import org.apache.commons.io.IOUtils;
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
        String queryTemplate = Try.apply(() ->
                IOUtils.toString(this.getClass().getResourceAsStream("/queries/priority_stat.sql"), "UTF-8")).get();
        String sql = queryTemplate.replace(TIME_PERIOD_ID_PLACEHOLDER, String.valueOf(timePeriodId));
        List<Object[]> destinationEntries = entityManager.createNativeQuery(sql).getResultList();

        return destinationEntries.stream()
                .map(arr -> new PriorityStat(arr[0] != null ? Integer.parseInt(arr[0].toString()) : 0,
                        arr[1] != null ? Long.parseLong(arr[1].toString()) : 0))
                .collect(Collectors.toList());
    }
}
