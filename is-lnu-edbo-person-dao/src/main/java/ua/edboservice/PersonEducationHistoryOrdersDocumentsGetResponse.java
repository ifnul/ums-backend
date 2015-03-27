
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
 *         &lt;element name="PersonEducationHistoryOrdersDocumentsGetResult" type="{http://edboservice.ua/}ArrayOfDPersonEducationHistoryOrdersDocuments" minOccurs="0"/>
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
    "personEducationHistoryOrdersDocumentsGetResult"
})
@XmlRootElement(name = "PersonEducationHistoryOrdersDocumentsGetResponse")
public class PersonEducationHistoryOrdersDocumentsGetResponse {

    @XmlElement(name = "PersonEducationHistoryOrdersDocumentsGetResult")
    protected ArrayOfDPersonEducationHistoryOrdersDocuments personEducationHistoryOrdersDocumentsGetResult;

    /**
     * Gets the value of the personEducationHistoryOrdersDocumentsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationHistoryOrdersDocuments }
     *     
     */
    public ArrayOfDPersonEducationHistoryOrdersDocuments getPersonEducationHistoryOrdersDocumentsGetResult() {
        return personEducationHistoryOrdersDocumentsGetResult;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersDocumentsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationHistoryOrdersDocuments }
     *     
     */
    public void setPersonEducationHistoryOrdersDocumentsGetResult(ArrayOfDPersonEducationHistoryOrdersDocuments value) {
        this.personEducationHistoryOrdersDocumentsGetResult = value;
    }

}
