
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPerformanceIndicators complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPerformanceIndicators">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PerformanceIndicator" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PerformanceIndicatorDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicYearName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PerformanceIndicatorData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PerformanceIndicatorDataValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PerformanceIndicatorDataDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_PerformanceIndicatorDataType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PerformanceIndicatorCategory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PerformanceIndicatorSubcategory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PerformanceIndicatorGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PerformanceIndicatorValueDimensions" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PerformanceIndicatorDataTypeClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerformanceIndicatorDataTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerformanceIndicatorDataTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerformanceIndicatorValueDimensionsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerformanceIndicatorGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerformanceIndicatorSubcategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerformanceIndicatorSubcategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerformanceIndicatorCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerformanceIndicatorCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsVerify" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPerformanceIndicators", propOrder = {
    "idPerformanceIndicator",
    "universityKode",
    "idAcademicYear",
    "performanceIndicatorDateLastChange",
    "universityFullName",
    "universityShortName",
    "academicYearName",
    "idPerformanceIndicatorData",
    "performanceIndicatorDataValue",
    "performanceIndicatorDataDateLastChange",
    "idPerformanceIndicatorDataType",
    "idPerformanceIndicatorCategory",
    "idPerformanceIndicatorSubcategory",
    "idPerformanceIndicatorGroup",
    "idPerformanceIndicatorValueDimensions",
    "performanceIndicatorDataTypeClasifierCode",
    "performanceIndicatorDataTypeCode",
    "performanceIndicatorDataTypeName",
    "performanceIndicatorValueDimensionsName",
    "performanceIndicatorGroupName",
    "performanceIndicatorSubcategoryCode",
    "performanceIndicatorSubcategoryName",
    "performanceIndicatorCategoryName",
    "performanceIndicatorCategoryCode",
    "isVerify"
})
public class DPerformanceIndicators {

    @XmlElement(name = "Id_PerformanceIndicator")
    protected int idPerformanceIndicator;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_AcademicYear")
    protected int idAcademicYear;
    @XmlElement(name = "PerformanceIndicatorDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar performanceIndicatorDateLastChange;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "UniversityShortName")
    protected String universityShortName;
    @XmlElement(name = "AcademicYearName")
    protected String academicYearName;
    @XmlElement(name = "Id_PerformanceIndicatorData")
    protected int idPerformanceIndicatorData;
    @XmlElement(name = "PerformanceIndicatorDataValue", required = true)
    protected BigDecimal performanceIndicatorDataValue;
    @XmlElement(name = "PerformanceIndicatorDataDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar performanceIndicatorDataDateLastChange;
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
    @XmlElement(name = "PerformanceIndicatorDataTypeClasifierCode")
    protected String performanceIndicatorDataTypeClasifierCode;
    @XmlElement(name = "PerformanceIndicatorDataTypeCode")
    protected String performanceIndicatorDataTypeCode;
    @XmlElement(name = "PerformanceIndicatorDataTypeName")
    protected String performanceIndicatorDataTypeName;
    @XmlElement(name = "PerformanceIndicatorValueDimensionsName")
    protected String performanceIndicatorValueDimensionsName;
    @XmlElement(name = "PerformanceIndicatorGroupName")
    protected String performanceIndicatorGroupName;
    @XmlElement(name = "PerformanceIndicatorSubcategoryCode")
    protected String performanceIndicatorSubcategoryCode;
    @XmlElement(name = "PerformanceIndicatorSubcategoryName")
    protected String performanceIndicatorSubcategoryName;
    @XmlElement(name = "PerformanceIndicatorCategoryName")
    protected String performanceIndicatorCategoryName;
    @XmlElement(name = "PerformanceIndicatorCategoryCode")
    protected String performanceIndicatorCategoryCode;
    @XmlElement(name = "IsVerify")
    protected int isVerify;

    /**
     * Gets the value of the idPerformanceIndicator property.
     * 
     */
    public int getIdPerformanceIndicator() {
        return idPerformanceIndicator;
    }

    /**
     * Sets the value of the idPerformanceIndicator property.
     * 
     */
    public void setIdPerformanceIndicator(int value) {
        this.idPerformanceIndicator = value;
    }

    /**
     * Gets the value of the universityKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKode() {
        return universityKode;
    }

    /**
     * Sets the value of the universityKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKode(String value) {
        this.universityKode = value;
    }

    /**
     * Gets the value of the idAcademicYear property.
     * 
     */
    public int getIdAcademicYear() {
        return idAcademicYear;
    }

    /**
     * Sets the value of the idAcademicYear property.
     * 
     */
    public void setIdAcademicYear(int value) {
        this.idAcademicYear = value;
    }

    /**
     * Gets the value of the performanceIndicatorDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPerformanceIndicatorDateLastChange() {
        return performanceIndicatorDateLastChange;
    }

    /**
     * Sets the value of the performanceIndicatorDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPerformanceIndicatorDateLastChange(XMLGregorianCalendar value) {
        this.performanceIndicatorDateLastChange = value;
    }

    /**
     * Gets the value of the universityFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullName() {
        return universityFullName;
    }

    /**
     * Sets the value of the universityFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullName(String value) {
        this.universityFullName = value;
    }

    /**
     * Gets the value of the universityShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityShortName() {
        return universityShortName;
    }

    /**
     * Sets the value of the universityShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityShortName(String value) {
        this.universityShortName = value;
    }

    /**
     * Gets the value of the academicYearName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicYearName() {
        return academicYearName;
    }

    /**
     * Sets the value of the academicYearName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicYearName(String value) {
        this.academicYearName = value;
    }

    /**
     * Gets the value of the idPerformanceIndicatorData property.
     * 
     */
    public int getIdPerformanceIndicatorData() {
        return idPerformanceIndicatorData;
    }

    /**
     * Sets the value of the idPerformanceIndicatorData property.
     * 
     */
    public void setIdPerformanceIndicatorData(int value) {
        this.idPerformanceIndicatorData = value;
    }

    /**
     * Gets the value of the performanceIndicatorDataValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerformanceIndicatorDataValue() {
        return performanceIndicatorDataValue;
    }

    /**
     * Sets the value of the performanceIndicatorDataValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerformanceIndicatorDataValue(BigDecimal value) {
        this.performanceIndicatorDataValue = value;
    }

    /**
     * Gets the value of the performanceIndicatorDataDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPerformanceIndicatorDataDateLastChange() {
        return performanceIndicatorDataDateLastChange;
    }

    /**
     * Sets the value of the performanceIndicatorDataDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPerformanceIndicatorDataDateLastChange(XMLGregorianCalendar value) {
        this.performanceIndicatorDataDateLastChange = value;
    }

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

    /**
     * Gets the value of the isVerify property.
     * 
     */
    public int getIsVerify() {
        return isVerify;
    }

    /**
     * Sets the value of the isVerify property.
     * 
     */
    public void setIsVerify(int value) {
        this.isVerify = value;
    }

}
