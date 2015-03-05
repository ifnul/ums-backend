
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
 *         &lt;element name="PersonDocumentsValuesFullGetResult" type="{http://edboservice.ua/}ArrayOfDPersonDocumentsValuesFull" minOccurs="0"/>
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
    "personDocumentsValuesFullGetResult"
})
@XmlRootElement(name = "PersonDocumentsValuesFullGetResponse")
public class PersonDocumentsValuesFullGetResponse {

    @XmlElement(name = "PersonDocumentsValuesFullGetResult")
    protected ArrayOfDPersonDocumentsValuesFull personDocumentsValuesFullGetResult;

    /**
     * Gets the value of the personDocumentsValuesFullGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonDocumentsValuesFull }
     *     
     */
    public ArrayOfDPersonDocumentsValuesFull getPersonDocumentsValuesFullGetResult() {
        return personDocumentsValuesFullGetResult;
    }

    /**
     * Sets the value of the personDocumentsValuesFullGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonDocumentsValuesFull }
     *     
     */
    public void setPersonDocumentsValuesFullGetResult(ArrayOfDPersonDocumentsValuesFull value) {
        this.personDocumentsValuesFullGetResult = value;
    }

}
