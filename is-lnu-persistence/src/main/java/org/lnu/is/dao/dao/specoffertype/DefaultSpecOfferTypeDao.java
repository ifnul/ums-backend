package org.lnu.is.dao.dao.specoffertype;

import javax.annotation.Resource;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.specoffertype.SpecOfferType;
import org.springframework.stereotype.Repository;

/**
 * Default Spec Offer Type Dao.
 * @author ivanursul
 *
 */
@Repository("specOfferTypeDao")
public class DefaultSpecOfferTypeDao extends AbstractDao<SpecOfferType, Long> implements SpecOfferTypeDao {

	@Override
	public Class<SpecOfferType> getEntityClass() {
		return SpecOfferType.class;
	}

	@Override
	@Resource(name = "specOfferTypeQueryBuilder")
	public void setQueryBuilder(final QueryBuilder<SpecOfferType> queryBuilder) {
		super.setQueryBuilder(queryBuilder);
	}

}
