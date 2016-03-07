package org.lnu.is.edbo;

import org.lnu.is.domain.specoffer.SpecOffer;
import ua.edboservice.*;

import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



class Edbo {

	class WorkAddSpecOffer implements Callable<Void>
	{
		private DUniversityFacultetSpecialities spec;
		private Integer i;
		public WorkAddSpecOffer(DUniversityFacultetSpecialities ex, Integer i){
			spec = ex;
			this.i = i;
		}


		public Void call() throws Exception {
			try {
				String actualDate = Main.getActualDate();

				SpecOffer specOffer = CallService.Instance().AddSpecoffer(spec);

				List<DUniversityFacultetSpecialitiesSubjects2> subjects = null;

				subjects = ConnectionEDBO.Instance().GetGuides()
						.universityFacultetSpecialitiesSubjectsGet2(ConnectionEDBO.SessionGuid, Language.getIdLanguage(),
								actualDate, spec.getUniversitySpecialitiesKode()).getDUniversityFacultetSpecialitiesSubjects2();

				for (DUniversityFacultetSpecialitiesSubjects2 subject : subjects)
					CallService.Instance().AddSpecofferSubject(specOffer, subject);

				List<DUniversityFacultetSpecialitiesQuotas> quotas = ConnectionEDBO.Instance().GetGuides()
						.universityFacultetSpecialitiesQuotasGet(ConnectionEDBO.SessionGuid, Language.getIdLanguage(),
								actualDate, spec.getUniversitySpecialitiesKode(), 0).getDUniversityFacultetSpecialitiesQuotas();
				for (DUniversityFacultetSpecialitiesQuotas quota : quotas)
					CallService.Instance().AddSpecofferQuota(specOffer, quota);
			} catch (RemoteException e) {
				e.printStackTrace();
			}
			System.out.println(i);
			return null;
		}
	}
	class WorkAddRequest implements Callable<Void>
	{
		private DUniversityFacultetsRequests2 zayava;
		private Integer i;
		public WorkAddRequest(DUniversityFacultetsRequests2 ex, Integer i){
			zayava = ex;
			this.i = i;
		}


