package org.lnu.is.service.adminunit;

import org.lnu.is.dao.dao.adminunit.AdminUnitDao;
import org.lnu.is.dao.dao.allocation.EntrantAdminUnitAllocationDao;
import org.lnu.is.domain.admin.unit.AdminUnit;
import org.lnu.is.domain.admin.unit.AdminUnitEntrantAllocation;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class AdminUnitEntrantAllocationService {

    @Resource(name = "adminUnitDao")
    private AdminUnitDao adminUnitDao;

    @Resource
    private EntrantAdminUnitAllocationDao entrantAdminUnitAllocationDao;

    public List<AdminUnitEntrantAllocation> getAdminUnitsAllocation(long timePeriodId) {
        AdminUnit rootAdminUnit = adminUnitDao.getRootAdminUnit();
        return entrantAdminUnitAllocationDao.getAdminUnitEntrantsAllocation(rootAdminUnit.getId(), timePeriodId);
    }
}
