
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
 *         &lt;element name="PersonWorkOrdersDataGetResult" type="{http://edboservice.ua/}ArrayOfDPersonWorkOrdersData" minOccurs="0"/>
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
    "personWorkOrdersDataGetResult"
})
@XmlRootElement(name = "PersonWorkOrdersDataGetResponse")
public class PersonWorkOrdersDataGetResponse {

    @XmlElement(name = "PersonWorkOrdersDataGetResult")
    protected ArrayOfDPersonWorkOrdersData personWorkOrdersDataGetResult;

    /**
     * Gets the value of the personWorkOrdersDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonWorkOrdersData }
     *     
     */
    public ArrayOfDPersonWorkOrdersData getPersonWorkOrdersDataGetResult() {
        return personWorkOrdersDataGetResult;
    }

    /**
     * Sets the value of the personWorkOrdersDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonWorkOrdersData }
     *     
     */
    public void setPersonWorkOrdersDataGetResult(ArrayOfDPersonWorkOrdersData value) {
        this.personWorkOrdersDataGetResult = value;
    }

}
