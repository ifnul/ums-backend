
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
 *         &lt;element name="SpecIndastriesGet2Result" type="{http://edboservice.ua/}ArrayOfDSpecIndastries2" minOccurs="0"/>
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
    "specIndastriesGet2Result"
})
@XmlRootElement(name = "SpecIndastriesGet2Response")
public class SpecIndastriesGet2Response {

    @XmlElement(name = "SpecIndastriesGet2Result")
    protected ArrayOfDSpecIndastries2 specIndastriesGet2Result;

    /**
     * Gets the value of the specIndastriesGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDSpecIndastries2 }
     *     
     */
    public ArrayOfDSpecIndastries2 getSpecIndastriesGet2Result() {
        return specIndastriesGet2Result;
    }

    /**
     * Sets the value of the specIndastriesGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDSpecIndastries2 }
     *     
     */
    public void setSpecIndastriesGet2Result(ArrayOfDSpecIndastries2 value) {
        this.specIndastriesGet2Result = value;
    }

}
