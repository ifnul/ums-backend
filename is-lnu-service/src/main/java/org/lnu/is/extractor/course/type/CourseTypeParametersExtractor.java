package org.lnu.is.extractor.course.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.coursetype.CourseType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Course Type Parameters Extractor.
 * 
 * @author ivanursul
 *
 */
@ParametersExtractor("courseTypeParametersExtractor")
public class CourseTypeParametersExtractor extends AbstractParametersExtractor<CourseType> {

	@Override
	public Map<String, Object> getParameters(final CourseType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
