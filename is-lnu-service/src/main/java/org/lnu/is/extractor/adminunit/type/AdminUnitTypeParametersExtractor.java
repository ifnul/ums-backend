package org.lnu.is.extractor.adminunit.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.adminunit.type.AdminUnitType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Admin Unit type parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("adminUnitTypeParametersExtractor")
public class AdminUnitTypeParametersExtractor extends AbstractParametersExtractor<AdminUnitType> {

	@Override
	protected Map<String, Object> getParameters(final AdminUnitType entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getName(), "name", parameters);
		
		return parameters;
	}

}
