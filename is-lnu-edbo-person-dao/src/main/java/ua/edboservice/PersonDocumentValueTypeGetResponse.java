
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
 *         &lt;element name="PersonDocumentValueTypeGetResult" type="{http://edboservice.ua/}ArrayOfDPersonDocumentValueType" minOccurs="0"/>
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
    "personDocumentValueTypeGetResult"
})
@XmlRootElement(name = "PersonDocumentValueTypeGetResponse")
public class PersonDocumentValueTypeGetResponse {

    @XmlElement(name = "PersonDocumentValueTypeGetResult")
    protected ArrayOfDPersonDocumentValueType personDocumentValueTypeGetResult;

    /**
     * Gets the value of the personDocumentValueTypeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonDocumentValueType }
     *     
     */
    public ArrayOfDPersonDocumentValueType getPersonDocumentValueTypeGetResult() {
        return personDocumentValueTypeGetResult;
    }

    /**
     * Sets the value of the personDocumentValueTypeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonDocumentValueType }
     *     
     */
    public void setPersonDocumentValueTypeGetResult(ArrayOfDPersonDocumentValueType value) {
        this.personDocumentValueTypeGetResult = value;
    }

}
