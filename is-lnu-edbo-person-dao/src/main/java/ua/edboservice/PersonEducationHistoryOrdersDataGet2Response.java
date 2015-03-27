
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
 *         &lt;element name="PersonEducationHistoryOrdersDataGet2Result" type="{http://edboservice.ua/}ArrayOfDPersonEducationHistoryOrdersData2" minOccurs="0"/>
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
    "personEducationHistoryOrdersDataGet2Result"
})
@XmlRootElement(name = "PersonEducationHistoryOrdersDataGet2Response")
public class PersonEducationHistoryOrdersDataGet2Response {

    @XmlElement(name = "PersonEducationHistoryOrdersDataGet2Result")
    protected ArrayOfDPersonEducationHistoryOrdersData2 personEducationHistoryOrdersDataGet2Result;

    /**
     * Gets the value of the personEducationHistoryOrdersDataGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationHistoryOrdersData2 }
     *     
     */
    public ArrayOfDPersonEducationHistoryOrdersData2 getPersonEducationHistoryOrdersDataGet2Result() {
        return personEducationHistoryOrdersDataGet2Result;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersDataGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationHistoryOrdersData2 }
     *     
     */
    public void setPersonEducationHistoryOrdersDataGet2Result(ArrayOfDPersonEducationHistoryOrdersData2 value) {
        this.personEducationHistoryOrdersDataGet2Result = value;
    }

}
