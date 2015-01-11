package org.lnu.is.extractor.family.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.familytype.FamilyType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Family Type Parameters Extractor.
 * 
 * @author ivanursul
 *
 */
@ParametersExtractor("familyTypeParametersExtractor")
public class FamilyTypeParametersExtractor extends AbstractParametersExtractor<FamilyType> {

	@Override
	public Map<String, Object> getParameters(final FamilyType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
