
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
 *         &lt;element name="PersonWorkHistoryGetResult" type="{http://edboservice.ua/}ArrayOfDPersonWorkHistory" minOccurs="0"/>
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
    "personWorkHistoryGetResult"
})
@XmlRootElement(name = "PersonWorkHistoryGetResponse")
public class PersonWorkHistoryGetResponse {

    @XmlElement(name = "PersonWorkHistoryGetResult")
    protected ArrayOfDPersonWorkHistory personWorkHistoryGetResult;

    /**
     * Gets the value of the personWorkHistoryGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonWorkHistory }
     *     
     */
    public ArrayOfDPersonWorkHistory getPersonWorkHistoryGetResult() {
        return personWorkHistoryGetResult;
    }

    /**
     * Sets the value of the personWorkHistoryGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonWorkHistory }
     *     
     */
    public void setPersonWorkHistoryGetResult(ArrayOfDPersonWorkHistory value) {
        this.personWorkHistoryGetResult = value;
    }

}
