
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
 *         &lt;element name="PersonBenefitsGet2Result" type="{http://edboservice.ua/}ArrayOfDPersonBenefits2" minOccurs="0"/>
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
    "personBenefitsGet2Result"
})
@XmlRootElement(name = "PersonBenefitsGet2Response")
public class PersonBenefitsGet2Response {

    @XmlElement(name = "PersonBenefitsGet2Result")
    protected ArrayOfDPersonBenefits2 personBenefitsGet2Result;

    /**
     * Gets the value of the personBenefitsGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonBenefits2 }
     *     
     */
    public ArrayOfDPersonBenefits2 getPersonBenefitsGet2Result() {
        return personBenefitsGet2Result;
    }

    /**
     * Sets the value of the personBenefitsGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonBenefits2 }
     *     
     */
    public void setPersonBenefitsGet2Result(ArrayOfDPersonBenefits2 value) {
        this.personBenefitsGet2Result = value;
    }

}
