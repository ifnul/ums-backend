
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
 *         &lt;element name="PersonRequestEnteranceCodesFullGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestEnteranceCodesFull" minOccurs="0"/>
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
    "personRequestEnteranceCodesFullGetResult"
})
@XmlRootElement(name = "PersonRequestEnteranceCodesFullGetResponse")
public class PersonRequestEnteranceCodesFullGetResponse {

    @XmlElement(name = "PersonRequestEnteranceCodesFullGetResult")
    protected ArrayOfDPersonRequestEnteranceCodesFull personRequestEnteranceCodesFullGetResult;

    /**
     * Gets the value of the personRequestEnteranceCodesFullGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestEnteranceCodesFull }
     *     
     */
    public ArrayOfDPersonRequestEnteranceCodesFull getPersonRequestEnteranceCodesFullGetResult() {
        return personRequestEnteranceCodesFullGetResult;
    }

    /**
     * Sets the value of the personRequestEnteranceCodesFullGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestEnteranceCodesFull }
     *     
     */
    public void setPersonRequestEnteranceCodesFullGetResult(ArrayOfDPersonRequestEnteranceCodesFull value) {
        this.personRequestEnteranceCodesFullGetResult = value;
    }

}
