
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonRequestSeasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitySpecialitiesKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalDocumentsAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsNeedHostel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodeOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonEnteranceTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequestExaminationCause" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversitySpecialitiesQuota1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversitySpecialitiesQuota2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversitySpecialitiesQuota3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RequestFromEB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsBudget" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsContract" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentSubject1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentSubject2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentSubject3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonCourse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonRequestCourseBonus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonOlympiadAward" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonRequestOlympiadAwardBonus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AutoSelectZnoSubjects" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RequestEnteranceCodes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsHigherEducation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SkipDocumentValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonBenefit1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonBenefit2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonBenefit3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionGUID",
    "idPersonRequestSeasons",
    "personCodeU",
    "universitySpecialitiesKode",
    "originalDocumentsAdd",
    "isNeedHostel",
    "codeOfBusiness",
    "idPersonEnteranceTypes",
    "idPersonRequestExaminationCause",
    "idUniversitySpecialitiesQuota1",
    "idUniversitySpecialitiesQuota2",
    "idUniversitySpecialitiesQuota3",
    "requestFromEB",
    "isBudget",
    "isContract",
    "idPersonEducationForm",
    "idPersonDocumentSubject1",
    "idPersonDocumentSubject2",
    "idPersonDocumentSubject3",
    "idPersonCourse",
    "personRequestCourseBonus",
    "idPersonOlympiadAward",
    "personRequestOlympiadAwardBonus",
    "idPersonDocument",
    "autoSelectZnoSubjects",
    "requestEnteranceCodes",
    "isHigherEducation",
    "skipDocumentValue",
    "idPersonBenefit1",
    "idPersonBenefit2",
    "idPersonBenefit3"
})
@XmlRootElement(name = "PersonRequestAdd")
public class PersonRequestAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_PersonRequestSeasons")
    protected int idPersonRequestSeasons;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "UniversitySpecialitiesKode")
    protected String universitySpecialitiesKode;
    @XmlElement(name = "OriginalDocumentsAdd")
    protected int originalDocumentsAdd;
    @XmlElement(name = "IsNeedHostel")
    protected int isNeedHostel;
    @XmlElement(name = "CodeOfBusiness")
    protected String codeOfBusiness;
    @XmlElement(name = "Id_PersonEnteranceTypes")
    protected int idPersonEnteranceTypes;
    @XmlElement(name = "Id_PersonRequestExaminationCause")
    protected int idPersonRequestExaminationCause;
    @XmlElement(name = "Id_UniversitySpecialitiesQuota1")
    protected int idUniversitySpecialitiesQuota1;
    @XmlElement(name = "Id_UniversitySpecialitiesQuota2")
    protected int idUniversitySpecialitiesQuota2;
    @XmlElement(name = "Id_UniversitySpecialitiesQuota3")
    protected int idUniversitySpecialitiesQuota3;
    @XmlElement(name = "RequestFromEB")
    protected int requestFromEB;
    @XmlElement(name = "IsBudget")
    protected int isBudget;
    @XmlElement(name = "IsContract")
    protected int isContract;
    @XmlElement(name = "Id_PersonEducationForm")
    protected int idPersonEducationForm;
    @XmlElement(name = "Id_PersonDocumentSubject1")
    protected int idPersonDocumentSubject1;
    @XmlElement(name = "Id_PersonDocumentSubject2")
    protected int idPersonDocumentSubject2;
    @XmlElement(name = "Id_PersonDocumentSubject3")
    protected int idPersonDocumentSubject3;
    @XmlElement(name = "Id_PersonCourse")
    protected int idPersonCourse;
    @XmlElement(name = "PersonRequestCourseBonus")
    protected String personRequestCourseBonus;
    @XmlElement(name = "Id_PersonOlympiadAward")
    protected int idPersonOlympiadAward;
    @XmlElement(name = "PersonRequestOlympiadAwardBonus")
    protected String personRequestOlympiadAwardBonus;
    @XmlElement(name = "Id_PersonDocument")
    protected int idPersonDocument;
    @XmlElement(name = "AutoSelectZnoSubjects")
    protected int autoSelectZnoSubjects;
    @XmlElement(name = "RequestEnteranceCodes")
    protected String requestEnteranceCodes;
    @XmlElement(name = "IsHigherEducation")
    protected int isHigherEducation;
    @XmlElement(name = "SkipDocumentValue")
    protected int skipDocumentValue;
    @XmlElement(name = "Id_PersonBenefit1")
    protected int idPersonBenefit1;
    @XmlElement(name = "Id_PersonBenefit2")
    protected int idPersonBenefit2;
    @XmlElement(name = "Id_PersonBenefit3")
    protected int idPersonBenefit3;

    /**
     * Gets the value of the sessionGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionGUID() {
        return sessionGUID;
    }

    /**
     * Sets the value of the sessionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionGUID(String value) {
        this.sessionGUID = value;
    }

    /**
     * Gets the value of the idPersonRequestSeasons property.
     * 
     */
    public int getIdPersonRequestSeasons() {
        return idPersonRequestSeasons;
    }

    /**
     * Sets the value of the idPersonRequestSeasons property.
     * 
     */
    public void setIdPersonRequestSeasons(int value) {
        this.idPersonRequestSeasons = value;
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
     * Gets the value of the universitySpecialitiesKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesKode() {
        return universitySpecialitiesKode;
    }

    /**
     * Sets the value of the universitySpecialitiesKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesKode(String value) {
        this.universitySpecialitiesKode = value;
    }

    /**
     * Gets the value of the originalDocumentsAdd property.
     * 
     */
    public int getOriginalDocumentsAdd() {
        return originalDocumentsAdd;
    }

    /**
     * Sets the value of the originalDocumentsAdd property.
     * 
     */
    public void setOriginalDocumentsAdd(int value) {
        this.originalDocumentsAdd = value;
    }

    /**
     * Gets the value of the isNeedHostel property.
     * 
     */
    public int getIsNeedHostel() {
        return isNeedHostel;
    }

    /**
     * Sets the value of the isNeedHostel property.
     * 
     */
    public void setIsNeedHostel(int value) {
        this.isNeedHostel = value;
    }

    /**
     * Gets the value of the codeOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeOfBusiness() {
        return codeOfBusiness;
    }

    /**
     * Sets the value of the codeOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeOfBusiness(String value) {
        this.codeOfBusiness = value;
    }

    /**
     * Gets the value of the idPersonEnteranceTypes property.
     * 
     */
    public int getIdPersonEnteranceTypes() {
        return idPersonEnteranceTypes;
    }

    /**
     * Sets the value of the idPersonEnteranceTypes property.
     * 
     */
    public void setIdPersonEnteranceTypes(int value) {
        this.idPersonEnteranceTypes = value;
    }

    /**
     * Gets the value of the idPersonRequestExaminationCause property.
     * 
     */
    public int getIdPersonRequestExaminationCause() {
        return idPersonRequestExaminationCause;
    }

    /**
     * Sets the value of the idPersonRequestExaminationCause property.
     * 
     */
    public void setIdPersonRequestExaminationCause(int value) {
        this.idPersonRequestExaminationCause = value;
    }

    /**
     * Gets the value of the idUniversitySpecialitiesQuota1 property.
     * 
     */
    public int getIdUniversitySpecialitiesQuota1() {
        return idUniversitySpecialitiesQuota1;
    }

    /**
     * Sets the value of the idUniversitySpecialitiesQuota1 property.
     * 
     */
    public void setIdUniversitySpecialitiesQuota1(int value) {
        this.idUniversitySpecialitiesQuota1 = value;
    }

    /**
     * Gets the value of the idUniversitySpecialitiesQuota2 property.
     * 
     */
    public int getIdUniversitySpecialitiesQuota2() {
        return idUniversitySpecialitiesQuota2;
    }

    /**
     * Sets the value of the idUniversitySpecialitiesQuota2 property.
     * 
     */
    public void setIdUniversitySpecialitiesQuota2(int value) {
        this.idUniversitySpecialitiesQuota2 = value;
    }

    /**
     * Gets the value of the idUniversitySpecialitiesQuota3 property.
     * 
     */
    public int getIdUniversitySpecialitiesQuota3() {
        return idUniversitySpecialitiesQuota3;
    }

    /**
     * Sets the value of the idUniversitySpecialitiesQuota3 property.
     * 
     */
    public void setIdUniversitySpecialitiesQuota3(int value) {
        this.idUniversitySpecialitiesQuota3 = value;
    }

    /**
     * Gets the value of the requestFromEB property.
     * 
     */
    public int getRequestFromEB() {
        return requestFromEB;
    }

    /**
     * Sets the value of the requestFromEB property.
     * 
     */
    public void setRequestFromEB(int value) {
        this.requestFromEB = value;
    }

    /**
     * Gets the value of the isBudget property.
     * 
     */
    public int getIsBudget() {
        return isBudget;
    }

    /**
     * Sets the value of the isBudget property.
     * 
     */
    public void setIsBudget(int value) {
        this.isBudget = value;
    }

    /**
     * Gets the value of the isContract property.
     * 
     */
    public int getIsContract() {
        return isContract;
    }

    /**
     * Sets the value of the isContract property.
     * 
     */
    public void setIsContract(int value) {
        this.isContract = value;
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
     * Gets the value of the idPersonDocumentSubject1 property.
     * 
     */
    public int getIdPersonDocumentSubject1() {
        return idPersonDocumentSubject1;
    }

    /**
     * Sets the value of the idPersonDocumentSubject1 property.
     * 
     */
    public void setIdPersonDocumentSubject1(int value) {
        this.idPersonDocumentSubject1 = value;
    }

    /**
     * Gets the value of the idPersonDocumentSubject2 property.
     * 
     */
    public int getIdPersonDocumentSubject2() {
        return idPersonDocumentSubject2;
    }

    /**
     * Sets the value of the idPersonDocumentSubject2 property.
     * 
     */
    public void setIdPersonDocumentSubject2(int value) {
        this.idPersonDocumentSubject2 = value;
    }

    /**
     * Gets the value of the idPersonDocumentSubject3 property.
     * 
     */
    public int getIdPersonDocumentSubject3() {
        return idPersonDocumentSubject3;
    }

    /**
     * Sets the value of the idPersonDocumentSubject3 property.
     * 
     */
    public void setIdPersonDocumentSubject3(int value) {
        this.idPersonDocumentSubject3 = value;
    }

    /**
     * Gets the value of the idPersonCourse property.
     * 
     */
    public int getIdPersonCourse() {
        return idPersonCourse;
    }

    /**
     * Sets the value of the idPersonCourse property.
     * 
     */
    public void setIdPersonCourse(int value) {
        this.idPersonCourse = value;
    }

    /**
     * Gets the value of the personRequestCourseBonus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRequestCourseBonus() {
        return personRequestCourseBonus;
    }

    /**
     * Sets the value of the personRequestCourseBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRequestCourseBonus(String value) {
        this.personRequestCourseBonus = value;
    }

    /**
     * Gets the value of the idPersonOlympiadAward property.
     * 
     */
    public int getIdPersonOlympiadAward() {
        return idPersonOlympiadAward;
    }

    /**
     * Sets the value of the idPersonOlympiadAward property.
     * 
     */
    public void setIdPersonOlympiadAward(int value) {
        this.idPersonOlympiadAward = value;
    }

    /**
     * Gets the value of the personRequestOlympiadAwardBonus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRequestOlympiadAwardBonus() {
        return personRequestOlympiadAwardBonus;
    }

    /**
     * Sets the value of the personRequestOlympiadAwardBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRequestOlympiadAwardBonus(String value) {
        this.personRequestOlympiadAwardBonus = value;
    }

    /**
     * Gets the value of the idPersonDocument property.
     * 
     */
    public int getIdPersonDocument() {
        return idPersonDocument;
    }

    /**
     * Sets the value of the idPersonDocument property.
     * 
     */
    public void setIdPersonDocument(int value) {
        this.idPersonDocument = value;
    }

    /**
     * Gets the value of the autoSelectZnoSubjects property.
     * 
     */
    public int getAutoSelectZnoSubjects() {
        return autoSelectZnoSubjects;
    }

    /**
     * Sets the value of the autoSelectZnoSubjects property.
     * 
     */
    public void setAutoSelectZnoSubjects(int value) {
        this.autoSelectZnoSubjects = value;
    }

    /**
     * Gets the value of the requestEnteranceCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestEnteranceCodes() {
        return requestEnteranceCodes;
    }

    /**
     * Sets the value of the requestEnteranceCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestEnteranceCodes(String value) {
        this.requestEnteranceCodes = value;
    }

    /**
     * Gets the value of the isHigherEducation property.
     * 
     */
    public int getIsHigherEducation() {
        return isHigherEducation;
    }

    /**
     * Sets the value of the isHigherEducation property.
     * 
     */
    public void setIsHigherEducation(int value) {
        this.isHigherEducation = value;
    }

    /**
     * Gets the value of the skipDocumentValue property.
     * 
     */
    public int getSkipDocumentValue() {
        return skipDocumentValue;
    }

    /**
     * Sets the value of the skipDocumentValue property.
     * 
     */
    public void setSkipDocumentValue(int value) {
        this.skipDocumentValue = value;
    }

    /**
     * Gets the value of the idPersonBenefit1 property.
     * 
     */
    public int getIdPersonBenefit1() {
        return idPersonBenefit1;
    }

    /**
     * Sets the value of the idPersonBenefit1 property.
     * 
     */
    public void setIdPersonBenefit1(int value) {
        this.idPersonBenefit1 = value;
    }

    /**
     * Gets the value of the idPersonBenefit2 property.
     * 
     */
    public int getIdPersonBenefit2() {
        return idPersonBenefit2;
    }

    /**
     * Sets the value of the idPersonBenefit2 property.
     * 
     */
    public void setIdPersonBenefit2(int value) {
        this.idPersonBenefit2 = value;
    }

    /**
     * Gets the value of the idPersonBenefit3 property.
     * 
     */
    public int getIdPersonBenefit3() {
        return idPersonBenefit3;
    }

    /**
     * Sets the value of the idPersonBenefit3 property.
     * 
     */
    public void setIdPersonBenefit3(int value) {
        this.idPersonBenefit3 = value;
    }

}
