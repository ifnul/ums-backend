
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
 *         &lt;element name="PersonEntrantAutoAdd2Result" type="{http://edboservice.ua/}ArrayOfDPersonAddRet" minOccurs="0"/>
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
    "personEntrantAutoAdd2Result"
})
@XmlRootElement(name = "PersonEntrantAutoAdd2Response")
public class PersonEntrantAutoAdd2Response {

    @XmlElement(name = "PersonEntrantAutoAdd2Result")
    protected ArrayOfDPersonAddRet personEntrantAutoAdd2Result;

    /**
     * Gets the value of the personEntrantAutoAdd2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonAddRet }
     *     
     */
    public ArrayOfDPersonAddRet getPersonEntrantAutoAdd2Result() {
        return personEntrantAutoAdd2Result;
    }

    /**
     * Sets the value of the personEntrantAutoAdd2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonAddRet }
     *     
     */
    public void setPersonEntrantAutoAdd2Result(ArrayOfDPersonAddRet value) {
        this.personEntrantAutoAdd2Result = value;
    }

}
