
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
 *         &lt;element name="PersonEducationPaymentTypesGetResult" type="{http://edboservice.ua/}ArrayOfDPersonEducationPaymentTypes" minOccurs="0"/>
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
    "personEducationPaymentTypesGetResult"
})
@XmlRootElement(name = "PersonEducationPaymentTypesGetResponse")
public class PersonEducationPaymentTypesGetResponse {

    @XmlElement(name = "PersonEducationPaymentTypesGetResult")
    protected ArrayOfDPersonEducationPaymentTypes personEducationPaymentTypesGetResult;

    /**
     * Gets the value of the personEducationPaymentTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationPaymentTypes }
     *     
     */
    public ArrayOfDPersonEducationPaymentTypes getPersonEducationPaymentTypesGetResult() {
        return personEducationPaymentTypesGetResult;
    }

    /**
     * Sets the value of the personEducationPaymentTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationPaymentTypes }
     *     
     */
    public void setPersonEducationPaymentTypesGetResult(ArrayOfDPersonEducationPaymentTypes value) {
        this.personEducationPaymentTypesGetResult = value;
    }

}
