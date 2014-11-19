package org.lnu.is.extractor.person.paper;

import java.util.Map;

import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.extractor.AbstractParametersExtractor;
import org.springframework.stereotype.Component;

/**
 * TODO: IU - Write tests for all parameter extractors.
 * Person paper parameters extractor.
 * @author ivanursul
 *
 */
@Component("personPaperParametersExtractor")
public class PersonPaperParametersExtractor extends AbstractParametersExtractor<PersonPaper> {

	@Override
	public Map<String, Object> getParameters(final PersonPaper entity) {
		return null;
	}

}
