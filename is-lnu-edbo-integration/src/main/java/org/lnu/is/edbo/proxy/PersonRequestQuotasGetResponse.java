
package org.lnu.is.edbo.proxy;

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
 *         &lt;element name="PersonRequestQuotasGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestQuotas" minOccurs="0"/>
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
    "personRequestQuotasGetResult"
})
@XmlRootElement(name = "PersonRequestQuotasGetResponse")
public class PersonRequestQuotasGetResponse {

    @XmlElement(name = "PersonRequestQuotasGetResult")
    protected ArrayOfDPersonRequestQuotas personRequestQuotasGetResult;

    /**
     * Gets the value of the personRequestQuotasGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestQuotas }
     *     
     */
    public ArrayOfDPersonRequestQuotas getPersonRequestQuotasGetResult() {
        return personRequestQuotasGetResult;
    }

    /**
     * Sets the value of the personRequestQuotasGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestQuotas }
     *     
     */
    public void setPersonRequestQuotasGetResult(ArrayOfDPersonRequestQuotas value) {
        this.personRequestQuotasGetResult = value;
    }

}
