package org.lnu.is.dao.builder.specoffer.type;

import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.springframework.stereotype.Component;

/**
 * Query Builder for SpecOfferType.
 * @author ivanursul
 *
 */
@Component("specOfferTypeQueryBuilder")
public class SpecOfferTypeQueryBuilder implements QueryBuilder<SpecOfferType> {

	private static final String QUERY = "SELECT s FROM SpecOfferType s %s";

	private static final String NAME_CONDITION = "s.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "s.abbrName LIKE CONCAT('%',:abbrName,'%') ";
	private static final String SPECIALTY_TYPE_CONDITION = "s.specialtyType = :specialtyType";
	
	@Override
	public String build(final SpecOfferType context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.addOrCondition(SPECIALTY_TYPE_CONDITION, context.getSpecialtyType())
				.build();
		
		return query;
	}

}
