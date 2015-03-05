
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
 *         &lt;element name="PersonBlockGetResult" type="{http://edboservice.ua/}ArrayOfDPersonBlock" minOccurs="0"/>
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
    "personBlockGetResult"
})
@XmlRootElement(name = "PersonBlockGetResponse")
public class PersonBlockGetResponse {

    @XmlElement(name = "PersonBlockGetResult")
    protected ArrayOfDPersonBlock personBlockGetResult;

    /**
     * Gets the value of the personBlockGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonBlock }
     *     
     */
    public ArrayOfDPersonBlock getPersonBlockGetResult() {
        return personBlockGetResult;
    }

    /**
     * Sets the value of the personBlockGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonBlock }
     *     
     */
    public void setPersonBlockGetResult(ArrayOfDPersonBlock value) {
        this.personBlockGetResult = value;
    }

}
