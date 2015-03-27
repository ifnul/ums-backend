
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
 *         &lt;element name="WebPersonsEducationGetResult" type="{http://edboservice.ua/}ArrayOfDWebPersonsEducation" minOccurs="0"/>
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
    "webPersonsEducationGetResult"
})
@XmlRootElement(name = "WebPersonsEducationGetResponse")
public class WebPersonsEducationGetResponse {

    @XmlElement(name = "WebPersonsEducationGetResult")
    protected ArrayOfDWebPersonsEducation webPersonsEducationGetResult;

    /**
     * Gets the value of the webPersonsEducationGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDWebPersonsEducation }
     *     
     */
    public ArrayOfDWebPersonsEducation getWebPersonsEducationGetResult() {
        return webPersonsEducationGetResult;
    }

    /**
     * Sets the value of the webPersonsEducationGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDWebPersonsEducation }
     *     
     */
    public void setWebPersonsEducationGetResult(ArrayOfDWebPersonsEducation value) {
        this.webPersonsEducationGetResult = value;
    }

}
