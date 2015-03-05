
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPerformanceIndicatorValueDimensions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPerformanceIndicatorValueDimensions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PerformanceIndicatorValueDimensions" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PerformanceIndicatorValueDimensionsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPerformanceIndicatorValueDimensions", propOrder = {
    "idPerformanceIndicatorValueDimensions",
    "performanceIndicatorValueDimensionsName"
})
public class DPerformanceIndicatorValueDimensions {

    @XmlElement(name = "Id_PerformanceIndicatorValueDimensions")
    protected int idPerformanceIndicatorValueDimensions;
    @XmlElement(name = "PerformanceIndicatorValueDimensionsName")
    protected String performanceIndicatorValueDimensionsName;

    /**
     * Gets the value of the idPerformanceIndicatorValueDimensions property.
     * 
     */
    public int getIdPerformanceIndicatorValueDimensions() {
        return idPerformanceIndicatorValueDimensions;
    }

    /**
     * Sets the value of the idPerformanceIndicatorValueDimensions property.
     * 
     */
    public void setIdPerformanceIndicatorValueDimensions(int value) {
        this.idPerformanceIndicatorValueDimensions = value;
    }

    /**
     * Gets the value of the performanceIndicatorValueDimensionsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformanceIndicatorValueDimensionsName() {
        return performanceIndicatorValueDimensionsName;
    }

    /**
     * Sets the value of the performanceIndicatorValueDimensionsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformanceIndicatorValueDimensionsName(String value) {
        this.performanceIndicatorValueDimensionsName = value;
    }

}
