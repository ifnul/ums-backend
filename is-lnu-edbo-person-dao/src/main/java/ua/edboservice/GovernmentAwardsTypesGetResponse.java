
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
 *         &lt;element name="GovernmentAwardsTypesGetResult" type="{http://edboservice.ua/}ArrayOfDGovernmentAwardsTypes" minOccurs="0"/>
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
    "governmentAwardsTypesGetResult"
})
@XmlRootElement(name = "GovernmentAwardsTypesGetResponse")
public class GovernmentAwardsTypesGetResponse {

    @XmlElement(name = "GovernmentAwardsTypesGetResult")
    protected ArrayOfDGovernmentAwardsTypes governmentAwardsTypesGetResult;

    /**
     * Gets the value of the governmentAwardsTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDGovernmentAwardsTypes }
     *     
     */
    public ArrayOfDGovernmentAwardsTypes getGovernmentAwardsTypesGetResult() {
        return governmentAwardsTypesGetResult;
    }

    /**
     * Sets the value of the governmentAwardsTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDGovernmentAwardsTypes }
     *     
     */
    public void setGovernmentAwardsTypesGetResult(ArrayOfDGovernmentAwardsTypes value) {
        this.governmentAwardsTypesGetResult = value;
    }

}
