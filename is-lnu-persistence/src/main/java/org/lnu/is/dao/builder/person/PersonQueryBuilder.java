package org.lnu.is.dao.builder.person;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.person.Person;

/**
 * Person Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("personQueryBuilder")
public class PersonQueryBuilder implements QueryBuilder<Person> {

	private static final String QUERY = "SELECT p FROM Person p %s";

	private static final String PARENT_CONDITION = "p.parent = :parent ";
	private static final String NAME_CONDITION = "p.name LIKE CONCAT('%',:name,'%') ";
	private static final String PERSONTYPE_CONDITION = "p.personType = :personType ";
	private static final String GENDERTYPE_CONDITION = "p.genderType = :genderType ";
	private static final String MARRIEDTYPE_CONDITION = "p.marriedType = :marriedType ";

	private static final String FIRSTNAME_CONDITION = "p.firstName LIKE CONCAT('%',:firstName,'%') ";
	private static final String FATHERNAME_CONDITION = "p.fatherName LIKE CONCAT('%',:fatherName,'%') ";
	private static final String SURNAME_CONDITION = "p.surname LIKE CONCAT('%',:surname,'%') e";
	private static final String DOCSERIES_CONDITION = "p.docSeries LIKE CONCAT('%',:docSeries,'%') ";
	private static final String IDENTIFIER_CONDITION = "p.identifier LIKE CONCAT('%',:identifier,'%') ";
	private static final String BIRTHPLACE_CONDITION = "p.birthPlace LIKE CONCAT('%',:birthPlace,'%') ";
	private static final String PHOTO_CONDITION = "p.photo LIKE CONCAT('%',:photo,'%') ";
	private static final String DOCNUM_CONDITION = "p.docNum LIKE CONCAT('%',:docNum,'%') ";
	
	private static final String RESIDENT_CONDITION = "p.resident = :resident ";
	private static final String BEGDATE_CONDITION = "p.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "p.endDate >= :endDate";
	private static final String ISMILITARY_CONDITION = "p.isMilitary = :isMilitary ";
	private static final String ISHOSTEL_CONDITION = "p.isHostel = :isHostel ";
	
	
	@Override
	public String build(final Person context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(PERSONTYPE_CONDITION, context.getPersonType())
				.addOrCondition(GENDERTYPE_CONDITION, context.getGenderType())
				.addOrCondition(MARRIEDTYPE_CONDITION, context.getMarriedType())
				.addOrCondition(PARENT_CONDITION, context.getParent())
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(FIRSTNAME_CONDITION, context.getFirstName())
				.addOrCondition(FATHERNAME_CONDITION, context.getFatherName())
				.addOrCondition(SURNAME_CONDITION, context.getSurname())
				.addOrCondition(PHOTO_CONDITION, context.getPhoto())
				.addOrCondition(DOCSERIES_CONDITION, context.getDocSeries())
				.addOrCondition(DOCNUM_CONDITION, context.getDocNum())
				.addOrCondition(IDENTIFIER_CONDITION, context.getIdentifier())
				.addOrCondition(RESIDENT_CONDITION, context.getResident())
				.addOrCondition(BIRTHPLACE_CONDITION, context.getBirthPlace())
				.addOrCondition(BEGDATE_CONDITION, context.getBegDate())
				.addOrCondition(ENDDATE_CONDITION, context.getEndDate())
				.addOrCondition(ISMILITARY_CONDITION, context.getIsMilitary())
				.addOrCondition(ISHOSTEL_CONDITION, context.getIsHostel())
				.build();
		
		return query;
	}

}
