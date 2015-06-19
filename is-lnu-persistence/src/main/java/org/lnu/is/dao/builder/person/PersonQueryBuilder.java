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
	private static final String PARENT_CONDITION = "e.parent in :parent ";
	private static final String NAME_CONDITION = "e.name LIKE in :name,'%' ";
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
/*
	@Override
	protected BaseQueryBuilder build(PersonList context, BaseQueryBuilder builder) {
    	    BaseQueryBuilder baseQueryBuilder= builder.where();
    	    if (context.getPersonType()!=null){
    		baseQueryBuilder=baseQueryBuilder.openBracket();
    			for (PersonType personType : context.getPersonType()) {
    			    baseQueryBuilder=baseQueryBuilder.addOrCondition(PERSONTYPE_CONDITION, personType);
			}
    		baseQueryBuilder=baseQueryBuilder.closeBracket();
    	    }
    	    if (context.getGenderType()!=null){
		baseQueryBuilder=baseQueryBuilder.and().openBracket();
			for (GenderType genderType : context.getGenderType()) {
			    baseQueryBuilder=baseQueryBuilder.addOrCondition(GENDERTYPE_CONDITION, genderType);
			}
		baseQueryBuilder=baseQueryBuilder.closeBracket();
	    }
	if (context.getMarriedType()!=null){
		baseQueryBuilder=baseQueryBuilder.and().openBracket();
			for (MarriedType marriedType : context.getMarriedType()) {
			    baseQueryBuilder=baseQueryBuilder.addOrCondition(MARRIEDTYPE_CONDITION, marriedType);
			}
		baseQueryBuilder=baseQueryBuilder.closeBracket();
	    }	
	if (context.getParent()!=null){
		baseQueryBuilder=baseQueryBuilder.and().openBracket();
			for (Person person : context.getParent()) {
			    baseQueryBuilder=baseQueryBuilder.addOrCondition(PARENT_CONDITION, person);
			}
		baseQueryBuilder=baseQueryBuilder.closeBracket();
	    }
	if (context.getName()!=null){
		baseQueryBuilder=baseQueryBuilder.and().openBracket();
			for (String name : context.getName()) {
			    baseQueryBuilder=baseQueryBuilder.addOrCondition(NAME_CONDITION, name);
			}
		baseQueryBuilder=baseQueryBuilder.closeBracket();
	    }
	if (context.getFirstName()!=null){
		baseQueryBuilder=baseQueryBuilder.and().openBracket();
			for (String firstName : context.getFirstName()) {
			    baseQueryBuilder=baseQueryBuilder.addOrCondition(FIRSTNAME_CONDITION, firstName);
			}
		baseQueryBuilder=baseQueryBuilder.closeBracket();
	    }
	if (context.getFatherName()!=null){
		baseQueryBuilder=baseQueryBuilder.and().openBracket();
			for (String fatherName : context.getFatherName()) {
			    baseQueryBuilder=baseQueryBuilder.addOrCondition(FATHERNAME_CONDITION, fatherName);
			}
		baseQueryBuilder=baseQueryBuilder.closeBracket();
	    }
	if (context.getSurname()!=null){
		baseQueryBuilder=baseQueryBuilder.and().openBracket();
			for (String surname : context.getSurname()) {
			    baseQueryBuilder=baseQueryBuilder.addOrCondition(SURNAME_CONDITION, surname);
			}
		baseQueryBuilder=baseQueryBuilder.closeBracket();
	    }
	if (context.getPhoto()!=null){
		baseQueryBuilder=baseQueryBuilder.and().openBracket();
			for (String photo : context.getPhoto()) {
			    baseQueryBuilder=baseQueryBuilder.addOrCondition(PHOTO_CONDITION, photo);
			}
		baseQueryBuilder=baseQueryBuilder.closeBracket();
	    }
	if (context.getDocSeries()!=null){
		baseQueryBuilder=baseQueryBuilder.and().openBracket();
			for (String docSeries : context.getDocSeries()) {
			    baseQueryBuilder=baseQueryBuilder.addOrCondition(DOCSERIES_CONDITION, docSeries);
			}
		baseQueryBuilder=baseQueryBuilder.closeBracket();
	    }
	if (context.getDocNum()!=null){
		baseQueryBuilder=baseQueryBuilder.and().openBracket();
			for (String docNum : context.getDocNum()) {
			    baseQueryBuilder=baseQueryBuilder.addOrCondition(DOCNUM_CONDITION, docNum);
			}
		baseQueryBuilder=baseQueryBuilder.closeBracket();
	    }

	if (context.getIdentifier()!=null){
		baseQueryBuilder=baseQueryBuilder.and().openBracket();
			for (String identifier : context.getIdentifier()) {
			    baseQueryBuilder=baseQueryBuilder.addOrCondition(IDENTIFIER_CONDITION, identifier);
			}
		baseQueryBuilder=baseQueryBuilder.closeBracket();
	    }
	if (context.getResident()!=null){
		baseQueryBuilder=baseQueryBuilder.and().openBracket();
			for (Integer resident : context.getResident()) {
			    baseQueryBuilder=baseQueryBuilder.addOrCondition(RESIDENT_CONDITION, resident);
			}
		baseQueryBuilder=baseQueryBuilder.closeBracket();
	    }
	if (context.getBirthPlace()!=null){
		baseQueryBuilder=baseQueryBuilder.and().openBracket();
			for (String birthPlace : context.getBirthPlace()) {
			    baseQueryBuilder=baseQueryBuilder.addOrCondition(BIRTHPLACE_CONDITION, birthPlace);
			}
		baseQueryBuilder=baseQueryBuilder.closeBracket();
	    }
	if (context.getBegDate()!=null){
		baseQueryBuilder=baseQueryBuilder.and().openBracket();
			for (Date begDate : context.getBegDate()) {
			    baseQueryBuilder=baseQueryBuilder.addOrCondition(BEGDATE_CONDITION, begDate);
			}
		baseQueryBuilder=baseQueryBuilder.closeBracket();
	    }
	if (context.getEndDate()!=null){
		baseQueryBuilder=baseQueryBuilder.and().openBracket();
			for (Date endDate : context.getEndDate()) {
			    baseQueryBuilder=baseQueryBuilder.addOrCondition(ENDDATE_CONDITION, endDate);
			}
		baseQueryBuilder=baseQueryBuilder.closeBracket();
	    }
	if (context.getIsMilitary()!=null){
		baseQueryBuilder=baseQueryBuilder.and().openBracket();
			for (Integer isMilitary : context.getIsMilitary()) {
			    baseQueryBuilder=baseQueryBuilder.addOrCondition(ISMILITARY_CONDITION, isMilitary);
			}
		baseQueryBuilder=baseQueryBuilder.closeBracket();
	    }
	
	if (context.getIsHostel()!=null){
		baseQueryBuilder=baseQueryBuilder.and().openBracket();
			for (Integer isHostel : context.getIsHostel()) {
			    baseQueryBuilder=baseQueryBuilder.addOrCondition(ISHOSTEL_CONDITION, isHostel);
			}
		baseQueryBuilder=baseQueryBuilder.closeBracket();
	    }
	    return baseQueryBuilder;
	}
*/
}
