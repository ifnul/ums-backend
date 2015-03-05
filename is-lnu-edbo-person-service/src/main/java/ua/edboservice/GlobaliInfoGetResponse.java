
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
 *         &lt;element name="GlobaliInfoGetResult" type="{http://edboservice.ua/}ArrayOfDGloabalInfo" minOccurs="0"/>
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
    "globaliInfoGetResult"
})
@XmlRootElement(name = "GlobaliInfoGetResponse")
public class GlobaliInfoGetResponse {

    @XmlElement(name = "GlobaliInfoGetResult")
    protected ArrayOfDGloabalInfo globaliInfoGetResult;

    /**
     * Gets the value of the globaliInfoGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDGloabalInfo }
     *     
     */
    public ArrayOfDGloabalInfo getGlobaliInfoGetResult() {
        return globaliInfoGetResult;
    }

    /**
     * Sets the value of the globaliInfoGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDGloabalInfo }
     *     
     */
    public void setGlobaliInfoGetResult(ArrayOfDGloabalInfo value) {
        this.globaliInfoGetResult = value;
    }

}
