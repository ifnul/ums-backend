
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
 *         &lt;element name="PersonRequestEnteranceCodesGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestEnteranceCodes" minOccurs="0"/>
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
    "personRequestEnteranceCodesGetResult"
})
@XmlRootElement(name = "PersonRequestEnteranceCodesGetResponse")
public class PersonRequestEnteranceCodesGetResponse {

    @XmlElement(name = "PersonRequestEnteranceCodesGetResult")
    protected ArrayOfDPersonRequestEnteranceCodes personRequestEnteranceCodesGetResult;

    /**
     * Gets the value of the personRequestEnteranceCodesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestEnteranceCodes }
     *     
     */
    public ArrayOfDPersonRequestEnteranceCodes getPersonRequestEnteranceCodesGetResult() {
        return personRequestEnteranceCodesGetResult;
    }

    /**
     * Sets the value of the personRequestEnteranceCodesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestEnteranceCodes }
     *     
     */
    public void setPersonRequestEnteranceCodesGetResult(ArrayOfDPersonRequestEnteranceCodes value) {
        this.personRequestEnteranceCodesGetResult = value;
    }

}
