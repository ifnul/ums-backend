package org.lnu.is.converter.jobtype;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.resource.jobtype.JobTypeResource;
/**
 * 
 * @author kushnir
 *
 */
@ResourceConverter("jobTypeResourceConverter")
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
