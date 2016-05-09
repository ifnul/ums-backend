package org.lnu.is.edbo;

import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.address.type.AddressType;
import org.lnu.is.domain.admin.unit.AdminUnit;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.education.form.type.EducationFormType;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.benefit.EnrolmentBenefit;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.domain.gender.type.GenderType;
import org.lnu.is.domain.married.type.MarriedType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.address.PersonAddress;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.domain.person.type.PersonType;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferBenefit;
import org.lnu.is.domain.specoffer.SpecOfferSubject;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.domain.street.type.StreetType;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.edbo.exeption.EdboExeption;
import org.lnu.is.edbo.exeption.EdboType;
import org.lnu.is.edbo.proxy.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by illya on 20.07.15.
 */
@Component("callService")
public class CallService {
    private static final Logger LOG = LoggerFactory.getLogger(CallService.class);
    
    @Resource(name = "benefitDao")
    private Dao<Benefit, Benefit, Long> benefitDao;

    @Resource(name = "departmentDao")
    private Dao<Department, Department, Long> departmentDao;

    @Resource(name = "eduFormTypeDao")
    private Dao<EducationFormType, EducationFormType, Long> educationFormTypeDao;

    @Resource(name = "enrolmentSubjectDao")
    private Dao<EnrolmentSubject, EnrolmentSubject, Long> enrolmentSubjectDao;

    @Resource(name = "specialtyDao")
    private Dao<Specialty, Specialty, Long> specialtyDao;

    @Resource(name = "specOfferDao")
    private Dao<SpecOffer, SpecOffer, Long> specOfferDao;

    @Resource(name = "specOfferSubjectDao")
    private Dao<SpecOfferSubject, SpecOfferSubject, Long> specOfferSubjectDao;

    @Resource(name = "specOfferBenefitDao")
    private Dao<SpecOfferBenefit, SpecOfferBenefit, Long> specOfferBenefitDao;

    @Resource(name = "personDao")
    private Dao<Person, Person, Long> personDao;

    @Resource(name = "personAddressDao")
    private Dao<PersonAddress, PersonAddress, Long> personAddressDao;

    @Resource(name = "specOfferTypeDao")
    private Dao<SpecOfferType, SpecOfferType, Long> specOfferTypeDao;

    @Resource(name = "timePeriodDao")
    private Dao<TimePeriod, TimePeriod, Long> timePeriodDao;

    @Resource(name = "adminUnitDao")
    private Dao<AdminUnit, AdminUnit, Long> adminUnitDao;

    @Resource(name = "enrolmentBenefitDao")
    private Dao< EnrolmentBenefit, EnrolmentBenefit, Long> enrolmentBenefitDao;

    @Resource(name = "enrolmentDao")
    private Dao<Enrolment, Enrolment, Long> enrolmentDao;

    @Resource(name = "edboIntegration")
    private Edbo edbo;

