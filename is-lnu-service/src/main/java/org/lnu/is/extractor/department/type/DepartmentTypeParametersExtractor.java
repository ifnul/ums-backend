package org.lnu.is.extractor.department.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.department.DepartmentType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Department Type Parameters Extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("departmentTypeParametersExtractor")
public class DepartmentTypeParametersExtractor extends AbstractParametersExtractor<DepartmentType> {

	@Override
	public Map<String, Object> getParameters(final DepartmentType entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getName(), "name", parameters);
		
		return parameters;
	}

}
