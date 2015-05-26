
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dEducationalCyclesPatternDisciplines complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dEducationalCyclesPatternDisciplines">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_EducationalCyclesPatternDiscipline" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCyclesPattern" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversitiesDisciplines" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCyclesPatternDisciplinesGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationalCyclesPatternDisciplineDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EducationalCyclesPatternDisciplinesGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitiesDisciplinesFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitiesDisciplinesSmallName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitiesDisciplinesFullNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitiesDisciplinesSmallNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversitiesDisciplinesCategory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitiesDisciplinesCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YearBegin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="YearEnd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ECSTCredit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Id_EducationalCyclesDisciplinesTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationalCyclesDisciplinesTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dEducationalCyclesPatternDisciplines", propOrder = {
    "idEducationalCyclesPatternDiscipline",
    "idEducationalCyclesPattern",
    "idUniversitiesDisciplines",
    "idEducationalCyclesPatternDisciplinesGroup",
    "educationalCyclesPatternDisciplineDateLastChange",
    "educationalCyclesPatternDisciplinesGroupName",
    "universitiesDisciplinesFullName",
    "universitiesDisciplinesSmallName",
    "universitiesDisciplinesFullNameEn",
    "universitiesDisciplinesSmallNameEn",
    "idUniversitiesDisciplinesCategory",
    "universitiesDisciplinesCategoryName",
    "yearBegin",
    "yearEnd",
    "ecstCredit",
    "idEducationalCyclesDisciplinesTypes",
    "educationalCyclesDisciplinesTypeName"
})
public class DEducationalCyclesPatternDisciplines {

