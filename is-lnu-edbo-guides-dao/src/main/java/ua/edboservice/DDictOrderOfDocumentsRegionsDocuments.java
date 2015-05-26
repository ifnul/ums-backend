
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dDictOrderOfDocumentsRegionsDocuments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dDictOrderOfDocumentsRegionsDocuments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_OrderOfDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_OrderOfDocumentGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderOfDocumentDataGive" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrderOfDocumentDataExpires" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrderOfDocumentDataLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrderOfDocumenDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDocumentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_OrderOfDocumentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitySpecialitiesKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecScecializationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Qualification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QualificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Course" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CourseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderOfDocumentDataEndEducation" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="QualificationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirectionsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsBenefits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_OrderOfDocumentsStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderOfDocumentsStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cStud" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dDictOrderOfDocumentsRegionsDocuments", propOrder = {
    "idUniversity",
    "universityFullName",
    "idOrderOfDocument",
    "idOrderOfDocumentGroup",
    "universityFacultetKode",
    "idUniversityGroup",
    "idPersonDocumentType",
    "idPersonEducationForm",
    "orderOfDocumentDataGive",
    "orderOfDocumentDataExpires",
    "orderOfDocumentDataLastChange",
    "orderOfDocumenDescription",
    "universityKode",
    "universityGroupFullName",
    "universityGroupShortName",
    "personDocumentTypeName",
    "personEducationFormName",
    "universityFacultetFullName",
    "idOrderOfDocumentType",
    "universitySpecialitiesKode",
    "specClasifierCode",
    "specDirectionName",
    "specSpecialityClasifierCode",
    "specSpecialityName",
    "specScecializationName",
    "idQualification",
    "qualificationName",
    "idCourse",
    "courseName",
    "orderOfDocumentDataEndEducation",
    "qualificationLevel",
    "specDirectionsCode",
    "specSpecialityCode",
    "isBenefits",
    "idAcademicYear",
    "idOrderOfDocumentsStatus",
    "orderOfDocumentsStatusName",
    "cStud"
})
public class DDictOrderOfDocumentsRegionsDocuments {

    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "Id_OrderOfDocument")
    protected int idOrderOfDocument;
    @XmlElement(name = "Id_OrderOfDocumentGroup")
    protected int idOrderOfDocumentGroup;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "Id_UniversityGroup")
    protected int idUniversityGroup;
    @XmlElement(name = "Id_PersonDocumentType")
    protected int idPersonDocumentType;
    @XmlElement(name = "Id_PersonEducationForm")
    protected int idPersonEducationForm;
    @XmlElement(name = "OrderOfDocumentDataGive", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderOfDocumentDataGive;
    @XmlElement(name = "OrderOfDocumentDataExpires", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderOfDocumentDataExpires;
    @XmlElement(name = "OrderOfDocumentDataLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderOfDocumentDataLastChange;
    @XmlElement(name = "OrderOfDocumenDescription")
    protected String orderOfDocumenDescription;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityGroupFullName")
    protected String universityGroupFullName;
    @XmlElement(name = "UniversityGroupShortName")
    protected String universityGroupShortName;
    @XmlElement(name = "PersonDocumentTypeName")
    protected String personDocumentTypeName;
    @XmlElement(name = "PersonEducationFormName")
    protected String personEducationFormName;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "Id_OrderOfDocumentType")
    protected int idOrderOfDocumentType;
    @XmlElement(name = "UniversitySpecialitiesKode")
    protected String universitySpecialitiesKode;
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
    @XmlElement(name = "Id_Qualification")
    protected int idQualification;
    @XmlElement(name = "QualificationName")
    protected String qualificationName;
    @XmlElement(name = "Id_Course")
    protected int idCourse;
    @XmlElement(name = "CourseName")
    protected String courseName;
    @XmlElement(name = "OrderOfDocumentDataEndEducation", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderOfDocumentDataEndEducation;
    @XmlElement(name = "QualificationLevel")
    protected String qualificationLevel;
    @XmlElement(name = "SpecDirectionsCode")
    protected String specDirectionsCode;
    @XmlElement(name = "SpecSpecialityCode")
    protected String specSpecialityCode;
    @XmlElement(name = "IsBenefits")
    protected int isBenefits;
    @XmlElement(name = "Id_AcademicYear")
    protected int idAcademicYear;
    @XmlElement(name = "Id_OrderOfDocumentsStatus")
    protected int idOrderOfDocumentsStatus;
    @XmlElement(name = "OrderOfDocumentsStatusName")
    protected String orderOfDocumentsStatusName;
    protected int cStud;

    /**
     * Gets the value of the idUniversity property.
     * 
     */
    public int getIdUniversity() {
        return idUniversity;
    }

    /**
     * Sets the value of the idUniversity property.
     * 
     */
    public void setIdUniversity(int value) {
        this.idUniversity = value;
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
     * Gets the value of the idOrderOfDocument property.
     * 
     */
    public int getIdOrderOfDocument() {
        return idOrderOfDocument;
    }

    /**
     * Sets the value of the idOrderOfDocument property.
     * 
     */
    public void setIdOrderOfDocument(int value) {
        this.idOrderOfDocument = value;
    }

    /**
     * Gets the value of the idOrderOfDocumentGroup property.
     * 
     */
    public int getIdOrderOfDocumentGroup() {
        return idOrderOfDocumentGroup;
    }

    /**
     * Sets the value of the idOrderOfDocumentGroup property.
     * 
     */
    public void setIdOrderOfDocumentGroup(int value) {
        this.idOrderOfDocumentGroup = value;
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
     * Gets the value of the idPersonDocumentType property.
     * 
     */
    public int getIdPersonDocumentType() {
        return idPersonDocumentType;
    }

    /**
     * Sets the value of the idPersonDocumentType property.
     * 
     */
    public void setIdPersonDocumentType(int value) {
        this.idPersonDocumentType = value;
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
     * Gets the value of the orderOfDocumentDataGive property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderOfDocumentDataGive() {
        return orderOfDocumentDataGive;
    }

    /**
     * Sets the value of the orderOfDocumentDataGive property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderOfDocumentDataGive(XMLGregorianCalendar value) {
        this.orderOfDocumentDataGive = value;
    }

    /**
     * Gets the value of the orderOfDocumentDataExpires property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderOfDocumentDataExpires() {
        return orderOfDocumentDataExpires;
    }

    /**
     * Sets the value of the orderOfDocumentDataExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderOfDocumentDataExpires(XMLGregorianCalendar value) {
        this.orderOfDocumentDataExpires = value;
    }

    /**
     * Gets the value of the orderOfDocumentDataLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderOfDocumentDataLastChange() {
        return orderOfDocumentDataLastChange;
    }

    /**
     * Sets the value of the orderOfDocumentDataLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderOfDocumentDataLastChange(XMLGregorianCalendar value) {
        this.orderOfDocumentDataLastChange = value;
    }

    /**
     * Gets the value of the orderOfDocumenDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOfDocumenDescription() {
        return orderOfDocumenDescription;
    }

    /**
     * Sets the value of the orderOfDocumenDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOfDocumenDescription(String value) {
        this.orderOfDocumenDescription = value;
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
     * Gets the value of the personDocumentTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonDocumentTypeName() {
        return personDocumentTypeName;
    }

    /**
     * Sets the value of the personDocumentTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonDocumentTypeName(String value) {
        this.personDocumentTypeName = value;
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
     * Gets the value of the idOrderOfDocumentType property.
     * 
     */
    public int getIdOrderOfDocumentType() {
        return idOrderOfDocumentType;
    }

    /**
     * Sets the value of the idOrderOfDocumentType property.
     * 
     */
    public void setIdOrderOfDocumentType(int value) {
        this.idOrderOfDocumentType = value;
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
     * Gets the value of the orderOfDocumentDataEndEducation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderOfDocumentDataEndEducation() {
        return orderOfDocumentDataEndEducation;
    }

    /**
     * Sets the value of the orderOfDocumentDataEndEducation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderOfDocumentDataEndEducation(XMLGregorianCalendar value) {
        this.orderOfDocumentDataEndEducation = value;
    }

    /**
     * Gets the value of the qualificationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationLevel() {
        return qualificationLevel;
    }

    /**
     * Sets the value of the qualificationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationLevel(String value) {
        this.qualificationLevel = value;
    }

    /**
     * Gets the value of the specDirectionsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionsCode() {
        return specDirectionsCode;
    }

    /**
     * Sets the value of the specDirectionsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionsCode(String value) {
        this.specDirectionsCode = value;
    }

    /**
     * Gets the value of the specSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityCode() {
        return specSpecialityCode;
    }

    /**
     * Sets the value of the specSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityCode(String value) {
        this.specSpecialityCode = value;
    }

    /**
     * Gets the value of the isBenefits property.
     * 
     */
    public int getIsBenefits() {
        return isBenefits;
    }

    /**
     * Sets the value of the isBenefits property.
     * 
     */
    public void setIsBenefits(int value) {
        this.isBenefits = value;
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
     * Gets the value of the idOrderOfDocumentsStatus property.
     * 
     */
    public int getIdOrderOfDocumentsStatus() {
        return idOrderOfDocumentsStatus;
    }

    /**
     * Sets the value of the idOrderOfDocumentsStatus property.
     * 
     */
    public void setIdOrderOfDocumentsStatus(int value) {
        this.idOrderOfDocumentsStatus = value;
    }

    /**
     * Gets the value of the orderOfDocumentsStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOfDocumentsStatusName() {
        return orderOfDocumentsStatusName;
    }

    /**
     * Sets the value of the orderOfDocumentsStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOfDocumentsStatusName(String value) {
        this.orderOfDocumentsStatusName = value;
    }

    /**
     * Gets the value of the cStud property.
     * 
     */
    public int getCStud() {
        return cStud;
    }

    /**
     * Sets the value of the cStud property.
     * 
     */
    public void setCStud(int value) {
        this.cStud = value;
    }

}
