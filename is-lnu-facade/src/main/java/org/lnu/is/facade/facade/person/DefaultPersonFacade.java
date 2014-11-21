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
	private PersonService personService;

	@Resource(name = "personResourceConverter")
	private Converter<PersonResource, Person> personResourceConverter;

	@Resource(name = "personConverter")
	private Converter<Person, PersonResource> personConverter;
	
	@Override
	public PersonResource createPerson(final PersonResource resource) {
		LOG.info("Creating person: {}", resource);
		
		Person person = personResourceConverter.convert(resource);
		
		insertConverter.convert(resource, person);
		personService.createPerson(person);
		
		return personConverter.convert(person);
	}

	@Override
	public void updatePerson(final Long id, final PersonResource resource) {
		LOG.info("Updating person with id: {}, resource: {}", id, resource);
		
		Person person = personService.getPerson(id);
		
		personResourceConverter.convert(resource, person);
		updateConverter.convert(resource, person);
		
		personService.updatePerson(person);
	}

	@Override
	public PersonResource getPerson(final Long id) {
		LOG.info("Getting person with id: {}", id);
		
		Person person = personService.getPerson(id);
		return personConverter.convert(person);
	}

	@Override
	public void removePerson(final Long id) {
		LOG.info("Removing person with id: {}", id);
		
		Person person = personService.getPerson(id);
		personService.removePerson(person);
	}

	@Override
	public PagedResultResource<PersonResource> getPersons(final PagedRequest<PersonResource> request) {
		LOG.info("Get persons by paged request: {}", request);

		PagedSearch<Person> pagedSearch = pagedRequestConverter.convert(request);
		pagedSearch.setEntity(personResourceConverter.convert(request.getResource()));

		PagedResult<Person> pagedResult = personService.getPersons(pagedSearch);

		List<PersonResource> resources = personConverter.convertAll(pagedResult.getEntities());

		PagedResultResource<PersonResource> pagedResultResource = new PagedResultResource<>("/persons");
		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}

}
