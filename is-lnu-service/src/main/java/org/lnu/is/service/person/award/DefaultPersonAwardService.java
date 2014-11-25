package org.lnu.is.service.person.award;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.person.award.PersonAwardDao;
import org.lnu.is.domain.person.PersonAward;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Service;

/**
 * Default implementation of person award service.
 * @author ivanursul
 *
 */
@Service("personAwardService")
public class DefaultPersonAwardService implements PersonAwardService {

	@Resource(name = "personAwardParametersExtractor")
	private ParametersExtractor<PersonAward> parametersExtractor;
	
	@Resource(name = "personAwardDao")
	private PersonAwardDao personAwardDao;
	
	@Override
	public void createAward(final PersonAward award) {
		personAwardDao.save(award);
	}

	@Override
	public void updateAward(final PersonAward award) {
		personAwardDao.update(award);
	}

	@Override
	public PersonAward getAward(final Long personAwardId) {
		return personAwardDao.findById(personAwardId);
	}

	@Override
	public void removeAward(final PersonAward award) {
		personAwardDao.delete(award);
	}

	@Override
	public PagedResult<PersonAward> getAwards(final PagedSearch<PersonAward> pagedSearch) {
		Map<String, Object> parameters = parametersExtractor.getParameters(pagedSearch.getEntity());
		pagedSearch.setParameters(parameters);
		
		return personAwardDao.getEntities(pagedSearch);
	}

}
