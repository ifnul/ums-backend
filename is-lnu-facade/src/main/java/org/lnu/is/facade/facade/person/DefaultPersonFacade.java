package org.lnu.is.facade.facade.person;

import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.person.Person;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
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
public class DefaultPersonFacade implements PersonFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultPersonFacade.class);
	
	@Resource(name = "personService")
	private PersonService personService;

	@Resource(name = "insertConverter")
	private Converter<PersonResource, Person> insertConverter;

	@Resource(name = "updateConverter")
	private Converter<PersonResource, Person> updateConverter;
	
	@Resource(name = "personResourceConverter")
	private Converter<PersonResource, Person> personResourceConverter;

	@Resource(name = "personConverter")
	private Converter<Person, PersonResource> personConverter;
	
	@Resource(name = "pagedRequestConverter")
	private Converter<PagedRequest<PersonResource>, PagedSearch<Person>> pagedRequestConverter;

	@Resource(name = "pagedSearchConverter")
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;

	@Override
	public PersonResource createPerson(final PersonResource personResource) {
		Person person = personResourceConverter.convert(personResource);
		insertConverter.convert(personResource, person);
		personService.createPerson(person);
		return personConverter.convert(person);
	}

	@Override
	public void updatePerson(final Long id, final PersonResource personResource) {
		Person person = personService.getPerson(id);
		
		personResourceConverter.convert(personResource, person);
		updateConverter.convert(personResource, person);
		
		personService.updatePerson(person);
	}

	@Override
	public PersonResource getPerson(final Long id) {
		Person person = personService.getPerson(id);
		return personConverter.convert(person);
	}

	@Override
	public void removePerson(final Long id) {
		Person person = personService.getPerson(id);
		personService.removePerson(person);
	}

	@Override
	public PagedResultResource<PersonResource> getPersons(final PagedRequest<PersonResource> pagedRequest) {
		LOG.info("Get persons by paged request: {}", pagedRequest);

		PagedSearch<Person> pagedSearch = pagedRequestConverter.convert(pagedRequest);

		PagedResult<Person> pagedResult = personService.getPersons(pagedSearch);

		List<PersonResource> resources = personConverter.convertAll(pagedResult.getEntities());

		PagedResultResource<PersonResource> pagedResultResource = new PagedResultResource<>("/persons");
		pagedResultResource.setEntities(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}

}
