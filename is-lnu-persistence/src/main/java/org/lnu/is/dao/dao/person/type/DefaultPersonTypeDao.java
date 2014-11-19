package org.lnu.is.dao.dao.person.type;

import javax.annotation.Resource;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.person.PersonType;
import org.springframework.stereotype.Repository;

/**
 * Default implementation of person type dao.
 * @author ivanursul
 *
 */
@Repository("personTypeDao")
public class DefaultPersonTypeDao extends AbstractDao<PersonType, Long> implements PersonTypeDao {

	@Override
	public Class<PersonType> getEntityClass() {
		return PersonType.class;
	}

	@Override
	@Resource(name = "personTypeQueryBuilder")
	public void setQueryBuilder(final QueryBuilder<PersonType> queryBuilder) {
		super.setQueryBuilder(queryBuilder);
	}

}
