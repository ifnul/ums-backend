package org.lnu.is.dao.dao.department;

import org.lnu.is.dao.dao.DefaultDao;
import org.lnu.is.dao.utils.DaoUtils;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.DepartmentSpecoffer;

import java.util.List;

public class DepartmentDao extends DefaultDao<Department, Department, Long> {
    private static final String TIME_PERIOD_ID_PLACEHOLDER = "$$TIME_PERIOD_ID$$";

    public List<DepartmentSpecoffer> getDepartmentByTimePeriodGroupedByDepartment(long timePeriodId) {
        String sql = DaoUtils.getQuery("department_specoffers.sql")
                .replace(TIME_PERIOD_ID_PLACEHOLDER, String.valueOf(timePeriodId));

        return getResultListFromNativeQuery(sql, DepartmentSpecoffer.class);
    }
}
