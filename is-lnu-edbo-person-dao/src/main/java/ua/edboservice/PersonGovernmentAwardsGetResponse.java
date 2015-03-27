
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
 *         &lt;element name="PersonGovernmentAwardsGetResult" type="{http://edboservice.ua/}ArrayOfDPersonGovernmentAwardsGet" minOccurs="0"/>
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
    "personGovernmentAwardsGetResult"
})
@XmlRootElement(name = "PersonGovernmentAwardsGetResponse")
public class PersonGovernmentAwardsGetResponse {

    @XmlElement(name = "PersonGovernmentAwardsGetResult")
    protected ArrayOfDPersonGovernmentAwardsGet personGovernmentAwardsGetResult;

    /**
     * Gets the value of the personGovernmentAwardsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonGovernmentAwardsGet }
     *     
     */
    public ArrayOfDPersonGovernmentAwardsGet getPersonGovernmentAwardsGetResult() {
        return personGovernmentAwardsGetResult;
    }

    /**
     * Sets the value of the personGovernmentAwardsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonGovernmentAwardsGet }
     *     
     */
    public void setPersonGovernmentAwardsGetResult(ArrayOfDPersonGovernmentAwardsGet value) {
        this.personGovernmentAwardsGetResult = value;
    }

}
