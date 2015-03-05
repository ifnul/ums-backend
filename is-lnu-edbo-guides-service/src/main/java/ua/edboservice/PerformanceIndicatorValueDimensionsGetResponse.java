
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
 *         &lt;element name="PerformanceIndicatorValueDimensionsGetResult" type="{http://edboservice.ua/}ArrayOfDPerformanceIndicatorValueDimensions" minOccurs="0"/>
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
    "performanceIndicatorValueDimensionsGetResult"
})
@XmlRootElement(name = "PerformanceIndicatorValueDimensionsGetResponse")
public class PerformanceIndicatorValueDimensionsGetResponse {

    @XmlElement(name = "PerformanceIndicatorValueDimensionsGetResult")
    protected ArrayOfDPerformanceIndicatorValueDimensions performanceIndicatorValueDimensionsGetResult;

    /**
     * Gets the value of the performanceIndicatorValueDimensionsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPerformanceIndicatorValueDimensions }
     *     
     */
    public ArrayOfDPerformanceIndicatorValueDimensions getPerformanceIndicatorValueDimensionsGetResult() {
        return performanceIndicatorValueDimensionsGetResult;
    }

    /**
     * Sets the value of the performanceIndicatorValueDimensionsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPerformanceIndicatorValueDimensions }
     *     
     */
    public void setPerformanceIndicatorValueDimensionsGetResult(ArrayOfDPerformanceIndicatorValueDimensions value) {
        this.performanceIndicatorValueDimensionsGetResult = value;
    }

}
