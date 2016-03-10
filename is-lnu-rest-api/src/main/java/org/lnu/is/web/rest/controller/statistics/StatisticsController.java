package org.lnu.is.web.rest.controller.statistics;

import org.lnu.is.facade.facade.statistics.StatisticsFacade;
import org.lnu.is.resource.adminunit.AdminUnitEntrantAllocationResource;
import org.lnu.is.resource.priority.PriorityStatResource;
import org.lnu.is.web.rest.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping
public class StatisticsController extends BaseController {
    private static final Logger LOG = LoggerFactory.getLogger(StatisticsController.class);

    @Resource
    private StatisticsFacade statisticsFacade;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/priorities", method = RequestMethod.GET)
    public List<PriorityStatResource> getPriorityStat() {
        LOG.info("Getting priority statistics");
        return statisticsFacade.getPriorityStat();
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/entrants/allocations/adminunits")
    public List<AdminUnitEntrantAllocationResource> getAdminUnitAllocation() {
        LOG.info("Getting allocation of entrants per admin units of Ukraine");
        return statisticsFacade.getAdminUnitEntrantsAllocation();
    }

}
