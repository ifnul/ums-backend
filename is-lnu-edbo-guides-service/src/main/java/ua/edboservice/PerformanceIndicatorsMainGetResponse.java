
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
 *         &lt;element name="PerformanceIndicatorsMainGetResult" type="{http://edboservice.ua/}ArrayOfDPerformanceIndicatorsMain" minOccurs="0"/>
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
    "performanceIndicatorsMainGetResult"
})
@XmlRootElement(name = "PerformanceIndicatorsMainGetResponse")
public class PerformanceIndicatorsMainGetResponse {

    @XmlElement(name = "PerformanceIndicatorsMainGetResult")
    protected ArrayOfDPerformanceIndicatorsMain performanceIndicatorsMainGetResult;

    /**
     * Gets the value of the performanceIndicatorsMainGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPerformanceIndicatorsMain }
     *     
     */
    public ArrayOfDPerformanceIndicatorsMain getPerformanceIndicatorsMainGetResult() {
        return performanceIndicatorsMainGetResult;
    }

    /**
     * Sets the value of the performanceIndicatorsMainGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPerformanceIndicatorsMain }
     *     
     */
    public void setPerformanceIndicatorsMainGetResult(ArrayOfDPerformanceIndicatorsMain value) {
        this.performanceIndicatorsMainGetResult = value;
    }

}
