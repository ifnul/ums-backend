
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
 *         &lt;element name="PersonEducationHistoryOrdersDataGetResult" type="{http://edboservice.ua/}ArrayOfDPersonEducationHistoryOrdersData" minOccurs="0"/>
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
    "personEducationHistoryOrdersDataGetResult"
})
@XmlRootElement(name = "PersonEducationHistoryOrdersDataGetResponse")
public class PersonEducationHistoryOrdersDataGetResponse {

    @XmlElement(name = "PersonEducationHistoryOrdersDataGetResult")
    protected ArrayOfDPersonEducationHistoryOrdersData personEducationHistoryOrdersDataGetResult;

    /**
     * Gets the value of the personEducationHistoryOrdersDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationHistoryOrdersData }
     *     
     */
    public ArrayOfDPersonEducationHistoryOrdersData getPersonEducationHistoryOrdersDataGetResult() {
        return personEducationHistoryOrdersDataGetResult;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationHistoryOrdersData }
     *     
     */
    public void setPersonEducationHistoryOrdersDataGetResult(ArrayOfDPersonEducationHistoryOrdersData value) {
        this.personEducationHistoryOrdersDataGetResult = value;
    }

}
