package org.lnu.is.edbo.ua.edu.lnu.edbo;


import org.lnu.is.edbo.guides_min.DUniversityFacultetSpecialities;
import org.lnu.is.edbo.guides_min.DUniversityFacultetSpecialitiesQuotas;
import org.lnu.is.edbo.guides_min.DUniversityFacultetSpecialitiesSubjects2;
import org.lnu.is.edbo.guides_min.DUniversityFacultetsRequests2;
import org.lnu.is.edbo.person_min.DPersonAddresses2;
import org.lnu.is.edbo.person_min.DPersonBenefits;
import org.lnu.is.edbo.person_min.DPersonDocuments;
import org.lnu.is.edbo.person_min.DPersonDocumentsSubjects;
import org.lnu.is.edbo.person_min.DPersonOlympiadsAwards;
import org.lnu.is.edbo.person_min.DPersonRequestBenefits;
import org.lnu.is.edbo.person_min.DPersonRequestDocumentSubjects;
import org.lnu.is.edbo.person_min.DPersonRequestExaminations;
import org.lnu.is.edbo.person_min.DPersonRequestOlympiadsAwards;
import org.lnu.is.edbo.person_min.DPersonRequestQuotas;
import org.lnu.is.edbo.person_min.DPersonsFind;

/**
 * Created by illya on 20.07.15.
 */
public class CallServiceEmpty extends CallService {
    @Override
    protected void CloseConnection() {

    }

    @Override
    public Long AddSpecoffer(DUniversityFacultetSpecialities spec) {
        return null;
    }

    @Override
    public Long AddSpecofferSubject(Long specofferId, DUniversityFacultetSpecialitiesSubjects2 specSubject) {
        return null;
    }

    @Override
    public Long AddSpecofferQuota(Long specofferId, DUniversityFacultetSpecialitiesQuotas specQuota) {
        return null;
    }

    @Override
    public Long AddPerson(DPersonsFind dPersonsFind) {
        return null;
    }

    @Override
    public Long AddPersonAddresses(Long personId, DPersonAddresses2 addresses) {
        return null;
    }

    @Override
    public Long AddPersonDocs(Long personId, DPersonDocuments doc) {
        return null;
    }

    @Override
    public Long AddPersonBenefit(Long personId, DPersonBenefits benefits) {
        return null;
    }

    @Override
    public Long AddPersonOlymp(Long personId, DPersonOlympiadsAwards olymp) {
        return null;
    }

    @Override
    public Long AddPersonDocumentsSubjects(Long personId, DPersonDocumentsSubjects docSubj) {
        return null;
    }

    @Override
    public Long AddRequest(DUniversityFacultetsRequests2 zayava) {
        return null;
    }

    @Override
    public Long AddRequestOlymp(Long requestId, DPersonRequestBenefits benefit) {
        return null;
    }

    @Override
    public Long AddRequestKvota(Long requestId, DPersonRequestQuotas kvota) {
        return null;
    }

    @Override
    public Long AddRequestDocumentSubjects(Long requestId, DPersonRequestDocumentSubjects znoSubj) {
        return null;
    }

    @Override
    public Long AddRequestOlympiadsAwards(Long requestId, DPersonRequestOlympiadsAwards olympiadsAwards) {
        return null;
    }

    @Override
    public Long AddRequestExaminations(Long requestId, DPersonRequestExaminations examSubj) {
        return null;
    }
}