    public SpecOffer AddSpecoffer(DUniversityFacultetSpecialities spec, Boolean updateData, String sessionGuid, int yearSeason) {

            SpecOffer specOffer =  specOfferDao.getByUid(spec.getIdUniversitySpecialities());
            if ((!updateData) && (specOffer != null))
                return specOffer;

            String specUtid = "";
            if (!spec.getSpecSpecializationCode().isEmpty())
                specUtid = spec.getSpecSpecializationCode();
            else if (!spec.getSpecSpecialityCode().isEmpty())
                specUtid = spec.getSpecSpecialityCode();
            else if (!spec.getSpecDirectionsCode().isEmpty())
                specUtid = spec.getSpecDirectionsCode();

            Specialty specialty = specialtyDao.getByUtid(specUtid);
            if (specialty == null) {
                specialty = specialtyDao.getByUtid(spec.getSpecSpecialityCode());
                if (specialty == null) {
                    String message = "Parent not exist: " +spec.getSpecDirectionName() + ":" + spec.getSpecSpecialityName() + ":" + spec.getSpecSpecializationName();
                    LOG.info(message);
                    throw new EdboExeption(message, EdboType.SpecialtyParent);
                }

                List<DSpecSpecialization> arrayOfDSpecSpecialization = edbo.edboGuides().specSpecializationFind(
                        sessionGuid, spec.getSpecDirectionsCode(), spec.getSpecSpecialityCode()).getDSpecSpecialization();

                for (DSpecSpecialization sp : arrayOfDSpecSpecialization) {

                    Specialty newSpecialty = new Specialty();
                    newSpecialty.setSpecialtyType(specialty.getSpecialtyType());
                    newSpecialty.setCipher(specialty.getCipher());
                    newSpecialty.setName(sp.getSpecScecializationName());
                    newSpecialty.setUtid(sp.getSpecScecializationCode());
                    newSpecialty.setUapp("");
                    newSpecialty.setParent(specialty);
                    save(specialtyDao, specialty);
                }
                specialty = specialtyDao.getByUtid(spec.getSpecSpecializationCode());

                if (specialty == null) {
                    String message = String.format("{0} : {1} : {2}",spec.getSpecDirectionName() , spec.getSpecSpecialityName() ,spec.getSpecSpecializationName());
                    LOG.info(message);
                    throw new EdboExeption(message, EdboType.Specialty);
                }

            }

            Department department = departmentDao.getByUtid(spec.getUniversityFacultetKode());
            if (department == null) {
                String message = spec.getUniversityFacultetKode()+":"+spec.getUniversityFacultetFullName()+":"+spec.getUniversityFacultetShortName();
                LOG.info(message);
                throw new EdboExeption("null", EdboType.Department);
            }

            TimePeriod timePeriod = timePeriodDao.getByUidAndUap(yearSeason, "edbo/IdPersonRequestSeasons");
            if (timePeriod == null) {
                String message ="Enter time period:" + yearSeason;
                LOG.info(message);
                throw new EdboExeption(message, EdboType.TimePeriod);
            }

            TimePeriod courseTimeperiod = timePeriodDao.getByUidAndUap(spec.getIdCourse() , "edbo/IdCourse");
            if (courseTimeperiod == null) {
                String message ="Enter time period course:" + spec.getIdCourse();
                LOG.info(message);
                throw new EdboExeption(message,EdboType.CourseTimePeriod);
            }

            SpecOfferType specOfferType = specOfferTypeDao.getByUid(spec.getIdQualification());
            if (specOfferType == null) {
                String message ="Enter specoffer type:" + spec.getIdQualification();
                LOG.info(message);
                throw new EdboExeption(message, EdboType.SpecOfferType);
            }

            EducationFormType educationFormType = educationFormTypeDao.getByUid(spec.getIdPersonEducationForm());
            if (educationFormType == null) {
                String message ="Enter Eduform type:" + spec.getIdQualification();
                LOG.info(message);
                throw new EdboExeption(message, EdboType.EducationFormType);
            }

            if (specOffer == null){
                specOffer = new SpecOffer();
            }

            specOffer.setSpecialty(specialty);
            specOffer.setDepartment(department);
            specOffer.setTimePeriod(timePeriod);
            specOffer.setTimePeriodCourse(courseTimeperiod);
            specOffer.setSpecOfferType(specOfferType);
            specOffer.setEducationFormType(educationFormType);
            specOffer.setDuration(spec.getDurationEducation().toString());
            specOffer.setLicCount(spec.getUniversitySpecialitiesLicenseCount());
            specOffer.setStateCount(spec.getUniversitySpecialitiesLicenseCount() - spec.getUniversitySpecialitiesContractCount());
            specOffer.setBegDate(spec.getDateBeginPersonRequestSeason().toGregorianCalendar().getTime());
            specOffer.setEndDate(spec.getDateEndPersonRequestSeason().toGregorianCalendar().getTime());
            specOffer.setUid((long)spec.getIdUniversitySpecialities());
            specOffer.setUtid(spec.getUniversitySpecialitiesKode());
            specOffer.setUapp("edbo/IdUniversitySpecialities");
            save(specOfferDao,specOffer);
            return specOffer;


    }

