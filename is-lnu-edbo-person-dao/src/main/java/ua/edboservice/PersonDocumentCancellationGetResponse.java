
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
 *         &lt;element name="PersonDocumentCancellationGetResult" type="{http://edboservice.ua/}ArrayOfDPersonDocumentCancellation" minOccurs="0"/>
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
    "personDocumentCancellationGetResult"
})
@XmlRootElement(name = "PersonDocumentCancellationGetResponse")
public class PersonDocumentCancellationGetResponse {

    @XmlElement(name = "PersonDocumentCancellationGetResult")
    protected ArrayOfDPersonDocumentCancellation personDocumentCancellationGetResult;

    /**
     * Gets the value of the personDocumentCancellationGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonDocumentCancellation }
     *     
     */
    public ArrayOfDPersonDocumentCancellation getPersonDocumentCancellationGetResult() {
        return personDocumentCancellationGetResult;
    }

    /**
     * Sets the value of the personDocumentCancellationGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonDocumentCancellation }
     *     
     */
    public void setPersonDocumentCancellationGetResult(ArrayOfDPersonDocumentCancellation value) {
        this.personDocumentCancellationGetResult = value;
    }

}
