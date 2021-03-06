package org.lnu.is.facade.facade.statistics;

import org.lnu.is.converter.Converter;
import org.lnu.is.domain.admin.unit.AdminUnitEntrantAllocation;
import org.lnu.is.domain.department.DepartmentEntrantAllocation;
import org.lnu.is.domain.enrolment.EntrantPlace;
import org.lnu.is.domain.gender.type.GenderTypeAllocation;
import org.lnu.is.domain.kb.AverageKb;
import org.lnu.is.domain.priority.PriorityStat;
import org.lnu.is.resource.adminunit.AdminUnitEntrantAllocationResource;
import org.lnu.is.resource.department.DepartmentEntrantAllocationResource;
import org.lnu.is.resource.enrolment.EntrantPlaceResource;
import org.lnu.is.resource.gender.type.GenderTypeAllocationResource;
import org.lnu.is.resource.kb.AverageGlobalKbResource;
import org.lnu.is.resource.priority.PriorityStatResource;
import org.lnu.is.service.adminunit.AdminUnitEntrantAllocationService;
import org.lnu.is.service.department.DepartmentEntrantAllocationService;
import org.lnu.is.service.entrant.EntrantPlaceService;
import org.lnu.is.service.gender.GenderTypeService;
import org.lnu.is.service.kb.KbService;
import org.lnu.is.service.priority.PriorityService;
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

    @Resource
    private GenderTypeService genderTypeService;

    @Resource
    private KbService kbService;

    @Resource(name = "priorityStatsConverter")
    private Converter<PriorityStat, PriorityStatResource> priorityConverter;

    @Resource(name = "entrantAdminUnitAllocationConverter")
    private Converter<AdminUnitEntrantAllocation, AdminUnitEntrantAllocationResource> entrantAdminUnitAllocationConverter;

    @Resource(name = "entrantDepartmentAllocationConverter")
    private Converter<DepartmentEntrantAllocation, DepartmentEntrantAllocationResource> entrantDepartmentAllocationConverter;

    @Resource(name = "entrantPlaceResourceConverter")
    private Converter<EntrantPlace, EntrantPlaceResource> entrantPlaceResourceConverter;

    @Resource(name = "genderTypeAllocationConverter")
    private Converter<GenderTypeAllocation, GenderTypeAllocationResource> genderTypeAllocationConverter;

    public List<PriorityStatResource> getPriorityStat(long timePeriodId) {
        List<PriorityStat> priorityStats = priorityService.getPriorityStat(timePeriodId);
        return priorityConverter.convertAll(priorityStats);
    }

    public List<AdminUnitEntrantAllocationResource> getAdminUnitEntrantsAllocation(long timePeriodId) {
        List<AdminUnitEntrantAllocation> adminUnitsAllocation = adminUnitEntrantAllocationService.getAdminUnitsAllocation(timePeriodId);
        return entrantAdminUnitAllocationConverter.convertAll(adminUnitsAllocation);
    }

    public List<DepartmentEntrantAllocationResource> getDepartmentEntrantsAllocation(long timePeriodId) {
        List<DepartmentEntrantAllocation> departmentEntrantAllocation = departmentEntrantAllocationService.getDepartmentsAllocations(timePeriodId);
        return entrantDepartmentAllocationConverter.convertAll(departmentEntrantAllocation);
    }

    public List<EntrantPlaceResource> getEntrantsPerPlace(long timePeriodId) {
        List<EntrantPlace> entrantsPerPlace = entrantPlaceService.getEntrantsPerPlace(timePeriodId);
        return entrantPlaceResourceConverter.convertAll(entrantsPerPlace);
    }

    public GenderTypeAllocationResource getGenderAllocation(long specOfferId) {
        GenderTypeAllocation genderTypeAllocation = genderTypeService.getGenderTypeAllocation(specOfferId);
        return genderTypeAllocationConverter.convert(genderTypeAllocation);
    }

    public AverageGlobalKbResource getAverageKb(long timePeriodId) {
        List<AverageKb> averageKbs = kbService.getAverageKb(timePeriodId);
        return null;
    }
}
