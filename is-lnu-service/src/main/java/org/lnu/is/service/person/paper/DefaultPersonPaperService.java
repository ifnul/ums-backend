package org.lnu.is.service.person.paper;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.person.paper.PersonPaperDao;
import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.extractor.ParametersExtractor;
import org.springframework.stereotype.Service;

/**
 * Default Person Paper Service.
 * @author ivanursul
 *
 */
@Service("personPaperService")
public class DefaultPersonPaperService implements PersonPaperService {

	@Resource(name = "personPaperParametersExtractor")
	private ParametersExtractor<PersonPaper> parametersExtractor;
	
	@Resource(name = "personPaperDao")
	private PersonPaperDao personPaperDao;
	
}
