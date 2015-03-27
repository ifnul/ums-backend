
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
 *         &lt;element name="PersonDocumentsGet21Result" type="{http://edboservice.ua/}ArrayOfDPersonDocuments21" minOccurs="0"/>
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
    "personDocumentsGet21Result"
})
@XmlRootElement(name = "PersonDocumentsGet21Response")
public class PersonDocumentsGet21Response {

    @XmlElement(name = "PersonDocumentsGet21Result")
    protected ArrayOfDPersonDocuments21 personDocumentsGet21Result;

    /**
     * Gets the value of the personDocumentsGet21Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonDocuments21 }
     *     
     */
    public ArrayOfDPersonDocuments21 getPersonDocumentsGet21Result() {
        return personDocumentsGet21Result;
    }

    /**
     * Sets the value of the personDocumentsGet21Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonDocuments21 }
     *     
     */
    public void setPersonDocumentsGet21Result(ArrayOfDPersonDocuments21 value) {
        this.personDocumentsGet21Result = value;
    }

}
