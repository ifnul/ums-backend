package org.lnu.is.edbo;

import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.edbo.proxy.*;

import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.rmi.RemoteException;
import java.util.List;

@Component
public class Edbo {

	@Resource(name = "callService")
	private CallService callService;

	@Resource(name = "edbo")
	private EdboClient edbo;

	private String dateTimeNow = Main.getActualDate();
	private DLanguages languages;
    private DUniversities universities;

	private Integer getIdLanguage(String sessionGuid) {
		if (languages == null) {
			languages = edbo.languagesGet(sessionGuid).getDLanguages().get(0);
		}

		return languages.getIdLanguage();
	}

	private String getUniversityKode(String sessionGuid) {
		if (universities == null) {

			universities = edbo.universitiesGet(sessionGuid, "0176a9d2-e37c-4123-9688-a952e1374077",
					getIdLanguage(sessionGuid), dateTimeNow, "").getDUniversities().get(0);
		}
		return universities.getUniversityKode();
	}

    public void GetAllSpecoffer(boolean updateData, String sessionGuid, int yearSeason) throws RemoteException {

		List<DUniversityFacultetSpecialities> soecialities = edbo.universityFacultetSpecialitiesGet(sessionGuid, getUniversityKode(sessionGuid), "", "",
						getIdLanguage(sessionGuid), dateTimeNow, yearSeason, 0, "", "", "", "").getDUniversityFacultetSpecialities();

		for (DUniversityFacultetSpecialities spec : soecialities)
		{
            String actualDate = Main.getActualDate();

			SpecOffer specOffer = callService.AddSpecoffer(spec, updateData, sessionGuid, yearSeason);

			List<DUniversityFacultetSpecialitiesSubjects2> subjects = null;

			subjects = edbo
					.universityFacultetSpecialitiesSubjectsGet2(sessionGuid, getIdLanguage(sessionGuid),
							actualDate, spec.getUniversitySpecialitiesKode()).getDUniversityFacultetSpecialitiesSubjects2();

			for (DUniversityFacultetSpecialitiesSubjects2 subject : subjects)
				callService.AddSpecofferSubject(specOffer, subject, updateData);

			List<DUniversityFacultetSpecialitiesQuotas> quotas = edbo
					.universityFacultetSpecialitiesQuotasGet(sessionGuid, getIdLanguage(sessionGuid),
							actualDate, spec.getUniversitySpecialitiesKode(), 0).getDUniversityFacultetSpecialitiesQuotas();
			for (DUniversityFacultetSpecialitiesQuotas quota : quotas)
				callService.AddSpecofferQuota(specOffer, quota, updateData);
        }

	}

