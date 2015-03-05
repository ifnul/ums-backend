
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
 *         &lt;element name="PersonEducationHistoryOrdersStatusesGetResult" type="{http://edboservice.ua/}ArrayOfDPersonEducationHistoryOrdersStatuses" minOccurs="0"/>
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
    "personEducationHistoryOrdersStatusesGetResult"
})
@XmlRootElement(name = "PersonEducationHistoryOrdersStatusesGetResponse")
public class PersonEducationHistoryOrdersStatusesGetResponse {

    @XmlElement(name = "PersonEducationHistoryOrdersStatusesGetResult")
    protected ArrayOfDPersonEducationHistoryOrdersStatuses personEducationHistoryOrdersStatusesGetResult;

    /**
     * Gets the value of the personEducationHistoryOrdersStatusesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationHistoryOrdersStatuses }
     *     
     */
    public ArrayOfDPersonEducationHistoryOrdersStatuses getPersonEducationHistoryOrdersStatusesGetResult() {
        return personEducationHistoryOrdersStatusesGetResult;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersStatusesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationHistoryOrdersStatuses }
     *     
     */
    public void setPersonEducationHistoryOrdersStatusesGetResult(ArrayOfDPersonEducationHistoryOrdersStatuses value) {
        this.personEducationHistoryOrdersStatusesGetResult = value;
    }

}
