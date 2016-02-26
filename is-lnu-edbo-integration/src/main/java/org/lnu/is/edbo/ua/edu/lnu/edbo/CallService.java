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

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class CallService {

    private static CallService instance;

    protected Connection c = null;
    protected Statement stmt = null;
    protected String sql = null;


    public static CallService Instance() {
        return (instance == null) ? instance = new CallServiceImplament() : instance;
    }

    public static void EndConnection() {
        instance.CloseConnection();
        instance = null;
    }


    protected CallService() {

    }

    protected abstract void CloseConnection();

	protected Long getFirstLong(ResultSet rs) throws SQLException {
        if (rs.next()) {
            return rs.getLong(1);
        }
        return null;
    }

    public abstract Long AddSpecoffer(DUniversityFacultetSpecialities spec);

    public abstract Long AddSpecofferSubject(Long specofferId, DUniversityFacultetSpecialitiesSubjects2 specSubject);

    public abstract Long AddSpecofferQuota(Long specofferId, DUniversityFacultetSpecialitiesQuotas specQuota);

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
