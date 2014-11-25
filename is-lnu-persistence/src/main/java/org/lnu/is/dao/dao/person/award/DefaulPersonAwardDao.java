package org.lnu.is.dao.dao.person.award;

import javax.annotation.Resource;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.person.PersonAward;
import org.springframework.stereotype.Repository;

/**
 * Default Person Award DAo.
 * @author ivanursul
 *
 */
@Repository("personAwardDao")
public class DefaulPersonAwardDao extends AbstractDao<PersonAward, Long> implements PersonAwardDao {

	@Override
	public Class<PersonAward> getEntityClass() {
		return PersonAward.class;
	}

	@Override
	@Resource(name = "personAwardQueryBuilder")
	public void setQueryBuilder(final QueryBuilder<PersonAward> queryBuilder) {
		super.setQueryBuilder(queryBuilder);
	}

}
