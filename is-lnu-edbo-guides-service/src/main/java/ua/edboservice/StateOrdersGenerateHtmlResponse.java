
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
 *         &lt;element name="StateOrdersGenerateHtmlResult" type="{http://edboservice.ua/}ArrayOfDStateOrdersGenerateHtml" minOccurs="0"/>
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
    "stateOrdersGenerateHtmlResult"
})
@XmlRootElement(name = "StateOrdersGenerateHtmlResponse")
public class StateOrdersGenerateHtmlResponse {

    @XmlElement(name = "StateOrdersGenerateHtmlResult")
    protected ArrayOfDStateOrdersGenerateHtml stateOrdersGenerateHtmlResult;

    /**
     * Gets the value of the stateOrdersGenerateHtmlResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDStateOrdersGenerateHtml }
     *     
     */
    public ArrayOfDStateOrdersGenerateHtml getStateOrdersGenerateHtmlResult() {
        return stateOrdersGenerateHtmlResult;
    }

    /**
     * Sets the value of the stateOrdersGenerateHtmlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDStateOrdersGenerateHtml }
     *     
     */
    public void setStateOrdersGenerateHtmlResult(ArrayOfDStateOrdersGenerateHtml value) {
        this.stateOrdersGenerateHtmlResult = value;
    }

}
