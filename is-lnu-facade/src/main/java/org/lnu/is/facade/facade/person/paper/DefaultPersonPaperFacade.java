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
	private PersonPaperService personPaperService;

	@Resource(name = "personPaperResourceConverter")
	private Converter<PersonPaperResource, PersonPaper> personPaperResourceConverter;

	@Resource(name = "personPaperConverter")
	private Converter<PersonPaper, PersonPaperResource> personPaperConverter;

	@Override
	public PersonPaperResource createPersonPaper(final PersonPaperResource resource) {
		LOG.info("Creating person paper: {}", resource);
		
		PersonPaper personPaper = personPaperResourceConverter.convert(resource);
		insertConverter.convert(resource, personPaper);
		personPaperService.createPersonPaper(personPaper);
		return personPaperConverter.convert(personPaper);
	}

	@Override
	public void updatePersonPaper(final Long personPaperId, final PersonPaperResource resource) {
		LOG.info("Updating person-paper({}): {}", personPaperId, resource);
		
		PersonPaper personPaper = personPaperService.getPersonPaper(personPaperId);
		
		personPaperResourceConverter.convert(resource, personPaper);
		updateConverter.convert(resource, personPaper);
		
		personPaperService.updatePersonPaper(personPaper);
	}

	@Override
	public PersonPaperResource getPersonPaper(final Long id) {
		LOG.info("Getting person paper with id: {}", id);
		
		PersonPaper personPaper = personPaperService.getPersonPaper(id);
		return personPaperConverter.convert(personPaper);
	}

	@Override
	public void removePersonPaper(final Long id) {
		LOG.info("Removing person-paper with id: {}", id);
		PersonPaper personPaper = personPaperService.getPersonPaper(id);
		personPaperService.removePersonPaper(personPaper);
	}

	@Override
	public PagedResultResource<PersonPaperResource> getPersonPapers(final PagedRequest<PersonPaperResource> request) {
		LOG.info("Get person papers by paged request: {}", request);

		PagedSearch<PersonPaper> pagedSearch = pagedRequestConverter.convert(request);
		pagedSearch.setEntity(personPaperResourceConverter.convert(request.getResource()));

		PagedResult<PersonPaper> pagedResult = personPaperService.getPersonPapers(pagedSearch);

		List<PersonPaperResource> resources = personPaperConverter.convertAll(pagedResult.getEntities());

		PagedResultResource<PersonPaperResource> pagedResultResource = new PagedResultResource<>(MessageFormat.format("/persons/{0}/papers", request.getResource().getPersonId()));
		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}
}
