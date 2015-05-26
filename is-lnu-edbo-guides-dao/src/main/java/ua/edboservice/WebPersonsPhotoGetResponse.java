
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
 *         &lt;element name="WebPersonsPhotoGetResult" type="{http://edboservice.ua/}ArrayOfDWebPersonsPhoto" minOccurs="0"/>
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
    "webPersonsPhotoGetResult"
})
@XmlRootElement(name = "WebPersonsPhotoGetResponse")
public class WebPersonsPhotoGetResponse {

    @XmlElement(name = "WebPersonsPhotoGetResult")
    protected ArrayOfDWebPersonsPhoto webPersonsPhotoGetResult;

    /**
     * Gets the value of the webPersonsPhotoGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDWebPersonsPhoto }
     *     
     */
    public ArrayOfDWebPersonsPhoto getWebPersonsPhotoGetResult() {
        return webPersonsPhotoGetResult;
    }

    /**
     * Sets the value of the webPersonsPhotoGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDWebPersonsPhoto }
     *     
     */
    public void setWebPersonsPhotoGetResult(ArrayOfDWebPersonsPhoto value) {
        this.webPersonsPhotoGetResult = value;
    }

}
