package org.lnu.is.edbo;

import ua.edboservice.DLanguages;
import ua.edboservice.DPersonAddresses2;
import ua.edboservice.DPersonBenefits;
import ua.edboservice.DPersonDocuments;
import ua.edboservice.DPersonDocumentsSubjects;
import ua.edboservice.DPersonOlympiadsAwards;
import ua.edboservice.DPersonRequestBenefits;
import ua.edboservice.DPersonRequestDocumentSubjects;
import ua.edboservice.DPersonRequestExaminations;
import ua.edboservice.DPersonRequestOlympiadsAwards;
import ua.edboservice.DPersonRequestQuotas;
import ua.edboservice.DPersonsFind;
import ua.edboservice.DUniversityFacultetsRequests2;

import java.rmi.RemoteException;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * @since 3/7/16
 */
class WorkAddRequest implements Callable<Void> {
    private Edbo edbo;
    private DUniversityFacultetsRequests2 zayava;
    private Integer i;
    private CallService callService;
	private DLanguages language;

	public WorkAddRequest(Edbo edbo, DUniversityFacultetsRequests2 ex, Integer i,
						  CallService callService,
						  DLanguages language) {
        this.edbo = edbo;
        this.zayava = ex;
        this.i = i;
        this.callService = callService;
		this.language = language;
    }


    public Void call() {
        try {
			String actualDate = Main.getActualDate();

			Long requestId = callService.AddRequest(zayava);

			List<DPersonsFind> persons = null;

            persons = ConnectionEDBO.Instance().GetPerson().personsFind(
					ConnectionEDBO.SessionGuid, actualDate, language.getIdLanguage(), "", "", "", "", 1,
					zayava.getPersonCodeU(), "").getDPersonsFind();

			if (persons == null)
				throw new Exception("null");
			DPersonsFind person = persons.get(0);
			Long personId = callService.AddPerson(person);

			List<DPersonAddresses2> personAddresses = ConnectionEDBO.Instance().GetPerson().personAddressesGet2(
					ConnectionEDBO.SessionGuid, actualDate, language.getIdLanguage(), person.getPersonCodeU(),
					0).getDPersonAddresses2();
			if (personAddresses == null)
				throw new Exception("null");
			for (DPersonAddresses2 addresses : personAddresses) {
				callService.AddPersonAddresses(personId, addresses);
			}
			List<DPersonDocuments> docs = ConnectionEDBO.Instance().GetPerson().personDocumentsGet(
					ConnectionEDBO.SessionGuid, actualDate, language.getIdLanguage(), person.getPersonCodeU(),
					0, 0, "", 0).getDPersonDocuments();
			if (docs == null)
				throw new Exception("null");
			for (DPersonDocuments doc : docs) {
				callService.AddPersonDocs(personId, doc);
			}
			List<DPersonBenefits> personBenefits = ConnectionEDBO.Instance().GetPerson()
					.personBenefitsGet(ConnectionEDBO.SessionGuid, actualDate, language.getIdLanguage(),
							person.getIdPerson()).getDPersonBenefits();
			if (personBenefits == null)
				throw new Exception("null");
			for (DPersonBenefits benefits : personBenefits) {
				callService.AddPersonBenefit(personId, benefits);
			}
			List<DPersonDocumentsSubjects> znoPerson = ConnectionEDBO.Instance().GetPerson()
					.personDocumentsSubjectsGet(ConnectionEDBO.SessionGuid, actualDate,
							language.getIdLanguage(), 0, person.getIdPerson(), 4).getDPersonDocumentsSubjects();
			if (znoPerson == null)
				throw new Exception("null");
			for (DPersonDocumentsSubjects docSubj : znoPerson)
				callService.AddPersonDocumentsSubjects(personId, docSubj);

			List<DPersonOlympiadsAwards> olympPerson = ConnectionEDBO.Instance().GetPerson()
					.personOlympiadsAwardsGet(ConnectionEDBO.SessionGuid, actualDate,
							language.getIdLanguage(), person.getPersonCodeU(), ConnectionEDBO.YearSeason).getDPersonOlympiadsAwards();
			if (olympPerson == null)
				throw new Exception("null");
			for (DPersonOlympiadsAwards olymp : olympPerson) {
				callService.AddPersonOlymp(personId, olymp);
			}


			List<DPersonRequestBenefits> requestBenefits = ConnectionEDBO.Instance().GetPerson()
					.personRequestBenefitsGet(ConnectionEDBO.SessionGuid, actualDate, language.getIdLanguage(),
							zayava.getIdPersonRequest()).getDPersonRequestBenefits();
			if (requestBenefits == null)
				throw new Exception("null");
			for (DPersonRequestBenefits benefit : requestBenefits) {
				callService.AddRequestOlymp(requestId, benefit);
			}

			List<DPersonRequestQuotas> requestKvota = ConnectionEDBO.Instance().GetPerson().personRequestQuotasGet(
					ConnectionEDBO.SessionGuid, actualDate, language.getIdLanguage(),
					zayava.getIdPersonRequest()).getDPersonRequestQuotas();
			if (requestKvota == null)
				throw new Exception("null");
            for (DPersonRequestQuotas kvotas : requestKvota) {
                callService.AddRequestKvota(requestId, kvotas);
            }

			List<DPersonRequestDocumentSubjects> zno = ConnectionEDBO.Instance().GetPerson()
					.personRequestDocumentSubjectsGet(ConnectionEDBO.SessionGuid, actualDate,
							language.getIdLanguage(), zayava.getIdPersonRequest()).getDPersonRequestDocumentSubjects();
			if (zno == null)
				throw new Exception("null");

            for (DPersonRequestDocumentSubjects znoSubj : zno) {
                callService.AddRequestDocumentSubjects(requestId, znoSubj);
            }

			List<DPersonRequestOlympiadsAwards> olymp = ConnectionEDBO.Instance().GetPerson()
					.personRequestOlympiadsAwardsGet(ConnectionEDBO.SessionGuid, actualDate,
							language.getIdLanguage(), zayava.getIdPersonRequest()).getDPersonRequestOlympiadsAwards();
			if (olymp == null)
				throw new Exception("null");
            for (DPersonRequestOlympiadsAwards olympiadsAwards : olymp) {
                callService.AddRequestOlympiadsAwards(requestId, olympiadsAwards);
            }

			List<DPersonRequestExaminations> exam = ConnectionEDBO.Instance().GetPerson()
					.personRequestExaminationsGet(ConnectionEDBO.SessionGuid, actualDate,
							language.getIdLanguage(), zayava.getIdPersonRequest()).getDPersonRequestExaminations();
			if (exam == null)
				throw new Exception("null");
            for (DPersonRequestExaminations examSubj : exam) {
                callService.AddRequestExaminations(requestId, examSubj);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(i);
        return null;
    }
}