		public Void call(){
			try {
			String actualDate = Main.getActualDate();

			Long requestId = CallService.Instance().AddRequest(zayava);

			List<DPersonsFind> persons = null;

				persons = ConnectionEDBO.Instance().GetPerson().personsFind(
                        ConnectionEDBO.SessionGuid, actualDate, Language.getIdLanguage(), "", "", "", "", 1,
                        zayava.getPersonCodeU(), "").getDPersonsFind();

			if (persons == null)
				throw new Exception("null");
			DPersonsFind person = persons.get(0);
			Long personId = CallService.Instance().AddPerson(person);

			List<DPersonAddresses2> personAddresses = ConnectionEDBO.Instance().GetPerson().personAddressesGet2(
					ConnectionEDBO.SessionGuid, actualDate, Language.getIdLanguage(), person.getPersonCodeU(),
					0).getDPersonAddresses2();
			if (personAddresses == null)
				throw new Exception("null");
			for(DPersonAddresses2 addresses : personAddresses){
				CallService.Instance().AddPersonAddresses(personId, addresses);
			}
			List<DPersonDocuments> docs = ConnectionEDBO.Instance().GetPerson().personDocumentsGet(
					ConnectionEDBO.SessionGuid, actualDate, Language.getIdLanguage(), person.getPersonCodeU(),
					0, 0, "", 0).getDPersonDocuments();
			if (docs == null)
				throw new Exception("null");
			for(DPersonDocuments doc : docs){
				CallService.Instance().AddPersonDocs(personId, doc);
			}
			List<DPersonBenefits> personBenefits = ConnectionEDBO.Instance().GetPerson()
					.personBenefitsGet(ConnectionEDBO.SessionGuid, actualDate, Language.getIdLanguage(),
							person.getIdPerson()).getDPersonBenefits();
			if (personBenefits == null)
				throw new Exception("null");
			for(DPersonBenefits benefits : personBenefits){
				CallService.Instance().AddPersonBenefit(personId, benefits);
			}
			List<DPersonDocumentsSubjects> znoPerson = ConnectionEDBO.Instance().GetPerson()
					.personDocumentsSubjectsGet(ConnectionEDBO.SessionGuid, actualDate,
							Language.getIdLanguage(), 0, person.getIdPerson(), 4).getDPersonDocumentsSubjects();
			if (znoPerson == null)
				throw new Exception("null");
			for (DPersonDocumentsSubjects docSubj: znoPerson)
				CallService.Instance().AddPersonDocumentsSubjects(personId, docSubj);

			List<DPersonOlympiadsAwards> olympPerson = ConnectionEDBO.Instance().GetPerson()
					.personOlympiadsAwardsGet(ConnectionEDBO.SessionGuid, actualDate,
							Language.getIdLanguage(), person.getPersonCodeU(), ConnectionEDBO.YearSeason).getDPersonOlympiadsAwards();
			if (olympPerson == null)
				throw new Exception("null");
			for(DPersonOlympiadsAwards olymp : olympPerson){
				CallService.Instance().AddPersonOlymp(personId, olymp);
			}


			List<DPersonRequestBenefits> requestBenefits = ConnectionEDBO.Instance().GetPerson()
					.personRequestBenefitsGet(ConnectionEDBO.SessionGuid, actualDate, Language.getIdLanguage(),
							zayava.getIdPersonRequest()).getDPersonRequestBenefits();
			if (requestBenefits == null)
				throw new Exception("null");
			for(DPersonRequestBenefits benefit : requestBenefits){
				CallService.Instance().AddRequestOlymp(requestId, benefit);
			}

			List<DPersonRequestQuotas> requestKvota = ConnectionEDBO.Instance().GetPerson().personRequestQuotasGet(
					ConnectionEDBO.SessionGuid, actualDate, Language.getIdLanguage(),
					zayava.getIdPersonRequest()).getDPersonRequestQuotas();
			if (requestKvota == null)
				throw new Exception("null");
				for(DPersonRequestQuotas kvotas : requestKvota){
					CallService.Instance().AddRequestKvota(requestId, kvotas);
				}

			List<DPersonRequestDocumentSubjects> zno = ConnectionEDBO.Instance().GetPerson()
					.personRequestDocumentSubjectsGet(ConnectionEDBO.SessionGuid, actualDate,
							Language.getIdLanguage(), zayava.getIdPersonRequest()).getDPersonRequestDocumentSubjects();
			if (zno == null)
				throw new Exception("null");

				for(DPersonRequestDocumentSubjects znoSubj : zno){
					CallService.Instance().AddRequestDocumentSubjects(requestId, znoSubj);
				}

			List<DPersonRequestOlympiadsAwards> olymp = ConnectionEDBO.Instance().GetPerson()
					.personRequestOlympiadsAwardsGet(ConnectionEDBO.SessionGuid, actualDate,
							Language.getIdLanguage(), zayava.getIdPersonRequest()).getDPersonRequestOlympiadsAwards();
			if (olymp == null)
				throw new Exception("null");
				for(DPersonRequestOlympiadsAwards olympiadsAwards : olymp){
					CallService.Instance().AddRequestOlympiadsAwards(requestId, olympiadsAwards);
				}

			List<DPersonRequestExaminations> exam = ConnectionEDBO.Instance().GetPerson()
					.personRequestExaminationsGet(ConnectionEDBO.SessionGuid, actualDate,
							Language.getIdLanguage(), zayava.getIdPersonRequest()).getDPersonRequestExaminations();
			if (exam == null)
				throw new Exception("null");
				for(DPersonRequestExaminations examSubj : exam){
					CallService.Instance().AddRequestExaminations(requestId, examSubj);
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

	private static Edbo edbo;

    public static Edbo Instanse() throws RemoteException {
        return edbo == null ? edbo = new Edbo() : edbo;
    }

    private Edbo() throws RemoteException {
        Init();
    }

    private DLanguages Language;
    private DUniversities University;

    private void Init() throws RemoteException {
        EDBOGuidesSoap guides = ConnectionEDBO.Instance().GetGuides();

        String dt = Main.getActualDate();

        try {
			ArrayOfDLanguages arrayOfDLanguages = guides.languagesGet(ConnectionEDBO.SessionGuid);
			Language = arrayOfDLanguages .getDLanguages().get(0);

            University = guides.universitiesGet(ConnectionEDBO.SessionGuid, "0176a9d2-e37c-4123-9688-a952e1374077",
                    Language.getIdLanguage(), dt, "").getDUniversities().get(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
			System.out.println(guides.getLastError(ConnectionEDBO.SessionGuid).getDLastError().get(0).getLastErrorDescription());
        }
    }

    public void GetAllSpecoffer() throws RemoteException {
		String actualDate = Main.getActualDate();

		List<DUniversityFacultetSpecialities> soecialities = ConnectionEDBO.Instance().GetGuides()
                .universityFacultetSpecialitiesGet(ConnectionEDBO.SessionGuid, University.getUniversityKode(), "", "",
						Language.getIdLanguage(), actualDate, ConnectionEDBO.YearSeason, 0, "", "", "", "").getDUniversityFacultetSpecialities();
        int i = 0;
		ExecutorService taskExecutor = Executors.newFixedThreadPool(32);
		List<Callable<Void>> tasks= new LinkedList<Callable<Void>>();

		for (DUniversityFacultetSpecialities spec : soecialities)
		{
            ++i;
			tasks.add(new WorkAddSpecOffer(spec,i));
        }

		try {
			System.out.println(i);
			System.out.println(i);
			System.out.println(i);
			System.out.println(i);
			taskExecutor.invokeAll(tasks);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

    public void GetAllRequest() throws Exception {

		String actualDate = Main.getActualDate();

		List<DUniversityFacultetSpecialities> soecialities = ConnectionEDBO.Instance().GetGuides()
				.universityFacultetSpecialitiesGet(ConnectionEDBO.SessionGuid, University.getUniversityKode(), "", "",
						Language.getIdLanguage(), actualDate, ConnectionEDBO.YearSeason, 0, "", "", "", "").getDUniversityFacultetSpecialities();
		int i = 0 ;
		ExecutorService taskExecutor = Executors.newFixedThreadPool(32);

		for (DUniversityFacultetSpecialities spec : soecialities) {
			List<Callable<Void>> tasks= new LinkedList<Callable<Void>>();
			List<DUniversityFacultetsRequests2> reqst = ConnectionEDBO.Instance().GetGuides()
					.universityFacultetsGetRequests2(ConnectionEDBO.SessionGuid, ConnectionEDBO.YearSeason, "",
							spec.getUniversitySpecialitiesKode(), Language.getIdLanguage(), actualDate, "", 1, "",
							//1, 4, 9, // Нові, допущені затримані
							0, 0, 0, //Всі
							0, spec.getUniversityKode(), 0, "").getDUniversityFacultetsRequests2();

			if (reqst == null)
				throw new Exception("null");
			if (reqst.size() == 0)
				continue;

			for (DUniversityFacultetsRequests2 zayava : reqst) {
				++i;
				WorkAddRequest a = new WorkAddRequest(zayava, i);
				a.call();
			}

			try {
				System.out.println(i);
				System.out.println(i);
				System.out.println(i);
				System.out.println(i);
				taskExecutor.invokeAll(tasks);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}



    }

}

