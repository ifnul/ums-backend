
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
 *         &lt;element name="PersonDocumentsValuesFullGet2Result" type="{http://edboservice.ua/}ArrayOfDPersonDocumentsValuesFull2" minOccurs="0"/>
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
    "personDocumentsValuesFullGet2Result"
})
@XmlRootElement(name = "PersonDocumentsValuesFullGet2Response")
public class PersonDocumentsValuesFullGet2Response {

    @XmlElement(name = "PersonDocumentsValuesFullGet2Result")
    protected ArrayOfDPersonDocumentsValuesFull2 personDocumentsValuesFullGet2Result;

    /**
     * Gets the value of the personDocumentsValuesFullGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonDocumentsValuesFull2 }
     *     
     */
    public ArrayOfDPersonDocumentsValuesFull2 getPersonDocumentsValuesFullGet2Result() {
        return personDocumentsValuesFullGet2Result;
    }

    /**
     * Sets the value of the personDocumentsValuesFullGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonDocumentsValuesFull2 }
     *     
     */
    public void setPersonDocumentsValuesFullGet2Result(ArrayOfDPersonDocumentsValuesFull2 value) {
        this.personDocumentsValuesFullGet2Result = value;
    }

}
