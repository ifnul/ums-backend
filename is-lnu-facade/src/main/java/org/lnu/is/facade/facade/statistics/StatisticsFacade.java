package org.lnu.is.facade.facade.statistics;

import org.lnu.is.converter.Converter;
import org.lnu.is.domain.admin.unit.AdminUnitEntrantAllocation;
import org.lnu.is.domain.priority.PriorityStat;
import org.lnu.is.resource.adminunit.AdminUnitEntrantAllocationResource;
import org.lnu.is.resource.priority.PriorityStatResource;
import org.lnu.is.service.AdminUnitEntrantAllocationService;
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

    @Resource(name = "priorityStatsConverter")
    private Converter<PriorityStat, PriorityStatResource> priorityConverter;

    @Resource(name = "entrantAdminUnitAllocationConverter")
    private Converter<AdminUnitEntrantAllocation, AdminUnitEntrantAllocationResource> entrantAdminUnitAllocationConverter;


    public List<PriorityStatResource> getPriorityStat() {
        List<PriorityStat> priorityStats = priorityService.getPriorityStat();
        return priorityConverter.convertAll(priorityStats);
    }

    public List<AdminUnitEntrantAllocationResource> getAdminUnitEntrantsAllocation() {
        List<AdminUnitEntrantAllocation> adminUnitsAllocation = adminUnitEntrantAllocationService.getAdminUnitsAllocation();
        return entrantAdminUnitAllocationConverter.convertAll(adminUnitsAllocation);
    }
}
