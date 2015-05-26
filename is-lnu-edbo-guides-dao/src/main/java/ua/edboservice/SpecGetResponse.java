
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
 *         &lt;element name="SpecGetResult" type="{http://edboservice.ua/}ArrayOfDSpec" minOccurs="0"/>
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
    "specGetResult"
})
@XmlRootElement(name = "SpecGetResponse")
public class SpecGetResponse {

    @XmlElement(name = "SpecGetResult")
    protected ArrayOfDSpec specGetResult;

    /**
     * Gets the value of the specGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDSpec }
     *     
     */
    public ArrayOfDSpec getSpecGetResult() {
        return specGetResult;
    }

    /**
     * Sets the value of the specGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDSpec }
     *     
     */
    public void setSpecGetResult(ArrayOfDSpec value) {
        this.specGetResult = value;
    }

}
