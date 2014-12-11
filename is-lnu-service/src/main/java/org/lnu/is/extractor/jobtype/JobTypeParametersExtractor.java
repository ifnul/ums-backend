package org.lnu.is.extractor.jobtype;

import java.util.HashMap;
import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * 
 * @author kushnir
 *
 */
@ParametersExtractor("jobTypeParametersExtractor")
public class JobTypeParametersExtractor extends AbstractParametersExtractor<JobType> {

	@Override
	public Map<String, Object> getParameters(final JobType entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
