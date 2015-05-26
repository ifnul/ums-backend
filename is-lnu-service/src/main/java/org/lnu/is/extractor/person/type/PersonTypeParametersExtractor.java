package org.lnu.is.extractor.person.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.person.type.PersonType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Person Type parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("personTypeParametersExtractor")
public class PersonTypeParametersExtractor extends AbstractParametersExtractor<PersonType> {

	@Override
	public Map<String, Object> getParameters(final PersonType entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getName(), "name", parameters);
		
		return parameters;
	}

}
