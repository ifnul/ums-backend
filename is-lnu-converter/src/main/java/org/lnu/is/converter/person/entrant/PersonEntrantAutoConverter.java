package org.lnu.is.converter.person.entrant;

import javax.annotation.Resource;

import org.is.lnu.edbo.model.authentification.EdboAuthentification;
import org.is.lnu.edbo.service.language.EdboLanguageService;
import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.person.entrant.PersonEntrantAuto;
import org.lnu.is.security.service.SessionService;

import ua.edboservice.PersonEntrantAutoAdd;

/**
 * Converter for converting from View to proxy class.
 * @author ivanursul
 *
 */
@Converter("personEntrantAutoConverter")
public class PersonEntrantAutoConverter extends AbstractConverter<PersonEntrantAuto, PersonEntrantAutoAdd> {

	@Resource(name = "sessionService")
	private SessionService sessionService;
	
	@Resource(name = "edboLanguageService")
	private EdboLanguageService languageService;
	
	@Override
	public PersonEntrantAutoAdd convert(final PersonEntrantAuto source, final PersonEntrantAutoAdd target) {
		EdboAuthentification authentification = sessionService.getSession().getEdboAuthentification();

		target.setIdLanguage(languageService.getDefaultLanguage(authentification));
		target.setSessionGUID(authentification.getSessionGUID());

		target.setAllowProcessedPersonalData(source.getAllowProcessedPersonalData());
		target.setAttestatDate(source.getAttestatDate());
		target.setAttestatNumber(source.getAttestatNumber());
		target.setAttestatSeries(source.getAttestatSeries());
		target.setAttestatValue(source.getAttestatValue());
		target.setBirthCertificateDate(source.getBirthCertificateDate());
		target.setBirthCertificateNumber(source.getBirthCertificateNumber());
		target.setBirthCertificateSeries(source.getBirthCertificateSeries());
		target.setBirthplace(source.getBirthplace());
		target.setEmail(source.getEmail());
		target.setFather(source.getFather());
		target.setFatherPhones(source.getFatherPhones());
		target.setICQ(source.getIcq());
		target.setIdEntrantDocumentsAwardType(source.getIdEntrantDocumentsAwardType());
		target.setIdPersonSex(source.getIdPersonSex());
		target.setKodeSchool(source.getKodeSchool());
		target.setLanguagesAreStudied(source.getLanguagesAreStudied());
		target.setMobile(source.getMobile());
		target.setMother(source.getMother());
		target.setMotherPhones(source.getMotherPhones());
		target.setPasportDate(source.getPasportDate());
		target.setPasportIssued(source.getPasportIssued());
		target.setPasportNumber(source.getPasportNumber());
		target.setPasportSeries(source.getPasportSeries());
		target.setPhone(source.getPhone());
		target.setSkype(source.getSkype());
		target.setZNODateGet(source.getZnoDateGet());
		target.setZNONumbers(source.getZnoNumbers());
		target.setZNOPin(source.getZnoPin());
		
		return target;
	}

	@Override
	public PersonEntrantAutoAdd convert(final PersonEntrantAuto source) {
		return convert(source, new PersonEntrantAutoAdd());
	}

}
