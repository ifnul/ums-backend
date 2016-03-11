package org.lnu.is.converter.department;

import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.department.DepartmentEntrantAllocation;
import org.lnu.is.resource.department.DepartmentEntrantAllocationResource;
import org.springframework.stereotype.Component;

@Component("entrantDepartmentAllocationConverter")
public class EntrantDepartmentAllocationConverter extends AbstractConverter<DepartmentEntrantAllocation, DepartmentEntrantAllocationResource> {
    @Override
    public DepartmentEntrantAllocationResource convert(DepartmentEntrantAllocation departmentEntrantAllocation, DepartmentEntrantAllocationResource departmentEntrantAllocationResource) {
        return null;
    }

    @Override
    public DepartmentEntrantAllocationResource convert(DepartmentEntrantAllocation departmentEntrantAllocation) {
        return null;
    }
}
