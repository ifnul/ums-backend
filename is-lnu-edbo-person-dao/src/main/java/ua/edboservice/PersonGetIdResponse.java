
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
 *         &lt;element name="PersonGetIdResult" type="{http://edboservice.ua/}ArrayOfDPersonAddRet" minOccurs="0"/>
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
    "personGetIdResult"
})
@XmlRootElement(name = "PersonGetIdResponse")
public class PersonGetIdResponse {

    @XmlElement(name = "PersonGetIdResult")
    protected ArrayOfDPersonAddRet personGetIdResult;

    /**
     * Gets the value of the personGetIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonAddRet }
     *     
     */
    public ArrayOfDPersonAddRet getPersonGetIdResult() {
        return personGetIdResult;
    }

    /**
     * Sets the value of the personGetIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonAddRet }
     *     
     */
    public void setPersonGetIdResult(ArrayOfDPersonAddRet value) {
        this.personGetIdResult = value;
    }

}
