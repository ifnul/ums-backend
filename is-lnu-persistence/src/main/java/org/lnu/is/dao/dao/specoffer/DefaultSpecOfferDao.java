package org.lnu.is.dao.dao.specoffer;

import javax.annotation.Resource;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.springframework.stereotype.Repository;

/**
 * Default implementation of specoffer table for
 * persistence layer.
 * @author ivanursul
 *
 */
@Repository("specOfferDao")
public class DefaultSpecOfferDao extends AbstractDao<SpecOffer, Long> implements SpecOfferDao {

	@Override
	public Class<SpecOffer> getEntityClass() {
		return SpecOffer.class;
	}

	@Override
	@Resource(name = "specOfferQueryBuilder")
	public void setQueryBuilder(final QueryBuilder<SpecOffer> queryBuilder) {
		super.setQueryBuilder(queryBuilder);
	}

}
