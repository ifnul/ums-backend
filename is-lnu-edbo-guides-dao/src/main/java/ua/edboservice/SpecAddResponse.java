
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
 *         &lt;element name="SpecAddResult" type="{http://edboservice.ua/}ArrayOfDSpecAddRet" minOccurs="0"/>
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
    "specAddResult"
})
@XmlRootElement(name = "SpecAddResponse")
public class SpecAddResponse {

    @XmlElement(name = "SpecAddResult")
    protected ArrayOfDSpecAddRet specAddResult;

    /**
     * Gets the value of the specAddResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDSpecAddRet }
     *     
     */
    public ArrayOfDSpecAddRet getSpecAddResult() {
        return specAddResult;
    }

    /**
     * Sets the value of the specAddResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDSpecAddRet }
     *     
     */
    public void setSpecAddResult(ArrayOfDSpecAddRet value) {
        this.specAddResult = value;
    }

}
