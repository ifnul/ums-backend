
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
 *         &lt;element name="PersonDocumentCancellationTypesGetResult" type="{http://edboservice.ua/}ArrayOfDPersonDocumentCancellationTypes" minOccurs="0"/>
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
    "personDocumentCancellationTypesGetResult"
})
@XmlRootElement(name = "PersonDocumentCancellationTypesGetResponse")
public class PersonDocumentCancellationTypesGetResponse {

    @XmlElement(name = "PersonDocumentCancellationTypesGetResult")
    protected ArrayOfDPersonDocumentCancellationTypes personDocumentCancellationTypesGetResult;

    /**
     * Gets the value of the personDocumentCancellationTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonDocumentCancellationTypes }
     *     
     */
    public ArrayOfDPersonDocumentCancellationTypes getPersonDocumentCancellationTypesGetResult() {
        return personDocumentCancellationTypesGetResult;
    }

    /**
     * Sets the value of the personDocumentCancellationTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonDocumentCancellationTypes }
     *     
     */
    public void setPersonDocumentCancellationTypesGetResult(ArrayOfDPersonDocumentCancellationTypes value) {
        this.personDocumentCancellationTypesGetResult = value;
    }

}
