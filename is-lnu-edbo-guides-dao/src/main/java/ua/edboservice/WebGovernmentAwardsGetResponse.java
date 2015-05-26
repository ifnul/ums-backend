
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
 *         &lt;element name="WebGovernmentAwardsGetResult" type="{http://edboservice.ua/}ArrayOfDWebGovernmentAwards" minOccurs="0"/>
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
    "webGovernmentAwardsGetResult"
})
@XmlRootElement(name = "WebGovernmentAwardsGetResponse")
public class WebGovernmentAwardsGetResponse {

    @XmlElement(name = "WebGovernmentAwardsGetResult")
    protected ArrayOfDWebGovernmentAwards webGovernmentAwardsGetResult;

    /**
     * Gets the value of the webGovernmentAwardsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDWebGovernmentAwards }
     *     
     */
    public ArrayOfDWebGovernmentAwards getWebGovernmentAwardsGetResult() {
        return webGovernmentAwardsGetResult;
    }

    /**
     * Sets the value of the webGovernmentAwardsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDWebGovernmentAwards }
     *     
     */
    public void setWebGovernmentAwardsGetResult(ArrayOfDWebGovernmentAwards value) {
        this.webGovernmentAwardsGetResult = value;
    }

}
