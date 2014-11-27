package org.lnu.is.dao.dao.specoffer.subject;

import javax.annotation.Resource;

import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.dao.dao.AbstractDao;
import org.lnu.is.domain.specoffer.SpecofferSubject;
import org.springframework.stereotype.Repository;

/**
 * Default Spec Offer Subject dao.
 * @author ivanursul
 *
 */
@Repository("specOfferSubjectDao")
public class DefaultSpecOfferSubjectDao extends AbstractDao<SpecofferSubject, Long> implements SpecOfferSubjectDao {

	@Override
	public Class<SpecofferSubject> getEntityClass() {
		return SpecofferSubject.class;
	}

	@Override
	@Resource(name = "specOfferSubjectQueryBuilder")
	public void setQueryBuilder(final QueryBuilder<SpecofferSubject> queryBuilder) {
		super.setQueryBuilder(queryBuilder);
	}

}
