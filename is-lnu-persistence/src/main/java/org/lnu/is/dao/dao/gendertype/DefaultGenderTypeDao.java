package org.lnu.is.dao.dao.gendertype;

import org.lnu.is.dao.dao.DefaultDao;
import org.lnu.is.dao.utils.DaoUtils;
import org.lnu.is.domain.gender.type.GenderType;
import org.lnu.is.domain.gender.type.GenderTypeAllocation;

public class DefaultGenderTypeDao extends DefaultDao<GenderType, GenderType, Long> implements GenderTypeDao {
    private static final String SPECOFFER_ID_PL = "$$SPECOFFER_ID$$";

    @Override
    public GenderTypeAllocation getGenderTypeAllocation(long timePeriodId, long specOfferId) {
        String sql = DaoUtils.getQuery("gendertype_allocation.sql")
                .replace(SPECOFFER_ID_PL, String.valueOf(specOfferId));
        return getSingleResultFromNativeQuery(sql, GenderTypeAllocation.class);
    }

}
