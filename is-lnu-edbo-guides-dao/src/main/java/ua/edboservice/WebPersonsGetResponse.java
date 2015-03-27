
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
 *         &lt;element name="WebPersonsGetResult" type="{http://edboservice.ua/}ArrayOfDWebPersons" minOccurs="0"/>
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
    "webPersonsGetResult"
})
@XmlRootElement(name = "WebPersonsGetResponse")
public class WebPersonsGetResponse {

    @XmlElement(name = "WebPersonsGetResult")
    protected ArrayOfDWebPersons webPersonsGetResult;

    /**
     * Gets the value of the webPersonsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDWebPersons }
     *     
     */
    public ArrayOfDWebPersons getWebPersonsGetResult() {
        return webPersonsGetResult;
    }

    /**
     * Sets the value of the webPersonsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDWebPersons }
     *     
     */
    public void setWebPersonsGetResult(ArrayOfDWebPersons value) {
        this.webPersonsGetResult = value;
    }

}
