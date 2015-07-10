package org.lnu.is.dao.builder.person;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.multysearch.person.PersonList;

import java.text.MessageFormat;
import java.util.function.Function;

/**
 * Person Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("personQueryBuilder")
public class PersonQueryBuilder extends AbstractQueryBuilder<PersonList> {
	// Single field conditions
	private static final String NAMES_CONDITIOIN_PLACEHOLDER = "LOWER(e.name) LIKE LOWER(''%{0}%'') ";
	private static final String FIRSTNAMES_CONDITIOIN_PLACEHOLDER = "LOWER(e.firstName) LIKE LOWER(''%{0}%'') ";
	private static final String SURNNAMES_CONDITIOIN_PLACEHOLDER = "LOWER(e.surname) LIKE LOWER(''%{0}%'') ";
	private static final String FATHERNAMES_CONDITIOIN_PLACEHOLDER = "LOWER(e.fatherName) LIKE LOWER(''%{0}%'') ";
	private static final String PHOTOS_CONDITIOIN_PLACEHOLDER = "LOWER(e.photo) LIKE LOWER(''%{0}%'') ";
	private static final String DOCSERIES_CONDITIOIN_PLACEHOLDER = "LOWER(e.docSeries) LIKE LOWER(''%{0}%'') ";
	private static final String DOCNUMS_CONDITIOIN_PLACEHOLDER = "LOWER(e.docNum) LIKE LOWER(''%{0,number,#}%'') ";
	private static final String IDENTIFIERS_CONDITIOIN_PLACEHOLDER = "LOWER(e.identifier) LIKE LOWER(''%{0}%'') ";
	private static final String BIRTHPLACES_CONDITIOIN_PLACEHOLDER = "LOWER(e.birthPlace) LIKE LOWER(''%{0}%'') ";

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
		Function<Object, String> docNumFunction = value -> {
			return "LOWER(e.docNum) LIKE LOWER('%" + value + "%') ";
		};

		return builder
				.where()
				.openBracket()
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
					.addAndConditionForLoop(docNumFunction, context.getDocNums())
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
