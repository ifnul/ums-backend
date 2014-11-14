package org.lnu.is.dao.dao.person;

import javax.annotation.Resource;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.person.Person;
import org.springframework.stereotype.Repository;

/**
 * Default Person Dao.
 * @author ivanursul
 *
 */
@Repository("personDao")
public class DefaultPersonDao extends AbstractDao<Person, Long> implements PersonDao {

	@Override
	public Class<Person> getEntityClass() {
		return Person.class;
	}

	@Override
	@Resource(name = "personQueryBuilder")
	public void setQueryBuilder(final QueryBuilder<Person> queryBuilder) {
		super.setQueryBuilder(queryBuilder);
	}

}
