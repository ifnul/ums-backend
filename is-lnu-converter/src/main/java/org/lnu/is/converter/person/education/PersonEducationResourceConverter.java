package org.lnu.is.converter.person.education;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.education.type.EducationType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.education.PersonEducation;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.resource.person.education.PersonEducationResource;

/**
 * Person Education Converter.
 * @author ivanursul
 *
 */
@Converter("personEducationResourceConverter")
public class PersonEducationResourceConverter extends AbstractConverter<PersonEducationResource, PersonEducation> {

	@Override
	public PersonEducation convert(final PersonEducationResource source, final PersonEducation target) {
		
		if (source.getPersonId() != null) {
			Person person = new Person();
			person.setId(source.getPersonId());
			target.setPerson(person);
		}
		
		if (source.getEducationTypeId() != null) {
			EducationType educationType = new EducationType();
			educationType.setId(source.getEducationTypeId());
			target.setEducationType(educationType);
		}
		
		if (source.getPersonPaperId() != null) {
			PersonPaper personPaper = new PersonPaper();
			personPaper.setId(source.getPersonPaperId());
			target.setPersonPaper(personPaper);
		}

		target.setBegDate(source.getBegDate());
		target.setEndDate(source.getEndDate());
		
		return target;
	}

	@Override
	public PersonEducation convert(final PersonEducationResource source) {
		return convert(source, new PersonEducation());
	}

}
