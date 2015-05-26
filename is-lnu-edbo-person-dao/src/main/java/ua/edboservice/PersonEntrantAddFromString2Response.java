
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
 *         &lt;element name="PersonEntrantAddFromString2Result" type="{http://edboservice.ua/}ArrayOfDPersonAddRet" minOccurs="0"/>
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
    "personEntrantAddFromString2Result"
})
@XmlRootElement(name = "PersonEntrantAddFromString2Response")
public class PersonEntrantAddFromString2Response {

    @XmlElement(name = "PersonEntrantAddFromString2Result")
    protected ArrayOfDPersonAddRet personEntrantAddFromString2Result;

    /**
     * Gets the value of the personEntrantAddFromString2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonAddRet }
     *     
     */
    public ArrayOfDPersonAddRet getPersonEntrantAddFromString2Result() {
        return personEntrantAddFromString2Result;
    }

    /**
     * Sets the value of the personEntrantAddFromString2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonAddRet }
     *     
     */
    public void setPersonEntrantAddFromString2Result(ArrayOfDPersonAddRet value) {
        this.personEntrantAddFromString2Result = value;
    }

}
