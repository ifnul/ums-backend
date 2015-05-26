
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
 *         &lt;element name="GovernmentAwardsGetResult" type="{http://edboservice.ua/}ArrayOfDGovernmentAward" minOccurs="0"/>
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
    "governmentAwardsGetResult"
})
@XmlRootElement(name = "GovernmentAwardsGetResponse")
public class GovernmentAwardsGetResponse {

    @XmlElement(name = "GovernmentAwardsGetResult")
    protected ArrayOfDGovernmentAward governmentAwardsGetResult;

    /**
     * Gets the value of the governmentAwardsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDGovernmentAward }
     *     
     */
    public ArrayOfDGovernmentAward getGovernmentAwardsGetResult() {
        return governmentAwardsGetResult;
    }

    /**
     * Sets the value of the governmentAwardsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDGovernmentAward }
     *     
     */
    public void setGovernmentAwardsGetResult(ArrayOfDGovernmentAward value) {
        this.governmentAwardsGetResult = value;
    }

}
