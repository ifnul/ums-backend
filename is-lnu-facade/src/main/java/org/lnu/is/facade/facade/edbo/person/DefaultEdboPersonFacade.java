package org.lnu.is.facade.facade.edbo.person;

import java.util.List;

import org.is.lnu.edbo.resource.person.EdboPersonFindRequest;
import org.is.lnu.edbo.resource.person.EdboPersonResource;
import org.is.lnu.edbo.service.person.EdboPersonService;
import org.lnu.is.converter.Converter;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.entrant.PersonEntrant;
import org.lnu.is.domain.person.entrant.PersonEntrantAuto;
import org.lnu.is.resource.person.PersonResource;
import org.lnu.is.service.Service;
import org.lnu.is.service.person.PersonEntrantService;

import ua.edboservice.ArrayOfDPersonAddRet;
import ua.edboservice.ArrayOfDPersonsFind;
import ua.edboservice.PersonEntrantAdd;
import ua.edboservice.PersonEntrantAutoAdd;
import ua.edboservice.PersonsFind;

/**
 * Default implementation of edbo person facade.
 * @author ivanursul
 *
 */
public class DefaultEdboPersonFacade implements EdboPersonFacade {

	private Converter<EdboPersonFindRequest, PersonsFind> personFindResourceConverter;
	private Converter<ArrayOfDPersonsFind, List<EdboPersonResource>> arrayOfDPersonFindResourceConverter;

	private Converter<PersonEntrant, PersonEntrantAdd> personEntrantConverter;
	private Converter<PersonEntrantAuto, PersonEntrantAutoAdd> personEntrantAutoConverter;
	private Converter<ArrayOfDPersonAddRet, Person> entrantPersonConverter;
	private Converter<Person, PersonResource> personResourceConverter;
	
	private EdboPersonService service;
	private PersonEntrantService personEntrantService;
	private Service<Person, Long> personService;
	
	@Override
	public List<EdboPersonResource> findPersons(final EdboPersonFindRequest request) {
		PersonsFind personsFind = personFindResourceConverter.convert(request);
		ArrayOfDPersonsFind persons = service.findPerson(personsFind);
		
		return arrayOfDPersonFindResourceConverter.convert(persons);
	}

	@Override
	public PersonResource createPerson(final Long entrantId, final Boolean auto) {
		ArrayOfDPersonAddRet response = sendEntrant(entrantId, auto);
		Person person = personService.getEntity(entrantId);
		
		entrantPersonConverter.convert(response, person);
		personService.updateEntity(person);
		
		return personResourceConverter.convert(person);
	}

	/**
	 * Method for sending request to edbo.
	 * @param entrantId
	 * @param auto
	 * @return Array Of Returned Entrants.
	 */
	private ArrayOfDPersonAddRet sendEntrant(final Long entrantId, final Boolean auto) {
		ArrayOfDPersonAddRet response = null;
		
		if (auto) {
			PersonEntrantAuto entrant = personEntrantService.getEntrantAuto(entrantId);
			PersonEntrantAutoAdd entrantAdd = personEntrantAutoConverter.convert(entrant);
			
			response = service.createApplicantAutomatically(entrantAdd);
		} else {
			PersonEntrant entrant = personEntrantService.getEntrant(entrantId);
			PersonEntrantAdd entrantAdd = personEntrantConverter.convert(entrant);
			
			response = service.createApplicantManually(entrantAdd);
		}
		
		return response;
	}

	public void setPersonFindResourceConverter(final Converter<EdboPersonFindRequest, PersonsFind> personFindResourceConverter) {
		this.personFindResourceConverter = personFindResourceConverter;
	}

	public void setArrayOfDPersonFindResourceConverter(final Converter<ArrayOfDPersonsFind, List<EdboPersonResource>> arrayOfDPersonFindResourceConverter) {
		this.arrayOfDPersonFindResourceConverter = arrayOfDPersonFindResourceConverter;
	}

	public void setService(final EdboPersonService service) {
		this.service = service;
	}

	public void setPersonEntrantConverter(final Converter<PersonEntrant, PersonEntrantAdd> personEntrantConverter) {
		this.personEntrantConverter = personEntrantConverter;
	}

	public void setPersonEntrantAutoConverter(final Converter<PersonEntrantAuto, PersonEntrantAutoAdd> personEntrantAutoConverter) {
		this.personEntrantAutoConverter = personEntrantAutoConverter;
	}

	public void setEntrantPersonConverter(final Converter<ArrayOfDPersonAddRet, Person> entrantPersonConverter) {
		this.entrantPersonConverter = entrantPersonConverter;
	}

	public void setPersonResourceConverter(final Converter<Person, PersonResource> personResourceConverter) {
		this.personResourceConverter = personResourceConverter;
	}

	public void setPersonEntrantService(final PersonEntrantService personEntrantService) {
		this.personEntrantService = personEntrantService;
	}

	public void setPersonService(final Service<Person, Long> personService) {
		this.personService = personService;
	}

}
