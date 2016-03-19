package org.lnu.is.dao.dao.allocation;

import com.lambdista.util.Try;
import org.apache.commons.io.IOUtils;
import org.lnu.is.domain.department.DepartmentEntrantAllocation;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DepartmentEntrantAllocationDao {
    private static final String TIME_PERIOD_ID_PLACEHOLDER = "$$TIME_PERIOD_ID$$";

    @PersistenceContext
    private EntityManager entityManager;

    public List<DepartmentEntrantAllocation> getDepartmentsAllocations(long timePeriodId) {
        String queryTemplate = Try.apply(() ->
                IOUtils.toString(this.getClass().getResourceAsStream("/queries/department_allocation.sql"), "UTF-8")).get();
        String sql = queryTemplate
                .replace(TIME_PERIOD_ID_PLACEHOLDER, String.valueOf(timePeriodId));

        Query query = entityManager.createNativeQuery(sql);
        List<Object[]> result = query.getResultList();
        return result.stream()
                .map(arr -> new DepartmentEntrantAllocation(arr[3].toString(),
                        Long.valueOf(arr[4].toString()),
                        Integer.valueOf(arr[0].toString()),
                        Integer.valueOf(arr[2].toString()),
                        Integer.valueOf(arr[1].toString())))
                .collect(Collectors.toList());
    }
}
