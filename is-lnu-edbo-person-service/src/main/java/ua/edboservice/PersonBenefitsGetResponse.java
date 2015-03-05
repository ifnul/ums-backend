
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
 *         &lt;element name="PersonBenefitsGetResult" type="{http://edboservice.ua/}ArrayOfDPersonBenefits" minOccurs="0"/>
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
    "personBenefitsGetResult"
})
@XmlRootElement(name = "PersonBenefitsGetResponse")
public class PersonBenefitsGetResponse {

    @XmlElement(name = "PersonBenefitsGetResult")
    protected ArrayOfDPersonBenefits personBenefitsGetResult;

    /**
     * Gets the value of the personBenefitsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonBenefits }
     *     
     */
    public ArrayOfDPersonBenefits getPersonBenefitsGetResult() {
        return personBenefitsGetResult;
    }

    /**
     * Sets the value of the personBenefitsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonBenefits }
     *     
     */
    public void setPersonBenefitsGetResult(ArrayOfDPersonBenefits value) {
        this.personBenefitsGetResult = value;
    }

}
