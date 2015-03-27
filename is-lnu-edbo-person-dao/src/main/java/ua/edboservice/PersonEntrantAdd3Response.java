
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
 *         &lt;element name="PersonEntrantAdd3Result" type="{http://edboservice.ua/}ArrayOfDPersonAddRet" minOccurs="0"/>
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
    "personEntrantAdd3Result"
})
@XmlRootElement(name = "PersonEntrantAdd3Response")
public class PersonEntrantAdd3Response {

    @XmlElement(name = "PersonEntrantAdd3Result")
    protected ArrayOfDPersonAddRet personEntrantAdd3Result;

    /**
     * Gets the value of the personEntrantAdd3Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonAddRet }
     *     
     */
    public ArrayOfDPersonAddRet getPersonEntrantAdd3Result() {
        return personEntrantAdd3Result;
    }

    /**
     * Sets the value of the personEntrantAdd3Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonAddRet }
     *     
     */
    public void setPersonEntrantAdd3Result(ArrayOfDPersonAddRet value) {
        this.personEntrantAdd3Result = value;
    }

}