    public void GetAllRequest(String sessionGuid, int yearSeason) throws Exception {

		String actualDate = Main.getActualDate();

		List<DUniversityFacultetSpecialities> soecialities = edbo
				.universityFacultetSpecialitiesGet(sessionGuid, getUniversityKode(sessionGuid), "", "",
						getIdLanguage(sessionGuid), actualDate, yearSeason, 0, "", "", "", "").getDUniversityFacultetSpecialities();
		int i = 0 ;

		for (DUniversityFacultetSpecialities spec : soecialities) {
			List<DUniversityFacultetsRequests2> reqst = edbo
					.universityFacultetsGetRequests2(sessionGuid, yearSeason, "",
							spec.getUniversitySpecialitiesKode(), getIdLanguage(sessionGuid), actualDate, "", 1, "",
							//1, 4, 9, // Нові, допущені затримані
							0, 0, 0, //Всі
							0, spec.getUniversityKode(), 0, "").getDUniversityFacultetsRequests2();

			if (reqst == null)
				throw new Exception("null");
			if (reqst.size() == 0)
				continue;

			for (DUniversityFacultetsRequests2 zayava : reqst) {

				Long requestId = callService.AddRequest(zayava);

				List<DPersonsFind> persons = null;

				persons = edbo.personsFind(
						sessionGuid, actualDate, getIdLanguage(sessionGuid), "", "", "", "", 1,
						zayava.getPersonCodeU(), "").getDPersonsFind();

				if (persons == null)
					throw new Exception("null");
				DPersonsFind person = persons.get(0);
				Long personId = callService.AddPerson(person);

				List<DPersonAddresses2> personAddresses = edbo.personAddressesGet2(
						sessionGuid, actualDate, getIdLanguage(sessionGuid), person.getPersonCodeU(),
						0).getDPersonAddresses2();
				if (personAddresses == null)
					throw new Exception("null");
				for (DPersonAddresses2 addresses : personAddresses) {
					callService.AddPersonAddresses(personId, addresses);
				}
				List<DPersonDocuments> docs = edbo.personDocumentsGet(
						sessionGuid, actualDate, getIdLanguage(sessionGuid), person.getPersonCodeU(),
						0, 0, "", 0).getDPersonDocuments();
				if (docs == null)
					throw new Exception("null");
				for (DPersonDocuments doc : docs) {
					callService.AddPersonDocs(personId, doc);
				}
				List<DPersonBenefits> personBenefits = edbo
						.personBenefitsGet(sessionGuid, actualDate, getIdLanguage(sessionGuid),
								person.getIdPerson()).getDPersonBenefits();
				if (personBenefits == null)
					throw new Exception("null");
				for (DPersonBenefits benefits : personBenefits) {
					callService.AddPersonBenefit(personId, benefits);
				}
				List<DPersonDocumentsSubjects> znoPerson = edbo
						.personDocumentsSubjectsGet(sessionGuid, actualDate,
								getIdLanguage(sessionGuid), 0, person.getIdPerson(), 4).getDPersonDocumentsSubjects();
				if (znoPerson == null)
					throw new Exception("null");
				for (DPersonDocumentsSubjects docSubj : znoPerson)
					callService.AddPersonDocumentsSubjects(personId, docSubj);

				List<DPersonOlympiadsAwards> olympPerson = edbo
						.personOlympiadsAwardsGet(sessionGuid, actualDate,
								getIdLanguage(sessionGuid), person.getPersonCodeU(), yearSeason).getDPersonOlympiadsAwards();
				if (olympPerson == null)
					throw new Exception("null");
				for (DPersonOlympiadsAwards olymp : olympPerson) {
					callService.AddPersonOlymp(personId, olymp);
				}

				List<DPersonRequestBenefits> requestBenefits = edbo
						.personRequestBenefitsGet(sessionGuid, actualDate, getIdLanguage(sessionGuid),
								zayava.getIdPersonRequest()).getDPersonRequestBenefits();
				if (requestBenefits == null)
					throw new Exception("null");
				for (DPersonRequestBenefits benefit : requestBenefits) {
					callService.AddRequestOlymp(requestId, benefit);
				}

				List<DPersonRequestQuotas> requestKvota = edbo.personRequestQuotasGet(
						sessionGuid, actualDate, getIdLanguage(sessionGuid),
						zayava.getIdPersonRequest()).getDPersonRequestQuotas();
				if (requestKvota == null)
					throw new Exception("null");
				for (DPersonRequestQuotas kvotas : requestKvota) {
					callService.AddRequestKvota(requestId, kvotas);
				}

				List<DPersonRequestDocumentSubjects> zno = edbo
						.personRequestDocumentSubjectsGet(sessionGuid, actualDate,
								getIdLanguage(sessionGuid), zayava.getIdPersonRequest()).getDPersonRequestDocumentSubjects();
				if (zno == null)
					throw new Exception("null");

				for (DPersonRequestDocumentSubjects znoSubj : zno) {
					callService.AddRequestDocumentSubjects(requestId, znoSubj);
				}

				List<DPersonRequestOlympiadsAwards> olymp = edbo
						.personRequestOlympiadsAwardsGet(sessionGuid, actualDate,
								getIdLanguage(sessionGuid), zayava.getIdPersonRequest()).getDPersonRequestOlympiadsAwards();
				if (olymp == null)
					throw new Exception("null");
				for (DPersonRequestOlympiadsAwards olympiadsAwards : olymp) {
					callService.AddRequestOlympiadsAwards(requestId, olympiadsAwards);
				}

				List<DPersonRequestExaminations> exam = edbo
						.personRequestExaminationsGet(sessionGuid, actualDate,
								getIdLanguage(sessionGuid), zayava.getIdPersonRequest()).getDPersonRequestExaminations();
				if (exam == null)
					throw new Exception("null");
				for (DPersonRequestExaminations examSubj : exam) {
					callService.AddRequestExaminations(requestId, examSubj);
				}
			}
		}
    }
}

