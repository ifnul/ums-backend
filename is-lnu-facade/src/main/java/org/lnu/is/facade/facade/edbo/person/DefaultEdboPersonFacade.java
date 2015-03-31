package org.lnu.is.facade.facade.edbo.person;

import java.util.List;

import org.is.lnu.edbo.resource.person.EdboPersonFindRequest;
import org.is.lnu.edbo.resource.person.EdboPersonResource;
import org.is.lnu.edbo.service.person.EdboPersonService;
import org.lnu.is.converter.Converter;

import ua.edboservice.ArrayOfDPersonsFind;
import ua.edboservice.PersonsFind;

/**
 * Default implementation of edbo person facade.
 * @author ivanursul
 *
 */
public class DefaultEdboPersonFacade implements EdboPersonFacade {

	private Converter<EdboPersonFindRequest, PersonsFind> personFindResourceConverter;
	private Converter<ArrayOfDPersonsFind, List<EdboPersonResource>> arrayOfDPersonFindResourceConverter;
	private EdboPersonService service;
	
	@Override
	public List<EdboPersonResource> findPersons(final EdboPersonFindRequest request) {
		PersonsFind personsFind = personFindResourceConverter.convert(request);
		ArrayOfDPersonsFind persons = service.findPerson(personsFind);
		
		return arrayOfDPersonFindResourceConverter.convert(persons);
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

}
