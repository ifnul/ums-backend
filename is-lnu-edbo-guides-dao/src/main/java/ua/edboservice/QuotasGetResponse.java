
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
 *         &lt;element name="QuotasGetResult" type="{http://edboservice.ua/}ArrayOfDQuotas" minOccurs="0"/>
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
    "quotasGetResult"
})
@XmlRootElement(name = "QuotasGetResponse")
public class QuotasGetResponse {

    @XmlElement(name = "QuotasGetResult")
    protected ArrayOfDQuotas quotasGetResult;

    /**
     * Gets the value of the quotasGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDQuotas }
     *     
     */
    public ArrayOfDQuotas getQuotasGetResult() {
        return quotasGetResult;
    }

    /**
     * Sets the value of the quotasGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDQuotas }
     *     
     */
    public void setQuotasGetResult(ArrayOfDQuotas value) {
        this.quotasGetResult = value;
    }

}
