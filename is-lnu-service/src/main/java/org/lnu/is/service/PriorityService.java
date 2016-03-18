package org.lnu.is.service;

import org.lnu.is.dao.dao.priority.PriorityDao;
import org.lnu.is.domain.priority.PriorityStat;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class PriorityService {

    @Resource
    private PriorityDao priorityDao;

    public List<PriorityStat> getPriorityStat(long timePeriodId) {
        return priorityDao.getPriorityStat(timePeriodId);
    }
}