    public SpecOfferSubject AddSpecofferSubject(SpecOffer specOffer, DUniversityFacultetSpecialitiesSubjects2 specSubject, Boolean updateData) {
            SpecOfferSubject specOfferSubject = specOfferSubjectDao.getByUidAndUap(specSubject.getIdUniversitySpecialitiesSubject(), "edbo/IdUniversitySpecialitiesSubject");
            if ((!updateData) && (specOfferSubject != null))
                return specOfferSubject;

            EnrolmentSubject enrolmentSubject = enrolmentSubjectDao.getByUid(specSubject.getIdSubject());
            if (enrolmentSubject == null) {
                String message = "not exist Enrolment subject:" + specSubject.getIdSubject();
                LOG.info(message);
                throw new EdboExeption(message, EdboType.EnrolmentSubject);
            }

            if (specOfferSubject == null){
                specOfferSubject = new SpecOfferSubject();
            }
            specOfferSubject.setSpecOffer(specOffer);
            specOfferSubject.setEnrolmentSubject(enrolmentSubject);
            specOfferSubject.setIsMajor((specSubject.getIsProfiled() == 1));
            specOfferSubject.setAlternative( (specSubject.getInGroup() == 1));
            specOfferSubject.setMark(100d);
            specOfferSubject.setWeightSubject(Double.parseDouble(specSubject.getKoeficient()));
            specOfferSubject.setUid((long)specSubject.getIdUniversitySpecialitiesSubject());
            specOfferSubject.setUapp("edbo/IdUniversitySpecialitiesSubject");
            save(specOfferSubjectDao, specOfferSubject);
            return specOfferSubject;

    }

    public SpecOfferBenefit AddSpecofferQuota(SpecOffer specOffer, DUniversityFacultetSpecialitiesQuotas specQuota, Boolean updateData) {
            SpecOfferBenefit specOfferBenefit = specOfferBenefitDao.getByUidAndUap(specQuota.getIdUniversitySpecialitiesQuota(), "edbo/IdUniversitySpecialitiesQuota");

            if ((!updateData) && (specOfferBenefit != null))
                return specOfferBenefit;

            Benefit benefit = benefitDao.getByUid(specQuota.getIdQuota());
            if (benefit == null) {
                String message ="not exist benefit" + specQuota.getIdQuota();
                LOG.info(message);
                throw new EdboExeption(message, EdboType.Benefit);
            }
            if (specOfferBenefit == null){
                specOfferBenefit = new SpecOfferBenefit();
            }

            specOfferBenefit.setSpecOffer(specOffer);
            specOfferBenefit.setBenefit(benefit);
            specOfferBenefit.setUid((long)specQuota.getIdUniversitySpecialitiesQuota());
            specOfferBenefit.setUapp("edbo/IdUniversitySpecialitiesQuota");
            save(specOfferBenefitDao, specOfferBenefit);
            return specOfferBenefit;

    }

    public Person AddPerson(DPersonsFind dPersonsFind, boolean updateData) {

        Person person = personDao.getByUidOrUtidAndUap(dPersonsFind.getIdPerson(), dPersonsFind.getPersonCodeU(), "edbo");
        if ((!updateData) && (person != null))
            return person;

        //TODO : foring key
        AdminUnit citizenCountry = null;
        GenderType genderType = null;
        MarriedType marriedType = null;
        Person parent = null;
        PersonType personType = null;

        if (person == null) {
            person = new Person();
        }

        person.setBegDate(null);
        person.setBirthPlace(dPersonsFind.getBirthplace());
        person.setCitizenCountry(citizenCountry);
        person.setDocNum(null);
        person.setDocSeries(null);
        person.setEndDate(null);
        person.setFatherName(dPersonsFind.getMiddleName());
        person.setFirstName(dPersonsFind.getFirstName());
        person.setGenderType(genderType);
        person.setIdentifier(null);
        person.setIsHostel(null);
        person.setIsMilitary(null);
        person.setMarriedType(marriedType);
        person.setName(null);
        person.setParent(parent);
        person.setPersonType(personType);
        person.setPhoto(null);
        person.setResident(dPersonsFind.getResident());
        person.setSurname(dPersonsFind.getLastName());

        save(personDao, person);
        return  person;

    }

    public PersonAddress AddPersonAddresses(Person person, DPersonAddresses2 addresses, boolean updateData) {

        PersonAddress personAddress = personAddressDao.getByUid(addresses.getIdPersonAddress());
        if (!updateData && personAddress != null)
            return  personAddress;

        //TODO : foring key
        AdminUnit adminUnit = null;
        StreetType streetType = null;
        AddressType addressType = null;


        if (personAddress == null){
            personAddress = new PersonAddress();
        }

        personAddress.setPerson(person);
        personAddress.setApartment(addresses.getApartment());
        personAddress.setStreet(addresses.getAdress());
        personAddress.setHouse(addresses.getHousing());
        personAddress.setZipCode(addresses.getPostIndex());
        personAddress.setAddressType(addressType);
        personAddress.setAdminUnit(adminUnit);
        personAddress.setStreetType(streetType);

        save(personAddressDao, personAddress);
        return  personAddress;

    }

