package org.lnu.is.extractor.contact.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.contacttype.ContactType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Contact Type Parameters Extractor.
 * 
 * @author ivanursul
 *
 */
@ParametersExtractor("contactTypeParametersExtractor")
public class ContactTypeParametersExtractor extends AbstractParametersExtractor<ContactType> {

	@Override
	public Map<String, Object> getParameters(final ContactType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
