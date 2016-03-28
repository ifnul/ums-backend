package org.lnu.is.web.rest.controller.statistics;

import org.lnu.is.facade.facade.statistics.StatisticsFacade;
import org.lnu.is.resource.adminunit.AdminUnitEntrantAllocationResource;
import org.lnu.is.resource.department.DepartmentEntrantAllocationResource;
import org.lnu.is.resource.enrolment.EntrantPlaceResource;
import org.lnu.is.resource.gender.type.GenderTypeAllocationResource;
import org.lnu.is.resource.kb.AverageGlobalKbResource;
import org.lnu.is.resource.priority.PriorityStatResource;
import org.lnu.is.web.rest.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping
public class StatisticsController extends BaseController {
    private static final Logger LOG = LoggerFactory.getLogger(StatisticsController.class);

    @Resource
    private StatisticsFacade statisticsFacade;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/stats/{timePeriodId}/priorities", method = RequestMethod.GET)
    public List<PriorityStatResource> getPriorityStat(@PathVariable("timePeriodId") long timePeriodId) {
        LOG.info("Getting priority statistics");
        return statisticsFacade.getPriorityStat(timePeriodId);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/stats/{timePeriodId}/entrants/allocations/adminunits", method = RequestMethod.GET)
    public List<AdminUnitEntrantAllocationResource> getAdminUnitAllocation(@PathVariable("timePeriodId") long timePeriodId) {
        LOG.info("Getting allocation of entrants per admin units of Ukraine");
        return statisticsFacade.getAdminUnitEntrantsAllocation(timePeriodId);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/stats/{timePeriodId}/entrants/allocations/departments", method = RequestMethod.GET)
    public List<DepartmentEntrantAllocationResource> getDepartmentsAllocation(@PathVariable("timePeriodId") long timePeriodId) {
        LOG.info("Getting allocation of entrants per admin units of Ukraine");
        return statisticsFacade.getDepartmentEntrantsAllocation(timePeriodId);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/stats/{timePeriodId}/entrants/places")
    public List<EntrantPlaceResource> getEntrantsPerPlace(@PathVariable("timePeriodId") long timePeriodId) {
        LOG.info("Getting entrants per place");
        return statisticsFacade.getEntrantsPerPlace(timePeriodId);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/stats/{timePeriodId}/specoffers/{specOfferId}/genders")
    public GenderTypeAllocationResource getGenderAllocations(@PathVariable("specOfferId") long specOfferId) {
        LOG.info("Getting gender allocations by timePeriodId : {} and specOffer: {}", specOfferId);
        return statisticsFacade.getGenderAllocation(specOfferId);
    }

    @RequestMapping(value = "/stats/{timePeriodId}/kb")
    public AverageGlobalKbResource getAverageKb(@PathVariable("timePeriodId") long timePeriodId) {
        LOG.info("Getting average Kb per specoffer");
        return statisticsFacade.getAverageKb(timePeriodId);
    }

}
