
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
 *         &lt;element name="PersonEducationProgressOrdersGetResult" type="{http://edboservice.ua/}ArrayOfDPersonEducationProgressOrders" minOccurs="0"/>
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
    "personEducationProgressOrdersGetResult"
})
@XmlRootElement(name = "PersonEducationProgressOrdersGetResponse")
public class PersonEducationProgressOrdersGetResponse {

    @XmlElement(name = "PersonEducationProgressOrdersGetResult")
    protected ArrayOfDPersonEducationProgressOrders personEducationProgressOrdersGetResult;

    /**
     * Gets the value of the personEducationProgressOrdersGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationProgressOrders }
     *     
     */
    public ArrayOfDPersonEducationProgressOrders getPersonEducationProgressOrdersGetResult() {
        return personEducationProgressOrdersGetResult;
    }

    /**
     * Sets the value of the personEducationProgressOrdersGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationProgressOrders }
     *     
     */
    public void setPersonEducationProgressOrdersGetResult(ArrayOfDPersonEducationProgressOrders value) {
        this.personEducationProgressOrdersGetResult = value;
    }

}
