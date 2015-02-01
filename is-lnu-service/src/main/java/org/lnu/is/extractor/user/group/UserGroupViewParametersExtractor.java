package org.lnu.is.extractor.user.group;

import java.util.List;
import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * User Group View Parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("userGroupViewsParametersExtractor")
public class UserGroupViewParametersExtractor extends AbstractParametersExtractor<List<Long>> {

	@Override
	protected Map<String, Object> getParameters(final List<Long> entity, final Map<String, Object> parameters) {
		
		addParameter(entity, "groupIds", parameters);
		
		return parameters;
	}

}