    public Long AddPersonDocs(Person personId, DPersonDocuments doc) {

        throw new EdboExeption("null", EdboType.PersonDocument );
    }

    public Long AddPersonBenefit(Person personId, DPersonBenefits benefits) {

        throw new EdboExeption("null", EdboType.PersonBenefit);
    }

    public Long AddPersonOlymp(Person personId, DPersonOlympiadsAwards olymp) {
        throw new EdboExeption("null", EdboType.PersonOlympiadsAwards);
    }

    public Long AddPersonDocumentsSubjects(Person personId, DPersonDocumentsSubjects docSubj) {
        throw new EdboExeption("null", EdboType.PersonDocumentSubject);
    }

    public Enrolment AddRequest(DUniversityFacultetsRequests2 zayava, Boolean updateData) {
        Enrolment enrolment = enrolmentDao.getByUid(zayava.getIdPersonRequest());
        if (!updateData && enrolment != null){
            return  enrolment;
        }
        throw new EdboExeption("null", EdboType.Request);
    }

    public EnrolmentBenefit AddRequestBenefits(Enrolment requestId, DPersonRequestBenefits personRequestBenefits, Boolean updateData) {

        EnrolmentBenefit enrolmentBenefit = enrolmentBenefitDao.getByUid(personRequestBenefits.getIdPersonBenefit());
        if (!updateData && enrolmentBenefit != null){
            return  enrolmentBenefit;
        }
        Benefit benefit = null;
        //personRequestBenefits.getIdBenefit();
        PersonPaper personPaper = null;
        //personRequestBenefits.getIdPersonBenefit();
        if (enrolmentBenefit == null){
            enrolmentBenefit = new EnrolmentBenefit();
        }
        enrolmentBenefit.setBenefit(benefit);
        enrolmentBenefit.setPersonPaper(personPaper);
        enrolmentBenefit.setEnrolment(requestId);
        save(enrolmentBenefitDao, enrolmentBenefit);
        return  enrolmentBenefit;
    }

    public Long AddRequestKvota(Enrolment requestId, DPersonRequestQuotas kvota) {
        throw new EdboExeption("null", EdboType.RequestQuota );
    }

    public Long AddRequestDocumentSubjects(Enrolment requestId, DPersonRequestDocumentSubjects znoSubj) {
        throw new EdboExeption("null", EdboType.RequestDocumentSubject);
    }

    public Long AddRequestOlympiadsAwards(Enrolment requestId, DPersonRequestOlympiadsAwards olympiadsAwards) {
        throw new EdboExeption("null", EdboType.RequestOlympiadAward);
    }

    public Long AddRequestExaminations(Enrolment requestId, DPersonRequestExaminations examSubj) {
        throw new EdboExeption("null", EdboType.RequestExaminations);
    }

    private <T extends InformationModel> void save(Dao<T,T, Long> dao, T data){

        data.setUpdateDate(new Date());
        if (data.getId() == 0)
        {
            data.setStatus(RowStatus.ACTIVE);
            data.setActual(1);
            data.setCrtUser("illay");
            data.setCrtUserGroup("public");
            data.setCreateDate(new Date());
            dao.save(data);
        }
        else
        {
            dao.update(data);
        }

    }

    public Specialty synchronizeSpecialization(boolean updateData,List<DSpecSpecialization> arrayOfDSpecSpecialization, DUniversityFacultetSpecialities spec) {

        String specUtid = "";
        if (!spec.getSpecSpecializationCode().isEmpty())
            specUtid = spec.getSpecSpecializationCode();
        else if (!spec.getSpecSpecialityCode().isEmpty())
            specUtid = spec.getSpecSpecialityCode();
        else if (!spec.getSpecDirectionsCode().isEmpty())
            specUtid = spec.getSpecDirectionsCode();

        Specialty specialty = specialtyDao.getByUtid(specUtid);

        if (specialty!=null && !updateData){
            return specialty;
        }



        return specialty;
    }
}
