
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
 *         &lt;element name="PersonDocumentTypesGet2Result" type="{http://edboservice.ua/}ArrayOfDPersonDocumentTypes2" minOccurs="0"/>
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
    "personDocumentTypesGet2Result"
})
@XmlRootElement(name = "PersonDocumentTypesGet2Response")
public class PersonDocumentTypesGet2Response {

    @XmlElement(name = "PersonDocumentTypesGet2Result")
    protected ArrayOfDPersonDocumentTypes2 personDocumentTypesGet2Result;

    /**
     * Gets the value of the personDocumentTypesGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonDocumentTypes2 }
     *     
     */
    public ArrayOfDPersonDocumentTypes2 getPersonDocumentTypesGet2Result() {
        return personDocumentTypesGet2Result;
    }

    /**
     * Sets the value of the personDocumentTypesGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonDocumentTypes2 }
     *     
     */
    public void setPersonDocumentTypesGet2Result(ArrayOfDPersonDocumentTypes2 value) {
        this.personDocumentTypesGet2Result = value;
    }

}
