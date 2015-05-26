
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
 *         &lt;element name="PersonHistoryGetResult" type="{http://edboservice.ua/}ArrayOfDPersonHistoryGet" minOccurs="0"/>
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
    "personHistoryGetResult"
})
@XmlRootElement(name = "PersonHistoryGetResponse")
public class PersonHistoryGetResponse {

    @XmlElement(name = "PersonHistoryGetResult")
    protected ArrayOfDPersonHistoryGet personHistoryGetResult;

    /**
     * Gets the value of the personHistoryGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonHistoryGet }
     *     
     */
    public ArrayOfDPersonHistoryGet getPersonHistoryGetResult() {
        return personHistoryGetResult;
    }

    /**
     * Sets the value of the personHistoryGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonHistoryGet }
     *     
     */
    public void setPersonHistoryGetResult(ArrayOfDPersonHistoryGet value) {
        this.personHistoryGetResult = value;
    }

}
