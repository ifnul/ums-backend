
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
 *         &lt;element name="Id_UniversityBuildingDocuments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityBuildingDocumentsSubtypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocumentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentDateGet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsExistStateRegistration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsExistNotarization" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idUniversityBuildingDocuments",
    "idUniversityBuildingDocumentsSubtypes",
    "documentName",
    "organizationFullName",
    "documentSeries",
    "documentNumber",
    "documentDateGet",
    "documentDateBegin",
    "documentDateEnd",
    "isExistStateRegistration",
    "isExistNotarization"
})
@XmlRootElement(name = "UniversityBuildingDocumentsEdit")
public class UniversityBuildingDocumentsEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_UniversityBuildingDocuments")
    protected int idUniversityBuildingDocuments;
    @XmlElement(name = "Id_UniversityBuildingDocumentsSubtypes")
    protected int idUniversityBuildingDocumentsSubtypes;
    @XmlElement(name = "DocumentName")
    protected String documentName;
    @XmlElement(name = "OrganizationFullName")
    protected String organizationFullName;
    @XmlElement(name = "DocumentSeries")
    protected String documentSeries;
    @XmlElement(name = "DocumentNumber")
    protected String documentNumber;
    @XmlElement(name = "DocumentDateGet")
    protected String documentDateGet;
    @XmlElement(name = "DocumentDateBegin")
    protected String documentDateBegin;
    @XmlElement(name = "DocumentDateEnd")
    protected String documentDateEnd;
    @XmlElement(name = "IsExistStateRegistration")
    protected int isExistStateRegistration;
    @XmlElement(name = "IsExistNotarization")
    protected int isExistNotarization;

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
     * Gets the value of the idUniversityBuildingDocuments property.
     * 
     */
    public int getIdUniversityBuildingDocuments() {
        return idUniversityBuildingDocuments;
    }

    /**
     * Sets the value of the idUniversityBuildingDocuments property.
     * 
     */
    public void setIdUniversityBuildingDocuments(int value) {
        this.idUniversityBuildingDocuments = value;
    }

    /**
     * Gets the value of the idUniversityBuildingDocumentsSubtypes property.
     * 
     */
    public int getIdUniversityBuildingDocumentsSubtypes() {
        return idUniversityBuildingDocumentsSubtypes;
    }

    /**
     * Sets the value of the idUniversityBuildingDocumentsSubtypes property.
     * 
     */
    public void setIdUniversityBuildingDocumentsSubtypes(int value) {
        this.idUniversityBuildingDocumentsSubtypes = value;
    }

    /**
     * Gets the value of the documentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * Sets the value of the documentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentName(String value) {
        this.documentName = value;
    }

    /**
     * Gets the value of the organizationFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationFullName() {
        return organizationFullName;
    }

    /**
     * Sets the value of the organizationFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationFullName(String value) {
        this.organizationFullName = value;
    }

    /**
     * Gets the value of the documentSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentSeries() {
        return documentSeries;
    }

    /**
     * Sets the value of the documentSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentSeries(String value) {
        this.documentSeries = value;
    }

    /**
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the documentDateGet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDateGet() {
        return documentDateGet;
    }

    /**
     * Sets the value of the documentDateGet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDateGet(String value) {
        this.documentDateGet = value;
    }

    /**
     * Gets the value of the documentDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDateBegin() {
        return documentDateBegin;
    }

    /**
     * Sets the value of the documentDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDateBegin(String value) {
        this.documentDateBegin = value;
    }

    /**
     * Gets the value of the documentDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDateEnd() {
        return documentDateEnd;
    }

    /**
     * Sets the value of the documentDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDateEnd(String value) {
        this.documentDateEnd = value;
    }

    /**
     * Gets the value of the isExistStateRegistration property.
     * 
     */
    public int getIsExistStateRegistration() {
        return isExistStateRegistration;
    }

    /**
     * Sets the value of the isExistStateRegistration property.
     * 
     */
    public void setIsExistStateRegistration(int value) {
        this.isExistStateRegistration = value;
    }

    /**
     * Gets the value of the isExistNotarization property.
     * 
     */
    public int getIsExistNotarization() {
        return isExistNotarization;
    }

    /**
     * Sets the value of the isExistNotarization property.
     * 
     */
    public void setIsExistNotarization(int value) {
        this.isExistNotarization = value;
    }

}
