package org.lnu.is.service.specoffer.subject;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.specoffer.subject.SpecOfferSubjectDao;
import org.lnu.is.domain.specoffer.SpecofferSubject;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Service;

/**
 * Default SpecOffer Subject Service.
 * @author ivanursul
 *
 */
@Service("specOfferSubjectService")
public class DefaultSpecOfferSubjectService implements SpecOfferSubjectService {

	@Resource(name = "specOfferSubjectParametersExtractor")
	private ParametersExtractor<SpecofferSubject> parametersExtractor;
	
	@Resource(name = "specOfferSubjectDao")
	private SpecOfferSubjectDao defaultDao;

	@Override
	public void createSubject(final SpecofferSubject subject) {
		defaultDao.save(subject);
	}

	@Override
	public SpecofferSubject getSubject(final Long id) {
		return defaultDao.findById(id);
	}

	@Override
	public void updateSubject(final SpecofferSubject subject) {
		defaultDao.update(subject);
	}

	@Override
	public void removeSubject(final SpecofferSubject subject) {
		defaultDao.delete(subject);
	}

	@Override
	public PagedResult<SpecofferSubject> getSubjects(final PagedSearch<SpecofferSubject> pagedSearch) {
		Map<String, Object> parameters = parametersExtractor.getParameters(pagedSearch.getEntity());
		pagedSearch.setParameters(parameters);
		
		return defaultDao.getEntities(pagedSearch);
	}
	
}
