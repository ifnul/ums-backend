
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
 *         &lt;element name="PersonDocumentsFullGetResult" type="{http://edboservice.ua/}ArrayOfDPersonDocumentsFull" minOccurs="0"/>
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
    "personDocumentsFullGetResult"
})
@XmlRootElement(name = "PersonDocumentsFullGetResponse")
public class PersonDocumentsFullGetResponse {

    @XmlElement(name = "PersonDocumentsFullGetResult")
    protected ArrayOfDPersonDocumentsFull personDocumentsFullGetResult;

    /**
     * Gets the value of the personDocumentsFullGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonDocumentsFull }
     *     
     */
    public ArrayOfDPersonDocumentsFull getPersonDocumentsFullGetResult() {
        return personDocumentsFullGetResult;
    }

    /**
     * Sets the value of the personDocumentsFullGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonDocumentsFull }
     *     
     */
    public void setPersonDocumentsFullGetResult(ArrayOfDPersonDocumentsFull value) {
        this.personDocumentsFullGetResult = value;
    }

}
