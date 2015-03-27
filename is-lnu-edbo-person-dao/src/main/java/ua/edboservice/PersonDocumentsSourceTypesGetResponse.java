
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
 *         &lt;element name="PersonDocumentsSourceTypesGetResult" type="{http://edboservice.ua/}ArrayOfDPersonDocumentsSourceTypes" minOccurs="0"/>
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
    "personDocumentsSourceTypesGetResult"
})
@XmlRootElement(name = "PersonDocumentsSourceTypesGetResponse")
public class PersonDocumentsSourceTypesGetResponse {

    @XmlElement(name = "PersonDocumentsSourceTypesGetResult")
    protected ArrayOfDPersonDocumentsSourceTypes personDocumentsSourceTypesGetResult;

    /**
     * Gets the value of the personDocumentsSourceTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonDocumentsSourceTypes }
     *     
     */
    public ArrayOfDPersonDocumentsSourceTypes getPersonDocumentsSourceTypesGetResult() {
        return personDocumentsSourceTypesGetResult;
    }

    /**
     * Sets the value of the personDocumentsSourceTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonDocumentsSourceTypes }
     *     
     */
    public void setPersonDocumentsSourceTypesGetResult(ArrayOfDPersonDocumentsSourceTypes value) {
        this.personDocumentsSourceTypesGetResult = value;
    }

}
