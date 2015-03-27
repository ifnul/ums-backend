
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
 *         &lt;element name="PersonEducationHistoryOrdersGet2Result" type="{http://edboservice.ua/}ArrayOfDPersonEducationHistoryOrders2" minOccurs="0"/>
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
    "personEducationHistoryOrdersGet2Result"
})
@XmlRootElement(name = "PersonEducationHistoryOrdersGet2Response")
public class PersonEducationHistoryOrdersGet2Response {

    @XmlElement(name = "PersonEducationHistoryOrdersGet2Result")
    protected ArrayOfDPersonEducationHistoryOrders2 personEducationHistoryOrdersGet2Result;

    /**
     * Gets the value of the personEducationHistoryOrdersGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationHistoryOrders2 }
     *     
     */
    public ArrayOfDPersonEducationHistoryOrders2 getPersonEducationHistoryOrdersGet2Result() {
        return personEducationHistoryOrdersGet2Result;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationHistoryOrders2 }
     *     
     */
    public void setPersonEducationHistoryOrdersGet2Result(ArrayOfDPersonEducationHistoryOrders2 value) {
        this.personEducationHistoryOrdersGet2Result = value;
    }

}
