package org.lnu.is.converter.admin.unit;

import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.admin.unit.AdminUnitEntrantAllocation;
import org.lnu.is.resource.adminunit.AdminUnitEntrantAllocationResource;
import org.springframework.stereotype.Component;

/**
 * @since 3/10/16
 */
@Component("entrantAdminUnitAllocationConverter")
public class AdminUnitEntrantAllocationConverter extends AbstractConverter<AdminUnitEntrantAllocation, AdminUnitEntrantAllocationResource> {

    @Override
    public AdminUnitEntrantAllocationResource convert(AdminUnitEntrantAllocation source, AdminUnitEntrantAllocationResource target) {

        target.setAdminUnit(source.getAdminUnit());
        target.setAdminUnitId(source.getAdminUnitId());
        target.setEntrantCount(source.getEntrantCount());

        return target;
    }

    @Override
    public AdminUnitEntrantAllocationResource convert(AdminUnitEntrantAllocation adminUnitEntrantAllocation) {
        return convert(adminUnitEntrantAllocation, new AdminUnitEntrantAllocationResource());
    }
}
