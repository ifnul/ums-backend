
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
 *         &lt;element name="PersonWorkTariffTypesGetResult" type="{http://edboservice.ua/}ArrayOfDPersonWorkTariffTypes" minOccurs="0"/>
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
    "personWorkTariffTypesGetResult"
})
@XmlRootElement(name = "PersonWorkTariffTypesGetResponse")
public class PersonWorkTariffTypesGetResponse {

    @XmlElement(name = "PersonWorkTariffTypesGetResult")
    protected ArrayOfDPersonWorkTariffTypes personWorkTariffTypesGetResult;

    /**
     * Gets the value of the personWorkTariffTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonWorkTariffTypes }
     *     
     */
    public ArrayOfDPersonWorkTariffTypes getPersonWorkTariffTypesGetResult() {
        return personWorkTariffTypesGetResult;
    }

    /**
     * Sets the value of the personWorkTariffTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonWorkTariffTypes }
     *     
     */
    public void setPersonWorkTariffTypesGetResult(ArrayOfDPersonWorkTariffTypes value) {
        this.personWorkTariffTypesGetResult = value;
    }

}
