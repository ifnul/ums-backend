package org.lnu.is.facade.facade.person.paper;

import java.text.MessageFormat;
import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.person.paper.PersonPaperResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.person.paper.PersonPaperService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Default implementation of person paper facade.
 * @author ivanursul
 *
 */
@Facade("personPaperFacade")
public class DefaultPersonPaperFacade implements PersonPaperFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultPersonPaperFacade.class);
	
	@Resource(name = "personPaperService")
	private PersonPaperService personPaperService;

	@Resource(name = "insertConverter")
	private Converter<PersonPaperResource, PersonPaper> insertConverter;

	@Resource(name = "updateConverter")
	private Converter<PersonPaperResource, PersonPaper> updateConverter;
	
	@Resource(name = "personPaperResourceConverter")
	private Converter<PersonPaperResource, PersonPaper> personPaperResourceConverter;

	@Resource(name = "personPaperConverter")
	private Converter<PersonPaper, PersonPaperResource> personPaperConverter;
	
	@Resource(name = "pagedRequestConverter")
	private Converter<PagedRequest<PersonPaperResource>, PagedSearch<PersonPaper>> pagedRequestConverter;

	@Resource(name = "pagedSearchConverter")
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;

	@Override
	public PersonPaperResource createPersonPaper(final PersonPaperResource personPaperResource) {
		LOG.info("Creating person paper: {}", personPaperResource);
		
		PersonPaper personPaper = personPaperResourceConverter.convert(personPaperResource);
		insertConverter.convert(personPaperResource, personPaper);
		personPaperService.createPersonPaper(personPaper);
		return personPaperConverter.convert(personPaper);
	}

	@Override
	public void updatePersonPaper(final Long personPaperId, final PersonPaperResource personPaperResource) {
		LOG.info("Updating person-paper({}): {}", personPaperId, personPaperResource);
		
		PersonPaper personPaper = personPaperService.getPersonPaper(personPaperId);
		
		personPaperResourceConverter.convert(personPaperResource, personPaper);
		updateConverter.convert(personPaperResource, personPaper);
		
		personPaperService.updatePersonPaper(personPaper);
	}

	@Override
	public PersonPaperResource getPersonPaper(final Long personPaperId) {
		LOG.info("Getting person paper with id: {}", personPaperId);
		
		PersonPaper personPaper = personPaperService.getPersonPaper(personPaperId);
		return personPaperConverter.convert(personPaper);
	}

	@Override
	public void removePersonPaper(final Long personPaperId) {
		LOG.info("Removing person-paper with id: {}", personPaperId);
		PersonPaper personPaper = personPaperService.getPersonPaper(personPaperId);
		personPaperService.removePersonPaper(personPaper);
	}

	@Override
	public PagedResultResource<PersonPaperResource> getPersonPapers(final PagedRequest<PersonPaperResource> pagedRequest) {
		LOG.info("Get person papers by paged request: {}", pagedRequest);

		PagedSearch<PersonPaper> pagedSearch = pagedRequestConverter.convert(pagedRequest);
		pagedSearch.setEntity(personPaperResourceConverter.convert(pagedRequest.getResource()));

		PagedResult<PersonPaper> pagedResult = personPaperService.getPersonPapers(pagedSearch);

		List<PersonPaperResource> resources = personPaperConverter.convertAll(pagedResult.getEntities());

		PagedResultResource<PersonPaperResource> pagedResultResource = new PagedResultResource<>(MessageFormat.format("/persons/{0}/papers", pagedRequest.getResource().getPersonId()));
		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}
}
