
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
 *         &lt;element name="PersonDocumentsGet2Result" type="{http://edboservice.ua/}ArrayOfDPersonDocuments2" minOccurs="0"/>
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
    "personDocumentsGet2Result"
})
@XmlRootElement(name = "PersonDocumentsGet2Response")
public class PersonDocumentsGet2Response {

    @XmlElement(name = "PersonDocumentsGet2Result")
    protected ArrayOfDPersonDocuments2 personDocumentsGet2Result;

    /**
     * Gets the value of the personDocumentsGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonDocuments2 }
     *     
     */
    public ArrayOfDPersonDocuments2 getPersonDocumentsGet2Result() {
        return personDocumentsGet2Result;
    }

    /**
     * Sets the value of the personDocumentsGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonDocuments2 }
     *     
     */
    public void setPersonDocumentsGet2Result(ArrayOfDPersonDocuments2 value) {
        this.personDocumentsGet2Result = value;
    }

}
