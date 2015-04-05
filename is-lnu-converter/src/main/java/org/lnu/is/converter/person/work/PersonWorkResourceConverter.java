package org.lnu.is.converter.person.work;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.job.type.JobType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.work.PersonWork;
import org.lnu.is.domain.specstagetype.SpecStageType;
import org.lnu.is.resource.person.work.PersonWorkResource;

/**
 *  Person Work Resource Converter.
 * @author ivanursul
 *
 */
@Converter("personWorkResourceConverter")
public class PersonWorkResourceConverter extends AbstractConverter<PersonWorkResource, PersonWork> {

	@Override
	public PersonWork convert(final PersonWorkResource source, final PersonWork target) {
		
		if (source.getPersonId() != null) {
			Person person = new Person();
			person.setId(source.getPersonId());
			target.setPerson(person);
		}
		
		if (source.getJobTypeId() != null) {
			JobType jobType = new JobType();
			jobType.setId(source.getJobTypeId());
			target.setJobType(jobType);
		}
		
		if (source.getSpecStageTypeId() != null) {
			SpecStageType specStageType = new SpecStageType();
			specStageType.setId(source.getSpecStageTypeId());
			target.setSpecStageType(specStageType);
		}
		
		target.setOrganizationName(source.getOrganizationName());
		target.setPostName(source.getPostName());
		target.setDescription(source.getDescription());
		target.setBegDate(source.getBegDate());
		target.setEndDate(source.getEndDate());
		
		return target;
	}

	@Override
	public PersonWork convert(final PersonWorkResource source) {
		return convert(source, new PersonWork());
	}

}
