package org.lnu.is.service;

import org.lnu.is.dao.dao.entrant.EntrantPlaceDao;
import org.lnu.is.domain.enrolment.EntrantPlace;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class EntrantPlaceService {

    @Resource
    private EntrantPlaceDao entrantPlaceDao;

    public List<EntrantPlace> getEntrantsPerPlace(long timePeriodId) {
        return entrantPlaceDao.getEntrantsPerPlace(timePeriodId);
    }
}
