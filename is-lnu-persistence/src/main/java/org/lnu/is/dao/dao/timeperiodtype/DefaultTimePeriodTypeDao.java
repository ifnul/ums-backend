package org.lnu.is.dao.dao.timeperiodtype;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.domain.timeperiodtype.TimePeriodType;
import org.springframework.stereotype.Repository;

/**
 * Default implementation of Time PEriod Type DAo.
 * @author ivanursul
 *
 */
@Repository("timePeriodTypeDao")
public class DefaultTimePeriodTypeDao extends AbstractDao<TimePeriodType, Long> implements TimePeriodTypeDao {

	@Override
	public Class<TimePeriodType> getEntityClass() {
		return TimePeriodType.class;
	}

}
