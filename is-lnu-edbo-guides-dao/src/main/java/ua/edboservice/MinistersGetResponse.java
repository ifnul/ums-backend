
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
 *         &lt;element name="MinistersGetResult" type="{http://edboservice.ua/}ArrayOfDMinisters" minOccurs="0"/>
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
    "ministersGetResult"
})
@XmlRootElement(name = "MinistersGetResponse")
public class MinistersGetResponse {

    @XmlElement(name = "MinistersGetResult")
    protected ArrayOfDMinisters ministersGetResult;

    /**
     * Gets the value of the ministersGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDMinisters }
     *     
     */
    public ArrayOfDMinisters getMinistersGetResult() {
        return ministersGetResult;
    }

    /**
     * Sets the value of the ministersGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDMinisters }
     *     
     */
    public void setMinistersGetResult(ArrayOfDMinisters value) {
        this.ministersGetResult = value;
    }

}
