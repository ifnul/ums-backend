package org.lnu.is.edbo.ua.edu.lnu.edbo;

import org.lnu.is.edbo.guides_min.DSpecSpecialization;
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

import java.rmi.RemoteException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by illya on 20.07.15.
 */
public class CallServiceImplament extends CallService {

    public CallServiceImplament() {
        super();
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+ConnectionEDBO.DefaultTable, "postgres",
                    "postgres");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void CloseConnection() {
        try {
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Long AddSpecoffer(DUniversityFacultetSpecialities spec) {
        try {
            stmt = c.createStatement();
            sql = "SELECT id FROM q_ob_specoffer WHERE uid=" + spec.getIdUniversitySpecialities();
            Long id = getFirstLong(stmt.executeQuery(sql));
            if ((!ConnectionEDBO.UpdateData) && (id != null)) return id;
            String SpecUtid = "";
            if (!spec.getSpecSpecializationCode().isEmpty())
                SpecUtid = spec.getSpecSpecializationCode();
            else if (!spec.getSpecSpecialityCode().isEmpty())
                SpecUtid = spec.getSpecSpecialityCode();
            else if (!spec.getSpecDirectionsCode().isEmpty())
                SpecUtid = spec.getSpecDirectionsCode();
            sql = "SELECT id FROM q_ob_specialty WHERE utid='" + SpecUtid + "'";
            Long idSpec = getFirstLong(stmt.executeQuery(sql));

            if (idSpec == null) {
                SpecUtid = spec.getSpecSpecialityCode();
                sql = "SELECT id, specialtytype_id,cipher FROM q_ob_specialty WHERE utid='" + SpecUtid + "'";
                ResultSet rs = stmt.executeQuery(sql);
                rs.next();
                idSpec = rs.getLong(1);
                Long specialitytype_id = rs.getLong(2);
                String cipher = rs.getString(3);
                List<DSpecSpecialization> arrayOfDSpecSpecialization = ConnectionEDBO.Instance().GetGuides().specSpecializationFind(
                        ConnectionEDBO.SessionGuid, spec.getSpecDirectionsCode(), spec.getSpecSpecialityCode()).getDSpecSpecialization();
                for (DSpecSpecialization sp : arrayOfDSpecSpecialization) {

                    sql = "SELECT id FROM q_ob_specialty WHERE utid='" + sp.getSpecScecializationCode() + "'";
                    idSpec = getFirstLong(stmt.executeQuery(sql));
                    if (idSpec != null) continue;
                    sql = "INSERT INTO q_ob_specialty (specialtytype_id, cipher, name, utid, uapp, status, actual, crtuser, crtusergroup, update_date, create_date, parent_id) VALUES (" + specialitytype_id + ", '" + cipher + "', '" + sp.getSpecScecializationName().replace("'", "’") + "', '" + sp.getSpecScecializationCode() + "','\"edbo/SpecSpecializationsGet\"','ACTIVE',1,'illay','PUBLIC',now(),now()," + idSpec + ")";
                    stmt.execute(sql);
                }
                SpecUtid = spec.getSpecSpecializationCode();
                sql = "SELECT id FROM q_ob_specialty WHERE utid='" + SpecUtid + "'";
                idSpec = getFirstLong(stmt.executeQuery(sql));

                if (idSpec == null) {
                    System.out.println(spec.getSpecDirectionName() + ":" + spec.getSpecSpecialityName() + ":" + spec.getSpecSpecializationName());
                    return null;
                }
            }

            sql = "SELECT id FROM q_ob_department WHERE utid='" + spec.getUniversityFacultetKode() + "'";
            Long idDepartment = getFirstLong(stmt.executeQuery(sql));
            if (idDepartment == null) {
                System.out.print(spec.getUniversityFacultetKode());
                System.out.print(":");
                System.out.print(spec.getUniversityFacultetFullName());
                System.out.print(":");
                System.out.println(spec.getUniversityFacultetShortName());
                return null;
            }

            sql = "SELECT id FROM q_ob_timeperiod WHERE uid=" + ConnectionEDBO.YearSeason + " and uapp='edbo/IdPersonRequestSeasons'";
            Long idTimeperiod = getFirstLong(stmt.executeQuery(sql));
            if (idTimeperiod == null) {
                System.out.print("Enter time period:" + ConnectionEDBO.YearSeason);
                return null;
            }

            sql = "SELECT id FROM q_ob_timeperiod WHERE uid=" + spec.getIdCourse() + "and uapp='edbo/IdCourse'";
            Long idCourseTimeperiod = getFirstLong(stmt.executeQuery(sql));
            if (idCourseTimeperiod == null) {
                System.out.print("Enter time period:" + ConnectionEDBO.YearSeason);
                return null;
            }

            sql = "SELECT id FROM q_rf_specoffertype WHERE uid=" + spec.getIdQualification();
            Long idSpecoffertype = getFirstLong(stmt.executeQuery(sql));
            if (idSpecoffertype == null) {
                System.out.print("Enter specoffer type:" + spec.getIdQualification());
                return null;
            }


            sql = "SELECT id FROM q_rf_eduformtype WHERE uid=" + spec.getIdPersonEducationForm();
            Long idEduformtype = getFirstLong(stmt.executeQuery(sql));
            if (idEduformtype == null) {
                System.out.print("Enter Eduform type:" + spec.getIdQualification());
                return null;
            }
            if (id == null) {
                sql = "INSERT INTO q_ob_specoffer " +
                        "(specialty_id, department_id, timeperiod_id, specoffertype_id, eduformtype_id, " +
                        "timeperiodcourse_id, duration, " +
                        "liccount, " +
                        "statecount, " +
                        "begdate, enddate, " +
                        "uid, utid, " +
                        "uapp, status, actual, crtuser, crtusergroup,update_date,create_date) values " +
                        "(" + idSpec + ", " + idDepartment + ", " + idTimeperiod + ", " + idSpecoffertype + ", " + idEduformtype + ", " +
                        idCourseTimeperiod + ", '" + spec.getDurationEducation() + "', " +
                        spec.getUniversitySpecialitiesLicenseCount() + ", " +
                        (spec.getUniversitySpecialitiesLicenseCount() - spec.getUniversitySpecialitiesContractCount()) + ", '" +
                        spec.getDateBeginPersonRequestSeason() + "', '" + spec.getDateEndPersonRequestSeason() + "', " +
                        spec.getIdUniversitySpecialities() + ", '" + spec.getUniversitySpecialitiesKode() + "', " +
                        "'edbo/IdUniversitySpecialities', 'ACTIVE', 1, 'illay', 'public', now(), now())";
                stmt.execute(sql);
                sql = "SELECT id FROM q_ob_specoffer WHERE uid=" + spec.getIdUniversitySpecialities();
                id = getFirstLong(stmt.executeQuery(sql));
            } else {
                sql = "UPDATE q_ob_specoffer  SET " +
                        "specialty_id=" + idSpec + ", " +
                        "department_id=" + idDepartment + ", " +
                        "timeperiod_id=" + idTimeperiod + ", " +
                        "specoffertype_id=" + idSpecoffertype + ", " +
                        "eduformtype_id=" + idEduformtype + ", " +
                        "timeperiodcourse_id=" + idCourseTimeperiod + ", " +
                        "duration='" + spec.getDurationEducation() + "', " +
                        "liccount=" + spec.getUniversitySpecialitiesLicenseCount() + ", " +
                        "statecount=" + (spec.getUniversitySpecialitiesLicenseCount() - spec.getUniversitySpecialitiesContractCount()) + ", " +
                        "begdate='" + spec.getDateBeginPersonRequestSeason() + "', " +
                        "enddate='" + spec.getDateEndPersonRequestSeason() + "', " +
                        "update_date=now()" +
                        "WHERE id = " + id;
                stmt.execute(sql);
            }
            return id;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Long AddSpecofferSubject(Long specofferId, DUniversityFacultetSpecialitiesSubjects2 specSubject) {
        try {
            stmt = c.createStatement();
            sql = "SELECT id FROM q_od_specoffersubject WHERE uid=" + specSubject.getIdUniversitySpecialitiesSubject() + "and uapp ='edbo/IdUniversitySpecialitiesSubject'";
            Long id = getFirstLong(stmt.executeQuery(sql));
            if ((!ConnectionEDBO.UpdateData) && (id != null)) return id;
            sql = "SELECT id FROM q_ob_specoffer WHERE (id=" + specofferId + ") OR (utid = '" + specSubject.getUniversitySpecialitiesKode() + "')";
            specofferId = getFirstLong(stmt.executeQuery(sql));
            if (specofferId == null) return null;
            sql = "SELECT id FROM q_rf_enrolsubject WHERE uid=" + specSubject.getIdSubject();
            Long idEnrolsubject = getFirstLong(stmt.executeQuery(sql));
            if (idEnrolsubject == null) {
                System.out.println("not exist Enrolment subject:" + specSubject.getIdSubject());
                return null;
            }
            if (id == null) {
                sql = "INSERT INTO q_od_specoffersubject(" +
                        "specoffer_id, enrolsubject_id, ismajor, alternative, mark, " +
                        "weightsubject, uid, uapp, status, actual, crtuser, " +
                        "crtusergroup, update_date, create_date, istrainingcourses)" +
                        "VALUES (" + specofferId + ", " + idEnrolsubject + ", " + (specSubject.getIsProfiled() == 1) + ", " +
                        (specSubject.getInGroup() == 1) + ", 100, " + specSubject.getKoeficient() + ", " +
                        specSubject.getIdUniversitySpecialitiesSubject() + ", 'edbo/IdUniversitySpecialitiesSubject', " +
                        "'ACTIVE', 1, 'illay', 'public', now(), now(), 0);";
                stmt.execute(sql);
                sql = "SELECT id FROM q_od_specoffersubject WHERE uid=" + specSubject.getIdUniversitySpecialitiesSubject() + "and uapp ='edbo/IdUniversitySpecialitiesSubject'";
                id = getFirstLong(stmt.executeQuery(sql));
                return id;
            }
            sql = "UPDATE q_od_specoffersubject " +
                    "SET specoffer_id=" + specofferId + ", enrolsubject_id=" + idEnrolsubject + ", " +
                    "ismajor=" + (specSubject.getIsProfiled() == 1) + ", alternative=" + (specSubject.getInGroup() == 1) + ", " +
                    "weightsubject=" + specSubject.getKoeficient() + ", update_date=now(), " +
                    "istrainingcourses=0 " +
                    "WHERE id=" + id;
            stmt.execute(sql);
            return id;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public Long AddSpecofferQuota(Long specofferId, DUniversityFacultetSpecialitiesQuotas specQuota) {
        try {
            stmt = c.createStatement();
            sql = "SELECT id FROM q_od_specofferbenefit WHERE uid=" + specQuota.getIdUniversitySpecialitiesQuota() + "and uapp ='edbo/IdUniversitySpecialitiesQuota'";
            Long id = getFirstLong(stmt.executeQuery(sql));
            if ((!ConnectionEDBO.UpdateData) && (id != null)) return id;
            sql = "SELECT id FROM q_ob_specoffer WHERE (id=" + specofferId + ") or (utid = '" + specQuota.getUniversitySpecialitiesKode() + "' and uapp='edbo/UniversitySpecialitiesKode')";
            specofferId = getFirstLong(stmt.executeQuery(sql));
            if (specofferId == null) return null;
            sql = "SELECT id FROM q_ob_benefit WHERE uid=" + specQuota.getIdQuota();
            Long idBenefit = getFirstLong(stmt.executeQuery(sql));
            if (idBenefit == null) {
                System.out.println("not exist benefit" + specQuota.getIdQuota());
                return null;
            }
            if (id == null) {
                sql = "INSERT INTO q_od_specofferbenefit(" +
                        "specoffer_id, benefit_id, uid, utid, uapp, status, actual, \n" +
                        "crtuser, crtusergroup, update_date, create_date)\n" +
                        "VALUES (" + specofferId + ", " + idBenefit + ", " +
                        specQuota.getIdUniversitySpecialitiesQuota() + ", 'edbo/IdUniversitySpecialitiesQuota', " +
                        "'ACTIVE', 1, 'illay', 'public', now(), now());";
                stmt.execute(sql);
                sql = "SELECT id FROM q_od_specofferbenefit WHERE uid=" + specQuota.getIdUniversitySpecialitiesQuota() + "and uapp ='edbo/IdUniversitySpecialitiesQuota'";
                id = getFirstLong(stmt.executeQuery(sql));
                return id;
            }
            sql = "UPDATE q_od_specofferbenefit " +
                    "SET specoffer_id=" + specofferId + ", benefit_id=" + idBenefit + ", " +
                    "update_date=now() " +
                    "WHERE id=" + id;
            stmt.execute(sql);
            return id;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public Long AddPerson(DPersonsFind dPersonsFind) {
        try{
            stmt = c.createStatement();
            sql = "SELECT id FROM q_ob_person WHERE (uid=" + dPersonsFind.getIdPerson() + " and utid = '"+ dPersonsFind.getPersonCodeU()+"' and uapp ='edbo/IdPerson'";
            Long id = getFirstLong(stmt.executeQuery(sql));
            if ((!ConnectionEDBO.UpdateData) && (id != null)) return id;

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
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
