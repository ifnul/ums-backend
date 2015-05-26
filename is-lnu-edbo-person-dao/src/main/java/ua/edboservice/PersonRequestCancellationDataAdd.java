
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
 *         &lt;element name="Id_PersonRequestCancellation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonRequestCancellationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonRequestCancellationDatas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idPersonRequestCancellation",
    "personRequestCancellationDescription",
    "personRequestCancellationDatas"
})
@XmlRootElement(name = "PersonRequestCancellationDataAdd")
public class PersonRequestCancellationDataAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_PersonRequestCancellation")
    protected int idPersonRequestCancellation;
    @XmlElement(name = "PersonRequestCancellationDescription")
    protected String personRequestCancellationDescription;
    @XmlElement(name = "PersonRequestCancellationDatas")
    protected String personRequestCancellationDatas;

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
     * Gets the value of the idPersonRequestCancellation property.
     * 
     */
    public int getIdPersonRequestCancellation() {
        return idPersonRequestCancellation;
    }

    /**
     * Sets the value of the idPersonRequestCancellation property.
     * 
     */
    public void setIdPersonRequestCancellation(int value) {
        this.idPersonRequestCancellation = value;
    }

    /**
     * Gets the value of the personRequestCancellationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRequestCancellationDescription() {
        return personRequestCancellationDescription;
    }

    /**
     * Sets the value of the personRequestCancellationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRequestCancellationDescription(String value) {
        this.personRequestCancellationDescription = value;
    }

    /**
     * Gets the value of the personRequestCancellationDatas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRequestCancellationDatas() {
        return personRequestCancellationDatas;
    }

    /**
     * Sets the value of the personRequestCancellationDatas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRequestCancellationDatas(String value) {
        this.personRequestCancellationDatas = value;
    }

}
