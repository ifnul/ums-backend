
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
 *         &lt;element name="PersonEducationHistoryOrdersGetResult" type="{http://edboservice.ua/}ArrayOfDPersonEducationHistoryOrders" minOccurs="0"/>
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
    "personEducationHistoryOrdersGetResult"
})
@XmlRootElement(name = "PersonEducationHistoryOrdersGetResponse")
public class PersonEducationHistoryOrdersGetResponse {

    @XmlElement(name = "PersonEducationHistoryOrdersGetResult")
    protected ArrayOfDPersonEducationHistoryOrders personEducationHistoryOrdersGetResult;

    /**
     * Gets the value of the personEducationHistoryOrdersGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationHistoryOrders }
     *     
     */
    public ArrayOfDPersonEducationHistoryOrders getPersonEducationHistoryOrdersGetResult() {
        return personEducationHistoryOrdersGetResult;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationHistoryOrders }
     *     
     */
    public void setPersonEducationHistoryOrdersGetResult(ArrayOfDPersonEducationHistoryOrders value) {
        this.personEducationHistoryOrdersGetResult = value;
    }

}
