
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
 *         &lt;element name="Id_SupportRequestType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupportRequestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_ApplicationModuleAction" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SupportRequestDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupportRequestNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idSupportRequestType",
    "universityKode",
    "supportRequestDescription",
    "idApplicationModuleAction",
    "supportRequestDate",
    "supportRequestNumber"
})
@XmlRootElement(name = "SupportRequestAdd")
public class SupportRequestAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_SupportRequestType")
    protected int idSupportRequestType;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "SupportRequestDescription")
    protected String supportRequestDescription;
    @XmlElement(name = "id_ApplicationModuleAction")
    protected int idApplicationModuleAction;
    @XmlElement(name = "SupportRequestDate")
    protected String supportRequestDate;
    @XmlElement(name = "SupportRequestNumber")
    protected String supportRequestNumber;

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
     * Gets the value of the idSupportRequestType property.
     * 
     */
    public int getIdSupportRequestType() {
        return idSupportRequestType;
    }

    /**
     * Sets the value of the idSupportRequestType property.
     * 
     */
    public void setIdSupportRequestType(int value) {
        this.idSupportRequestType = value;
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
     * Gets the value of the supportRequestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportRequestDescription() {
        return supportRequestDescription;
    }

    /**
     * Sets the value of the supportRequestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportRequestDescription(String value) {
        this.supportRequestDescription = value;
    }

    /**
     * Gets the value of the idApplicationModuleAction property.
     * 
     */
    public int getIdApplicationModuleAction() {
        return idApplicationModuleAction;
    }

    /**
     * Sets the value of the idApplicationModuleAction property.
     * 
     */
    public void setIdApplicationModuleAction(int value) {
        this.idApplicationModuleAction = value;
    }

    /**
     * Gets the value of the supportRequestDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportRequestDate() {
        return supportRequestDate;
    }

    /**
     * Sets the value of the supportRequestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportRequestDate(String value) {
        this.supportRequestDate = value;
    }

    /**
     * Gets the value of the supportRequestNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportRequestNumber() {
        return supportRequestNumber;
    }

    /**
     * Sets the value of the supportRequestNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportRequestNumber(String value) {
        this.supportRequestNumber = value;
    }

}
