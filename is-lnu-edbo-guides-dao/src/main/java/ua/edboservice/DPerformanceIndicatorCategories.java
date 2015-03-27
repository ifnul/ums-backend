
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPerformanceIndicatorCategories complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPerformanceIndicatorCategories">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PerformanceIndicatorCategory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PerformanceIndicatorCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerformanceIndicatorCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPerformanceIndicatorCategories", propOrder = {
    "idPerformanceIndicatorCategory",
    "performanceIndicatorCategoryName",
    "performanceIndicatorCategoryCode"
})
public class DPerformanceIndicatorCategories {

    @XmlElement(name = "Id_PerformanceIndicatorCategory")
    protected int idPerformanceIndicatorCategory;
    @XmlElement(name = "PerformanceIndicatorCategoryName")
    protected String performanceIndicatorCategoryName;
    @XmlElement(name = "PerformanceIndicatorCategoryCode")
    protected String performanceIndicatorCategoryCode;

    /**
     * Gets the value of the idPerformanceIndicatorCategory property.
     * 
     */
    public int getIdPerformanceIndicatorCategory() {
        return idPerformanceIndicatorCategory;
    }

    /**
     * Sets the value of the idPerformanceIndicatorCategory property.
     * 
     */
    public void setIdPerformanceIndicatorCategory(int value) {
        this.idPerformanceIndicatorCategory = value;
    }

    /**
     * Gets the value of the performanceIndicatorCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformanceIndicatorCategoryName() {
        return performanceIndicatorCategoryName;
    }

    /**
     * Sets the value of the performanceIndicatorCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformanceIndicatorCategoryName(String value) {
        this.performanceIndicatorCategoryName = value;
    }

    /**
     * Gets the value of the performanceIndicatorCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformanceIndicatorCategoryCode() {
        return performanceIndicatorCategoryCode;
    }

    /**
     * Sets the value of the performanceIndicatorCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformanceIndicatorCategoryCode(String value) {
        this.performanceIndicatorCategoryCode = value;
    }

}
