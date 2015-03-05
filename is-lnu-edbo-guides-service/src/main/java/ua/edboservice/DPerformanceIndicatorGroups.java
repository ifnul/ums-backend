
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPerformanceIndicatorGroups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPerformanceIndicatorGroups">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PerformanceIndicatorGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PerformanceIndicatorGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPerformanceIndicatorGroups", propOrder = {
    "idPerformanceIndicatorGroup",
    "performanceIndicatorGroupName"
})
public class DPerformanceIndicatorGroups {

    @XmlElement(name = "Id_PerformanceIndicatorGroup")
    protected int idPerformanceIndicatorGroup;
    @XmlElement(name = "PerformanceIndicatorGroupName")
    protected String performanceIndicatorGroupName;

    /**
     * Gets the value of the idPerformanceIndicatorGroup property.
     * 
     */
    public int getIdPerformanceIndicatorGroup() {
        return idPerformanceIndicatorGroup;
    }

    /**
     * Sets the value of the idPerformanceIndicatorGroup property.
     * 
     */
    public void setIdPerformanceIndicatorGroup(int value) {
        this.idPerformanceIndicatorGroup = value;
    }

    /**
     * Gets the value of the performanceIndicatorGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformanceIndicatorGroupName() {
        return performanceIndicatorGroupName;
    }

    /**
     * Sets the value of the performanceIndicatorGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformanceIndicatorGroupName(String value) {
        this.performanceIndicatorGroupName = value;
    }

}
