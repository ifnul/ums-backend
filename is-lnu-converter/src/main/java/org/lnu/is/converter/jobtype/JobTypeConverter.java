package org.lnu.is.converter.jobtype;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.job.type.JobType;
import org.lnu.is.resource.job.type.JobTypeResource;
/**
 * 
 * @author kushnir
 *
 */
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
