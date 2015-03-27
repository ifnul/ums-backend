
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
 *         &lt;element name="PersonDocumentCancellationPersonsFindResult" type="{http://edboservice.ua/}ArrayOfDPersonDocumentCancellationPersonsFind" minOccurs="0"/>
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
    "personDocumentCancellationPersonsFindResult"
})
@XmlRootElement(name = "PersonDocumentCancellationPersonsFindResponse")
public class PersonDocumentCancellationPersonsFindResponse {

    @XmlElement(name = "PersonDocumentCancellationPersonsFindResult")
    protected ArrayOfDPersonDocumentCancellationPersonsFind personDocumentCancellationPersonsFindResult;

    /**
     * Gets the value of the personDocumentCancellationPersonsFindResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonDocumentCancellationPersonsFind }
     *     
     */
    public ArrayOfDPersonDocumentCancellationPersonsFind getPersonDocumentCancellationPersonsFindResult() {
        return personDocumentCancellationPersonsFindResult;
    }

    /**
     * Sets the value of the personDocumentCancellationPersonsFindResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonDocumentCancellationPersonsFind }
     *     
     */
    public void setPersonDocumentCancellationPersonsFindResult(ArrayOfDPersonDocumentCancellationPersonsFind value) {
        this.personDocumentCancellationPersonsFindResult = value;
    }

}
