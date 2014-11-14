package org.lnu.is.dao.builder.specialty;

import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.queries.Queries;
import org.springframework.stereotype.Component;

/**
 * Specialty query builder. 
 * @author ivanursul
 *
 */
@Component("specialtyQueryBuilder")
public class SpecialtyQueryBuilder implements QueryBuilder<Specialty> {

	private static final String QUERY_NAME = "SpecialtyQueryBuilder";
	private static final String QUERY = "SELECT s FROM Specialty s %s";

	private static final String PARENT_CONDITION = "s.parent = :parent ";
	private static final String SPECIALTYTYPE_CONDITION = "s.specialtyType = :specialtyType ";
	private static final String BEGDATE_CONDITION = "s.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "s.endDate >= :endDate";
	private static final String ABBRNAME_CONDITION = "s.abbrName LIKE CONCAT('%',:abbrName,'%') ";
	private static final String NAME_CONDITION = "s.name LIKE CONCAT('%',:name,'%') ";
	private static final String CIPHER_CONDITION = "s.cipher LIKE CONCAT('%',:cipher,'%') ";
	
	@Override
	public Queries build(final Specialty context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(PARENT_CONDITION, context.getParent())
				.addOrCondition(SPECIALTYTYPE_CONDITION, context.getSpecialtyType())
				.addOrCondition(ABBRNAME_CONDITION, context.getAbbrName())
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(CIPHER_CONDITION, context.getCipher())
				.addOrCondition(BEGDATE_CONDITION, context.getBegDate())
				.addOrCondition(ENDDATE_CONDITION, context.getEndDate())
				.build();
		
		return new Queries(QUERY_NAME, query);
	}

}
