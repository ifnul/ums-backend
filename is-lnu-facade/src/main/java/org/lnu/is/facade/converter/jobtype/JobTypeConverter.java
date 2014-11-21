package org.lnu.is.facade.converter.jobtype;

import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.jobtype.JobTypeResource;

@Converter("jobTypeConverter")
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
