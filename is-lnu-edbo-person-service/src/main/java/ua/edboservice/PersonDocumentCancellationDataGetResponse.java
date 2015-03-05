
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
 *         &lt;element name="PersonDocumentCancellationDataGetResult" type="{http://edboservice.ua/}ArrayOfDPersonDocumentCancellationData" minOccurs="0"/>
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
    "personDocumentCancellationDataGetResult"
})
@XmlRootElement(name = "PersonDocumentCancellationDataGetResponse")
public class PersonDocumentCancellationDataGetResponse {

    @XmlElement(name = "PersonDocumentCancellationDataGetResult")
    protected ArrayOfDPersonDocumentCancellationData personDocumentCancellationDataGetResult;

    /**
     * Gets the value of the personDocumentCancellationDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonDocumentCancellationData }
     *     
     */
    public ArrayOfDPersonDocumentCancellationData getPersonDocumentCancellationDataGetResult() {
        return personDocumentCancellationDataGetResult;
    }

    /**
     * Sets the value of the personDocumentCancellationDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonDocumentCancellationData }
     *     
     */
    public void setPersonDocumentCancellationDataGetResult(ArrayOfDPersonDocumentCancellationData value) {
        this.personDocumentCancellationDataGetResult = value;
    }

}
