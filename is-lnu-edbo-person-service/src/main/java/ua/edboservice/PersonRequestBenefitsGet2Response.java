
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
 *         &lt;element name="PersonRequestBenefitsGet2Result" type="{http://edboservice.ua/}ArrayOfDPersonRequestBenefits2" minOccurs="0"/>
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
    "personRequestBenefitsGet2Result"
})
@XmlRootElement(name = "PersonRequestBenefitsGet2Response")
public class PersonRequestBenefitsGet2Response {

    @XmlElement(name = "PersonRequestBenefitsGet2Result")
    protected ArrayOfDPersonRequestBenefits2 personRequestBenefitsGet2Result;

    /**
     * Gets the value of the personRequestBenefitsGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestBenefits2 }
     *     
     */
    public ArrayOfDPersonRequestBenefits2 getPersonRequestBenefitsGet2Result() {
        return personRequestBenefitsGet2Result;
    }

    /**
     * Sets the value of the personRequestBenefitsGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestBenefits2 }
     *     
     */
    public void setPersonRequestBenefitsGet2Result(ArrayOfDPersonRequestBenefits2 value) {
        this.personRequestBenefitsGet2Result = value;
    }

}
