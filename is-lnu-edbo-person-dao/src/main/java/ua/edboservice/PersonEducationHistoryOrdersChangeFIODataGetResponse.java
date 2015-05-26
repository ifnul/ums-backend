
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
 *         &lt;element name="PersonEducationHistoryOrdersChangeFIODataGetResult" type="{http://edboservice.ua/}ArrayOfDPersonEducationHistoryOrdersChangeFIOData" minOccurs="0"/>
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
    "personEducationHistoryOrdersChangeFIODataGetResult"
})
@XmlRootElement(name = "PersonEducationHistoryOrdersChangeFIODataGetResponse")
public class PersonEducationHistoryOrdersChangeFIODataGetResponse {

    @XmlElement(name = "PersonEducationHistoryOrdersChangeFIODataGetResult")
    protected ArrayOfDPersonEducationHistoryOrdersChangeFIOData personEducationHistoryOrdersChangeFIODataGetResult;

    /**
     * Gets the value of the personEducationHistoryOrdersChangeFIODataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationHistoryOrdersChangeFIOData }
     *     
     */
    public ArrayOfDPersonEducationHistoryOrdersChangeFIOData getPersonEducationHistoryOrdersChangeFIODataGetResult() {
        return personEducationHistoryOrdersChangeFIODataGetResult;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersChangeFIODataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationHistoryOrdersChangeFIOData }
     *     
     */
    public void setPersonEducationHistoryOrdersChangeFIODataGetResult(ArrayOfDPersonEducationHistoryOrdersChangeFIOData value) {
        this.personEducationHistoryOrdersChangeFIODataGetResult = value;
    }

}
