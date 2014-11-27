package org.lnu.is.dao.dao.gendertype;

import javax.annotation.Resource;

import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.dao.dao.AbstractDao;
import org.lnu.is.domain.gendertype.GenderType;
import org.springframework.stereotype.Repository;

/**
 * Default gender type dao.
 * 
 * @author ivanursul
 *
 */
@Repository("genderTypeDao")
public class DefaultGenderTypeDao extends AbstractDao<GenderType, Long> implements GenderTypeDao {

	@Override
	public Class<GenderType> getEntityClass() {
		return GenderType.class;
	}

	@Override
	@Resource(name = "genderTypeQueryBuilder")
	public void setQueryBuilder(final QueryBuilder<GenderType> queryBuilder) {
		super.setQueryBuilder(queryBuilder);
	}

}
