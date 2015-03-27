
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
 *         &lt;element name="Id_UniversityEntrantWave" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequests" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonRequestStatusType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsBudejt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsContract" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InformationOriginalDocumentLocation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LetterOfGuarantee" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idUniversityEntrantWave",
    "idPersonRequests",
    "idPersonRequestStatusType",
    "isBudejt",
    "isContract",
    "description",
    "informationOriginalDocumentLocation",
    "letterOfGuarantee"
})
@XmlRootElement(name = "UniversityEntrantWavesRequestsStatusChange2")
public class UniversityEntrantWavesRequestsStatusChange2 {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_UniversityEntrantWave")
    protected int idUniversityEntrantWave;
    @XmlElement(name = "Id_PersonRequests")
    protected String idPersonRequests;
    @XmlElement(name = "Id_PersonRequestStatusType")
    protected int idPersonRequestStatusType;
    @XmlElement(name = "IsBudejt")
    protected int isBudejt;
    @XmlElement(name = "IsContract")
    protected int isContract;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "InformationOriginalDocumentLocation")
    protected int informationOriginalDocumentLocation;
    @XmlElement(name = "LetterOfGuarantee")
    protected int letterOfGuarantee;

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
     * Gets the value of the idUniversityEntrantWave property.
     * 
     */
    public int getIdUniversityEntrantWave() {
        return idUniversityEntrantWave;
    }

    /**
     * Sets the value of the idUniversityEntrantWave property.
     * 
     */
    public void setIdUniversityEntrantWave(int value) {
        this.idUniversityEntrantWave = value;
    }

    /**
     * Gets the value of the idPersonRequests property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPersonRequests() {
        return idPersonRequests;
    }

    /**
     * Sets the value of the idPersonRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPersonRequests(String value) {
        this.idPersonRequests = value;
    }

    /**
     * Gets the value of the idPersonRequestStatusType property.
     * 
     */
    public int getIdPersonRequestStatusType() {
        return idPersonRequestStatusType;
    }

    /**
     * Sets the value of the idPersonRequestStatusType property.
     * 
     */
    public void setIdPersonRequestStatusType(int value) {
        this.idPersonRequestStatusType = value;
    }

    /**
     * Gets the value of the isBudejt property.
     * 
     */
    public int getIsBudejt() {
        return isBudejt;
    }

    /**
     * Sets the value of the isBudejt property.
     * 
     */
    public void setIsBudejt(int value) {
        this.isBudejt = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the informationOriginalDocumentLocation property.
     * 
     */
    public int getInformationOriginalDocumentLocation() {
        return informationOriginalDocumentLocation;
    }

    /**
     * Sets the value of the informationOriginalDocumentLocation property.
     * 
     */
    public void setInformationOriginalDocumentLocation(int value) {
        this.informationOriginalDocumentLocation = value;
    }

    /**
     * Gets the value of the letterOfGuarantee property.
     * 
     */
    public int getLetterOfGuarantee() {
        return letterOfGuarantee;
    }

    /**
     * Sets the value of the letterOfGuarantee property.
     * 
     */
    public void setLetterOfGuarantee(int value) {
        this.letterOfGuarantee = value;
    }

}
