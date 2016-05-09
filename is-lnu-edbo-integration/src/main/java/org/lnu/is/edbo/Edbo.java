package org.lnu.is.edbo;

import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.edbo.exeption.EdboExeption;
import org.lnu.is.edbo.exeption.EdboType;
import org.lnu.is.edbo.proxy.*;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component("edboIntegration")
public class Edbo {

	@Resource(name = "callService")
	private CallService callService;

	@Resource
	private EDBOPerson EDBOPerson;

	@Resource
	private EDBOGuides EDBOGuides;

	private DLanguages languages;
    private DUniversities universities;

	public EDBOPersonSoap edboPerson(){
		return EDBOPerson.getEDBOPersonSoap();
	}

	public EDBOGuidesSoap edboGuides(){
		return EDBOGuides.getEDBOGuidesSoap();
	}

	private Integer getIdLanguage(String sessionGuid) {
		if (languages == null) {
			languages = edboGuides().languagesGet(sessionGuid).getDLanguages().get(0);
		}

		return languages.getIdLanguage();
	}

	private String getUniversityKode(String sessionGuid, String actualDate) {
		if (universities == null) {

			universities = edboGuides().universitiesGet(sessionGuid, "0176a9d2-e37c-4123-9688-a952e1374077",
					getIdLanguage(sessionGuid), actualDate, "").getDUniversities().get(0);
		}
		return universities.getUniversityKode();
	}

    public void synchronizeSpecoffers(boolean updateData, String sessionGuid, int yearSeason, String actualDate) {

			List<DUniversityFacultetSpecialities> soecialities = edboGuides().universityFacultetSpecialitiesGet(sessionGuid, getUniversityKode(sessionGuid, actualDate), "", "",
					getIdLanguage(sessionGuid), actualDate, yearSeason, 0, "", "", "", "").getDUniversityFacultetSpecialities();

			for (DUniversityFacultetSpecialities spec : soecialities) {

				SpecOffer specOffer = callService.AddSpecoffer(spec, updateData, sessionGuid, yearSeason);

				List<DUniversityFacultetSpecialitiesSubjects2> subjects = EDBOGuides.getEDBOGuidesSoap()
						.universityFacultetSpecialitiesSubjectsGet2(sessionGuid, getIdLanguage(sessionGuid),
								actualDate, spec.getUniversitySpecialitiesKode()).getDUniversityFacultetSpecialitiesSubjects2();

				for (DUniversityFacultetSpecialitiesSubjects2 subject : subjects)
					callService.AddSpecofferSubject(specOffer, subject, updateData);

				List<DUniversityFacultetSpecialitiesQuotas> quotas = edboGuides()
						.universityFacultetSpecialitiesQuotasGet(sessionGuid, getIdLanguage(sessionGuid),
								actualDate, spec.getUniversitySpecialitiesKode(), 0).getDUniversityFacultetSpecialitiesQuotas();
				for (DUniversityFacultetSpecialitiesQuotas quota : quotas)
					callService.AddSpecofferQuota(specOffer, quota, updateData);
			}
	}

