
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
 *         &lt;element name="PersonDocumentsValuesGet2Result" type="{http://edboservice.ua/}ArrayOfDPersonDocumentsValues2" minOccurs="0"/>
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
    "personDocumentsValuesGet2Result"
})
@XmlRootElement(name = "PersonDocumentsValuesGet2Response")
public class PersonDocumentsValuesGet2Response {

    @XmlElement(name = "PersonDocumentsValuesGet2Result")
    protected ArrayOfDPersonDocumentsValues2 personDocumentsValuesGet2Result;

    /**
     * Gets the value of the personDocumentsValuesGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonDocumentsValues2 }
     *     
     */
    public ArrayOfDPersonDocumentsValues2 getPersonDocumentsValuesGet2Result() {
        return personDocumentsValuesGet2Result;
    }

    /**
     * Sets the value of the personDocumentsValuesGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonDocumentsValues2 }
     *     
     */
    public void setPersonDocumentsValuesGet2Result(ArrayOfDPersonDocumentsValues2 value) {
        this.personDocumentsValuesGet2Result = value;
    }

}
