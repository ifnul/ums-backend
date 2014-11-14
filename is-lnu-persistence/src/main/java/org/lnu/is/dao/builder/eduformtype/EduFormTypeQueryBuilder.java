package org.lnu.is.dao.builder.eduformtype;

import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.queries.Queries;
import org.springframework.stereotype.Component;

/**
 * Edu Form Type Query Builder.
 * @author ivanursul
 *
 */
@Component("eduFormTypeQueryBuilder")
public class EduFormTypeQueryBuilder implements QueryBuilder<EduFormType> {

	private static final String QUERY_NAME = "EduFormTypeQueryBuilder";
	private static final String QUERY = "SELECT e FROM EduFormType e %s";

	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	
	@Override
	public Queries build(final EduFormType context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.build();
		
		return new Queries(QUERY_NAME, query);
	}

}
