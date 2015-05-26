
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
 *         &lt;element name="PerformanceIndicatorsGetResult" type="{http://edboservice.ua/}ArrayOfDPerformanceIndicators" minOccurs="0"/>
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
    "performanceIndicatorsGetResult"
})
@XmlRootElement(name = "PerformanceIndicatorsGetResponse")
public class PerformanceIndicatorsGetResponse {

    @XmlElement(name = "PerformanceIndicatorsGetResult")
    protected ArrayOfDPerformanceIndicators performanceIndicatorsGetResult;

    /**
     * Gets the value of the performanceIndicatorsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPerformanceIndicators }
     *     
     */
    public ArrayOfDPerformanceIndicators getPerformanceIndicatorsGetResult() {
        return performanceIndicatorsGetResult;
    }

    /**
     * Sets the value of the performanceIndicatorsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPerformanceIndicators }
     *     
     */
    public void setPerformanceIndicatorsGetResult(ArrayOfDPerformanceIndicators value) {
        this.performanceIndicatorsGetResult = value;
    }

}
