
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
 *         &lt;element name="PersonEducationHistoryGetResult" type="{http://edboservice.ua/}ArrayOfDPersonEducationHistory" minOccurs="0"/>
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
    "personEducationHistoryGetResult"
})
@XmlRootElement(name = "PersonEducationHistoryGetResponse")
public class PersonEducationHistoryGetResponse {

    @XmlElement(name = "PersonEducationHistoryGetResult")
    protected ArrayOfDPersonEducationHistory personEducationHistoryGetResult;

    /**
     * Gets the value of the personEducationHistoryGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationHistory }
     *     
     */
    public ArrayOfDPersonEducationHistory getPersonEducationHistoryGetResult() {
        return personEducationHistoryGetResult;
    }

    /**
     * Sets the value of the personEducationHistoryGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationHistory }
     *     
     */
    public void setPersonEducationHistoryGetResult(ArrayOfDPersonEducationHistory value) {
        this.personEducationHistoryGetResult = value;
    }

}
