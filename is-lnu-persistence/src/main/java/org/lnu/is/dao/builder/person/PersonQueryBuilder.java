package org.lnu.is.dao.builder.person;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.multysearch.person.PersonList;

/**
 * Person Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("personQueryBuilder")
public class PersonQueryBuilder extends AbstractQueryBuilder<PersonList> {
	private static final String PERSON_TYPES_CONDITION = "e.personType IN (:personTypes) ";
	private static final String GENDERTYPES_CONDITION = "e.genderType IN (:genderTypes) ";
	private static final String MARRIEDTYPE_CONDITION = "e.marriedType IN (:marriedTypes) ";
	private static final String PARENT_CONDITION = "e.parent IN (:parents) ";
	private static final String NAMES_CONDITION = "e.name IN (:names) ";
	private static final String FIRSTNAMES_CONDITION = "e.firstName IN (:firstNames) ";
	private static final String FATHERNAMES_CONDITION = "e.fatherName LIKE CONCAT('%',:fatherName,'%') ";

	private static final String SURNAME_CONDITION = "e.surname LIKE CONCAT('%',:surname,'%') ";
	private static final String DOCSERIES_CONDITION = "e.docSeries LIKE CONCAT('%',:docSeries,'%') ";
	private static final String IDENTIFIER_CONDITION = "e.identifier LIKE CONCAT('%',:identifier,'%') ";
	private static final String BIRTHPLACE_CONDITION = "e.birthPlace LIKE CONCAT('%',:birthPlace,'%') ";
	private static final String PHOTO_CONDITION = "e.photo LIKE CONCAT('%',:photo,'%') ";
	private static final String DOCNUM_CONDITION = "e.docNum in :docNum ";
	
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
	protected BaseQueryBuilder build(final PersonList context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(PERSON_TYPES_CONDITION, context.getPersonTypes())
					.addAndCondition(GENDERTYPES_CONDITION, context.getGenderTypes())
					.addAndCondition(MARRIEDTYPE_CONDITION, context.getMarriedTypes())
					.addAndCondition(PARENT_CONDITION, context.getParents())
					.addAndCondition(NAMES_CONDITION, context.getNames())
					.addAndCondition(FIRSTNAMES_CONDITION, context.getFirstNames())

					.addAndCondition(FATHERNAMES_CONDITION, context.getFatherNames())
					.addAndCondition(SURNAME_CONDITION, context.getSurnames())
					.addAndCondition(PHOTO_CONDITION, context.getPhotos())
					.addAndCondition(DOCSERIES_CONDITION, context.getDocSeries())
					.addAndCondition(DOCNUM_CONDITION, context.getDocNums())
					.addAndCondition(IDENTIFIER_CONDITION, context.getIdentifiers())
					.addAndCondition(RESIDENT_CONDITION, context.getResident())
					.addAndCondition(BIRTHPLACE_CONDITION, context.getBirthPlace())
					.addAndCondition(BEGDATE_CONDITION, context.getBegDate())
					.addAndCondition(ENDDATE_CONDITION, context.getEndDate())
					.addAndCondition(ISMILITARY_CONDITION, context.getIsMilitary())
					.addAndCondition(ISHOSTEL_CONDITION, context.getIsHostel())
				.closeBracket();
	}

}
