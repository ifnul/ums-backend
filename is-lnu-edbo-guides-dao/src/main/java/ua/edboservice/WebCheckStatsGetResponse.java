
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
 *         &lt;element name="WebCheckStatsGetResult" type="{http://edboservice.ua/}ArrayOfDWebCheckStats" minOccurs="0"/>
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
    "webCheckStatsGetResult"
})
@XmlRootElement(name = "WebCheckStatsGetResponse")
public class WebCheckStatsGetResponse {

    @XmlElement(name = "WebCheckStatsGetResult")
    protected ArrayOfDWebCheckStats webCheckStatsGetResult;

    /**
     * Gets the value of the webCheckStatsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDWebCheckStats }
     *     
     */
    public ArrayOfDWebCheckStats getWebCheckStatsGetResult() {
        return webCheckStatsGetResult;
    }

    /**
     * Sets the value of the webCheckStatsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDWebCheckStats }
     *     
     */
    public void setWebCheckStatsGetResult(ArrayOfDWebCheckStats value) {
        this.webCheckStatsGetResult = value;
    }

}
