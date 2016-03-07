package org.lnu.is.edbo;

import org.lnu.is.domain.specoffer.SpecOffer;
import ua.edboservice.DLanguages;
import ua.edboservice.DUniversityFacultetSpecialities;
import ua.edboservice.DUniversityFacultetSpecialitiesQuotas;
import ua.edboservice.DUniversityFacultetSpecialitiesSubjects2;

import java.rmi.RemoteException;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * @since 3/7/16
 */
class WorkAddSpecOffer implements Callable<Void> {
    private Edbo edbo;
    private DUniversityFacultetSpecialities spec;
    private Integer i;
    private CallService callService;
    private DLanguages language;

    public WorkAddSpecOffer(Edbo edbo, DUniversityFacultetSpecialities ex,
                            Integer i, CallService callService, DLanguages language) {
        this.edbo = edbo;
        this.spec = ex;
        this.i = i;
        this.callService = callService;
        this.language = language;
    }


    public Void call() throws Exception {
        try {
            String actualDate = Main.getActualDate();

            SpecOffer specOffer = callService.AddSpecoffer(spec);

            List<DUniversityFacultetSpecialitiesSubjects2> subjects = null;

            subjects = ConnectionEDBO.Instance().GetGuides()
                    .universityFacultetSpecialitiesSubjectsGet2(ConnectionEDBO.SessionGuid, language.getIdLanguage(),
                            actualDate, spec.getUniversitySpecialitiesKode()).getDUniversityFacultetSpecialitiesSubjects2();

            for (DUniversityFacultetSpecialitiesSubjects2 subject : subjects)
                callService.AddSpecofferSubject(specOffer, subject);

            List<DUniversityFacultetSpecialitiesQuotas> quotas = ConnectionEDBO.Instance().GetGuides()
                    .universityFacultetSpecialitiesQuotasGet(ConnectionEDBO.SessionGuid, language.getIdLanguage(),
                            actualDate, spec.getUniversitySpecialitiesKode(), 0).getDUniversityFacultetSpecialitiesQuotas();
            for (DUniversityFacultetSpecialitiesQuotas quota : quotas)
                callService.AddSpecofferQuota(specOffer, quota);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        System.out.println(i);
        return null;
    }
}
