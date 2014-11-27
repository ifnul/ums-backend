package org.lnu.is.facade.facade.person.paper;

import java.text.MessageFormat;
import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.facade.BaseFacade;
import org.lnu.is.facade.resource.person.paper.PersonPaperResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.person.paper.PersonPaperService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 * Default implementation of person paper facade.
 * @author ivanursul
 *
 */
@Transactional
@Facade("personPaperFacade")
public class DefaultPersonPaperFacade extends BaseFacade<PersonPaperResource, PersonPaper> implements PersonPaperFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultPersonPaperFacade.class);
	
	@Resource(name = "personPaperService")
	private PersonPaperService service;

	@Resource(name = "personPaperResourceConverter")
	private Converter<PersonPaperResource, PersonPaper> resourceConverter;

	@Resource(name = "personPaperConverter")
	private Converter<PersonPaper, PersonPaperResource> entityConverter;

	@Override
	public PersonPaperResource createEntity(final PersonPaperResource resource) {
		LOG.info("Creating person paper: {}", resource);
		
		PersonPaper personPaper = resourceConverter.convert(resource);
		insertConverter.convert(resource, personPaper);
		service.createPersonPaper(personPaper);
		return entityConverter.convert(personPaper);
	}

	@Override
	public void updateEntity(final Long personPaperId, final PersonPaperResource resource) {
		LOG.info("Updating person-paper({}): {}", personPaperId, resource);
		
		PersonPaper personPaper = service.getPersonPaper(personPaperId);
		
		resourceConverter.convert(resource, personPaper);
		updateConverter.convert(resource, personPaper);
		
		service.updatePersonPaper(personPaper);
	}

	@Override
	public PersonPaperResource getEntity(final Long id) {
		LOG.info("Getting person paper with id: {}", id);
		
		PersonPaper personPaper = service.getPersonPaper(id);
		return entityConverter.convert(personPaper);
	}

	@Override
	public void removeEntity(final Long id) {
		LOG.info("Removing person-paper with id: {}", id);
		PersonPaper personPaper = service.getPersonPaper(id);
		service.removePersonPaper(personPaper);
	}

	@Override
	public PagedResultResource<PersonPaperResource> getEntities(final PagedRequest<PersonPaperResource> request) {
		LOG.info("Get person papers by paged request: {}", request);

		PagedSearch<PersonPaper> pagedSearch = pagedRequestConverter.convert(request);
		pagedSearch.setEntity(resourceConverter.convert(request.getResource()));

		PagedResult<PersonPaper> pagedResult = service.getPersonPapers(pagedSearch);

		List<PersonPaperResource> resources = entityConverter.convertAll(pagedResult.getEntities());

		PagedResultResource<PersonPaperResource> pagedResultResource = new PagedResultResource<>(MessageFormat.format("/persons/{0}/papers", request.getResource().getPersonId()));
		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}
}
