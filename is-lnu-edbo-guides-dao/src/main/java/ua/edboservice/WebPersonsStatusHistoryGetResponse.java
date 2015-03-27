
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
 *         &lt;element name="WebPersonsStatusHistoryGetResult" type="{http://edboservice.ua/}ArrayOfDWebPersonsStatusHistory" minOccurs="0"/>
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
    "webPersonsStatusHistoryGetResult"
})
@XmlRootElement(name = "WebPersonsStatusHistoryGetResponse")
public class WebPersonsStatusHistoryGetResponse {

    @XmlElement(name = "WebPersonsStatusHistoryGetResult")
    protected ArrayOfDWebPersonsStatusHistory webPersonsStatusHistoryGetResult;

    /**
     * Gets the value of the webPersonsStatusHistoryGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDWebPersonsStatusHistory }
     *     
     */
    public ArrayOfDWebPersonsStatusHistory getWebPersonsStatusHistoryGetResult() {
        return webPersonsStatusHistoryGetResult;
    }

    /**
     * Sets the value of the webPersonsStatusHistoryGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDWebPersonsStatusHistory }
     *     
     */
    public void setWebPersonsStatusHistoryGetResult(ArrayOfDWebPersonsStatusHistory value) {
        this.webPersonsStatusHistoryGetResult = value;
    }

}
