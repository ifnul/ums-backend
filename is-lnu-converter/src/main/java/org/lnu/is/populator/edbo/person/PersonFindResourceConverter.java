package org.lnu.is.populator.edbo.person;

import javax.annotation.Resource;

import org.is.lnu.edbo.model.authentification.EdboAuthentification;
import org.is.lnu.edbo.resource.person.EdboPersonFindRequest;
import org.is.lnu.edbo.service.date.ActualDateService;
import org.is.lnu.edbo.service.language.EdboLanguageService;
import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.security.service.SessionService;

import ua.edboservice.PersonsFind;

/**
 * Converter for converting from EdboPersonFindRequest, which comes from controller.
 * @author ivanursul
 *
 */
@Converter("personFindResourceConverter")
public class PersonFindResourceConverter extends AbstractConverter<EdboPersonFindRequest, PersonsFind>  {

	@Resource(name = "sessionService")
	private SessionService sessionService;
	
	@Resource(name = "edboActualDateService")
	private ActualDateService actualDateService;
	
	@Resource(name = "edboLanguageService")
	private EdboLanguageService languageService;
	
	@Override
	public PersonsFind convert(final EdboPersonFindRequest source, final PersonsFind target) {
		EdboAuthentification authentification = sessionService.getSession().getEdboAuthentification();

		target.setSessionGUID(authentification.getSessionGUID());
		target.setActualDate(actualDateService.getActualDate());
		target.setIdLanguage(languageService.getDefaultLanguage(authentification));
		
		target.setDocumentNumber(source.getDocumentNumber());
		target.setDocumentSeries(source.getDocumentSeries());
		target.setFilters(source.getFilters());
		target.setFIOMask(source.getFioMask());
		target.setHundred(source.getHundred());
		target.setIdsDocumentTypes(source.getIdsDocumentTypes());
		target.setPersonCodeU(source.getPersonCodeU());
		
		return target;
	}

	@Override
	public PersonsFind convert(final EdboPersonFindRequest source) {
		return convert(source, new PersonsFind());
	}

}
