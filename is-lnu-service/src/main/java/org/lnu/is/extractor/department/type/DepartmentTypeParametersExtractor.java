package org.lnu.is.extractor.department.type;

import java.util.HashMap;
import java.util.Map;

import org.lnu.is.domain.department.DepartmentType;
import org.lnu.is.extractor.AbstractParametersExtractor;
import org.springframework.stereotype.Component;

/**
 * Department Type Parameters Extractor.
 * @author ivanursul
 *
 */
@Component("departmentTypeParametersExtractor")
public class DepartmentTypeParametersExtractor extends AbstractParametersExtractor<DepartmentType> {

	@Override
	public Map<String, Object> getParameters(final DepartmentType entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getName(), "name", parameters);
		
		return parameters;
	}

}
