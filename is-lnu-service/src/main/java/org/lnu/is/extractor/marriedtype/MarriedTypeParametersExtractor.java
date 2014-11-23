package org.lnu.is.extractor.marriedtype;

import java.util.HashMap;
import java.util.Map;

import org.lnu.is.domain.marriedtype.MarriedType;
import org.lnu.is.extractor.AbstractParametersExtractor;
import org.springframework.stereotype.Component;

/**
 * Married Type parameters extractor.
 * @author Bohdan
 *
 */
@Component("marriedTypeParametersExtractor")
public class MarriedTypeParametersExtractor extends AbstractParametersExtractor<MarriedType> {

	@Override
	public Map<String, Object> getParameters(final MarriedType entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
