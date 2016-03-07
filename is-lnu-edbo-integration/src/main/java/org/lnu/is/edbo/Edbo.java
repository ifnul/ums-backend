package org.lnu.is.edbo;

import org.springframework.stereotype.Component;
import ua.edboservice.*;

import javax.annotation.Resource;
import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;




@Component
public class Edbo {

	@Resource(name = "callService")
	private CallService callService;

	private static Edbo edbo;

    public static Edbo Instanse() throws RemoteException {
        return edbo == null ? edbo = new Edbo() : edbo;
    }

    private Edbo() throws RemoteException {
        Init();
    }

    private DLanguages language;
    private DUniversities University;

    private void Init() throws RemoteException {
        EDBOGuidesSoap guides = ConnectionEDBO.Instance().GetGuides();

        String dt = Main.getActualDate();

        try {
			ArrayOfDLanguages arrayOfDLanguages = guides.languagesGet(ConnectionEDBO.SessionGuid);
			language = arrayOfDLanguages .getDLanguages().get(0);

            University = guides.universitiesGet(ConnectionEDBO.SessionGuid, "0176a9d2-e37c-4123-9688-a952e1374077",
                    language.getIdLanguage(), dt, "").getDUniversities().get(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
			System.out.println(guides.getLastError(ConnectionEDBO.SessionGuid).getDLastError().get(0).getLastErrorDescription());
        }
    }

    public void GetAllSpecoffer() throws RemoteException {
		String actualDate = Main.getActualDate();

		List<DUniversityFacultetSpecialities> soecialities = ConnectionEDBO.Instance().GetGuides()
                .universityFacultetSpecialitiesGet(ConnectionEDBO.SessionGuid, University.getUniversityKode(), "", "",
						language.getIdLanguage(), actualDate, ConnectionEDBO.YearSeason, 0, "", "", "", "").getDUniversityFacultetSpecialities();
        int i = 0;
		ExecutorService taskExecutor = Executors.newFixedThreadPool(32);
		List<Callable<Void>> tasks= new LinkedList<Callable<Void>>();

		for (DUniversityFacultetSpecialities spec : soecialities)
		{
            ++i;
			tasks.add(new WorkAddSpecOffer(this, spec,i, callService, language));
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
						language.getIdLanguage(), actualDate, ConnectionEDBO.YearSeason, 0, "", "", "", "").getDUniversityFacultetSpecialities();
		int i = 0 ;
		ExecutorService taskExecutor = Executors.newFixedThreadPool(32);

		for (DUniversityFacultetSpecialities spec : soecialities) {
			List<Callable<Void>> tasks= new LinkedList<Callable<Void>>();
			List<DUniversityFacultetsRequests2> reqst = ConnectionEDBO.Instance().GetGuides()
					.universityFacultetsGetRequests2(ConnectionEDBO.SessionGuid, ConnectionEDBO.YearSeason, "",
							spec.getUniversitySpecialitiesKode(), language.getIdLanguage(), actualDate, "", 1, "",
							//1, 4, 9, // Нові, допущені затримані
							0, 0, 0, //Всі
							0, spec.getUniversityKode(), 0, "").getDUniversityFacultetsRequests2();

			if (reqst == null)
				throw new Exception("null");
			if (reqst.size() == 0)
				continue;

			for (DUniversityFacultetsRequests2 zayava : reqst) {
				++i;
				WorkAddRequest a = new WorkAddRequest(this, zayava, i, callService, language);
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

