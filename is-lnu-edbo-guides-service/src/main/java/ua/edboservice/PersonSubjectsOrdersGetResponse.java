
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
 *         &lt;element name="PersonSubjectsOrdersGetResult" type="{http://edboservice.ua/}ArrayOfDPersonSubjectsOrders" minOccurs="0"/>
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
    "personSubjectsOrdersGetResult"
})
@XmlRootElement(name = "PersonSubjectsOrdersGetResponse")
public class PersonSubjectsOrdersGetResponse {

    @XmlElement(name = "PersonSubjectsOrdersGetResult")
    protected ArrayOfDPersonSubjectsOrders personSubjectsOrdersGetResult;

    /**
     * Gets the value of the personSubjectsOrdersGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonSubjectsOrders }
     *     
     */
    public ArrayOfDPersonSubjectsOrders getPersonSubjectsOrdersGetResult() {
        return personSubjectsOrdersGetResult;
    }

    /**
     * Sets the value of the personSubjectsOrdersGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonSubjectsOrders }
     *     
     */
    public void setPersonSubjectsOrdersGetResult(ArrayOfDPersonSubjectsOrders value) {
        this.personSubjectsOrdersGetResult = value;
    }

}
