package org.lnu.is.service.gender;

import org.lnu.is.domain.gender.type.GenderType;
import org.lnu.is.domain.gender.type.GenderTypeAllocation;
import org.lnu.is.service.Service;

public interface GenderTypeService extends Service<GenderType, GenderType, Long> {

    GenderTypeAllocation getGenderTypeAllocation(long timePeriodId, long specOfferId);
}
