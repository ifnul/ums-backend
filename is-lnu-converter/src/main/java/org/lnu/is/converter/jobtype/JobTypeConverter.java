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
@ResourceConverter("jobTypeConverter")
public class JobTypeConverter extends AbstractConverter<JobType, JobTypeResource> {

	@Override
	public JobTypeResource convert(final JobType source, final JobTypeResource target) {
		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public JobTypeResource convert(final JobType source) {
		return convert(source, new JobTypeResource());
	}

}
