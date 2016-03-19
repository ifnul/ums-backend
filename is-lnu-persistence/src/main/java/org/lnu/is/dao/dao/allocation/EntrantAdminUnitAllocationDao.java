package org.lnu.is.dao.dao.allocation;

import org.lnu.is.dao.utils.DaoUtils;
import org.lnu.is.domain.admin.unit.AdminUnitEntrantAllocation;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @since 3/10/16
 */
@Repository
public class EntrantAdminUnitAllocationDao {
    private static final String TIME_PERIOD_ID_PLACEHOLDER = "$$TIME_PERIOD_ID$$";
    private static final String MAIN_ADMIN_UNIT_ID_PLACEHOLDER = "$$MAIN_ADMIN_UNIT_ID$$";

    @PersistenceContext
    private EntityManager entityManager;

    public List<AdminUnitEntrantAllocation> getAdminUnitEntrantsAllocation(long mainAdminUnitId, long timePeriodId) {
        String sql = DaoUtils.getQuery("admin_unit_allocation.sql")
                .replace(TIME_PERIOD_ID_PLACEHOLDER, String.valueOf(timePeriodId))
                .replace(MAIN_ADMIN_UNIT_ID_PLACEHOLDER, String.valueOf(mainAdminUnitId));

        Query query = entityManager.createNativeQuery(sql);
        List<Object[]> resultList = query.getResultList();
        return resultList.stream()
                .map(arr -> new AdminUnitEntrantAllocation(String.valueOf(arr[1]), Long.valueOf(arr[2].toString()), Integer.valueOf(arr[0].toString())))
                .collect(toList());
    }
}
