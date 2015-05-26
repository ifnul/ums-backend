
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonEducationHistory2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonEducationHistory2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonEducationHistory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationPaymentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationHistoryDesciption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Course" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Qualification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicYearName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CourseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QualificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationPaymentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationHistoryDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonEducationHistoryDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_OrderOfEnrollment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationHistoryOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecScecializationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationHistoryOrdersNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationHistoryOrdersDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsConfirmed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicLeaveType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicLeaveTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKodeFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityFrom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullNameFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonEducationHistoryCorrected" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsCorrected" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationsCancelEducationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationsCancelEducationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionClassifierCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionClassifierCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionClassifierCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionClassifierCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionName4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionClassifierCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionName5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfession1_MaxRang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfession2_MaxRang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfession3_MaxRang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfession4_MaxRang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfession5_MaxRang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfession1_CurRang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfession2_CurRang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfession3_CurRang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfession4_CurRang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfession5_CurRang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_SpecProfessions1RangType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_SpecProfessions2RangType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_SpecProfessions3RangType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_SpecProfessions4RangType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_SpecProfessions5RangType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecProfessionsRangTypeName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionsRangTypeName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionsRangTypeName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionsRangTypeName4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionsRangTypeName5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonEducationDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonEducationHistoryTypeNameOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonEducationHistoryTypeOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonEducationHistory2", propOrder = {
    "idPersonEducationHistory",
    "idPersonEducationHistoryType",
    "idPersonEducation",
    "idPersonEducationPaymentType",
    "idUniversityGroup",
    "dateLastChange",
    "isActive",
    "personEducationHistoryDesciption",
    "universityGroupCode",
    "universityGroupFullName",
    "universityGroupShortName",
    "universityGroupDescription",
    "idAcademicYear",
    "idCourse",
    "idPersonEducationForm",
    "universityFacultetKode",
    "specCode",
    "universityKode",
    "idQualification",
    "academicYearName",
    "courseName",
    "personEducationFormName",
    "universityFullName",
    "universityShortName",
    "universityFacultetFullName",
    "universityFacultetShortName",
    "qualificationName",
    "personEducationPaymentTypeName",
    "personEducationHistoryTypeName",
    "personCodeU",
    "personEducationHistoryDateBegin",
    "personEducationHistoryDateEnd",
    "idOrderOfEnrollment",
    "idPersonEducationHistoryOrders",
    "specClasifierCode",
    "specDirectionName",
    "specSpecialityClasifierCode",
    "specSpecialityName",
    "specScecializationName",
    "personEducationHistoryOrdersNumber",
    "personEducationHistoryOrdersDate",
    "isConfirmed",
    "idAcademicLeaveType",
    "academicLeaveTypeName",
    "universityKodeFrom",
    "idUniversityFrom",
    "universityFullNameFrom",
    "userFIO",
    "idPersonEducationHistoryCorrected",
    "isCorrected",
    "idPersonEducationsCancelEducationType",
    "personEducationsCancelEducationTypeName",
    "idPersonName",
    "fio",
    "specProfessionClassifierCode1",
    "specProfessionName1",
    "specProfessionClassifierCode2",
    "specProfessionName2",
    "specProfessionClassifierCode3",
    "specProfessionName3",
    "specProfessionClassifierCode4",
    "specProfessionName4",
    "specProfessionClassifierCode5",
    "specProfessionName5",
    "specProfession1MaxRang",
    "specProfession2MaxRang",
    "specProfession3MaxRang",
    "specProfession4MaxRang",
    "specProfession5MaxRang",
    "specProfession1CurRang",
    "specProfession2CurRang",
    "specProfession3CurRang",
    "specProfession4CurRang",
    "specProfession5CurRang",
    "idSpecProfessions1RangType",
    "idSpecProfessions2RangType",
    "idSpecProfessions3RangType",
    "idSpecProfessions4RangType",
    "idSpecProfessions5RangType",
    "specProfessionsRangTypeName1",
    "specProfessionsRangTypeName2",
    "specProfessionsRangTypeName3",
    "specProfessionsRangTypeName4",
    "specProfessionsRangTypeName5",
    "personEducationDateBegin",
    "personEducationDateEnd",
    "personEducationHistoryTypeNameOrder",
    "idPersonEducationHistoryTypeOrder"
})
public class DPersonEducationHistory2 {

