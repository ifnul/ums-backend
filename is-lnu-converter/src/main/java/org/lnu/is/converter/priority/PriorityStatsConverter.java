package org.lnu.is.converter.priority;

import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.priority.PriorityStat;
import org.lnu.is.resource.priority.PriorityStatResource;
import org.springframework.stereotype.Component;

@Component("priorityStatsConverter")
public class PriorityStatsConverter extends AbstractConverter<PriorityStat, PriorityStatResource> {

    @Override
    public PriorityStatResource convert(PriorityStat source, PriorityStatResource target) {

        target.setCount(source.getCount());
        target.setPriority(source.getPriority());

        return target;
    }

    @Override
    public PriorityStatResource convert(PriorityStat priorityStat) {
        return convert(priorityStat, new PriorityStatResource());
    }
}
