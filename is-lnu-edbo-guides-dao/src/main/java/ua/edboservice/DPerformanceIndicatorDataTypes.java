
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPerformanceIndicatorDataTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPerformanceIndicatorDataTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PerformanceIndicatorDataType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PerformanceIndicatorCategory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PerformanceIndicatorSubcategory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PerformanceIndicatorGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PerformanceIndicatorValueDimensions" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PerformanceIndicatorDataTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerformanceIndicatorDataTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerformanceIndicatorDataTypeClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerformanceIndicatorCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerformanceIndicatorCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerformanceIndicatorSubcategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerformanceIndicatorSubcategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerformanceIndicatorGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "dPerformanceIndicatorDataTypes", propOrder = {
    "idPerformanceIndicatorDataType",
    "idPerformanceIndicatorCategory",
    "idPerformanceIndicatorSubcategory",
    "idPerformanceIndicatorGroup",
    "idPerformanceIndicatorValueDimensions",
    "performanceIndicatorDataTypeCode",
    "performanceIndicatorDataTypeName",
    "performanceIndicatorDataTypeClasifierCode",
    "performanceIndicatorCategoryCode",
    "performanceIndicatorCategoryName",
    "performanceIndicatorSubcategoryCode",
    "performanceIndicatorSubcategoryName",
    "performanceIndicatorGroupName",
    "performanceIndicatorValueDimensionsName"
})
public class DPerformanceIndicatorDataTypes {

    @XmlElement(name = "Id_PerformanceIndicatorDataType")
    protected int idPerformanceIndicatorDataType;
    @XmlElement(name = "Id_PerformanceIndicatorCategory")
    protected int idPerformanceIndicatorCategory;
    @XmlElement(name = "Id_PerformanceIndicatorSubcategory")
    protected int idPerformanceIndicatorSubcategory;
    @XmlElement(name = "Id_PerformanceIndicatorGroup")
    protected int idPerformanceIndicatorGroup;
    @XmlElement(name = "Id_PerformanceIndicatorValueDimensions")
    protected int idPerformanceIndicatorValueDimensions;
    @XmlElement(name = "PerformanceIndicatorDataTypeCode")
    protected String performanceIndicatorDataTypeCode;
    @XmlElement(name = "PerformanceIndicatorDataTypeName")
    protected String performanceIndicatorDataTypeName;
    @XmlElement(name = "PerformanceIndicatorDataTypeClasifierCode")
    protected String performanceIndicatorDataTypeClasifierCode;
    @XmlElement(name = "PerformanceIndicatorCategoryCode")
    protected String performanceIndicatorCategoryCode;
    @XmlElement(name = "PerformanceIndicatorCategoryName")
    protected String performanceIndicatorCategoryName;
    @XmlElement(name = "PerformanceIndicatorSubcategoryCode")
    protected String performanceIndicatorSubcategoryCode;
    @XmlElement(name = "PerformanceIndicatorSubcategoryName")
    protected String performanceIndicatorSubcategoryName;
    @XmlElement(name = "PerformanceIndicatorGroupName")
    protected String performanceIndicatorGroupName;
    @XmlElement(name = "PerformanceIndicatorValueDimensionsName")
    protected String performanceIndicatorValueDimensionsName;

    /**
     * Gets the value of the idPerformanceIndicatorDataType property.
     * 
     */
    public int getIdPerformanceIndicatorDataType() {
        return idPerformanceIndicatorDataType;
    }

    /**
     * Sets the value of the idPerformanceIndicatorDataType property.
     * 
     */
    public void setIdPerformanceIndicatorDataType(int value) {
        this.idPerformanceIndicatorDataType = value;
    }

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
     * Gets the value of the performanceIndicatorDataTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformanceIndicatorDataTypeCode() {
        return performanceIndicatorDataTypeCode;
    }

    /**
     * Sets the value of the performanceIndicatorDataTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformanceIndicatorDataTypeCode(String value) {
        this.performanceIndicatorDataTypeCode = value;
    }

    /**
     * Gets the value of the performanceIndicatorDataTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformanceIndicatorDataTypeName() {
        return performanceIndicatorDataTypeName;
    }

    /**
     * Sets the value of the performanceIndicatorDataTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformanceIndicatorDataTypeName(String value) {
        this.performanceIndicatorDataTypeName = value;
    }

    /**
     * Gets the value of the performanceIndicatorDataTypeClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformanceIndicatorDataTypeClasifierCode() {
        return performanceIndicatorDataTypeClasifierCode;
    }

    /**
     * Sets the value of the performanceIndicatorDataTypeClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformanceIndicatorDataTypeClasifierCode(String value) {
        this.performanceIndicatorDataTypeClasifierCode = value;
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
