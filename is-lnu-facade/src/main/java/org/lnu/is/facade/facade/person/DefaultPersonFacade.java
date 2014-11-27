package org.lnu.is.facade.facade.person;

import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.person.Person;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.facade.BaseFacade;
import org.lnu.is.facade.resource.person.PersonResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.person.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 * Default implementation of person facade.
 * @author ivanursul
 *
 */
@Transactional
@Facade("personFacade")
public class DefaultPersonFacade extends BaseFacade<PersonResource, Person> implements PersonFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultPersonFacade.class);
	
	@Resource(name = "personService")
	private PersonService service;

	@Resource(name = "personResourceConverter")
	private Converter<PersonResource, Person> resourceConverter;

	@Resource(name = "personConverter")
	private Converter<Person, PersonResource> entityConverter;
	
	@Override
	public PersonResource createEntity(final PersonResource resource) {
		LOG.info("Creating person: {}", resource);
		
		Person person = resourceConverter.convert(resource);
		
		insertConverter.convert(resource, person);
		service.createPerson(person);
		
		return entityConverter.convert(person);
	}

	@Override
	public void updateEntity(final Long id, final PersonResource resource) {
		LOG.info("Updating person with id: {}, resource: {}", id, resource);
		
		Person person = service.getPerson(id);
		
		resourceConverter.convert(resource, person);
		updateConverter.convert(resource, person);
		
		service.updatePerson(person);
	}

	@Override
	public PersonResource getEntity(final Long id) {
		LOG.info("Getting person with id: {}", id);
		
		Person person = service.getPerson(id);
		return entityConverter.convert(person);
	}

	@Override
	public void removeEntity(final Long id) {
		LOG.info("Removing person with id: {}", id);
		
		Person person = service.getPerson(id);
		service.removePerson(person);
	}

	@Override
	public PagedResultResource<PersonResource> getEntities(final PagedRequest<PersonResource> request) {
		LOG.info("Get persons by paged request: {}", request);

		PagedSearch<Person> pagedSearch = pagedRequestConverter.convert(request);
		pagedSearch.setEntity(resourceConverter.convert(request.getResource()));

		PagedResult<Person> pagedResult = service.getPersons(pagedSearch);

		List<PersonResource> resources = entityConverter.convertAll(pagedResult.getEntities());

		PagedResultResource<PersonResource> pagedResultResource = new PagedResultResource<>("/persons");
		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}

}
