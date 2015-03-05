
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
 *         &lt;element name="PersonEducationHistoryOrdersRequestsPersonFindResult" type="{http://edboservice.ua/}ArrayOfDPersonEducationHistoryOrdersRequestsPersonFind" minOccurs="0"/>
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
    "personEducationHistoryOrdersRequestsPersonFindResult"
})
@XmlRootElement(name = "PersonEducationHistoryOrdersRequestsPersonFindResponse")
public class PersonEducationHistoryOrdersRequestsPersonFindResponse {

    @XmlElement(name = "PersonEducationHistoryOrdersRequestsPersonFindResult")
    protected ArrayOfDPersonEducationHistoryOrdersRequestsPersonFind personEducationHistoryOrdersRequestsPersonFindResult;

    /**
     * Gets the value of the personEducationHistoryOrdersRequestsPersonFindResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationHistoryOrdersRequestsPersonFind }
     *     
     */
    public ArrayOfDPersonEducationHistoryOrdersRequestsPersonFind getPersonEducationHistoryOrdersRequestsPersonFindResult() {
        return personEducationHistoryOrdersRequestsPersonFindResult;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersRequestsPersonFindResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationHistoryOrdersRequestsPersonFind }
     *     
     */
    public void setPersonEducationHistoryOrdersRequestsPersonFindResult(ArrayOfDPersonEducationHistoryOrdersRequestsPersonFind value) {
        this.personEducationHistoryOrdersRequestsPersonFindResult = value;
    }

}
