package org.lnu.is.dao.dao.specialty;

import javax.annotation.Resource;

import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.dao.dao.AbstractDao;
import org.lnu.is.domain.specialty.Specialty;
import org.springframework.stereotype.Repository;

/**
 * Default implemetation of specialty dao.
 * @author ivanursul
 *
 */
@Repository("specialtyDao")
public class DefaultSpecialtyDao extends AbstractDao<Specialty, Long> implements SpecialtyDao {

	@Override
	public Class<Specialty> getEntityClass() {
		return Specialty.class;
	}

	@Override
	@Resource(name = "specialtyQueryBuilder")
	public void setQueryBuilder(final QueryBuilder<Specialty> queryBuilder) {
		super.setQueryBuilder(queryBuilder);
	}
	
}
