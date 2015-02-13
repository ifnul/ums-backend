package org.lnu.is.converter.person.work;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.person.work.PersonWork;
import org.lnu.is.resource.person.work.PersonWorkResource;

/**
 * Person Work Converter.
 * @author ivanursul
 *
 */
@Converter("personWorkConverter")
public class PersonWorkConverter extends AbstractConverter<PersonWork, PersonWorkResource> {

	@Override
	public PersonWorkResource convert(final PersonWork source, final PersonWorkResource target) {
		
		if (source.getPerson() != null) {
			target.setPersonId(source.getPerson().getId());
		}
		
		if (source.getJobType() != null) {
			target.setJobTypeId(source.getJobType().getId());
		}
		
		if (source.getSpecStageType() != null) {
			target.setSpecStageTypeId(source.getSpecStageType().getId());
		}
		
		target.setId(source.getId());
		target.setOrganizationName(source.getOrganizationName());
		target.setPostName(source.getPostName());
		target.setDescription(source.getDescription());
		target.setBegDate(source.getBegDate());
		target.setEndDate(source.getEndDate());
		
		return target;
	}

	@Override
	public PersonWorkResource convert(final PersonWork source) {
		return convert(source, new PersonWorkResource());
	}

}
