package org.lnu.is.edbo;

import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.education.form.type.EducationFormType;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.address.PersonAddress;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferBenefit;
import org.lnu.is.domain.specoffer.SpecOfferSubject;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.edbo.proxy.DPersonAddresses2;
import org.lnu.is.edbo.proxy.DPersonBenefits;
import org.lnu.is.edbo.proxy.DPersonDocuments;
import org.lnu.is.edbo.proxy.DPersonDocumentsSubjects;
import org.lnu.is.edbo.proxy.DPersonOlympiadsAwards;
import org.lnu.is.edbo.proxy.DPersonRequestBenefits;
import org.lnu.is.edbo.proxy.DPersonRequestDocumentSubjects;
import org.lnu.is.edbo.proxy.DPersonRequestExaminations;
import org.lnu.is.edbo.proxy.DPersonRequestOlympiadsAwards;
import org.lnu.is.edbo.proxy.DPersonRequestQuotas;
import org.lnu.is.edbo.proxy.DPersonsFind;
import org.lnu.is.edbo.proxy.DSpecSpecialization;
import org.lnu.is.edbo.proxy.DUniversityFacultetSpecialities;
import org.lnu.is.edbo.proxy.DUniversityFacultetSpecialitiesQuotas;
import org.lnu.is.edbo.proxy.DUniversityFacultetSpecialitiesSubjects2;
import org.lnu.is.edbo.proxy.DUniversityFacultetsRequests2;
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

    @Resource(name = "edboClient")
    private EdboClient edbo;

    public SpecOffer AddSpecoffer(DUniversityFacultetSpecialities spec, Boolean updateData, String sessionGuid, int yearSeason) {
        try {
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
                List<DSpecSpecialization> arrayOfDSpecSpecialization = edbo.specSpecializationFind(
                        sessionGuid, spec.getSpecDirectionsCode(), spec.getSpecSpecialityCode()).getDSpecSpecialization();
                for (DSpecSpecialization sp : arrayOfDSpecSpecialization) {

                    if (specialtyDao.getByUtid(spec.getSpecSpecialityCode()) != null){
                        Specialty newSpecialty = new Specialty();
                        newSpecialty.setSpecialtyType(specialty.getSpecialtyType());
                        newSpecialty.setCipher(specialty.getCipher());
                        newSpecialty.setName(sp.getSpecScecializationName());
                        newSpecialty.setUtid(sp.getSpecScecializationCode());
                        newSpecialty.setUapp("");
                        newSpecialty.setParent(specialty);
                        save(specialtyDao, specialty);
                    }
                }
                specialty = specialtyDao.getByUtid(spec.getSpecSpecializationCode());

                if (specialty == null) {
                    LOG.info(spec.getSpecDirectionName() + ":" + spec.getSpecSpecialityName() + ":" + spec.getSpecSpecializationName());
                    return null;
                }
            }

            Department department = departmentDao.getByUtid(spec.getUniversityFacultetKode());
            if (department == null) {
                LOG.info(spec.getUniversityFacultetKode()+":"+spec.getUniversityFacultetFullName()+":"+spec.getUniversityFacultetShortName());
                return null;
            }

            TimePeriod timePeriod = timePeriodDao.getByUidAndUap(yearSeason, "edbo/IdPersonRequestSeasons");
            if (timePeriod == null) {
                LOG.info("Enter time period:" + yearSeason);
                return null;
            }

            TimePeriod courseTimeperiod = timePeriodDao.getByUidAndUap(spec.getIdCourse() , "edbo/IdCourse");
            if (courseTimeperiod == null) {
                LOG.info("Enter time period course:" + spec.getIdCourse());
                return null;
            }

            SpecOfferType specOfferType = specOfferTypeDao.getByUid(spec.getIdQualification());
            if (specOfferType == null) {
                LOG.info("Enter specoffer type:" + spec.getIdQualification());
                return null;
            }

            EducationFormType educationFormType = educationFormTypeDao.getByUid(spec.getIdPersonEducationForm());
            if (educationFormType == null) {
                LOG.info("Enter Eduform type:" + spec.getIdQualification());
                return null;
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

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public SpecOfferSubject AddSpecofferSubject(SpecOffer specOffer, DUniversityFacultetSpecialitiesSubjects2 specSubject, Boolean updateData) {
        try {
            SpecOfferSubject specOfferSubject = specOfferSubjectDao.getByUidAndUap(specSubject.getIdUniversitySpecialitiesSubject(), "edbo/IdUniversitySpecialitiesSubject");
            if ((!updateData) && (specOfferSubject != null))
                return specOfferSubject;

            EnrolmentSubject enrolmentSubject = enrolmentSubjectDao.getByUid(specSubject.getIdSubject());
            if (enrolmentSubject == null) {
                LOG.info("not exist Enrolment subject:" + specSubject.getIdSubject());
                return null;
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

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public SpecOfferBenefit AddSpecofferQuota(SpecOffer specOffer, DUniversityFacultetSpecialitiesQuotas specQuota, Boolean updateData) {
        try {
            SpecOfferBenefit specOfferBenefit = specOfferBenefitDao.getByUidAndUap(specQuota.getIdUniversitySpecialitiesQuota(), "edbo/IdUniversitySpecialitiesQuota");

            if ((updateData) && (specOfferBenefit != null))
                return specOfferBenefit;

            Benefit benefit = benefitDao.getByUid(specQuota.getIdQuota());
            if (benefit == null) {
                LOG.info("not exist benefit" + specQuota.getIdQuota());
                return null;
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

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Long AddPerson(DPersonsFind dPersonsFind) {
//        try{
//            stmt = c.createStatement();
//            sql = "SELECT id FROM q_ob_person WHERE (uid=" + dPersonsFind.getIdPerson() + " and utid = '"+ dPersonsFind.getPersonCodeU()+"' and uapp ='edbo/IdPerson'";
//            Long id = getFirstLong(stmt.executeQuery(sql));
//            if ((!ConnectionEDBO.UpdateData) && (id != null)) return id;
//
//        }
//        catch (SQLException e) {
//            e.printStackTrace();
//
//        }
        return null;
    }

    public Long AddPersonAddresses(Long personId, DPersonAddresses2 addresses) {
//        try{
//            stmt = c.createStatement();
//            sql = "SELECT id FROM q_od_personaddress WHERE (uid=" + addresses.getIdPersonAddress() + " and uapp ='edbo/PersonAddressId'";
//            Long id = getFirstLong(stmt.executeQuery(sql));
//            if ((!ConnectionEDBO.UpdateData) && (id != null)) return id;
//
//            sql = "SELECT id FROM q_ob_adminunit WHERE identifier = '"+addresses.getKOATUUCode()+"'";
//            Long adminunitId = getFirstLong(stmt.executeQuery(sql));
//            if (adminunitId == null) {
//                LOG.info("not exist adminunit" + addresses.getKOATUUCode());
//                return null;
//            }
//
//            if (id == null) {
//                sql = "INSERT INTO q_od_specofferbenefit(" +
//                        "specoffer_id, benefit_id, uid, utid, uapp, status, actual, \n" +
//                        "crtuser, crtusergroup, update_date, create_date)\n" +
//                        "VALUES (" + specofferId + ", " + idBenefit + ", " +
//                        specQuota.getIdUniversitySpecialitiesQuota() + ", 'edbo/IdUniversitySpecialitiesQuota', " +
//                        "'ACTIVE', 1, 'illay', 'public', now(), now());";
//                stmt.execute(sql);
//                sql = "SELECT id FROM q_od_specofferbenefit WHERE uid=" + specQuota.getIdUniversitySpecialitiesQuota() + "and uapp ='edbo/IdUniversitySpecialitiesQuota'";
//                id = getFirstLong(stmt.executeQuery(sql));
//                return id;
//            }
//            sql = "UPDATE q_od_specofferbenefit " +
//                    "SET specoffer_id=" + specofferId + ", benefit_id=" + idBenefit + ", " +
//                    "update_date=now() " +
//                    "WHERE id=" + id;
//            stmt.execute(sql);
//            return id;
//
//        }
//        catch (SQLException e) {
//            e.printStackTrace();
//
//        }
        return null;
    }

    public Long AddPersonDocs(Long personId, DPersonDocuments doc) {
        return null;
    }

    public Long AddPersonBenefit(Long personId, DPersonBenefits benefits) {
        return null;
    }

    public Long AddPersonOlymp(Long personId, DPersonOlympiadsAwards olymp) {
        return null;
    }

    public Long AddPersonDocumentsSubjects(Long personId, DPersonDocumentsSubjects docSubj) {
        return null;
    }

    public Long AddRequest(DUniversityFacultetsRequests2 zayava) {
        return null;
    }

    public Long AddRequestOlymp(Long requestId, DPersonRequestBenefits benefit) {
        return null;
    }

    public Long AddRequestKvota(Long requestId, DPersonRequestQuotas kvota) {
        return null;
    }

    public Long AddRequestDocumentSubjects(Long requestId, DPersonRequestDocumentSubjects znoSubj) {
        return null;
    }

    public Long AddRequestOlympiadsAwards(Long requestId, DPersonRequestOlympiadsAwards olympiadsAwards) {
        return null;
    }

    public Long AddRequestExaminations(Long requestId, DPersonRequestExaminations examSubj) {
        return null;
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

}