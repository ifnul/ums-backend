package org.lnu.is.edbo;

import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferBenefit;
import org.lnu.is.domain.specoffer.SpecOfferSubject;
import ua.edboservice.*;

public abstract class CallService {

    private static CallService instance;

    public static CallService Instance() {
        return (instance == null) ? instance = new CallServiceImplament() : instance;
    }

    protected CallService() {

    }

    public abstract SpecOffer AddSpecoffer(DUniversityFacultetSpecialities spec);

    public abstract SpecOfferSubject AddSpecofferSubject(SpecOffer specoffer, DUniversityFacultetSpecialitiesSubjects2 specSubject);

    public abstract SpecOfferBenefit AddSpecofferQuota(SpecOffer specofferId, DUniversityFacultetSpecialitiesQuotas specQuota);

    public abstract Long AddPerson(DPersonsFind dPersonsFind);

	public abstract Long AddPersonAddresses(Long personId, DPersonAddresses2 addresses);

    public abstract Long AddPersonDocs(Long personId, DPersonDocuments doc);

    public abstract Long AddPersonBenefit(Long personId, DPersonBenefits benefits);

    public abstract Long AddPersonOlymp(Long personId, DPersonOlympiadsAwards olymp);

    public abstract Long AddPersonDocumentsSubjects(Long personId, DPersonDocumentsSubjects docSubj);

    public abstract Long AddRequest(DUniversityFacultetsRequests2 zayava);

    public abstract Long AddRequestOlymp(Long requestId, DPersonRequestBenefits benefit);

    public abstract Long AddRequestKvota(Long requestId, DPersonRequestQuotas kvota);

    public abstract Long AddRequestDocumentSubjects(Long requestId, DPersonRequestDocumentSubjects znoSubj);

    public abstract Long AddRequestOlympiadsAwards(Long requestId, DPersonRequestOlympiadsAwards olympiadsAwards);

    public abstract Long AddRequestExaminations(Long requestId, DPersonRequestExaminations examSubj);
}