    @XmlElement(name = "Id_EducationalCyclesPatternDiscipline")
    protected int idEducationalCyclesPatternDiscipline;
    @XmlElement(name = "Id_EducationalCyclesPattern")
    protected int idEducationalCyclesPattern;
    @XmlElement(name = "Id_UniversitiesDisciplines")
    protected int idUniversitiesDisciplines;
    @XmlElement(name = "Id_EducationalCyclesPatternDisciplinesGroup")
    protected int idEducationalCyclesPatternDisciplinesGroup;
    @XmlElement(name = "EducationalCyclesPatternDisciplineDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar educationalCyclesPatternDisciplineDateLastChange;
    @XmlElement(name = "EducationalCyclesPatternDisciplinesGroupName")
    protected String educationalCyclesPatternDisciplinesGroupName;
    @XmlElement(name = "UniversitiesDisciplinesFullName")
    protected String universitiesDisciplinesFullName;
    @XmlElement(name = "UniversitiesDisciplinesSmallName")
    protected String universitiesDisciplinesSmallName;
    @XmlElement(name = "UniversitiesDisciplinesFullNameEn")
    protected String universitiesDisciplinesFullNameEn;
    @XmlElement(name = "UniversitiesDisciplinesSmallNameEn")
    protected String universitiesDisciplinesSmallNameEn;
    @XmlElement(name = "Id_UniversitiesDisciplinesCategory")
    protected int idUniversitiesDisciplinesCategory;
    @XmlElement(name = "UniversitiesDisciplinesCategoryName")
    protected String universitiesDisciplinesCategoryName;
    @XmlElement(name = "YearBegin")
    protected int yearBegin;
    @XmlElement(name = "YearEnd")
    protected int yearEnd;
    @XmlElement(name = "ECSTCredit", required = true)
    protected BigDecimal ecstCredit;
    @XmlElement(name = "Id_EducationalCyclesDisciplinesTypes")
    protected int idEducationalCyclesDisciplinesTypes;
    @XmlElement(name = "EducationalCyclesDisciplinesTypeName")
    protected String educationalCyclesDisciplinesTypeName;

    /**
     * Gets the value of the idEducationalCyclesPatternDiscipline property.
     * 
     */
    public int getIdEducationalCyclesPatternDiscipline() {
        return idEducationalCyclesPatternDiscipline;
    }

    /**
     * Sets the value of the idEducationalCyclesPatternDiscipline property.
     * 
     */
    public void setIdEducationalCyclesPatternDiscipline(int value) {
        this.idEducationalCyclesPatternDiscipline = value;
    }

    /**
     * Gets the value of the idEducationalCyclesPattern property.
     * 
     */
    public int getIdEducationalCyclesPattern() {
        return idEducationalCyclesPattern;
    }

    /**
     * Sets the value of the idEducationalCyclesPattern property.
     * 
     */
    public void setIdEducationalCyclesPattern(int value) {
        this.idEducationalCyclesPattern = value;
    }

    /**
     * Gets the value of the idUniversitiesDisciplines property.
     * 
     */
    public int getIdUniversitiesDisciplines() {
        return idUniversitiesDisciplines;
    }

    /**
     * Sets the value of the idUniversitiesDisciplines property.
     * 
     */
    public void setIdUniversitiesDisciplines(int value) {
        this.idUniversitiesDisciplines = value;
    }

    /**
     * Gets the value of the idEducationalCyclesPatternDisciplinesGroup property.
     * 
     */
    public int getIdEducationalCyclesPatternDisciplinesGroup() {
        return idEducationalCyclesPatternDisciplinesGroup;
    }

    /**
     * Sets the value of the idEducationalCyclesPatternDisciplinesGroup property.
     * 
     */
    public void setIdEducationalCyclesPatternDisciplinesGroup(int value) {
        this.idEducationalCyclesPatternDisciplinesGroup = value;
    }

    /**
     * Gets the value of the educationalCyclesPatternDisciplineDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEducationalCyclesPatternDisciplineDateLastChange() {
        return educationalCyclesPatternDisciplineDateLastChange;
    }

    /**
     * Sets the value of the educationalCyclesPatternDisciplineDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEducationalCyclesPatternDisciplineDateLastChange(XMLGregorianCalendar value) {
        this.educationalCyclesPatternDisciplineDateLastChange = value;
    }

    /**
     * Gets the value of the educationalCyclesPatternDisciplinesGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesPatternDisciplinesGroupName() {
        return educationalCyclesPatternDisciplinesGroupName;
    }

    /**
     * Sets the value of the educationalCyclesPatternDisciplinesGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesPatternDisciplinesGroupName(String value) {
        this.educationalCyclesPatternDisciplinesGroupName = value;
    }

    /**
     * Gets the value of the universitiesDisciplinesFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesDisciplinesFullName() {
        return universitiesDisciplinesFullName;
    }

    /**
     * Sets the value of the universitiesDisciplinesFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesDisciplinesFullName(String value) {
        this.universitiesDisciplinesFullName = value;
    }

    /**
     * Gets the value of the universitiesDisciplinesSmallName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesDisciplinesSmallName() {
        return universitiesDisciplinesSmallName;
    }

    /**
     * Sets the value of the universitiesDisciplinesSmallName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesDisciplinesSmallName(String value) {
        this.universitiesDisciplinesSmallName = value;
    }

    /**
     * Gets the value of the universitiesDisciplinesFullNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesDisciplinesFullNameEn() {
        return universitiesDisciplinesFullNameEn;
    }

    /**
     * Sets the value of the universitiesDisciplinesFullNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesDisciplinesFullNameEn(String value) {
        this.universitiesDisciplinesFullNameEn = value;
    }

    /**
     * Gets the value of the universitiesDisciplinesSmallNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesDisciplinesSmallNameEn() {
        return universitiesDisciplinesSmallNameEn;
    }

    /**
     * Sets the value of the universitiesDisciplinesSmallNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesDisciplinesSmallNameEn(String value) {
        this.universitiesDisciplinesSmallNameEn = value;
    }

    /**
     * Gets the value of the idUniversitiesDisciplinesCategory property.
     * 
     */
    public int getIdUniversitiesDisciplinesCategory() {
        return idUniversitiesDisciplinesCategory;
    }

    /**
     * Sets the value of the idUniversitiesDisciplinesCategory property.
     * 
     */
    public void setIdUniversitiesDisciplinesCategory(int value) {
        this.idUniversitiesDisciplinesCategory = value;
    }

    /**
     * Gets the value of the universitiesDisciplinesCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesDisciplinesCategoryName() {
        return universitiesDisciplinesCategoryName;
    }

    /**
     * Sets the value of the universitiesDisciplinesCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesDisciplinesCategoryName(String value) {
        this.universitiesDisciplinesCategoryName = value;
    }

    /**
     * Gets the value of the yearBegin property.
     * 
     */
    public int getYearBegin() {
        return yearBegin;
    }

    /**
     * Sets the value of the yearBegin property.
     * 
     */
    public void setYearBegin(int value) {
        this.yearBegin = value;
    }

    /**
     * Gets the value of the yearEnd property.
     * 
     */
    public int getYearEnd() {
        return yearEnd;
    }

    /**
     * Sets the value of the yearEnd property.
     * 
     */
    public void setYearEnd(int value) {
        this.yearEnd = value;
    }

    /**
     * Gets the value of the ecstCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getECSTCredit() {
        return ecstCredit;
    }

    /**
     * Sets the value of the ecstCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setECSTCredit(BigDecimal value) {
        this.ecstCredit = value;
    }

    /**
     * Gets the value of the idEducationalCyclesDisciplinesTypes property.
     * 
     */
    public int getIdEducationalCyclesDisciplinesTypes() {
        return idEducationalCyclesDisciplinesTypes;
    }

    /**
     * Sets the value of the idEducationalCyclesDisciplinesTypes property.
     * 
     */
    public void setIdEducationalCyclesDisciplinesTypes(int value) {
        this.idEducationalCyclesDisciplinesTypes = value;
    }

    /**
     * Gets the value of the educationalCyclesDisciplinesTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesDisciplinesTypeName() {
        return educationalCyclesDisciplinesTypeName;
    }

    /**
     * Sets the value of the educationalCyclesDisciplinesTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesDisciplinesTypeName(String value) {
        this.educationalCyclesDisciplinesTypeName = value;
    }

}
