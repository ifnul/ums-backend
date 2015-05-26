
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
 *         &lt;element name="PerformanceIndicatorGroupsGetResult" type="{http://edboservice.ua/}ArrayOfDPerformanceIndicatorGroups" minOccurs="0"/>
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
    "performanceIndicatorGroupsGetResult"
})
@XmlRootElement(name = "PerformanceIndicatorGroupsGetResponse")
public class PerformanceIndicatorGroupsGetResponse {

    @XmlElement(name = "PerformanceIndicatorGroupsGetResult")
    protected ArrayOfDPerformanceIndicatorGroups performanceIndicatorGroupsGetResult;

    /**
     * Gets the value of the performanceIndicatorGroupsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPerformanceIndicatorGroups }
     *     
     */
    public ArrayOfDPerformanceIndicatorGroups getPerformanceIndicatorGroupsGetResult() {
        return performanceIndicatorGroupsGetResult;
    }

    /**
     * Sets the value of the performanceIndicatorGroupsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPerformanceIndicatorGroups }
     *     
     */
    public void setPerformanceIndicatorGroupsGetResult(ArrayOfDPerformanceIndicatorGroups value) {
        this.performanceIndicatorGroupsGetResult = value;
    }

}
