
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
 *         &lt;element name="Id_PersonRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequestStatusType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Descryption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityEntrantWave" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsBudejt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsContract" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idPersonRequest",
    "idPersonRequestStatusType",
    "descryption",
    "idUniversityEntrantWave",
    "isBudejt",
    "isContract",
    "numberProtocol",
    "dateProtocol"
})
@XmlRootElement(name = "PersonRequestsStatusChange2")
public class PersonRequestsStatusChange2 {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_PersonRequest")
    protected int idPersonRequest;
    @XmlElement(name = "Id_PersonRequestStatusType")
    protected int idPersonRequestStatusType;
    @XmlElement(name = "Descryption")
    protected String descryption;
    @XmlElement(name = "Id_UniversityEntrantWave")
    protected int idUniversityEntrantWave;
    @XmlElement(name = "IsBudejt")
    protected int isBudejt;
    @XmlElement(name = "IsContract")
    protected int isContract;
    @XmlElement(name = "NumberProtocol")
    protected String numberProtocol;
    @XmlElement(name = "DateProtocol")
    protected String dateProtocol;

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
     * Gets the value of the descryption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescryption() {
        return descryption;
    }

    /**
     * Sets the value of the descryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescryption(String value) {
        this.descryption = value;
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
     * Gets the value of the numberProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberProtocol() {
        return numberProtocol;
    }

    /**
     * Sets the value of the numberProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberProtocol(String value) {
        this.numberProtocol = value;
    }

    /**
     * Gets the value of the dateProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateProtocol() {
        return dateProtocol;
    }

    /**
     * Sets the value of the dateProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateProtocol(String value) {
        this.dateProtocol = value;
    }

}
