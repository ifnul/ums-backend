package org.is.lnu.edbo.service.person;

import org.is.lnu.edbo.handler.ExceptionHandler;
import org.is.lnu.edbo.service.BaseEdboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ua.edboservice.ArrayOfDPersonAddRet;
import ua.edboservice.ArrayOfDPersonsFind;
import ua.edboservice.EDBOPersonSoap;
import ua.edboservice.PersonEntrantAdd;
import ua.edboservice.PersonEntrantAutoAdd;
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
	public ArrayOfDPersonsFind findPerson(final PersonsFind request) {
		LOG.info("Starting to search person by method personsFind");
		EDBOPersonSoap client = getServiceManager().getWebServiceClient();
		
		ArrayOfDPersonsFind response = client.personsFind(request.getSessionGUID(),
				request.getActualDate(),
				request.getIdLanguage(),
				request.getFIOMask(),
				request.getDocumentSeries(),
				request.getDocumentNumber(),
				request.getIdsDocumentTypes(),
				request.getHundred(),
				request.getPersonCodeU(),
				request.getFilters());
		
		if (response == null) {
			exceptionHandler.handle(request.getSessionGUID());
		}
		
		return response;
	}

	@Override
	public ArrayOfDPersonAddRet createApplicantManually(final PersonEntrantAdd request) {
		LOG.info("Creating new person manually");
		EDBOPersonSoap client = getServiceManager().getWebServiceClient();
		
		ArrayOfDPersonAddRet response = client.personEntrantAdd(request.getSessionGUID(), 
				request.getIdLanguage(), 
				request.getResident(), 
				request.getBirthday(), 
				request.getIdPersonSex(), 
				request.getFirstName(), 
				request.getMiddleName(), 
				request.getLastName(), 
				request.getKOATUUCode(), 
				request.getIdStreetType(), 
				request.getAdress(), 
				request.getHomeNumber(), 
				request.getEntrantDocumentSeries(), 
				request.getEntrantDocumentNumber(), 
				request.getEntrantDocumentDate(), 
				request.getEntrantDocumentValue(), 
				request.getPasportSeries(), 
				request.getPasportNumber(), 
				request.getPasportIssued(), 
				request.getPasportDate(), 
				request.getBirthCertificateSeries(), 
				request.getBirthCertificateNumber(), 
				request.getBirthCertificateDate(), 
				request.getKodeSchool(), 
				request.getPhone(), 
				request.getMobile(), 
				request.getEmail(), 
				request.getSkype(), 
				request.getICQ(), 
				request.getIsForeinghEntrantDocumet(), 
				request.getIsNotCheckAttestat(), 
				request.getIdEntrantDocumnetType(), 
				request.getEntrantDocumnetUniversityKode(), 
				request.getFather(), 
				request.getFather(), 
				request.getFatherPhones(), 
				request.getMotherPhones(), 
				request.getPostIndex(), 
				request.getBirthplace(), 
				request.getLanguagesAreStudied(), 
				request.getEntrantDocumentIssued(), 
				request.getIdEntrantDocumentsAwardType(), 
				request.getAllowProcessedPersonalData(), 
				request.getPosvidkaSeries(), 
				request.getPosvidkaNumber(), 
				request.getPosvidkaIssued(), 
				request.getPosvidkaDate(), 
				request.getIdCountry());
		
		if (response == null) {
			exceptionHandler.handle(request.getSessionGUID());
		}
		
		return response;
	}

	@Override
	public ArrayOfDPersonAddRet createApplicantAutomatically(final PersonEntrantAutoAdd person) {
		return null;
	}

	public void setExceptionHandler(final ExceptionHandler exceptionHandler) {
		this.exceptionHandler = exceptionHandler;
	}

}
