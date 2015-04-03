package org.lnu.is.converter.person.entrant;

import javax.annotation.Resource;

import org.is.lnu.edbo.service.language.EdboLanguageService;
import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.person.entrant.PersonEntrant;
import org.lnu.is.domain.session.Session;
import org.lnu.is.security.service.SessionService;

import ua.edboservice.PersonEntrantAdd;

/**
 * Converter for cnverting from view to edbo proxy class.
 * @author ivanursul
 *
 */
@Converter("personEntrantConverter")
public class PersonEntrantConverter extends AbstractConverter<PersonEntrant, PersonEntrantAdd> {

	@Resource(name = "sessionService")
	private SessionService sessionService;
	
	@Resource(name = "edboLanguageService")
	private EdboLanguageService languageService;
	
	@Override
	public PersonEntrantAdd convert(final PersonEntrant source, final PersonEntrantAdd target) {
		Session session = sessionService.getSession();
		target.setSessionGUID(session.getEdboAuthentification().getSessionGUID());
		target.setIdLanguage(languageService.getDefaultLanguage(session.getEdboAuthentification()));
		
		target.setAdress(source.getAdress());
		target.setAllowProcessedPersonalData(source.getAllowProcessedPersonalData());
		target.setBirthCertificateDate(source.getBirthCertificateDate());
		target.setBirthCertificateNumber(source.getBirthCertificateNumber());
		target.setBirthCertificateSeries(source.getBirthCertificateSeries());
		target.setBirthday(source.getBirthday());
		target.setBirthplace(source.getBirthplace());
		target.setEmail(source.getEmail());
		target.setEntrantDocumentDate(source.getEntrantDocumentDate());
		target.setEntrantDocumentIssued(source.getEntrantDocumentIssued());
		target.setEntrantDocumentNumber(source.getEntrantDocumentNumber());
		target.setEntrantDocumentSeries(source.getEntrantDocumentSeries());
		target.setEntrantDocumentValue(source.getEntrantDocumentValue());
		target.setEntrantDocumnetUniversityKode(source.getEntrantDocumnetUniversityKode());
		target.setFather(source.getFather());
		target.setFatherPhones(source.getFatherPhones());
		target.setFirstName(source.getFirstName());
		target.setHomeNumber(source.getHomeNumber());
		target.setICQ(source.getIcq());
		target.setIdCountry(source.getIdCountry());
		target.setIdEntrantDocumentsAwardType(source.getIdEntrantDocumentsAwardType());
		target.setIdEntrantDocumnetType(source.getIdEntrantDocumnetType());
		target.setIdPersonSex(source.getIdPersonSex());
		target.setIdStreetType(source.getIdStreetType());
		target.setIsForeinghEntrantDocumet(source.getIsForeinghEntrantDocumet());
		target.setIsNotCheckAttestat(source.getIsNotCheckAttestat());
		target.setKOATUUCode(source.getKoatuuCode());
		target.setKodeSchool(source.getKodeSchool());
		target.setLanguagesAreStudied(source.getLanguagesAreStudied());
		target.setLastName(source.getLastName());
		target.setMiddleName(source.getMiddleName());
		target.setMobile(source.getMobile());
		target.setMother(source.getMother());
		target.setMotherPhones(source.getMotherPhones());
		target.setPasportDate(source.getPasportDate());
		target.setPasportIssued(source.getPasportIssued());
		target.setPasportNumber(source.getPasportNumber());
		target.setPasportSeries(source.getPasportSeries());
		target.setPhone(source.getPhone());
		target.setPostIndex(source.getPostIndex());
		target.setPosvidkaDate(source.getPosvidkaDate());
		target.setPosvidkaIssued(source.getPosvidkaIssued());
		target.setPosvidkaNumber(source.getPosvidkaNumber());
		target.setPosvidkaSeries(source.getPosvidkaSeries());
		target.setResident(source.getResident());
		target.setSkype(source.getSkype());
		
		return target;
	}

	@Override
	public PersonEntrantAdd convert(final PersonEntrant source) {
		return convert(source, new PersonEntrantAdd());
	}

}
