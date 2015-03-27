
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
 *         &lt;element name="WebPersonsTrusteeGetResult" type="{http://edboservice.ua/}ArrayOfDWebPersonsTrustee" minOccurs="0"/>
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
    "webPersonsTrusteeGetResult"
})
@XmlRootElement(name = "WebPersonsTrusteeGetResponse")
public class WebPersonsTrusteeGetResponse {

    @XmlElement(name = "WebPersonsTrusteeGetResult")
    protected ArrayOfDWebPersonsTrustee webPersonsTrusteeGetResult;

    /**
     * Gets the value of the webPersonsTrusteeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDWebPersonsTrustee }
     *     
     */
    public ArrayOfDWebPersonsTrustee getWebPersonsTrusteeGetResult() {
        return webPersonsTrusteeGetResult;
    }

    /**
     * Sets the value of the webPersonsTrusteeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDWebPersonsTrustee }
     *     
     */
    public void setWebPersonsTrusteeGetResult(ArrayOfDWebPersonsTrustee value) {
        this.webPersonsTrusteeGetResult = value;
    }

}
