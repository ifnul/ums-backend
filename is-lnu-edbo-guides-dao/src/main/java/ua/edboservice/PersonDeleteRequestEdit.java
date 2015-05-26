
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
 *         &lt;element name="Id_PersonDeleteRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonDeleteRequestDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDeleteRequestNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDeleteRequestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idPersonDeleteRequest",
    "personDeleteRequestDate",
    "personDeleteRequestNumber",
    "personDeleteRequestDescription"
})
@XmlRootElement(name = "PersonDeleteRequestEdit")
public class PersonDeleteRequestEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_PersonDeleteRequest")
    protected int idPersonDeleteRequest;
    @XmlElement(name = "PersonDeleteRequestDate")
    protected String personDeleteRequestDate;
    @XmlElement(name = "PersonDeleteRequestNumber")
    protected String personDeleteRequestNumber;
    @XmlElement(name = "PersonDeleteRequestDescription")
    protected String personDeleteRequestDescription;

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
     * Gets the value of the idPersonDeleteRequest property.
     * 
     */
    public int getIdPersonDeleteRequest() {
        return idPersonDeleteRequest;
    }

    /**
     * Sets the value of the idPersonDeleteRequest property.
     * 
     */
    public void setIdPersonDeleteRequest(int value) {
        this.idPersonDeleteRequest = value;
    }

    /**
     * Gets the value of the personDeleteRequestDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonDeleteRequestDate() {
        return personDeleteRequestDate;
    }

    /**
     * Sets the value of the personDeleteRequestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonDeleteRequestDate(String value) {
        this.personDeleteRequestDate = value;
    }

    /**
     * Gets the value of the personDeleteRequestNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonDeleteRequestNumber() {
        return personDeleteRequestNumber;
    }

    /**
     * Sets the value of the personDeleteRequestNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonDeleteRequestNumber(String value) {
        this.personDeleteRequestNumber = value;
    }

    /**
     * Gets the value of the personDeleteRequestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonDeleteRequestDescription() {
        return personDeleteRequestDescription;
    }

    /**
     * Sets the value of the personDeleteRequestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonDeleteRequestDescription(String value) {
        this.personDeleteRequestDescription = value;
    }

}
