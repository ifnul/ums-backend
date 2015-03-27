
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonRequestExaminations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonRequestExaminations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonRequestExamination" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversitySpecialitiesSubject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonRequestExaminationValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_Subject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitySpecialitiesKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitySpecialitiesSubjectsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitySpecialitiesSubjectsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsProfiled" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdZnoSubject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ParentSubject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonRequestExaminations", propOrder = {
    "idPersonRequestExamination",
    "idPersonRequest",
    "idUniversitySpecialitiesSubject",
    "personRequestExaminationValue",
    "dateLastChange",
    "idSubject",
    "universitySpecialitiesKode",
    "universitySpecialitiesSubjectsName",
    "universitySpecialitiesSubjectsDescription",
    "isProfiled",
    "inGroup",
    "subjectKey",
    "idZnoSubject",
    "parentSubject",
    "subjectName"
})
public class DPersonRequestExaminations {

    @XmlElement(name = "Id_PersonRequestExamination")
    protected int idPersonRequestExamination;
    @XmlElement(name = "Id_PersonRequest")
    protected int idPersonRequest;
    @XmlElement(name = "Id_UniversitySpecialitiesSubject")
    protected int idUniversitySpecialitiesSubject;
    @XmlElement(name = "PersonRequestExaminationValue", required = true)
    protected BigDecimal personRequestExaminationValue;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "Id_Subject")
    protected int idSubject;
    @XmlElement(name = "UniversitySpecialitiesKode")
    protected String universitySpecialitiesKode;
    @XmlElement(name = "UniversitySpecialitiesSubjectsName")
    protected String universitySpecialitiesSubjectsName;
    @XmlElement(name = "UniversitySpecialitiesSubjectsDescription")
    protected String universitySpecialitiesSubjectsDescription;
    @XmlElement(name = "IsProfiled")
    protected int isProfiled;
    @XmlElement(name = "InGroup")
    protected int inGroup;
    @XmlElement(name = "SubjectKey")
    protected String subjectKey;
    @XmlElement(name = "IdZnoSubject")
    protected int idZnoSubject;
    @XmlElement(name = "ParentSubject")
    protected int parentSubject;
    @XmlElement(name = "SubjectName")
    protected String subjectName;

    /**
     * Gets the value of the idPersonRequestExamination property.
     * 
     */
    public int getIdPersonRequestExamination() {
        return idPersonRequestExamination;
    }

    /**
     * Sets the value of the idPersonRequestExamination property.
     * 
     */
    public void setIdPersonRequestExamination(int value) {
        this.idPersonRequestExamination = value;
    }

    /**
     * Gets the value of the idPersonRequest property.
     * 
     */
    public int getIdPersonRequest() {
        return idPersonRequest;
    }

    /**
     * Sets the value of the idPersonRequest property.
     * 
     */
    public void setIdPersonRequest(int value) {
        this.idPersonRequest = value;
    }

    /**
     * Gets the value of the idUniversitySpecialitiesSubject property.
     * 
     */
    public int getIdUniversitySpecialitiesSubject() {
        return idUniversitySpecialitiesSubject;
    }

    /**
     * Sets the value of the idUniversitySpecialitiesSubject property.
     * 
     */
    public void setIdUniversitySpecialitiesSubject(int value) {
        this.idUniversitySpecialitiesSubject = value;
    }

    /**
     * Gets the value of the personRequestExaminationValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPersonRequestExaminationValue() {
        return personRequestExaminationValue;
    }

    /**
     * Sets the value of the personRequestExaminationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPersonRequestExaminationValue(BigDecimal value) {
        this.personRequestExaminationValue = value;
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
     * Gets the value of the idSubject property.
     * 
     */
    public int getIdSubject() {
        return idSubject;
    }

    /**
     * Sets the value of the idSubject property.
     * 
     */
    public void setIdSubject(int value) {
        this.idSubject = value;
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
     * Gets the value of the universitySpecialitiesSubjectsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesSubjectsName() {
        return universitySpecialitiesSubjectsName;
    }

    /**
     * Sets the value of the universitySpecialitiesSubjectsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesSubjectsName(String value) {
        this.universitySpecialitiesSubjectsName = value;
    }

    /**
     * Gets the value of the universitySpecialitiesSubjectsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesSubjectsDescription() {
        return universitySpecialitiesSubjectsDescription;
    }

    /**
     * Sets the value of the universitySpecialitiesSubjectsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesSubjectsDescription(String value) {
        this.universitySpecialitiesSubjectsDescription = value;
    }

    /**
     * Gets the value of the isProfiled property.
     * 
     */
    public int getIsProfiled() {
        return isProfiled;
    }

    /**
     * Sets the value of the isProfiled property.
     * 
     */
    public void setIsProfiled(int value) {
        this.isProfiled = value;
    }

    /**
     * Gets the value of the inGroup property.
     * 
     */
    public int getInGroup() {
        return inGroup;
    }

    /**
     * Sets the value of the inGroup property.
     * 
     */
    public void setInGroup(int value) {
        this.inGroup = value;
    }

    /**
     * Gets the value of the subjectKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectKey() {
        return subjectKey;
    }

    /**
     * Sets the value of the subjectKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectKey(String value) {
        this.subjectKey = value;
    }

    /**
     * Gets the value of the idZnoSubject property.
     * 
     */
    public int getIdZnoSubject() {
        return idZnoSubject;
    }

    /**
     * Sets the value of the idZnoSubject property.
     * 
     */
    public void setIdZnoSubject(int value) {
        this.idZnoSubject = value;
    }

    /**
     * Gets the value of the parentSubject property.
     * 
     */
    public int getParentSubject() {
        return parentSubject;
    }

    /**
     * Sets the value of the parentSubject property.
     * 
     */
    public void setParentSubject(int value) {
        this.parentSubject = value;
    }

    /**
     * Gets the value of the subjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * Sets the value of the subjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName(String value) {
        this.subjectName = value;
    }

}
