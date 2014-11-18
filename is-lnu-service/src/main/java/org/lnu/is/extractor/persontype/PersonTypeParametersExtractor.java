package org.lnu.is.extractor.persontype;

import java.util.HashMap;
import java.util.Map;

import org.lnu.is.domain.person.PersonType;
import org.lnu.is.extractor.AbstractParametersExtractor;
import org.springframework.stereotype.Component;

/**
 * Person Type parameters extractor.
 * @author ivanursul
 *
 */
@Component("personTypeParametersExtractors")
public class PersonTypeParametersExtractor extends AbstractParametersExtractor<PersonType> {

	@Override
	public Map<String, Object> getParameters(final PersonType entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getName(), "name", parameters);
		
		return parameters;
	}

}
