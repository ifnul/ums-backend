
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
 *         &lt;element name="Id_PersonEducationHistory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonName" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idPersonEducationHistory",
    "idPersonName"
})
@XmlRootElement(name = "PersonEducationsHistoryPersonNameEdit")
public class PersonEducationsHistoryPersonNameEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_PersonEducationHistory")
    protected int idPersonEducationHistory;
    @XmlElement(name = "Id_PersonName")
    protected int idPersonName;

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
     * Gets the value of the idPersonEducationHistory property.
     * 
     */
    public int getIdPersonEducationHistory() {
        return idPersonEducationHistory;
    }

    /**
     * Sets the value of the idPersonEducationHistory property.
     * 
     */
    public void setIdPersonEducationHistory(int value) {
        this.idPersonEducationHistory = value;
    }

    /**
     * Gets the value of the idPersonName property.
     * 
     */
    public int getIdPersonName() {
        return idPersonName;
    }

    /**
     * Sets the value of the idPersonName property.
     * 
     */
    public void setIdPersonName(int value) {
        this.idPersonName = value;
    }

}
