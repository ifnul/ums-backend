package org.lnu.is.service.department;

import org.lnu.is.dao.dao.department.DepartmentDao;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.DepartmentSpecoffer;
import org.lnu.is.service.DefaultService;

import java.util.List;

public class DepartmentService extends DefaultService<Department, Department, Long, DepartmentDao> {

    public List<DepartmentSpecoffer> getDepartmentByTimePeriodGroupedByDepartment(long timePeriodId) {
        return dao.getDepartmentByTimePeriodGroupedByDepartment(timePeriodId);
    }
}
