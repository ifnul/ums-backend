
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
 *         &lt;element name="Id_OrderOfDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderOfDocumentDataGive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderOfDocumentDataExpires" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderOfDocumenDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderOfDocumentDataEndEducation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QualificationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsBenefits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Bank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_DocumentChipSeriesType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_DocumentsBlnakTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_DocumentsPaymentSystemType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QualificationLevelEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idOrderOfDocument",
    "idUniversityGroup",
    "orderOfDocumentDataGive",
    "orderOfDocumentDataExpires",
    "orderOfDocumenDescription",
    "orderOfDocumentDataEndEducation",
    "qualificationLevel",
    "isBenefits",
    "idBank",
    "idDocumentChipSeriesType",
    "idDocumentsBlnakTypes",
    "idDocumentsPaymentSystemType",
    "qualificationLevelEn"
})
@XmlRootElement(name = "OrderOfDocumentsEdit")
public class OrderOfDocumentsEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_OrderOfDocument")
    protected int idOrderOfDocument;
    @XmlElement(name = "Id_UniversityGroup")
    protected int idUniversityGroup;
    @XmlElement(name = "OrderOfDocumentDataGive")
    protected String orderOfDocumentDataGive;
    @XmlElement(name = "OrderOfDocumentDataExpires")
    protected String orderOfDocumentDataExpires;
    @XmlElement(name = "OrderOfDocumenDescription")
    protected String orderOfDocumenDescription;
    @XmlElement(name = "OrderOfDocumentDataEndEducation")
    protected String orderOfDocumentDataEndEducation;
    @XmlElement(name = "QualificationLevel")
    protected String qualificationLevel;
    @XmlElement(name = "IsBenefits")
    protected int isBenefits;
    @XmlElement(name = "Id_Bank")
    protected int idBank;
    @XmlElement(name = "Id_DocumentChipSeriesType")
    protected int idDocumentChipSeriesType;
    @XmlElement(name = "Id_DocumentsBlnakTypes")
    protected int idDocumentsBlnakTypes;
    @XmlElement(name = "Id_DocumentsPaymentSystemType")
    protected int idDocumentsPaymentSystemType;
    @XmlElement(name = "QualificationLevelEn")
    protected String qualificationLevelEn;

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
     * Gets the value of the orderOfDocumentDataGive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOfDocumentDataGive() {
        return orderOfDocumentDataGive;
    }

    /**
     * Sets the value of the orderOfDocumentDataGive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOfDocumentDataGive(String value) {
        this.orderOfDocumentDataGive = value;
    }

    /**
     * Gets the value of the orderOfDocumentDataExpires property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOfDocumentDataExpires() {
        return orderOfDocumentDataExpires;
    }

    /**
     * Sets the value of the orderOfDocumentDataExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOfDocumentDataExpires(String value) {
        this.orderOfDocumentDataExpires = value;
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
     * Gets the value of the orderOfDocumentDataEndEducation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOfDocumentDataEndEducation() {
        return orderOfDocumentDataEndEducation;
    }

    /**
     * Sets the value of the orderOfDocumentDataEndEducation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOfDocumentDataEndEducation(String value) {
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
     * Gets the value of the idBank property.
     * 
     */
    public int getIdBank() {
        return idBank;
    }

    /**
     * Sets the value of the idBank property.
     * 
     */
    public void setIdBank(int value) {
        this.idBank = value;
    }

    /**
     * Gets the value of the idDocumentChipSeriesType property.
     * 
     */
    public int getIdDocumentChipSeriesType() {
        return idDocumentChipSeriesType;
    }

    /**
     * Sets the value of the idDocumentChipSeriesType property.
     * 
     */
    public void setIdDocumentChipSeriesType(int value) {
        this.idDocumentChipSeriesType = value;
    }

    /**
     * Gets the value of the idDocumentsBlnakTypes property.
     * 
     */
    public int getIdDocumentsBlnakTypes() {
        return idDocumentsBlnakTypes;
    }

    /**
     * Sets the value of the idDocumentsBlnakTypes property.
     * 
     */
    public void setIdDocumentsBlnakTypes(int value) {
        this.idDocumentsBlnakTypes = value;
    }

    /**
     * Gets the value of the idDocumentsPaymentSystemType property.
     * 
     */
    public int getIdDocumentsPaymentSystemType() {
        return idDocumentsPaymentSystemType;
    }

    /**
     * Sets the value of the idDocumentsPaymentSystemType property.
     * 
     */
    public void setIdDocumentsPaymentSystemType(int value) {
        this.idDocumentsPaymentSystemType = value;
    }

    /**
     * Gets the value of the qualificationLevelEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationLevelEn() {
        return qualificationLevelEn;
    }

    /**
     * Sets the value of the qualificationLevelEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationLevelEn(String value) {
        this.qualificationLevelEn = value;
    }

}
