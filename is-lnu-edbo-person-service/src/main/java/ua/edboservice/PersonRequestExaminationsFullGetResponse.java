
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
 *         &lt;element name="PersonRequestExaminationsFullGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestExaminationsFull" minOccurs="0"/>
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
    "personRequestExaminationsFullGetResult"
})
@XmlRootElement(name = "PersonRequestExaminationsFullGetResponse")
public class PersonRequestExaminationsFullGetResponse {

    @XmlElement(name = "PersonRequestExaminationsFullGetResult")
    protected ArrayOfDPersonRequestExaminationsFull personRequestExaminationsFullGetResult;

    /**
     * Gets the value of the personRequestExaminationsFullGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestExaminationsFull }
     *     
     */
    public ArrayOfDPersonRequestExaminationsFull getPersonRequestExaminationsFullGetResult() {
        return personRequestExaminationsFullGetResult;
    }

    /**
     * Sets the value of the personRequestExaminationsFullGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestExaminationsFull }
     *     
     */
    public void setPersonRequestExaminationsFullGetResult(ArrayOfDPersonRequestExaminationsFull value) {
        this.personRequestExaminationsFullGetResult = value;
    }

}
