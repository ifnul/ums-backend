
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
 *         &lt;element name="WebPersonsForeignGetResult" type="{http://edboservice.ua/}ArrayOfDWebPersonsForeign" minOccurs="0"/>
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
    "webPersonsForeignGetResult"
})
@XmlRootElement(name = "WebPersonsForeignGetResponse")
public class WebPersonsForeignGetResponse {

    @XmlElement(name = "WebPersonsForeignGetResult")
    protected ArrayOfDWebPersonsForeign webPersonsForeignGetResult;

    /**
     * Gets the value of the webPersonsForeignGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDWebPersonsForeign }
     *     
     */
    public ArrayOfDWebPersonsForeign getWebPersonsForeignGetResult() {
        return webPersonsForeignGetResult;
    }

    /**
     * Sets the value of the webPersonsForeignGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDWebPersonsForeign }
     *     
     */
    public void setWebPersonsForeignGetResult(ArrayOfDWebPersonsForeign value) {
        this.webPersonsForeignGetResult = value;
    }

}
