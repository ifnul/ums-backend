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
	private SpecOfferSubjectDao entityDao;

	@Override
	public void createSubject(final SpecofferSubject subject) {
		entityDao.save(subject);
	}

	@Override
	public SpecofferSubject getSubject(final Long id) {
		return entityDao.findById(id);
	}

	@Override
	public void updateSubject(final SpecofferSubject subject) {
		entityDao.update(subject);
	}

	@Override
	public void removeSubject(final SpecofferSubject subject) {
		entityDao.delete(subject);
	}

	@Override
	public PagedResult<SpecofferSubject> getSubjects(final PagedSearch<SpecofferSubject> pagedSearch) {
		Map<String, Object> parameters = parametersExtractor.getParameters(pagedSearch.getEntity());
		pagedSearch.setParameters(parameters);
		
		return entityDao.getEntities(pagedSearch);
	}
	
}
