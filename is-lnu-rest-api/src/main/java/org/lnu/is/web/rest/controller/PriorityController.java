package org.lnu.is.web.rest.controller;

import org.lnu.is.facade.facade.priority.PriorityFacade;
import org.lnu.is.resource.priority.PriorityStatResource;
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
@RequestMapping("/priorities")
public class PriorityController extends BaseController {
    private static final Logger LOG = LoggerFactory.getLogger(PriorityController.class);

    @Resource
    private PriorityFacade priorityFacade;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET)
    public List<PriorityStatResource> getPriorityStat() {
        LOG.info("Getting priority statistics");
        return priorityFacade.getPriorityStat();
    }


}
