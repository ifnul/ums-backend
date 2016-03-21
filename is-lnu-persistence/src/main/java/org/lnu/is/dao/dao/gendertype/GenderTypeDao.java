package org.lnu.is.dao.dao.gendertype;

import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.gender.type.GenderType;
import org.lnu.is.domain.gender.type.GenderTypeAllocation;

public interface GenderTypeDao extends Dao<GenderType, GenderType, Long> {

    GenderTypeAllocation getGenderTypeAllocation(long specOfferId);
}
