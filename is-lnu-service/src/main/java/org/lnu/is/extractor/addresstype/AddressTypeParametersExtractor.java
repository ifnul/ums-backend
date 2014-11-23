package org.lnu.is.extractor.addresstype;

import java.util.HashMap;
import java.util.Map;

import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.extractor.AbstractParametersExtractor;
import org.springframework.stereotype.Component;

/**
 * Address Type Parameters Extractor.
 * 
 * @author ROMA
 *
 */
@Component("addressTypeParametersExtractor")
public class AddressTypeParametersExtractor extends
		AbstractParametersExtractor<AddressType> {

	@Override
	public Map<String, Object> getParameters(final AddressType entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
