package org.lnu.is.facade.facade.specoffer.subject;

import java.text.MessageFormat;
import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.specoffer.SpecofferSubject;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.facade.BaseFacade;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specoffer.subject.SpecOfferSubjectResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.specoffer.subject.SpecOfferSubjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Default Spec Offer Subject Facade.
 * @author ivanursul
 *
 */
@Facade("specOfferSubjectFacade")
public class DefaultSpecOfferSubjectFacade extends BaseFacade<SpecOfferSubjectResource, SpecofferSubject> implements SpecOfferSubjectFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultSpecOfferSubjectFacade.class);
	
	@Resource(name = "specOfferSubjectService")
	private SpecOfferSubjectService service;

	@Resource(name = "specOfferResourceConverter")
	private Converter<SpecOfferSubjectResource, SpecofferSubject> resourceConverter;
	
	@Resource(name = "specOfferConverter")
	private Converter<SpecofferSubject, SpecOfferSubjectResource> entityConverter;
	
	@Override
	public SpecOfferSubjectResource createEntity(final SpecOfferSubjectResource resource) {
		LOG.info("Creating spec offer subjects: {}", resource);
		
		SpecofferSubject subject = new SpecofferSubject();
		
		resourceConverter.convert(resource, subject);
		insertConverter.convert(resource, subject);
		service.createSubject(subject);
		
		return entityConverter.convert(subject);
	}

	@Override
	public void updateEntity(final Long subjectId, final SpecOfferSubjectResource resource) {
		LOG.info("Updating spec offer subject({}): {}", subjectId, resource);
		
		SpecofferSubject subject = service.getSubject(subjectId);
		resourceConverter.convert(resource, subject);
		updateConverter.convert(resource, subject);
		service.updateSubject(subject);
	}

	@Override
	public SpecOfferSubjectResource getEntity(final Long subjectId) {
		LOG.info("Getting spec offer subjects: {}", subjectId);
		
		SpecofferSubject subject = service.getSubject(subjectId);
		return entityConverter.convert(subject);
	}

	@Override
	public void removeEntity(final Long subjectId) {
		LOG.info("Removing spec offer subjects: {}", subjectId);
		
		SpecofferSubject subject = service.getSubject(subjectId);
		service.removeSubject(subject);
	}

	@Override
	public PagedResultResource<SpecOfferSubjectResource> getEntities(final PagedRequest<SpecOfferSubjectResource> request) {
		LOG.info("Getting spec offer subjects by paged request: {}", request);

		PagedSearch<SpecofferSubject> pagedSearch = pagedRequestConverter.convert(request);
		pagedSearch.setEntity(resourceConverter.convert(request.getResource()));
		
		PagedResult<SpecofferSubject> pagedResult = service.getSubjects(pagedSearch);

		List<SpecOfferSubjectResource> resources = entityConverter.convertAll(pagedResult.getEntities());

		String uri = MessageFormat.format("/specoffers/{0}/subjects", request.getResource().getSpecOfferId());
		PagedResultResource<SpecOfferSubjectResource> pagedResultResource = new PagedResultResource<>(uri);
		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}
	
}
