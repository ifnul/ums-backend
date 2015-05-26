package org.lnu.is.extractor.benefit.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.benefit.BenefitType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Benefit Type parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("benefitTypeParametersExtractor")
public class BenefitTypeParametersExtractor extends AbstractParametersExtractor<BenefitType> {

	@Override
	protected Map<String, Object> getParameters(final BenefitType entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getPriority(), "priority", parameters);
		
		return parameters;
	}

}
