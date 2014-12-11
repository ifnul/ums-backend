package org.lnu.is.dao.builder.eduformtype;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.eduformtype.EduFormType;

/**
 * Edu Form Type Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("eduFormTypeQueryBuilder")
public class EduFormTypeQueryBuilder implements QueryBuilder<EduFormType> {

	private static final String QUERY = "SELECT e FROM EduFormType e %s";

	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	
	@Override
	public String build(final EduFormType context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.build();
		
		return query;
	}

}
