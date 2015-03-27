
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
 *         &lt;element name="PersonRequestExaminationsGet2Result" type="{http://edboservice.ua/}ArrayOfDPersonRequestExaminations2" minOccurs="0"/>
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
    "personRequestExaminationsGet2Result"
})
@XmlRootElement(name = "PersonRequestExaminationsGet2Response")
public class PersonRequestExaminationsGet2Response {

    @XmlElement(name = "PersonRequestExaminationsGet2Result")
    protected ArrayOfDPersonRequestExaminations2 personRequestExaminationsGet2Result;

    /**
     * Gets the value of the personRequestExaminationsGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestExaminations2 }
     *     
     */
    public ArrayOfDPersonRequestExaminations2 getPersonRequestExaminationsGet2Result() {
        return personRequestExaminationsGet2Result;
    }

    /**
     * Sets the value of the personRequestExaminationsGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestExaminations2 }
     *     
     */
    public void setPersonRequestExaminationsGet2Result(ArrayOfDPersonRequestExaminations2 value) {
        this.personRequestExaminationsGet2Result = value;
    }

}
