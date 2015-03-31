package org.is.lnu.edbo.service.person;

import org.is.lnu.edbo.handler.ExceptionHandler;
import org.is.lnu.edbo.service.BaseEdboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ua.edboservice.ArrayOfDPersonsFind;
import ua.edboservice.EDBOPersonSoap;
import ua.edboservice.PersonsFind;

/**
 * Default implementation of EdboPersonService.
 * @author ivanursul
 *
 */
public class DefaultEdboPersonService extends BaseEdboService<EDBOPersonSoap> implements EdboPersonService {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultEdboPersonService.class);
	
	private ExceptionHandler exceptionHandler;
	
	@Override
	public ArrayOfDPersonsFind findPerson(final PersonsFind person) {
		LOG.info("Starting to search person by method personsFind");
		EDBOPersonSoap client = getServiceManager().getWebServiceClient();
		
		ArrayOfDPersonsFind persons = client.personsFind(person.getSessionGUID(),
				person.getActualDate(),
				person.getIdLanguage(),
				person.getFIOMask(),
				person.getDocumentSeries(),
				person.getDocumentNumber(),
				person.getIdsDocumentTypes(),
				person.getHundred(),
				person.getPersonCodeU(),
				person.getFilters());
		
		if (persons == null) {
			exceptionHandler.handle(person.getSessionGUID());
		}
		
		return persons;
	}

	public void setExceptionHandler(final ExceptionHandler exceptionHandler) {
		this.exceptionHandler = exceptionHandler;
	}

}
