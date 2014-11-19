package org.lnu.is.dao.builder.person.paper;

import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.queries.Queries;
import org.springframework.stereotype.Component;

/**
 * Person Paper Query builder.
 * @author ivanursul
 *
 */
@Component("personPaperQueryBuilder")
public class PersonPaperQueryBuilder implements QueryBuilder<PersonPaper> {
	private static final String QUERY_NAME = "PersonPaperQueryBuilder";
	private static final String QUERY = "SELECT p FROM PersonPaper p %s";

	private static final String DOCSERIES_CONDITION = "p.docSeries LIKE CONCAT('%',:docSeries,'%') ";
	private static final String DOCNUM_CONDITION = "p.docNum LIKE CONCAT('%',:docNum,'%') ";
	private static final String PERSON_CONDITION = "p.person = :person ";
	private static final String PAPERTYPE_CONDITION = "p.paperType = :paperType ";
	private static final String HONORS_TYPE = "p.honorsType = :honorsType ";
	private static final String DOC_DATE_CONDITION = "p.docDate = :docDate ";
	private static final String DOCISSUED_CONDITION = "p.docIssued = :docIssued ";
	private static final String DOCPIN_CONDITION = "p.docPin = :docPin ";
	private static final String MARK_CONDITION = "p.mark = :mark ";
	private static final String ISCHECKED_CONDITION = "p.isChecked = :isChecked ";
	private static final String ISFOREIGN_CONDITION = "p.isForeign = :isForeign ";
	
	@Override
	public Queries build(final PersonPaper context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(PERSON_CONDITION, context.getPerson())
				.addOrCondition(PAPERTYPE_CONDITION, context.getPaperType())
				.addOrCondition(HONORS_TYPE, context.getHonorsType())
				.addOrCondition(DOC_DATE_CONDITION, context.getDocDate())
				.addOrCondition(DOCSERIES_CONDITION, context.getDocSeries())
				.addOrCondition(DOCNUM_CONDITION, context.getDocNum())
				.addOrCondition(DOCISSUED_CONDITION, context.getDocIssued())
				.addOrCondition(DOCPIN_CONDITION, context.getDocPin())
				.addOrCondition(MARK_CONDITION, context.getMark())
				.addOrCondition(ISCHECKED_CONDITION, context.getIsChecked())
				.addOrCondition(ISFOREIGN_CONDITION, context.getIsForeign())
				.build();
		
		return new Queries(QUERY_NAME, query);
	}

}
