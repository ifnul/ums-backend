package org.lnu.is.service.person.paper;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.person.paper.PersonPaperDao;
import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
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
	private PersonPaperDao defaultDao;

	@Override
	public void createPersonPaper(final PersonPaper personPaper) {
		defaultDao.save(personPaper);
	}

	@Override
	public PersonPaper getPersonPaper(final Long personPaperId) {
		return defaultDao.findById(personPaperId);
	}

	@Override
	public void updatePersonPaper(final PersonPaper personPaper) {
		defaultDao.update(personPaper);
	}

	@Override
	public void removePersonPaper(final PersonPaper personPaper) {
		defaultDao.delete(personPaper);
	}

	@Override
	public PagedResult<PersonPaper> getPersonPapers(final PagedSearch<PersonPaper> pagedSearch) {
		Map<String, Object> parameters = parametersExtractor.getParameters(pagedSearch.getEntity());
		pagedSearch.setParameters(parameters);
		
		return defaultDao.getEntities(pagedSearch);
	}
	
}
