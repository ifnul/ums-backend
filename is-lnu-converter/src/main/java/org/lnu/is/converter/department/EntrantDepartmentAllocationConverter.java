package org.lnu.is.converter.department;

import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.department.DepartmentEntrantAllocation;
import org.lnu.is.resource.department.DepartmentEntrantAllocationResource;
import org.springframework.stereotype.Component;

@Component("entrantDepartmentAllocationConverter")
public class EntrantDepartmentAllocationConverter extends AbstractConverter<DepartmentEntrantAllocation, DepartmentEntrantAllocationResource> {

    @Override
    public DepartmentEntrantAllocationResource convert(DepartmentEntrantAllocation source, DepartmentEntrantAllocationResource target) {

        target.setAwardsCount(source.getAwardsCount());
        target.setBenefitCount(source.getBenefitCount());
        target.setDepartmentId(source.getDepartmentId());
        target.setGeneralCount(source.getGeneralCount());
        target.setName(source.getName());

        return target;
    }

    @Override
    public DepartmentEntrantAllocationResource convert(DepartmentEntrantAllocation source) {
        return convert(source, new DepartmentEntrantAllocationResource());
    }
}
