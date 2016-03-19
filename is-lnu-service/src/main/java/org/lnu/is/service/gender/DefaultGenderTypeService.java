package org.lnu.is.service.gender;

import org.lnu.is.dao.dao.gendertype.GenderTypeDao;
import org.lnu.is.domain.gender.type.GenderType;
import org.lnu.is.domain.gender.type.GenderTypeAllocation;
import org.lnu.is.service.DefaultService;

public class DefaultGenderTypeService extends DefaultService<GenderType, GenderType, Long, GenderTypeDao> implements GenderTypeService {

    @Override
    public GenderTypeAllocation getGenderTypeAllocation(long timePeriodId, long specOfferId) {
        return dao.getGenderTypeAllocation(timePeriodId, specOfferId);
    }

}
