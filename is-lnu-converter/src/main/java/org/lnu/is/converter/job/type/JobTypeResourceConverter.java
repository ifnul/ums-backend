package org.lnu.is.converter.job.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.job.type.JobType;
import org.lnu.is.resource.job.type.JobTypeResource;
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
