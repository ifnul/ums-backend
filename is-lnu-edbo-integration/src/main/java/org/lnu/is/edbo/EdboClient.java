package org.lnu.is.edbo;

import org.lnu.is.edbo.proxy.ArrayOfDLanguages;
import org.lnu.is.edbo.proxy.ArrayOfDLastError;
import org.lnu.is.edbo.proxy.ArrayOfDPersonAddresses2;
import org.lnu.is.edbo.proxy.ArrayOfDPersonBenefits;
import org.lnu.is.edbo.proxy.ArrayOfDPersonDocumentTypes;
import org.lnu.is.edbo.proxy.ArrayOfDPersonDocuments;
import org.lnu.is.edbo.proxy.ArrayOfDPersonDocumentsSubjects;
import org.lnu.is.edbo.proxy.ArrayOfDPersonOlympiadsAwards;
import org.lnu.is.edbo.proxy.ArrayOfDPersonRequestBenefits;
import org.lnu.is.edbo.proxy.ArrayOfDPersonRequestDocumentSubjects;
import org.lnu.is.edbo.proxy.ArrayOfDPersonRequestExaminations;
import org.lnu.is.edbo.proxy.ArrayOfDPersonRequestOlympiadsAwards;
import org.lnu.is.edbo.proxy.ArrayOfDPersonRequestQuotas;
import org.lnu.is.edbo.proxy.ArrayOfDPersonsFind;
import org.lnu.is.edbo.proxy.ArrayOfDSpecSpecialization;
import org.lnu.is.edbo.proxy.ArrayOfDUniversities;
import org.lnu.is.edbo.proxy.ArrayOfDUniversityFacultetSpecialities;
import org.lnu.is.edbo.proxy.ArrayOfDUniversityFacultetSpecialitiesQuotas;
import org.lnu.is.edbo.proxy.ArrayOfDUniversityFacultetSpecialitiesSubjects2;
import org.lnu.is.edbo.proxy.ArrayOfDUniversityFacultetsRequests2;
import org.springframework.stereotype.Component;

/**
 * Created by illya on 08.03.16.
 */
@Component("edboClient")
public class EdboClient
{

    public ArrayOfDUniversityFacultetSpecialities universityFacultetSpecialitiesGet(String sessionGUID, String universityKode, String universityFacultetKode, String specCode, int idLanguage, String actualDate, int idPersonRequestSeasons, int idPersonEducationForm, String universitySpecialitiesKode, String specDirectionsCode, String specSpecialityCode, String filters) {
        return null;
    }

    public ArrayOfDUniversityFacultetSpecialitiesQuotas universityFacultetSpecialitiesQuotasGet(String sessionGUID, int idLanguage, String actualDate, String universitySpecialitiesKode, int idQuota) {
        return null;
    }

    public ArrayOfDPersonRequestBenefits personRequestBenefitsGet(String sessionGUID, String actualDate, int idLanguage, int idPersonRequest) {
        return null;
    }

    public ArrayOfDPersonsFind personsFind(String sessionGUID, String actualDate, int idLanguage, String fioMask, String documentSeries, String documentNumber, String idsDocumentTypes, int hundred, String personCodeU, String filters) {
        return null;
    }

    public ArrayOfDPersonDocumentTypes personDocumentTypesGet(String sessionGUID, String actualDate, int idLanguage) {
        return null;
    }

    public ArrayOfDPersonRequestDocumentSubjects personRequestDocumentSubjectsGet(String sessionGUID, String actualDate, int idLanguage, int idPersonRequest) {
        return null;
    }

    public ArrayOfDPersonRequestOlympiadsAwards personRequestOlympiadsAwardsGet(String sessionGUID, String actualDate, int idLanguage, int idPersonRequest) {
        return null;
    }

    public ArrayOfDPersonBenefits personBenefitsGet(String sessionGUID, String actualDate, int idLanguage, int idPerson) {
        return null;
    }

    public ArrayOfDPersonRequestQuotas personRequestQuotasGet(String sessionGUID, String actualDate, int idLanguage, int idPersonRequest) {
        return null;
    }

    public ArrayOfDPersonDocumentsSubjects personDocumentsSubjectsGet(String sessionGUID, String actualDate, int idLanguage, int idPersonDocument, int idPerson, int idPersonDocumentType) {
        return null;
    }

    public ArrayOfDLastError getLastError(String guidSession) {
        return null;
    }

    public ArrayOfDPersonAddresses2 personAddressesGet2(String sessionGUID, String actualDate, int idLanguage, String personCodeU, int idPersonAddress) {
        return null;
    }

    public ArrayOfDPersonDocuments personDocumentsGet(String sessionGUID, String actualDate, int idLanguage, String personCodeU, int idPersonDocumentType, int idPersonDocument, String universityKode, int isEntrantDocument) {
        return null;
    }

    public ArrayOfDPersonRequestExaminations personRequestExaminationsGet(String sessionGUID, String actualDate, int idLanguage, int idPersonRequest) {
        return null;
    }

    public ArrayOfDPersonOlympiadsAwards personOlympiadsAwardsGet(String sessionGUID, String actualDate, int idLanguage, String personCodeU, int idPersonRequestSeasons) {
        return null;
    }

    public String logout(String sessionGUID) {
        return null;
    }

    public ArrayOfDLanguages languagesGet(String sessionGUID) {
        return null;
    }

    public ArrayOfDUniversityFacultetsRequests2 universityFacultetsGetRequests2(String sessionGUID, int idPersonRequestSeasons, String universityFacultetKode, String universitySpecialitiesKode, int idLanguage, String actualDate, String personCodeU, int hundred, String minDate, int idPersonRequestStatusType1, int idPersonRequestStatusType2, int idPersonRequestStatusType3, int idPersonEducationForm, String universityKode, int idQualification, String filters) {
        return null;
    }

    public ArrayOfDSpecSpecialization specSpecializationFind(String sessionGUID, String specDirectionsCode, String specSpecialityCode) {
        return null;
    }

    public ArrayOfDUniversities universitiesGet(String sessionGUID, String universityKode, int idLanguage, String actualDate, String universityName) {
        return null;
    }

    public ArrayOfDUniversityFacultetSpecialitiesSubjects2 universityFacultetSpecialitiesSubjectsGet2(String sessionGUID, int idLanguage, String actualDate, String universitySpecialitiesKode) {
        return null;
    }

    public String login(String user, String password, int clearPreviewSession, String applicationKey) {
        return null;
    }
}
