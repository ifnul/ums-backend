
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
 *         &lt;element name="SpecDirectionsGet2Result" type="{http://edboservice.ua/}ArrayOfDSpecDirections2" minOccurs="0"/>
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
    "specDirectionsGet2Result"
})
@XmlRootElement(name = "SpecDirectionsGet2Response")
public class SpecDirectionsGet2Response {

    @XmlElement(name = "SpecDirectionsGet2Result")
    protected ArrayOfDSpecDirections2 specDirectionsGet2Result;

    /**
     * Gets the value of the specDirectionsGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDSpecDirections2 }
     *     
     */
    public ArrayOfDSpecDirections2 getSpecDirectionsGet2Result() {
        return specDirectionsGet2Result;
    }

    /**
     * Sets the value of the specDirectionsGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDSpecDirections2 }
     *     
     */
    public void setSpecDirectionsGet2Result(ArrayOfDSpecDirections2 value) {
        this.specDirectionsGet2Result = value;
    }

}
