
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
 *         &lt;element name="PersonDocumentsValuesGetResult" type="{http://edboservice.ua/}ArrayOfDPersonDocumentsValues" minOccurs="0"/>
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
    "personDocumentsValuesGetResult"
})
@XmlRootElement(name = "PersonDocumentsValuesGetResponse")
public class PersonDocumentsValuesGetResponse {

    @XmlElement(name = "PersonDocumentsValuesGetResult")
    protected ArrayOfDPersonDocumentsValues personDocumentsValuesGetResult;

    /**
     * Gets the value of the personDocumentsValuesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonDocumentsValues }
     *     
     */
    public ArrayOfDPersonDocumentsValues getPersonDocumentsValuesGetResult() {
        return personDocumentsValuesGetResult;
    }

    /**
     * Sets the value of the personDocumentsValuesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonDocumentsValues }
     *     
     */
    public void setPersonDocumentsValuesGetResult(ArrayOfDPersonDocumentsValues value) {
        this.personDocumentsValuesGetResult = value;
    }

}
