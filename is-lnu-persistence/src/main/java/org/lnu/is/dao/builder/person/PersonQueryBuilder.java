package org.lnu.is.dao.builder.person;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.person.Person;

/**
 * Person Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("personQueryBuilder")
public class PersonQueryBuilder extends AbstractQueryBuilder<Person> {
	private static final String PARENT_CONDITION = "e.parent = :parent ";
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String PERSONTYPE_CONDITION = "e.personType = :personType ";
	private static final String GENDERTYPE_CONDITION = "e.genderType = :genderType ";
	private static final String MARRIEDTYPE_CONDITION = "e.marriedType = :marriedType ";

	private static final String FIRSTNAME_CONDITION = "e.firstName LIKE CONCAT('%',:firstName,'%') ";
	private static final String FATHERNAME_CONDITION = "e.fatherName LIKE CONCAT('%',:fatherName,'%') ";
	private static final String SURNAME_CONDITION = "e.surname LIKE CONCAT('%',:surname,'%') ";
	private static final String DOCSERIES_CONDITION = "e.docSeries LIKE CONCAT('%',:docSeries,'%') ";
	private static final String IDENTIFIER_CONDITION = "e.identifier LIKE CONCAT('%',:identifier,'%') ";
	private static final String BIRTHPLACE_CONDITION = "e.birthPlace LIKE CONCAT('%',:birthPlace,'%') ";
	private static final String PHOTO_CONDITION = "e.photo LIKE CONCAT('%',:photo,'%') ";
	private static final String DOCNUM_CONDITION = "e.docNum LIKE CONCAT('%',:docNum,'%') ";
	
	private static final String RESIDENT_CONDITION = "e.resident = :resident ";
	private static final String BEGDATE_CONDITION = "e.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "e.endDate >= :endDate ";
	private static final String ISMILITARY_CONDITION = "e.isMilitary = :isMilitary ";
	private static final String ISHOSTEL_CONDITION = "e.isHostel = :isHostel ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM Person e %s";
	}

	@Override
	protected BaseQueryBuilder build(final Person context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(PERSONTYPE_CONDITION, context.getPersonType())
					.addAndCondition(GENDERTYPE_CONDITION, context.getGenderType())
					.addAndCondition(MARRIEDTYPE_CONDITION, context.getMarriedType())
					.addAndCondition(PARENT_CONDITION, context.getParent())
					.addAndCondition(NAME_CONDITION, context.getName())
					.addAndCondition(FIRSTNAME_CONDITION, context.getFirstName())
					.addAndCondition(FATHERNAME_CONDITION, context.getFatherName())
					.addAndCondition(SURNAME_CONDITION, context.getSurname())
					.addAndCondition(PHOTO_CONDITION, context.getPhoto())
					.addAndCondition(DOCSERIES_CONDITION, context.getDocSeries())
					.addAndCondition(DOCNUM_CONDITION, context.getDocNum())
					.addAndCondition(IDENTIFIER_CONDITION, context.getIdentifier())
					.addAndCondition(RESIDENT_CONDITION, context.getResident())
					.addAndCondition(BIRTHPLACE_CONDITION, context.getBirthPlace())
					.addAndCondition(BEGDATE_CONDITION, context.getBegDate())
					.addAndCondition(ENDDATE_CONDITION, context.getEndDate())
					.addAndCondition(ISMILITARY_CONDITION, context.getIsMilitary())
					.addAndCondition(ISHOSTEL_CONDITION, context.getIsHostel())
				.closeBracket();
	}

}
