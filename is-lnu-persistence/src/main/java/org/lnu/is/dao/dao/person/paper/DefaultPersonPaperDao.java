package org.lnu.is.dao.dao.person.paper;

import javax.annotation.Resource;

import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.dao.dao.AbstractDao;
import org.lnu.is.domain.person.PersonPaper;
import org.springframework.stereotype.Repository;

/**
 * Default personPaper dao.
 * @author ivanursul
 *
 */
@Repository("personPaperDao")
public class DefaultPersonPaperDao extends AbstractDao<PersonPaper, Long> implements PersonPaperDao {

	@Override
	public Class<PersonPaper> getEntityClass() {
		return PersonPaper.class;
	}

	@Override
	@Resource(name = "personPaperQueryBuilder")
	public void setQueryBuilder(final QueryBuilder<PersonPaper> queryBuilder) {
		super.setQueryBuilder(queryBuilder);
	}

}
