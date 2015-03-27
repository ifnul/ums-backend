
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPerformanceIndicatorSubcategories complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPerformanceIndicatorSubcategories">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PerformanceIndicatorSubcategory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PerformanceIndicatorSubcategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerformanceIndicatorSubcategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPerformanceIndicatorSubcategories", propOrder = {
    "idPerformanceIndicatorSubcategory",
    "performanceIndicatorSubcategoryName",
    "performanceIndicatorSubcategoryCode"
})
public class DPerformanceIndicatorSubcategories {

    @XmlElement(name = "Id_PerformanceIndicatorSubcategory")
    protected int idPerformanceIndicatorSubcategory;
    @XmlElement(name = "PerformanceIndicatorSubcategoryName")
    protected String performanceIndicatorSubcategoryName;
    @XmlElement(name = "PerformanceIndicatorSubcategoryCode")
    protected String performanceIndicatorSubcategoryCode;

    /**
     * Gets the value of the idPerformanceIndicatorSubcategory property.
     * 
     */
    public int getIdPerformanceIndicatorSubcategory() {
        return idPerformanceIndicatorSubcategory;
    }

    /**
     * Sets the value of the idPerformanceIndicatorSubcategory property.
     * 
     */
    public void setIdPerformanceIndicatorSubcategory(int value) {
        this.idPerformanceIndicatorSubcategory = value;
    }

    /**
     * Gets the value of the performanceIndicatorSubcategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformanceIndicatorSubcategoryName() {
        return performanceIndicatorSubcategoryName;
    }

    /**
     * Sets the value of the performanceIndicatorSubcategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformanceIndicatorSubcategoryName(String value) {
        this.performanceIndicatorSubcategoryName = value;
    }

    /**
     * Gets the value of the performanceIndicatorSubcategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformanceIndicatorSubcategoryCode() {
        return performanceIndicatorSubcategoryCode;
    }

    /**
     * Sets the value of the performanceIndicatorSubcategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformanceIndicatorSubcategoryCode(String value) {
        this.performanceIndicatorSubcategoryCode = value;
    }

}
