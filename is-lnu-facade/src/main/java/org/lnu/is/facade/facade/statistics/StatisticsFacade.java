package org.lnu.is.facade.facade.statistics;

import org.lnu.is.converter.Converter;
import org.lnu.is.domain.admin.unit.AdminUnitEntrantAllocation;
import org.lnu.is.domain.department.DepartmentEntrantAllocation;
import org.lnu.is.domain.enrolment.EntrantPlace;
import org.lnu.is.domain.priority.PriorityStat;
import org.lnu.is.resource.adminunit.AdminUnitEntrantAllocationResource;
import org.lnu.is.resource.department.DepartmentEntrantAllocationResource;
import org.lnu.is.resource.enrolment.EntrantPlaceResource;
import org.lnu.is.resource.priority.PriorityStatResource;
import org.lnu.is.service.AdminUnitEntrantAllocationService;
import org.lnu.is.service.DepartmentEntrantAllocationService;
import org.lnu.is.service.EntrantPlaceService;
import org.lnu.is.service.PriorityService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Component
@Transactional
public class StatisticsFacade {

    @Resource
    private PriorityService priorityService;

    @Resource
    private AdminUnitEntrantAllocationService adminUnitEntrantAllocationService;

    @Resource
    private DepartmentEntrantAllocationService departmentEntrantAllocationService;

    @Resource
    private EntrantPlaceService entrantPlaceService;

    @Resource(name = "priorityStatsConverter")
    private Converter<PriorityStat, PriorityStatResource> priorityConverter;

    @Resource(name = "entrantAdminUnitAllocationConverter")
    private Converter<AdminUnitEntrantAllocation, AdminUnitEntrantAllocationResource> entrantAdminUnitAllocationConverter;

    @Resource(name = "entrantDepartmentAllocationConverter")
    private Converter<DepartmentEntrantAllocation, DepartmentEntrantAllocationResource> entrantDepartmentAllocationConverter;

    @Resource(name = "entrantPlaceResourceConverter")
    private Converter<EntrantPlace, EntrantPlaceResource> entrantPlaceResourceConverter;

    public List<PriorityStatResource> getPriorityStat(long timePeriodId) {
        List<PriorityStat> priorityStats = priorityService.getPriorityStat(timePeriodId);
        return priorityConverter.convertAll(priorityStats);
    }

    public List<AdminUnitEntrantAllocationResource> getAdminUnitEntrantsAllocation() {
        List<AdminUnitEntrantAllocation> adminUnitsAllocation = adminUnitEntrantAllocationService.getAdminUnitsAllocation();
        return entrantAdminUnitAllocationConverter.convertAll(adminUnitsAllocation);
    }

    public List<DepartmentEntrantAllocationResource> getDepartmentEntrantsAllocation() {
        List<DepartmentEntrantAllocation> departmentEntrantAllocation = departmentEntrantAllocationService.getDepartmentsAllocations();
        return entrantDepartmentAllocationConverter.convertAll(departmentEntrantAllocation);
    }

    public List<EntrantPlaceResource> getEntrantsPerPlace() {
        List<EntrantPlace> entrantsPerPlace = entrantPlaceService.getEntrantsPerPlace();
        return entrantPlaceResourceConverter.convertAll(entrantsPerPlace);
    }
}
