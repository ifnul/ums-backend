package org.lnu.is.converter.person.education;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.person.education.PersonEducation;
import org.lnu.is.resource.person.education.PersonEducationResource;

/**
 * Person Education Converter.
 * @author ivanursul
 *
 */
@Converter("personEducationConverter")
public class PersonEducationConverter extends AbstractConverter<PersonEducation, PersonEducationResource> {

	@Override
	public PersonEducationResource convert(final PersonEducation source, final PersonEducationResource target) {
		
		if (source.getPerson() != null) {
			target.setPersonId(source.getPerson().getId());
		}
		
		if (source.getEducationType() != null) {
			target.setEducationTypeId(source.getEducationType().getId());
		}
		
		if (source.getPersonPaper() != null) {
			target.setPersonPaperId(source.getPersonPaper().getId());
		}

		target.setId(source.getId());
		target.setBegDate(source.getBegDate());
		target.setEndDate(source.getEndDate());
		
		
		return target;
	}

	@Override
	public PersonEducationResource convert(final PersonEducation source) {
		return convert(source, new PersonEducationResource());
	}

}
