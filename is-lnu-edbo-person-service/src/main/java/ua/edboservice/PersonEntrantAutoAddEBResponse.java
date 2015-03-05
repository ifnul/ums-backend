
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
 *         &lt;element name="PersonEntrantAutoAddEBResult" type="{http://edboservice.ua/}ArrayOfDPersonAddRet" minOccurs="0"/>
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
    "personEntrantAutoAddEBResult"
})
@XmlRootElement(name = "PersonEntrantAutoAddEBResponse")
public class PersonEntrantAutoAddEBResponse {

    @XmlElement(name = "PersonEntrantAutoAddEBResult")
    protected ArrayOfDPersonAddRet personEntrantAutoAddEBResult;

    /**
     * Gets the value of the personEntrantAutoAddEBResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonAddRet }
     *     
     */
    public ArrayOfDPersonAddRet getPersonEntrantAutoAddEBResult() {
        return personEntrantAutoAddEBResult;
    }

    /**
     * Sets the value of the personEntrantAutoAddEBResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonAddRet }
     *     
     */
    public void setPersonEntrantAutoAddEBResult(ArrayOfDPersonAddRet value) {
        this.personEntrantAutoAddEBResult = value;
    }

}
