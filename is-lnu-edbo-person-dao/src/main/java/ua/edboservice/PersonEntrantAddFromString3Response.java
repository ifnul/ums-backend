
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
 *         &lt;element name="PersonEntrantAddFromString3Result" type="{http://edboservice.ua/}ArrayOfDPersonAddRet" minOccurs="0"/>
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
    "personEntrantAddFromString3Result"
})
@XmlRootElement(name = "PersonEntrantAddFromString3Response")
public class PersonEntrantAddFromString3Response {

    @XmlElement(name = "PersonEntrantAddFromString3Result")
    protected ArrayOfDPersonAddRet personEntrantAddFromString3Result;

    /**
     * Gets the value of the personEntrantAddFromString3Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonAddRet }
     *     
     */
    public ArrayOfDPersonAddRet getPersonEntrantAddFromString3Result() {
        return personEntrantAddFromString3Result;
    }

    /**
     * Sets the value of the personEntrantAddFromString3Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonAddRet }
     *     
     */
    public void setPersonEntrantAddFromString3Result(ArrayOfDPersonAddRet value) {
        this.personEntrantAddFromString3Result = value;
    }

}
