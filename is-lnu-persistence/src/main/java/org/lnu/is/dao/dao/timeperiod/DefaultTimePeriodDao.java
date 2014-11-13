package org.lnu.is.dao.dao.timeperiod;

import javax.annotation.Resource;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.springframework.stereotype.Repository;

/**
 * Time Period Dao.
 * @author ivanursul
 *
 */
@Repository("timePeriodDao")
public class DefaultTimePeriodDao extends AbstractDao<TimePeriod, Long> implements TimePeriodDao {

	@Override
	public Class<TimePeriod> getEntityClass() {
		return TimePeriod.class;
	}

	@Override
	@Resource(name = "timePeriodQueryBuilder")
	public void setQueryBuilder(final QueryBuilder<TimePeriod> queryBuilder) {
		super.setQueryBuilder(queryBuilder);
	}
}
