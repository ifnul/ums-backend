
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
 *         &lt;element name="PersonTypeHistoryGetResult" type="{http://edboservice.ua/}ArrayOfDPersonTypeHistoryGet" minOccurs="0"/>
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
    "personTypeHistoryGetResult"
})
@XmlRootElement(name = "PersonTypeHistoryGetResponse")
public class PersonTypeHistoryGetResponse {

    @XmlElement(name = "PersonTypeHistoryGetResult")
    protected ArrayOfDPersonTypeHistoryGet personTypeHistoryGetResult;

    /**
     * Gets the value of the personTypeHistoryGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonTypeHistoryGet }
     *     
     */
    public ArrayOfDPersonTypeHistoryGet getPersonTypeHistoryGetResult() {
        return personTypeHistoryGetResult;
    }

    /**
     * Sets the value of the personTypeHistoryGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonTypeHistoryGet }
     *     
     */
    public void setPersonTypeHistoryGetResult(ArrayOfDPersonTypeHistoryGet value) {
        this.personTypeHistoryGetResult = value;
    }

}
