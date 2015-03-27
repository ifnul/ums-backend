
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
 *         &lt;element name="PersonEntrantAddResult" type="{http://edboservice.ua/}ArrayOfDPersonAddRet" minOccurs="0"/>
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
    "personEntrantAddResult"
})
@XmlRootElement(name = "PersonEntrantAddResponse")
public class PersonEntrantAddResponse {

    @XmlElement(name = "PersonEntrantAddResult")
    protected ArrayOfDPersonAddRet personEntrantAddResult;

    /**
     * Gets the value of the personEntrantAddResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonAddRet }
     *     
     */
    public ArrayOfDPersonAddRet getPersonEntrantAddResult() {
        return personEntrantAddResult;
    }

    /**
     * Sets the value of the personEntrantAddResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonAddRet }
     *     
     */
    public void setPersonEntrantAddResult(ArrayOfDPersonAddRet value) {
        this.personEntrantAddResult = value;
    }

}
