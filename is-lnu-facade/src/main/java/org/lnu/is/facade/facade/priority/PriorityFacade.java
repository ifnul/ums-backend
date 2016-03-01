package org.lnu.is.facade.facade.priority;

import org.lnu.is.converter.Converter;
import org.lnu.is.domain.priority.PriorityStat;
import org.lnu.is.resource.priority.PriorityStatResource;
import org.lnu.is.service.PriorityService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Component
@Transactional
public class PriorityFacade {

    @Resource
    private PriorityService priorityService;

    @Resource(name = "priorityStatsConverter")
    private Converter<PriorityStat, PriorityStatResource> converter;

    public List<PriorityStatResource> getPriorityStat() {
        List<PriorityStat> priorityStats = priorityService.getPriorityStat();
        return converter.convertAll(priorityStats);
    }
}
