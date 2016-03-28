package org.lnu.is.service.department;

import org.lnu.is.dao.dao.allocation.DepartmentEntrantAllocationDao;
import org.lnu.is.domain.department.DepartmentEntrantAllocation;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class DepartmentEntrantAllocationService {

    @Resource
    private DepartmentEntrantAllocationDao departmentEntrantAllocationDao;

    public List<DepartmentEntrantAllocation> getDepartmentsAllocations(long timePeriodId) {
        return departmentEntrantAllocationDao.getDepartmentsAllocations(timePeriodId);
    }
}
