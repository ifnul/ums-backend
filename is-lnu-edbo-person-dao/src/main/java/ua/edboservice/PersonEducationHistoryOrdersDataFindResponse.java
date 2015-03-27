
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
 *         &lt;element name="PersonEducationHistoryOrdersDataFindResult" type="{http://edboservice.ua/}ArrayOfDPersonEducationHistoryOrdersDataFind" minOccurs="0"/>
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
    "personEducationHistoryOrdersDataFindResult"
})
@XmlRootElement(name = "PersonEducationHistoryOrdersDataFindResponse")
public class PersonEducationHistoryOrdersDataFindResponse {

    @XmlElement(name = "PersonEducationHistoryOrdersDataFindResult")
    protected ArrayOfDPersonEducationHistoryOrdersDataFind personEducationHistoryOrdersDataFindResult;

    /**
     * Gets the value of the personEducationHistoryOrdersDataFindResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationHistoryOrdersDataFind }
     *     
     */
    public ArrayOfDPersonEducationHistoryOrdersDataFind getPersonEducationHistoryOrdersDataFindResult() {
        return personEducationHistoryOrdersDataFindResult;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersDataFindResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationHistoryOrdersDataFind }
     *     
     */
    public void setPersonEducationHistoryOrdersDataFindResult(ArrayOfDPersonEducationHistoryOrdersDataFind value) {
        this.personEducationHistoryOrdersDataFindResult = value;
    }

}
