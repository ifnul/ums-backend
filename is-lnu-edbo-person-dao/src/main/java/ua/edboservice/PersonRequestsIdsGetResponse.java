
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
 *         &lt;element name="PersonRequestsIdsGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestsIds" minOccurs="0"/>
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
    "personRequestsIdsGetResult"
})
@XmlRootElement(name = "PersonRequestsIdsGetResponse")
public class PersonRequestsIdsGetResponse {

    @XmlElement(name = "PersonRequestsIdsGetResult")
    protected ArrayOfDPersonRequestsIds personRequestsIdsGetResult;

    /**
     * Gets the value of the personRequestsIdsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestsIds }
     *     
     */
    public ArrayOfDPersonRequestsIds getPersonRequestsIdsGetResult() {
        return personRequestsIdsGetResult;
    }

    /**
     * Sets the value of the personRequestsIdsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestsIds }
     *     
     */
    public void setPersonRequestsIdsGetResult(ArrayOfDPersonRequestsIds value) {
        this.personRequestsIdsGetResult = value;
    }

}
