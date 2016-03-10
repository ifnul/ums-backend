
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
 *         &lt;element name="PersonRequestBenefitsGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestBenefits" minOccurs="0"/>
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
    "personRequestBenefitsGetResult"
})
@XmlRootElement(name = "PersonRequestBenefitsGetResponse")
public class PersonRequestBenefitsGetResponse {

    @XmlElement(name = "PersonRequestBenefitsGetResult")
    protected ArrayOfDPersonRequestBenefits personRequestBenefitsGetResult;

    /**
     * Gets the value of the personRequestBenefitsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestBenefits }
     *     
     */
    public ArrayOfDPersonRequestBenefits getPersonRequestBenefitsGetResult() {
        return personRequestBenefitsGetResult;
    }

    /**
     * Sets the value of the personRequestBenefitsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestBenefits }
     *     
     */
    public void setPersonRequestBenefitsGetResult(ArrayOfDPersonRequestBenefits value) {
        this.personRequestBenefitsGetResult = value;
    }

}