    public void synchronizeRequests(boolean updateExist, String sessionGuid, int yearSeason, String actualDate ) {

		List<DUniversityFacultetSpecialities> soecialities = edboGuides()
				.universityFacultetSpecialitiesGet(sessionGuid, getUniversityKode(sessionGuid, actualDate), "", "",
						getIdLanguage(sessionGuid), actualDate, yearSeason, 0, "", "", "", "").getDUniversityFacultetSpecialities();
		int i = 0 ;

		for (DUniversityFacultetSpecialities spec : soecialities) {
			List<DUniversityFacultetsRequests2> reqst = edboGuides()
					.universityFacultetsGetRequests2(sessionGuid, yearSeason, "",
							spec.getUniversitySpecialitiesKode(), getIdLanguage(sessionGuid), actualDate, "", 1, "",
							//1, 4, 9, // Нові, допущені затримані
							0, 0, 0, //Всі
							0, spec.getUniversityKode(), 0, "").getDUniversityFacultetsRequests2();

			if (reqst == null)
				throw new EdboExeption("null", EdboType.Request);
			if (reqst.size() == 0)
				continue;

			for (DUniversityFacultetsRequests2 zayava : reqst) {

				Enrolment requestId = callService.AddRequest(zayava, updateExist);

				List<DPersonsFind> persons = null;

				persons = edboPerson().personsFind(
						sessionGuid, actualDate, getIdLanguage(sessionGuid), "", "", "", "", 1,
						zayava.getPersonCodeU(), "").getDPersonsFind();

				if (persons == null)
					throw new EdboExeption("null", EdboType.Person);
				DPersonsFind person = persons.get(0);
				Person personId = callService.AddPerson(person, updateExist);

				List<DPersonAddresses2> personAddresses = edboPerson().personAddressesGet2(
						sessionGuid, actualDate, getIdLanguage(sessionGuid), person.getPersonCodeU(),
						0).getDPersonAddresses2();
				if (personAddresses == null)
					throw new EdboExeption("null", EdboType.PersonAddres);
				for (DPersonAddresses2 addresses : personAddresses) {
					callService.AddPersonAddresses(personId, addresses, updateExist);
				}
				List<DPersonDocuments> docs = edboPerson().personDocumentsGet(
						sessionGuid, actualDate, getIdLanguage(sessionGuid), person.getPersonCodeU(),
						0, 0, "", 0).getDPersonDocuments();
				if (docs == null)
					throw new EdboExeption("null", EdboType.PersonDocument);
				for (DPersonDocuments doc : docs) {
					callService.AddPersonDocs(personId, doc);
				}
				List<DPersonBenefits> personBenefits = edboPerson()
						.personBenefitsGet(sessionGuid, actualDate, getIdLanguage(sessionGuid),
								person.getIdPerson()).getDPersonBenefits();
				if (personBenefits == null)
					throw new EdboExeption("null", EdboType.PersonBenefit);
				for (DPersonBenefits benefits : personBenefits) {
					callService.AddPersonBenefit(personId, benefits);
				}
				List<DPersonDocumentsSubjects> znoPerson = edboPerson()
						.personDocumentsSubjectsGet(sessionGuid, actualDate,
								getIdLanguage(sessionGuid), 0, person.getIdPerson(), 4).getDPersonDocumentsSubjects();
				if (znoPerson == null)
					throw new EdboExeption("null", EdboType.PersonDocumentSubject);
				for (DPersonDocumentsSubjects docSubj : znoPerson)
					callService.AddPersonDocumentsSubjects(personId, docSubj);

				List<DPersonOlympiadsAwards> olympPerson = edboPerson()
						.personOlympiadsAwardsGet(sessionGuid, actualDate,
								getIdLanguage(sessionGuid), person.getPersonCodeU(), yearSeason).getDPersonOlympiadsAwards();
				if (olympPerson == null)
					throw new EdboExeption("null", EdboType.PersonOlympiadsAwards);
				for (DPersonOlympiadsAwards olymp : olympPerson) {
					callService.AddPersonOlymp(personId, olymp);
				}

				List<DPersonRequestBenefits> requestBenefits = edboPerson()
						.personRequestBenefitsGet(sessionGuid, actualDate, getIdLanguage(sessionGuid),
								zayava.getIdPersonRequest()).getDPersonRequestBenefits();
				if (requestBenefits == null)
					throw new EdboExeption("null", EdboType.RequestBenefits);
				for (DPersonRequestBenefits benefit : requestBenefits) {
					callService.AddRequestBenefits(requestId, benefit, updateExist);
				}

				List<DPersonRequestQuotas> requestKvota = edboPerson().personRequestQuotasGet(
						sessionGuid, actualDate, getIdLanguage(sessionGuid),
						zayava.getIdPersonRequest()).getDPersonRequestQuotas();
				if (requestKvota == null)
					throw new EdboExeption("null", EdboType.RequestQuota);
				for (DPersonRequestQuotas kvotas : requestKvota) {
					callService.AddRequestKvota(requestId, kvotas);
				}

				List<DPersonRequestDocumentSubjects> zno = edboPerson()
						.personRequestDocumentSubjectsGet(sessionGuid, actualDate,
								getIdLanguage(sessionGuid), zayava.getIdPersonRequest()).getDPersonRequestDocumentSubjects();
				if (zno == null)
					throw new EdboExeption("null", EdboType.RequestDocumentSubject);

				for (DPersonRequestDocumentSubjects znoSubj : zno) {
					callService.AddRequestDocumentSubjects(requestId, znoSubj);
				}

				List<DPersonRequestOlympiadsAwards> olymp = edboPerson()
						.personRequestOlympiadsAwardsGet(sessionGuid, actualDate,
								getIdLanguage(sessionGuid), zayava.getIdPersonRequest()).getDPersonRequestOlympiadsAwards();
				if (olymp == null)
					throw new EdboExeption("null", EdboType.RequestOlympiadAward);
				for (DPersonRequestOlympiadsAwards olympiadsAwards : olymp) {
					callService.AddRequestOlympiadsAwards(requestId, olympiadsAwards);
				}

				List<DPersonRequestExaminations> exam = edboPerson()
						.personRequestExaminationsGet(sessionGuid, actualDate,
								getIdLanguage(sessionGuid), zayava.getIdPersonRequest()).getDPersonRequestExaminations();
				if (exam == null)
					throw new EdboExeption("null", EdboType.RequestExaminations);
				for (DPersonRequestExaminations examSubj : exam) {
					callService.AddRequestExaminations(requestId, examSubj);
				}
			}
		}
    }
}
