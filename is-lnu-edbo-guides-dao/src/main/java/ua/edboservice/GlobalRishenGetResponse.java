
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
 *         &lt;element name="GlobalRishenGetResult" type="{http://edboservice.ua/}ArrayOfDGlobalRishen" minOccurs="0"/>
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
    "globalRishenGetResult"
})
@XmlRootElement(name = "GlobalRishenGetResponse")
public class GlobalRishenGetResponse {

    @XmlElement(name = "GlobalRishenGetResult")
    protected ArrayOfDGlobalRishen globalRishenGetResult;

    /**
     * Gets the value of the globalRishenGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDGlobalRishen }
     *     
     */
    public ArrayOfDGlobalRishen getGlobalRishenGetResult() {
        return globalRishenGetResult;
    }

    /**
     * Sets the value of the globalRishenGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDGlobalRishen }
     *     
     */
    public void setGlobalRishenGetResult(ArrayOfDGlobalRishen value) {
        this.globalRishenGetResult = value;
    }

}