    @XmlElement(name = "Id_PersonEducationHistory")
    protected int idPersonEducationHistory;
    @XmlElement(name = "Id_PersonEducationHistoryType")
    protected int idPersonEducationHistoryType;
    @XmlElement(name = "Id_PersonEducation")
    protected int idPersonEducation;
    @XmlElement(name = "Id_PersonEducationPaymentType")
    protected int idPersonEducationPaymentType;
    @XmlElement(name = "Id_UniversityGroup")
    protected int idUniversityGroup;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "IsActive")
    protected int isActive;
    @XmlElement(name = "PersonEducationHistoryDesciption")
    protected String personEducationHistoryDesciption;
    @XmlElement(name = "UniversityGroupCode")
    protected String universityGroupCode;
    @XmlElement(name = "UniversityGroupFullName")
    protected String universityGroupFullName;
    @XmlElement(name = "UniversityGroupShortName")
    protected String universityGroupShortName;
    @XmlElement(name = "UniversityGroupDescription")
    protected String universityGroupDescription;
    @XmlElement(name = "Id_AcademicYear")
    protected int idAcademicYear;
    @XmlElement(name = "Id_Course")
    protected int idCourse;
    @XmlElement(name = "Id_PersonEducationForm")
    protected int idPersonEducationForm;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "SpecCode")
    protected String specCode;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_Qualification")
    protected int idQualification;
    @XmlElement(name = "AcademicYearName")
    protected String academicYearName;
    @XmlElement(name = "CourseName")
    protected String courseName;
    @XmlElement(name = "PersonEducationFormName")
    protected String personEducationFormName;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "UniversityShortName")
    protected String universityShortName;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "UniversityFacultetShortName")
    protected String universityFacultetShortName;
    @XmlElement(name = "QualificationName")
    protected String qualificationName;
    @XmlElement(name = "PersonEducationPaymentTypeName")
    protected String personEducationPaymentTypeName;
    @XmlElement(name = "PersonEducationHistoryTypeName")
    protected String personEducationHistoryTypeName;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "PersonEducationHistoryDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personEducationHistoryDateBegin;
    @XmlElement(name = "PersonEducationHistoryDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personEducationHistoryDateEnd;
    @XmlElement(name = "Id_OrderOfEnrollment")
    protected int idOrderOfEnrollment;
    @XmlElement(name = "Id_PersonEducationHistoryOrders")
    protected int idPersonEducationHistoryOrders;
    @XmlElement(name = "SpecClasifierCode")
    protected String specClasifierCode;
    @XmlElement(name = "SpecDirectionName")
    protected String specDirectionName;
    @XmlElement(name = "SpecSpecialityClasifierCode")
    protected String specSpecialityClasifierCode;
    @XmlElement(name = "SpecSpecialityName")
    protected String specSpecialityName;
    @XmlElement(name = "SpecScecializationName")
    protected String specScecializationName;
    @XmlElement(name = "PersonEducationHistoryOrdersNumber")
    protected String personEducationHistoryOrdersNumber;
    @XmlElement(name = "PersonEducationHistoryOrdersDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personEducationHistoryOrdersDate;
    @XmlElement(name = "IsConfirmed")
    protected int isConfirmed;
    @XmlElement(name = "Id_AcademicLeaveType")
    protected int idAcademicLeaveType;
    @XmlElement(name = "AcademicLeaveTypeName")
    protected String academicLeaveTypeName;
    @XmlElement(name = "UniversityKodeFrom")
    protected String universityKodeFrom;
    @XmlElement(name = "Id_UniversityFrom")
    protected int idUniversityFrom;
    @XmlElement(name = "UniversityFullNameFrom")
    protected String universityFullNameFrom;
    @XmlElement(name = "UserFIO")
    protected String userFIO;
    @XmlElement(name = "Id_PersonEducationHistoryCorrected")
    protected int idPersonEducationHistoryCorrected;
    @XmlElement(name = "IsCorrected")
    protected int isCorrected;
    @XmlElement(name = "Id_PersonEducationsCancelEducationType")
    protected int idPersonEducationsCancelEducationType;
    @XmlElement(name = "PersonEducationsCancelEducationTypeName")
    protected String personEducationsCancelEducationTypeName;
    @XmlElement(name = "Id_PersonName")
    protected int idPersonName;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "SpecProfessionClassifierCode1")
    protected String specProfessionClassifierCode1;
    @XmlElement(name = "SpecProfessionName1")
    protected String specProfessionName1;
    @XmlElement(name = "SpecProfessionClassifierCode2")
    protected String specProfessionClassifierCode2;
    @XmlElement(name = "SpecProfessionName2")
    protected String specProfessionName2;
    @XmlElement(name = "SpecProfessionClassifierCode3")
    protected String specProfessionClassifierCode3;
    @XmlElement(name = "SpecProfessionName3")
    protected String specProfessionName3;
    @XmlElement(name = "SpecProfessionClassifierCode4")
    protected String specProfessionClassifierCode4;
    @XmlElement(name = "SpecProfessionName4")
    protected String specProfessionName4;
    @XmlElement(name = "SpecProfessionClassifierCode5")
    protected String specProfessionClassifierCode5;
    @XmlElement(name = "SpecProfessionName5")
    protected String specProfessionName5;
    @XmlElement(name = "SpecProfession1_MaxRang")
    protected String specProfession1MaxRang;
    @XmlElement(name = "SpecProfession2_MaxRang")
    protected String specProfession2MaxRang;
    @XmlElement(name = "SpecProfession3_MaxRang")
    protected String specProfession3MaxRang;
    @XmlElement(name = "SpecProfession4_MaxRang")
    protected String specProfession4MaxRang;
    @XmlElement(name = "SpecProfession5_MaxRang")
    protected String specProfession5MaxRang;
    @XmlElement(name = "SpecProfession1_CurRang")
    protected String specProfession1CurRang;
    @XmlElement(name = "SpecProfession2_CurRang")
    protected String specProfession2CurRang;
    @XmlElement(name = "SpecProfession3_CurRang")
    protected String specProfession3CurRang;
    @XmlElement(name = "SpecProfession4_CurRang")
    protected String specProfession4CurRang;
    @XmlElement(name = "SpecProfession5_CurRang")
    protected String specProfession5CurRang;
    @XmlElement(name = "Id_SpecProfessions1RangType")
    protected int idSpecProfessions1RangType;
    @XmlElement(name = "Id_SpecProfessions2RangType")
    protected int idSpecProfessions2RangType;
    @XmlElement(name = "Id_SpecProfessions3RangType")
    protected int idSpecProfessions3RangType;
    @XmlElement(name = "Id_SpecProfessions4RangType")
    protected int idSpecProfessions4RangType;
    @XmlElement(name = "Id_SpecProfessions5RangType")
    protected int idSpecProfessions5RangType;
    @XmlElement(name = "SpecProfessionsRangTypeName1")
    protected String specProfessionsRangTypeName1;
    @XmlElement(name = "SpecProfessionsRangTypeName2")
    protected String specProfessionsRangTypeName2;
    @XmlElement(name = "SpecProfessionsRangTypeName3")
    protected String specProfessionsRangTypeName3;
    @XmlElement(name = "SpecProfessionsRangTypeName4")
    protected String specProfessionsRangTypeName4;
    @XmlElement(name = "SpecProfessionsRangTypeName5")
    protected String specProfessionsRangTypeName5;
    @XmlElement(name = "PersonEducationDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personEducationDateBegin;
    @XmlElement(name = "PersonEducationDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personEducationDateEnd;
    @XmlElement(name = "PersonEducationHistoryTypeNameOrder")
    protected String personEducationHistoryTypeNameOrder;
    @XmlElement(name = "Id_PersonEducationHistoryTypeOrder")
    protected int idPersonEducationHistoryTypeOrder;

    /**
     * Gets the value of the idPersonEducationHistory property.
     * 
     */
    public int getIdPersonEducationHistory() {
        return idPersonEducationHistory;
    }

    /**
     * Sets the value of the idPersonEducationHistory property.
     * 
     */
    public void setIdPersonEducationHistory(int value) {
        this.idPersonEducationHistory = value;
    }

    /**
     * Gets the value of the idPersonEducationHistoryType property.
     * 
     */
    public int getIdPersonEducationHistoryType() {
        return idPersonEducationHistoryType;
    }

    /**
     * Sets the value of the idPersonEducationHistoryType property.
     * 
     */
    public void setIdPersonEducationHistoryType(int value) {
        this.idPersonEducationHistoryType = value;
    }

    /**
     * Gets the value of the idPersonEducation property.
     * 
     */
    public int getIdPersonEducation() {
        return idPersonEducation;
    }

    /**
     * Sets the value of the idPersonEducation property.
     * 
     */
    public void setIdPersonEducation(int value) {
        this.idPersonEducation = value;
    }

    /**
     * Gets the value of the idPersonEducationPaymentType property.
     * 
     */
    public int getIdPersonEducationPaymentType() {
        return idPersonEducationPaymentType;
    }

    /**
     * Sets the value of the idPersonEducationPaymentType property.
     * 
     */
    public void setIdPersonEducationPaymentType(int value) {
        this.idPersonEducationPaymentType = value;
    }

    /**
     * Gets the value of the idUniversityGroup property.
     * 
     */
    public int getIdUniversityGroup() {
        return idUniversityGroup;
    }

    /**
     * Sets the value of the idUniversityGroup property.
     * 
     */
    public void setIdUniversityGroup(int value) {
        this.idUniversityGroup = value;
    }

    /**
     * Gets the value of the dateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastChange() {
        return dateLastChange;
    }

    /**
     * Sets the value of the dateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastChange(XMLGregorianCalendar value) {
        this.dateLastChange = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
    public int getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(int value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the personEducationHistoryDesciption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationHistoryDesciption() {
        return personEducationHistoryDesciption;
    }

    /**
     * Sets the value of the personEducationHistoryDesciption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationHistoryDesciption(String value) {
        this.personEducationHistoryDesciption = value;
    }

    /**
     * Gets the value of the universityGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityGroupCode() {
        return universityGroupCode;
    }

    /**
     * Sets the value of the universityGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityGroupCode(String value) {
        this.universityGroupCode = value;
    }

    /**
     * Gets the value of the universityGroupFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityGroupFullName() {
        return universityGroupFullName;
    }

    /**
     * Sets the value of the universityGroupFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityGroupFullName(String value) {
        this.universityGroupFullName = value;
    }

    /**
     * Gets the value of the universityGroupShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityGroupShortName() {
        return universityGroupShortName;
    }

    /**
     * Sets the value of the universityGroupShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityGroupShortName(String value) {
        this.universityGroupShortName = value;
    }

    /**
     * Gets the value of the universityGroupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityGroupDescription() {
        return universityGroupDescription;
    }

    /**
     * Sets the value of the universityGroupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityGroupDescription(String value) {
        this.universityGroupDescription = value;
    }

    /**
     * Gets the value of the idAcademicYear property.
     * 
     */
    public int getIdAcademicYear() {
        return idAcademicYear;
    }

    /**
     * Sets the value of the idAcademicYear property.
     * 
     */
    public void setIdAcademicYear(int value) {
        this.idAcademicYear = value;
    }

    /**
     * Gets the value of the idCourse property.
     * 
     */
    public int getIdCourse() {
        return idCourse;
    }

    /**
     * Sets the value of the idCourse property.
     * 
     */
    public void setIdCourse(int value) {
        this.idCourse = value;
    }

    /**
     * Gets the value of the idPersonEducationForm property.
     * 
     */
    public int getIdPersonEducationForm() {
        return idPersonEducationForm;
    }

    /**
     * Sets the value of the idPersonEducationForm property.
     * 
     */
    public void setIdPersonEducationForm(int value) {
        this.idPersonEducationForm = value;
    }

    /**
     * Gets the value of the universityFacultetKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetKode() {
        return universityFacultetKode;
    }

    /**
     * Sets the value of the universityFacultetKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetKode(String value) {
        this.universityFacultetKode = value;
    }

    /**
     * Gets the value of the specCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecCode() {
        return specCode;
    }

    /**
     * Sets the value of the specCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecCode(String value) {
        this.specCode = value;
    }

    /**
     * Gets the value of the universityKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKode() {
        return universityKode;
    }

    /**
     * Sets the value of the universityKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKode(String value) {
        this.universityKode = value;
    }

    /**
     * Gets the value of the idQualification property.
     * 
     */
    public int getIdQualification() {
        return idQualification;
    }

    /**
     * Sets the value of the idQualification property.
     * 
     */
    public void setIdQualification(int value) {
        this.idQualification = value;
    }

    /**
     * Gets the value of the academicYearName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicYearName() {
        return academicYearName;
    }

    /**
     * Sets the value of the academicYearName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicYearName(String value) {
        this.academicYearName = value;
    }

    /**
     * Gets the value of the courseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Sets the value of the courseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseName(String value) {
        this.courseName = value;
    }

    /**
     * Gets the value of the personEducationFormName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationFormName() {
        return personEducationFormName;
    }

    /**
     * Sets the value of the personEducationFormName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationFormName(String value) {
        this.personEducationFormName = value;
    }

    /**
     * Gets the value of the universityFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullName() {
        return universityFullName;
    }

    /**
     * Sets the value of the universityFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullName(String value) {
        this.universityFullName = value;
    }

    /**
     * Gets the value of the universityShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityShortName() {
        return universityShortName;
    }

    /**
     * Sets the value of the universityShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityShortName(String value) {
        this.universityShortName = value;
    }

    /**
     * Gets the value of the universityFacultetFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetFullName() {
        return universityFacultetFullName;
    }

    /**
     * Sets the value of the universityFacultetFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetFullName(String value) {
        this.universityFacultetFullName = value;
    }

    /**
     * Gets the value of the universityFacultetShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetShortName() {
        return universityFacultetShortName;
    }

    /**
     * Sets the value of the universityFacultetShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetShortName(String value) {
        this.universityFacultetShortName = value;
    }

    /**
     * Gets the value of the qualificationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationName() {
        return qualificationName;
    }

    /**
     * Sets the value of the qualificationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationName(String value) {
        this.qualificationName = value;
    }

    /**
     * Gets the value of the personEducationPaymentTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationPaymentTypeName() {
        return personEducationPaymentTypeName;
    }

    /**
     * Sets the value of the personEducationPaymentTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationPaymentTypeName(String value) {
        this.personEducationPaymentTypeName = value;
    }

    /**
     * Gets the value of the personEducationHistoryTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationHistoryTypeName() {
        return personEducationHistoryTypeName;
    }

    /**
     * Sets the value of the personEducationHistoryTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationHistoryTypeName(String value) {
        this.personEducationHistoryTypeName = value;
    }

    /**
     * Gets the value of the personCodeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeU() {
        return personCodeU;
    }

    /**
     * Sets the value of the personCodeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeU(String value) {
        this.personCodeU = value;
    }

    /**
     * Gets the value of the personEducationHistoryDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonEducationHistoryDateBegin() {
        return personEducationHistoryDateBegin;
    }

    /**
     * Sets the value of the personEducationHistoryDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonEducationHistoryDateBegin(XMLGregorianCalendar value) {
        this.personEducationHistoryDateBegin = value;
    }

    /**
     * Gets the value of the personEducationHistoryDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonEducationHistoryDateEnd() {
        return personEducationHistoryDateEnd;
    }

    /**
     * Sets the value of the personEducationHistoryDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonEducationHistoryDateEnd(XMLGregorianCalendar value) {
        this.personEducationHistoryDateEnd = value;
    }

    /**
     * Gets the value of the idOrderOfEnrollment property.
     * 
     */
    public int getIdOrderOfEnrollment() {
        return idOrderOfEnrollment;
    }

    /**
     * Sets the value of the idOrderOfEnrollment property.
     * 
     */
    public void setIdOrderOfEnrollment(int value) {
        this.idOrderOfEnrollment = value;
    }

    /**
     * Gets the value of the idPersonEducationHistoryOrders property.
     * 
     */
    public int getIdPersonEducationHistoryOrders() {
        return idPersonEducationHistoryOrders;
    }

    /**
     * Sets the value of the idPersonEducationHistoryOrders property.
     * 
     */
    public void setIdPersonEducationHistoryOrders(int value) {
        this.idPersonEducationHistoryOrders = value;
    }

    /**
     * Gets the value of the specClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecClasifierCode() {
        return specClasifierCode;
    }

    /**
     * Sets the value of the specClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecClasifierCode(String value) {
        this.specClasifierCode = value;
    }

    /**
     * Gets the value of the specDirectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionName() {
        return specDirectionName;
    }

    /**
     * Sets the value of the specDirectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionName(String value) {
        this.specDirectionName = value;
    }

    /**
     * Gets the value of the specSpecialityClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityClasifierCode() {
        return specSpecialityClasifierCode;
    }

    /**
     * Sets the value of the specSpecialityClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityClasifierCode(String value) {
        this.specSpecialityClasifierCode = value;
    }

    /**
     * Gets the value of the specSpecialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityName() {
        return specSpecialityName;
    }

    /**
     * Sets the value of the specSpecialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityName(String value) {
        this.specSpecialityName = value;
    }

    /**
     * Gets the value of the specScecializationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecScecializationName() {
        return specScecializationName;
    }

    /**
     * Sets the value of the specScecializationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecScecializationName(String value) {
        this.specScecializationName = value;
    }

    /**
     * Gets the value of the personEducationHistoryOrdersNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationHistoryOrdersNumber() {
        return personEducationHistoryOrdersNumber;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationHistoryOrdersNumber(String value) {
        this.personEducationHistoryOrdersNumber = value;
    }

    /**
     * Gets the value of the personEducationHistoryOrdersDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonEducationHistoryOrdersDate() {
        return personEducationHistoryOrdersDate;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonEducationHistoryOrdersDate(XMLGregorianCalendar value) {
        this.personEducationHistoryOrdersDate = value;
    }

    /**
     * Gets the value of the isConfirmed property.
     * 
     */
    public int getIsConfirmed() {
        return isConfirmed;
    }

    /**
     * Sets the value of the isConfirmed property.
     * 
     */
    public void setIsConfirmed(int value) {
        this.isConfirmed = value;
    }

    /**
     * Gets the value of the idAcademicLeaveType property.
     * 
     */
    public int getIdAcademicLeaveType() {
        return idAcademicLeaveType;
    }

    /**
     * Sets the value of the idAcademicLeaveType property.
     * 
     */
    public void setIdAcademicLeaveType(int value) {
        this.idAcademicLeaveType = value;
    }

    /**
     * Gets the value of the academicLeaveTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicLeaveTypeName() {
        return academicLeaveTypeName;
    }

    /**
     * Sets the value of the academicLeaveTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicLeaveTypeName(String value) {
        this.academicLeaveTypeName = value;
    }

    /**
     * Gets the value of the universityKodeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKodeFrom() {
        return universityKodeFrom;
    }

    /**
     * Sets the value of the universityKodeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKodeFrom(String value) {
        this.universityKodeFrom = value;
    }

    /**
     * Gets the value of the idUniversityFrom property.
     * 
     */
    public int getIdUniversityFrom() {
        return idUniversityFrom;
    }

    /**
     * Sets the value of the idUniversityFrom property.
     * 
     */
    public void setIdUniversityFrom(int value) {
        this.idUniversityFrom = value;
    }

    /**
     * Gets the value of the universityFullNameFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullNameFrom() {
        return universityFullNameFrom;
    }

    /**
     * Sets the value of the universityFullNameFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullNameFrom(String value) {
        this.universityFullNameFrom = value;
    }

    /**
     * Gets the value of the userFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFIO() {
        return userFIO;
    }

    /**
     * Sets the value of the userFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFIO(String value) {
        this.userFIO = value;
    }

    /**
     * Gets the value of the idPersonEducationHistoryCorrected property.
     * 
     */
    public int getIdPersonEducationHistoryCorrected() {
        return idPersonEducationHistoryCorrected;
    }

    /**
     * Sets the value of the idPersonEducationHistoryCorrected property.
     * 
     */
    public void setIdPersonEducationHistoryCorrected(int value) {
        this.idPersonEducationHistoryCorrected = value;
    }

    /**
     * Gets the value of the isCorrected property.
     * 
     */
    public int getIsCorrected() {
        return isCorrected;
    }

    /**
     * Sets the value of the isCorrected property.
     * 
     */
    public void setIsCorrected(int value) {
        this.isCorrected = value;
    }

    /**
     * Gets the value of the idPersonEducationsCancelEducationType property.
     * 
     */
    public int getIdPersonEducationsCancelEducationType() {
        return idPersonEducationsCancelEducationType;
    }

    /**
     * Sets the value of the idPersonEducationsCancelEducationType property.
     * 
     */
    public void setIdPersonEducationsCancelEducationType(int value) {
        this.idPersonEducationsCancelEducationType = value;
    }

    /**
     * Gets the value of the personEducationsCancelEducationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationsCancelEducationTypeName() {
        return personEducationsCancelEducationTypeName;
    }

    /**
     * Sets the value of the personEducationsCancelEducationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationsCancelEducationTypeName(String value) {
        this.personEducationsCancelEducationTypeName = value;
    }

    /**
     * Gets the value of the idPersonName property.
     * 
     */
    public int getIdPersonName() {
        return idPersonName;
    }

    /**
     * Sets the value of the idPersonName property.
     * 
     */
    public void setIdPersonName(int value) {
        this.idPersonName = value;
    }

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIO() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIO(String value) {
        this.fio = value;
    }

    /**
     * Gets the value of the specProfessionClassifierCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionClassifierCode1() {
        return specProfessionClassifierCode1;
    }

    /**
     * Sets the value of the specProfessionClassifierCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionClassifierCode1(String value) {
        this.specProfessionClassifierCode1 = value;
    }

    /**
     * Gets the value of the specProfessionName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionName1() {
        return specProfessionName1;
    }

    /**
     * Sets the value of the specProfessionName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionName1(String value) {
        this.specProfessionName1 = value;
    }

    /**
     * Gets the value of the specProfessionClassifierCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionClassifierCode2() {
        return specProfessionClassifierCode2;
    }

    /**
     * Sets the value of the specProfessionClassifierCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionClassifierCode2(String value) {
        this.specProfessionClassifierCode2 = value;
    }

    /**
     * Gets the value of the specProfessionName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionName2() {
        return specProfessionName2;
    }

    /**
     * Sets the value of the specProfessionName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionName2(String value) {
        this.specProfessionName2 = value;
    }

    /**
     * Gets the value of the specProfessionClassifierCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionClassifierCode3() {
        return specProfessionClassifierCode3;
    }

    /**
     * Sets the value of the specProfessionClassifierCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionClassifierCode3(String value) {
        this.specProfessionClassifierCode3 = value;
    }

    /**
     * Gets the value of the specProfessionName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionName3() {
        return specProfessionName3;
    }

    /**
     * Sets the value of the specProfessionName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionName3(String value) {
        this.specProfessionName3 = value;
    }

    /**
     * Gets the value of the specProfessionClassifierCode4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionClassifierCode4() {
        return specProfessionClassifierCode4;
    }

    /**
     * Sets the value of the specProfessionClassifierCode4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionClassifierCode4(String value) {
        this.specProfessionClassifierCode4 = value;
    }

    /**
     * Gets the value of the specProfessionName4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionName4() {
        return specProfessionName4;
    }

    /**
     * Sets the value of the specProfessionName4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionName4(String value) {
        this.specProfessionName4 = value;
    }

    /**
     * Gets the value of the specProfessionClassifierCode5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionClassifierCode5() {
        return specProfessionClassifierCode5;
    }

    /**
     * Sets the value of the specProfessionClassifierCode5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionClassifierCode5(String value) {
        this.specProfessionClassifierCode5 = value;
    }

    /**
     * Gets the value of the specProfessionName5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionName5() {
        return specProfessionName5;
    }

    /**
     * Sets the value of the specProfessionName5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionName5(String value) {
        this.specProfessionName5 = value;
    }

    /**
     * Gets the value of the specProfession1MaxRang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfession1MaxRang() {
        return specProfession1MaxRang;
    }

    /**
     * Sets the value of the specProfession1MaxRang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfession1MaxRang(String value) {
        this.specProfession1MaxRang = value;
    }

    /**
     * Gets the value of the specProfession2MaxRang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfession2MaxRang() {
        return specProfession2MaxRang;
    }

    /**
     * Sets the value of the specProfession2MaxRang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfession2MaxRang(String value) {
        this.specProfession2MaxRang = value;
    }

    /**
     * Gets the value of the specProfession3MaxRang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfession3MaxRang() {
        return specProfession3MaxRang;
    }

    /**
     * Sets the value of the specProfession3MaxRang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfession3MaxRang(String value) {
        this.specProfession3MaxRang = value;
    }

    /**
     * Gets the value of the specProfession4MaxRang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfession4MaxRang() {
        return specProfession4MaxRang;
    }

    /**
     * Sets the value of the specProfession4MaxRang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfession4MaxRang(String value) {
        this.specProfession4MaxRang = value;
    }

    /**
     * Gets the value of the specProfession5MaxRang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfession5MaxRang() {
        return specProfession5MaxRang;
    }

    /**
     * Sets the value of the specProfession5MaxRang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfession5MaxRang(String value) {
        this.specProfession5MaxRang = value;
    }

    /**
     * Gets the value of the specProfession1CurRang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfession1CurRang() {
        return specProfession1CurRang;
    }

    /**
     * Sets the value of the specProfession1CurRang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfession1CurRang(String value) {
        this.specProfession1CurRang = value;
    }

    /**
     * Gets the value of the specProfession2CurRang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfession2CurRang() {
        return specProfession2CurRang;
    }

    /**
     * Sets the value of the specProfession2CurRang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfession2CurRang(String value) {
        this.specProfession2CurRang = value;
    }

    /**
     * Gets the value of the specProfession3CurRang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfession3CurRang() {
        return specProfession3CurRang;
    }

    /**
     * Sets the value of the specProfession3CurRang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfession3CurRang(String value) {
        this.specProfession3CurRang = value;
    }

    /**
     * Gets the value of the specProfession4CurRang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfession4CurRang() {
        return specProfession4CurRang;
    }

    /**
     * Sets the value of the specProfession4CurRang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfession4CurRang(String value) {
        this.specProfession4CurRang = value;
    }

    /**
     * Gets the value of the specProfession5CurRang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfession5CurRang() {
        return specProfession5CurRang;
    }

    /**
     * Sets the value of the specProfession5CurRang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfession5CurRang(String value) {
        this.specProfession5CurRang = value;
    }

    /**
     * Gets the value of the idSpecProfessions1RangType property.
     * 
     */
    public int getIdSpecProfessions1RangType() {
        return idSpecProfessions1RangType;
    }

    /**
     * Sets the value of the idSpecProfessions1RangType property.
     * 
     */
    public void setIdSpecProfessions1RangType(int value) {
        this.idSpecProfessions1RangType = value;
    }

    /**
     * Gets the value of the idSpecProfessions2RangType property.
     * 
     */
    public int getIdSpecProfessions2RangType() {
        return idSpecProfessions2RangType;
    }

    /**
     * Sets the value of the idSpecProfessions2RangType property.
     * 
     */
    public void setIdSpecProfessions2RangType(int value) {
        this.idSpecProfessions2RangType = value;
    }

    /**
     * Gets the value of the idSpecProfessions3RangType property.
     * 
     */
    public int getIdSpecProfessions3RangType() {
        return idSpecProfessions3RangType;
    }

    /**
     * Sets the value of the idSpecProfessions3RangType property.
     * 
     */
    public void setIdSpecProfessions3RangType(int value) {
        this.idSpecProfessions3RangType = value;
    }

    /**
     * Gets the value of the idSpecProfessions4RangType property.
     * 
     */
    public int getIdSpecProfessions4RangType() {
        return idSpecProfessions4RangType;
    }

    /**
     * Sets the value of the idSpecProfessions4RangType property.
     * 
     */
    public void setIdSpecProfessions4RangType(int value) {
        this.idSpecProfessions4RangType = value;
    }

    /**
     * Gets the value of the idSpecProfessions5RangType property.
     * 
     */
    public int getIdSpecProfessions5RangType() {
        return idSpecProfessions5RangType;
    }

    /**
     * Sets the value of the idSpecProfessions5RangType property.
     * 
     */
    public void setIdSpecProfessions5RangType(int value) {
        this.idSpecProfessions5RangType = value;
    }

    /**
     * Gets the value of the specProfessionsRangTypeName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionsRangTypeName1() {
        return specProfessionsRangTypeName1;
    }

    /**
     * Sets the value of the specProfessionsRangTypeName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionsRangTypeName1(String value) {
        this.specProfessionsRangTypeName1 = value;
    }

    /**
     * Gets the value of the specProfessionsRangTypeName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionsRangTypeName2() {
        return specProfessionsRangTypeName2;
    }

    /**
     * Sets the value of the specProfessionsRangTypeName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionsRangTypeName2(String value) {
        this.specProfessionsRangTypeName2 = value;
    }

    /**
     * Gets the value of the specProfessionsRangTypeName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionsRangTypeName3() {
        return specProfessionsRangTypeName3;
    }

    /**
     * Sets the value of the specProfessionsRangTypeName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionsRangTypeName3(String value) {
        this.specProfessionsRangTypeName3 = value;
    }

    /**
     * Gets the value of the specProfessionsRangTypeName4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionsRangTypeName4() {
        return specProfessionsRangTypeName4;
    }

    /**
     * Sets the value of the specProfessionsRangTypeName4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionsRangTypeName4(String value) {
        this.specProfessionsRangTypeName4 = value;
    }

    /**
     * Gets the value of the specProfessionsRangTypeName5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionsRangTypeName5() {
        return specProfessionsRangTypeName5;
    }

    /**
     * Sets the value of the specProfessionsRangTypeName5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionsRangTypeName5(String value) {
        this.specProfessionsRangTypeName5 = value;
    }

    /**
     * Gets the value of the personEducationDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonEducationDateBegin() {
        return personEducationDateBegin;
    }

    /**
     * Sets the value of the personEducationDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonEducationDateBegin(XMLGregorianCalendar value) {
        this.personEducationDateBegin = value;
    }

    /**
     * Gets the value of the personEducationDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonEducationDateEnd() {
        return personEducationDateEnd;
    }

    /**
     * Sets the value of the personEducationDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonEducationDateEnd(XMLGregorianCalendar value) {
        this.personEducationDateEnd = value;
    }

    /**
     * Gets the value of the personEducationHistoryTypeNameOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationHistoryTypeNameOrder() {
        return personEducationHistoryTypeNameOrder;
    }

    /**
     * Sets the value of the personEducationHistoryTypeNameOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationHistoryTypeNameOrder(String value) {
        this.personEducationHistoryTypeNameOrder = value;
    }

    /**
     * Gets the value of the idPersonEducationHistoryTypeOrder property.
     * 
     */
    public int getIdPersonEducationHistoryTypeOrder() {
        return idPersonEducationHistoryTypeOrder;
    }

    /**
     * Sets the value of the idPersonEducationHistoryTypeOrder property.
     * 
     */
    public void setIdPersonEducationHistoryTypeOrder(int value) {
        this.idPersonEducationHistoryTypeOrder = value;
    }

}
