package org.lnu.is.extractor.address.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.address.type.AddressType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Address Type Parameters Extractor.
 * 
 * @author ROMA
 *
 */
@ParametersExtractor("addressTypeParametersExtractor")
public class AddressTypeParametersExtractor extends AbstractParametersExtractor<AddressType> {

	@Override
	public Map<String, Object> getParameters(final AddressType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
