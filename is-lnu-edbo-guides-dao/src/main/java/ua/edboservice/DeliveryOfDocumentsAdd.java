
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
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_DeliveryOfDocumentsDocumentTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_DeliveryOfDocumentsImportType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_OrderOfDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Qualification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeliveryOfDocumentsDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryOfDocumentsDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Course" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeliveryDocumentInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsTemporary" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentSourceTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityKode",
    "idAcademicYear",
    "idDeliveryOfDocumentsDocumentTypes",
    "idDeliveryOfDocumentsImportType",
    "idOrderOfDocument",
    "idPersonEducationForm",
    "idQualification",
    "deliveryOfDocumentsDateBegin",
    "deliveryOfDocumentsDateEnd",
    "universityFacultetKode",
    "idCourse",
    "deliveryDocumentInfo",
    "isTemporary",
    "idPersonDocumentSourceTypes"
})
@XmlRootElement(name = "DeliveryOfDocumentsAdd")
public class DeliveryOfDocumentsAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_AcademicYear")
    protected int idAcademicYear;
    @XmlElement(name = "Id_DeliveryOfDocumentsDocumentTypes")
    protected int idDeliveryOfDocumentsDocumentTypes;
    @XmlElement(name = "Id_DeliveryOfDocumentsImportType")
    protected int idDeliveryOfDocumentsImportType;
    @XmlElement(name = "Id_OrderOfDocument")
    protected int idOrderOfDocument;
    @XmlElement(name = "Id_PersonEducationForm")
    protected int idPersonEducationForm;
    @XmlElement(name = "Id_Qualification")
    protected int idQualification;
    @XmlElement(name = "DeliveryOfDocumentsDateBegin")
    protected String deliveryOfDocumentsDateBegin;
    @XmlElement(name = "DeliveryOfDocumentsDateEnd")
    protected String deliveryOfDocumentsDateEnd;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "Id_Course")
    protected int idCourse;
    @XmlElement(name = "DeliveryDocumentInfo")
    protected String deliveryDocumentInfo;
    @XmlElement(name = "IsTemporary")
    protected int isTemporary;
    @XmlElement(name = "Id_PersonDocumentSourceTypes")
    protected int idPersonDocumentSourceTypes;

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
     * Gets the value of the idDeliveryOfDocumentsDocumentTypes property.
     * 
     */
    public int getIdDeliveryOfDocumentsDocumentTypes() {
        return idDeliveryOfDocumentsDocumentTypes;
    }

    /**
     * Sets the value of the idDeliveryOfDocumentsDocumentTypes property.
     * 
     */
    public void setIdDeliveryOfDocumentsDocumentTypes(int value) {
        this.idDeliveryOfDocumentsDocumentTypes = value;
    }

    /**
     * Gets the value of the idDeliveryOfDocumentsImportType property.
     * 
     */
    public int getIdDeliveryOfDocumentsImportType() {
        return idDeliveryOfDocumentsImportType;
    }

    /**
     * Sets the value of the idDeliveryOfDocumentsImportType property.
     * 
     */
    public void setIdDeliveryOfDocumentsImportType(int value) {
        this.idDeliveryOfDocumentsImportType = value;
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
     * Gets the value of the deliveryOfDocumentsDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryOfDocumentsDateBegin() {
        return deliveryOfDocumentsDateBegin;
    }

    /**
     * Sets the value of the deliveryOfDocumentsDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryOfDocumentsDateBegin(String value) {
        this.deliveryOfDocumentsDateBegin = value;
    }

    /**
     * Gets the value of the deliveryOfDocumentsDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryOfDocumentsDateEnd() {
        return deliveryOfDocumentsDateEnd;
    }

    /**
     * Sets the value of the deliveryOfDocumentsDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryOfDocumentsDateEnd(String value) {
        this.deliveryOfDocumentsDateEnd = value;
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
     * Gets the value of the deliveryDocumentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDocumentInfo() {
        return deliveryDocumentInfo;
    }

    /**
     * Sets the value of the deliveryDocumentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDocumentInfo(String value) {
        this.deliveryDocumentInfo = value;
    }

    /**
     * Gets the value of the isTemporary property.
     * 
     */
    public int getIsTemporary() {
        return isTemporary;
    }

    /**
     * Sets the value of the isTemporary property.
     * 
     */
    public void setIsTemporary(int value) {
        this.isTemporary = value;
    }

    /**
     * Gets the value of the idPersonDocumentSourceTypes property.
     * 
     */
    public int getIdPersonDocumentSourceTypes() {
        return idPersonDocumentSourceTypes;
    }

    /**
     * Sets the value of the idPersonDocumentSourceTypes property.
     * 
     */
    public void setIdPersonDocumentSourceTypes(int value) {
        this.idPersonDocumentSourceTypes = value;
    }

}
