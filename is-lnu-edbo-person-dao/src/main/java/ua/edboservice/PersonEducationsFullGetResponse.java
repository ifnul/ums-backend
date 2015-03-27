
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
 *         &lt;element name="PersonEducationsFullGetResult" type="{http://edboservice.ua/}ArrayOfDPersonEducationsFull" minOccurs="0"/>
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
    "personEducationsFullGetResult"
})
@XmlRootElement(name = "PersonEducationsFullGetResponse")
public class PersonEducationsFullGetResponse {

    @XmlElement(name = "PersonEducationsFullGetResult")
    protected ArrayOfDPersonEducationsFull personEducationsFullGetResult;

    /**
     * Gets the value of the personEducationsFullGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationsFull }
     *     
     */
    public ArrayOfDPersonEducationsFull getPersonEducationsFullGetResult() {
        return personEducationsFullGetResult;
    }

    /**
     * Sets the value of the personEducationsFullGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationsFull }
     *     
     */
    public void setPersonEducationsFullGetResult(ArrayOfDPersonEducationsFull value) {
        this.personEducationsFullGetResult = value;
    }

}
