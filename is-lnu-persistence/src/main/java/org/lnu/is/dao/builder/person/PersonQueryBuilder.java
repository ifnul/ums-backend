package org.lnu.is.dao.builder.person;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.multysearch.person.PersonList;

import java.text.MessageFormat;

/**
 * Person Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("personQueryBuilder")
public class PersonQueryBuilder extends AbstractQueryBuilder<PersonList> {
	// Single field conditions
	private static final String PARENT_CONDITION = "e.parent = :parent ";
	private static final String PERSON_TYPE_CONDITION = "e.personType = :personType ";
	private static final String GENDERTYPE_CONDITION = "e.genderType = :genderType ";
	private static final String MARRIEDTYPE_CONDITION = "e.marriedType = :marriedType ";
	private static final String CITIZEN_COUNTRY_CONDITION = "e.citizenCountry = :citizenCountry ";

	// String fields
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String FIRST_NAME_CONDITION = "e.firstName LIKE CONCAT('%',:firstName,'%') ";
	private static final String FATHER_NAME_CONDITION = "e.fatherName LIKE CONCAT('%',:fatherName,'%') ";
	private static final String SURNAME_CONDITION = "e.surname LIKE CONCAT('%',:surname,'%') ";
	private static final String PHOTO_CONDITION = "e.photo LIKE CONCAT('%',:photo,'%') ";
	private static final String DOCNUM_CONDITION = "e.docNum LIKE CONCAT('%',:docNum,'%') ";
	private static final String IDENTIFIER_CONDITION = "e.identifier LIKE CONCAT('%',:identifier,'%') ";
	private static final String BIRTHNAME_CONDITION = "e.birthPlace LIKE CONCAT('%',:birthPlace,'%') ";

	private static final String NAMES_CONDITIOIN_PLACEHOLDER = "e.name LIKE ''%{0}%'' ";
	private static final String FIRSTNAMES_CONDITIOIN_PLACEHOLDER = "e.firstName LIKE ''%{0}%'' ";
	private static final String SURNNAMES_CONDITIOIN_PLACEHOLDER = "e.surname LIKE ''%{0}%'' ";
	private static final String FATHERNAMES_CONDITIOIN_PLACEHOLDER = "e.fatherName LIKE ''%{0}%'' ";
	private static final String PHOTOS_CONDITIOIN_PLACEHOLDER = "e.photo LIKE ''%{0}%'' ";
	private static final String DOCSERIES_CONDITIOIN_PLACEHOLDER = "e.docSeries LIKE ''%{0}%'' ";
	private static final String DOCNUMS_CONDITIOIN_PLACEHOLDER = "e.docNum LIKE ''%{0}%'' ";
	private static final String IDENTIFIERS_CONDITIOIN_PLACEHOLDER = "e.identifier LIKE ''%{0}%'' ";
	private static final String BIRTHPLACES_CONDITIOIN_PLACEHOLDER = "e.birthPlace LIKE ''%{0}%'' ";

	// Multi search constants
	private static final String PERSON_TYPES_CONDITION = "e.personType IN (:personTypes) ";
	private static final String GENDERTYPES_CONDITION = "e.genderType IN (:genderTypes) ";
	private static final String MARRIEDTYPES_CONDITION = "e.marriedType IN (:marriedTypes) ";
	private static final String PARENTS_CONDITION = "e.parent IN (:parents) ";
	private static final String CITIZEN_COUNTRIES_CONDITION = "e.citizenCountry IN (:citizenCountries) ";

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
					.addAndCondition(PERSON_TYPE_CONDITION, context.getPersonType())
					.addAndCondition(GENDERTYPE_CONDITION, context.getGenderType())
					.addAndCondition(MARRIEDTYPE_CONDITION, context.getMarriedType())
					.addAndCondition(PARENT_CONDITION, context.getParent())
					.addAndCondition(CITIZEN_COUNTRY_CONDITION, context.getCitizenCountry())

					.addAndCondition(NAME_CONDITION, context.getName())
					.addAndCondition(FIRST_NAME_CONDITION, context.getFirstName())
					.addAndCondition(FATHER_NAME_CONDITION, context.getFatherName())
					.addAndCondition(SURNAME_CONDITION, context.getSurname())
					.addAndCondition(PHOTO_CONDITION, context.getPhoto())
					.addAndCondition(DOCNUM_CONDITION, context.getDocNum())
					.addAndCondition(IDENTIFIER_CONDITION, context.getIdentifier())
					.addAndCondition(BIRTHNAME_CONDITION, context.getBirthPlace())

					.addAndCondition(PERSON_TYPES_CONDITION, context.getPersonTypes())
					.addAndCondition(GENDERTYPES_CONDITION, context.getGenderTypes())
					.addAndCondition(MARRIEDTYPES_CONDITION, context.getMarriedTypes())
					.addAndCondition(PARENTS_CONDITION, context.getParents())
					.addAndCondition(CITIZEN_COUNTRIES_CONDITION, context.getCitizenCountries())

					.addAndConditionForLoop(value -> MessageFormat.format(NAMES_CONDITIOIN_PLACEHOLDER, value), context.getNames())
					.addAndConditionForLoop(value -> MessageFormat.format(FIRSTNAMES_CONDITIOIN_PLACEHOLDER, value), context.getFirstNames())
					.addAndConditionForLoop(value -> MessageFormat.format(SURNNAMES_CONDITIOIN_PLACEHOLDER, value), context.getSurnames())
					.addAndConditionForLoop(value -> MessageFormat.format(FATHERNAMES_CONDITIOIN_PLACEHOLDER, value), context.getFatherNames())
					.addAndConditionForLoop(value -> MessageFormat.format(PHOTOS_CONDITIOIN_PLACEHOLDER, value), context.getPhotos())
					.addAndConditionForLoop(value -> MessageFormat.format(DOCSERIES_CONDITIOIN_PLACEHOLDER, value), context.getDocSeries())
					.addAndConditionForLoop(value -> MessageFormat.format(DOCNUMS_CONDITIOIN_PLACEHOLDER, value), context.getDocNums())
					.addAndConditionForLoop(value -> MessageFormat.format(IDENTIFIERS_CONDITIOIN_PLACEHOLDER, value), context.getIdentifiers())
					.addAndConditionForLoop(value -> MessageFormat.format(BIRTHPLACES_CONDITIOIN_PLACEHOLDER, value), context.getBirthPlaces())

					.addAndCondition(RESIDENT_CONDITION, context.getResident())
					.addAndCondition(BEGDATE_CONDITION, context.getBegDate())
					.addAndCondition(ENDDATE_CONDITION, context.getEndDate())
					.addAndCondition(ISMILITARY_CONDITION, context.getIsMilitary())
					.addAndCondition(ISHOSTEL_CONDITION, context.getIsHostel())
				.closeBracket();
	}

}
