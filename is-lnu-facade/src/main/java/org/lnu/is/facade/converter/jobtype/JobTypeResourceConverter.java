package org.lnu.is.facade.converter.jobtype;

import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.jobtype.JobTypeResource;
/**
 * 
 * @author kushnir
 *
 */
@Converter("jobTypeResourceConverter")
public class JobTypeResourceConverter extends AbstractConverter<JobTypeResource, JobType> {

	@Override
	public JobType convert(final JobTypeResource source, final JobType target) {
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public JobType convert(final JobTypeResource source) {
		return convert(source, new JobType());
	}

}
