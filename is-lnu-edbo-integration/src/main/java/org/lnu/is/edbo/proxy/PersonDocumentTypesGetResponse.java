
package org.lnu.is.edbo.proxy;

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
 *         &lt;element name="PersonDocumentTypesGetResult" type="{http://edboservice.ua/}ArrayOfDPersonDocumentTypes" minOccurs="0"/>
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
    "personDocumentTypesGetResult"
})
@XmlRootElement(name = "PersonDocumentTypesGetResponse")
public class PersonDocumentTypesGetResponse {

    @XmlElement(name = "PersonDocumentTypesGetResult")
    protected ArrayOfDPersonDocumentTypes personDocumentTypesGetResult;

    /**
     * Gets the value of the personDocumentTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonDocumentTypes }
     *     
     */
    public ArrayOfDPersonDocumentTypes getPersonDocumentTypesGetResult() {
        return personDocumentTypesGetResult;
    }

    /**
     * Sets the value of the personDocumentTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonDocumentTypes }
     *     
     */
    public void setPersonDocumentTypesGetResult(ArrayOfDPersonDocumentTypes value) {
        this.personDocumentTypesGetResult = value;
    }

}
