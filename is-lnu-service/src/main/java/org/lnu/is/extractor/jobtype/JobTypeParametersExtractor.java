package org.lnu.is.extractor.jobtype;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.job.type.JobType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * 
 * @author kushnir
 *
 */
@ParametersExtractor("jobTypeParametersExtractor")
public class JobTypeParametersExtractor extends AbstractParametersExtractor<JobType> {

	@Override
	public Map<String, Object> getParameters(final JobType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
