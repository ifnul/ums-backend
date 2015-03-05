
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
 *         &lt;element name="PerformanceIndicatorDataTypesGetResult" type="{http://edboservice.ua/}ArrayOfDPerformanceIndicatorDataTypes" minOccurs="0"/>
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
    "performanceIndicatorDataTypesGetResult"
})
@XmlRootElement(name = "PerformanceIndicatorDataTypesGetResponse")
public class PerformanceIndicatorDataTypesGetResponse {

    @XmlElement(name = "PerformanceIndicatorDataTypesGetResult")
    protected ArrayOfDPerformanceIndicatorDataTypes performanceIndicatorDataTypesGetResult;

    /**
     * Gets the value of the performanceIndicatorDataTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPerformanceIndicatorDataTypes }
     *     
     */
    public ArrayOfDPerformanceIndicatorDataTypes getPerformanceIndicatorDataTypesGetResult() {
        return performanceIndicatorDataTypesGetResult;
    }

    /**
     * Sets the value of the performanceIndicatorDataTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPerformanceIndicatorDataTypes }
     *     
     */
    public void setPerformanceIndicatorDataTypesGetResult(ArrayOfDPerformanceIndicatorDataTypes value) {
        this.performanceIndicatorDataTypesGetResult = value;
    }

}
