
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dReportEmploymentsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dReportEmploymentsData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ReportEmploymentsData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ReportEmployment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_QualificationGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecDirectionsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="f5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="f6" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="f7" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="f8" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="f9" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="f10" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReportEmploymentDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="QualificationGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecComplexClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecComplexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f5_e" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dReportEmploymentsData", propOrder = {
    "idReportEmploymentsData",
    "idReportEmployment",
    "idQualificationGroup",
    "specDirectionsCode",
    "specSpecialityCode",
    "f4",
    "f5",
    "f6",
    "f7",
    "f8",
    "f9",
    "f10",
    "reportEmploymentDateLastChange",
    "qualificationGroupName",
    "specComplexClasifierCode",
    "specComplexName",
    "f5E"
})
public class DReportEmploymentsData {

    @XmlElement(name = "Id_ReportEmploymentsData")
    protected int idReportEmploymentsData;
    @XmlElement(name = "Id_ReportEmployment")
    protected int idReportEmployment;
    @XmlElement(name = "Id_QualificationGroup")
    protected int idQualificationGroup;
    @XmlElement(name = "SpecDirectionsCode")
    protected String specDirectionsCode;
    @XmlElement(name = "SpecSpecialityCode")
    protected String specSpecialityCode;
    protected int f4;
    protected int f5;
    protected int f6;
    protected int f7;
    protected int f8;
    protected int f9;
    protected int f10;
    @XmlElement(name = "ReportEmploymentDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportEmploymentDateLastChange;
    @XmlElement(name = "QualificationGroupName")
    protected String qualificationGroupName;
    @XmlElement(name = "SpecComplexClasifierCode")
    protected String specComplexClasifierCode;
    @XmlElement(name = "SpecComplexName")
    protected String specComplexName;
    @XmlElement(name = "f5_e")
    protected int f5E;

    /**
     * Gets the value of the idReportEmploymentsData property.
     * 
     */
    public int getIdReportEmploymentsData() {
        return idReportEmploymentsData;
    }

    /**
     * Sets the value of the idReportEmploymentsData property.
     * 
     */
    public void setIdReportEmploymentsData(int value) {
        this.idReportEmploymentsData = value;
    }

    /**
     * Gets the value of the idReportEmployment property.
     * 
     */
    public int getIdReportEmployment() {
        return idReportEmployment;
    }

    /**
     * Sets the value of the idReportEmployment property.
     * 
     */
    public void setIdReportEmployment(int value) {
        this.idReportEmployment = value;
    }

    /**
     * Gets the value of the idQualificationGroup property.
     * 
     */
    public int getIdQualificationGroup() {
        return idQualificationGroup;
    }

    /**
     * Sets the value of the idQualificationGroup property.
     * 
     */
    public void setIdQualificationGroup(int value) {
        this.idQualificationGroup = value;
    }

    /**
     * Gets the value of the specDirectionsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionsCode() {
        return specDirectionsCode;
    }

    /**
     * Sets the value of the specDirectionsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionsCode(String value) {
        this.specDirectionsCode = value;
    }

    /**
     * Gets the value of the specSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityCode() {
        return specSpecialityCode;
    }

    /**
     * Sets the value of the specSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityCode(String value) {
        this.specSpecialityCode = value;
    }

    /**
     * Gets the value of the f4 property.
     * 
     */
    public int getF4() {
        return f4;
    }

    /**
     * Sets the value of the f4 property.
     * 
     */
    public void setF4(int value) {
        this.f4 = value;
    }

    /**
     * Gets the value of the f5 property.
     * 
     */
    public int getF5() {
        return f5;
    }

    /**
     * Sets the value of the f5 property.
     * 
     */
    public void setF5(int value) {
        this.f5 = value;
    }

    /**
     * Gets the value of the f6 property.
     * 
     */
    public int getF6() {
        return f6;
    }

    /**
     * Sets the value of the f6 property.
     * 
     */
    public void setF6(int value) {
        this.f6 = value;
    }

    /**
     * Gets the value of the f7 property.
     * 
     */
    public int getF7() {
        return f7;
    }

    /**
     * Sets the value of the f7 property.
     * 
     */
    public void setF7(int value) {
        this.f7 = value;
    }

    /**
     * Gets the value of the f8 property.
     * 
     */
    public int getF8() {
        return f8;
    }

    /**
     * Sets the value of the f8 property.
     * 
     */
    public void setF8(int value) {
        this.f8 = value;
    }

    /**
     * Gets the value of the f9 property.
     * 
     */
    public int getF9() {
        return f9;
    }

    /**
     * Sets the value of the f9 property.
     * 
     */
    public void setF9(int value) {
        this.f9 = value;
    }

    /**
     * Gets the value of the f10 property.
     * 
     */
    public int getF10() {
        return f10;
    }

    /**
     * Sets the value of the f10 property.
     * 
     */
    public void setF10(int value) {
        this.f10 = value;
    }

    /**
     * Gets the value of the reportEmploymentDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportEmploymentDateLastChange() {
        return reportEmploymentDateLastChange;
    }

    /**
     * Sets the value of the reportEmploymentDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportEmploymentDateLastChange(XMLGregorianCalendar value) {
        this.reportEmploymentDateLastChange = value;
    }

    /**
     * Gets the value of the qualificationGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationGroupName() {
        return qualificationGroupName;
    }

    /**
     * Sets the value of the qualificationGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationGroupName(String value) {
        this.qualificationGroupName = value;
    }

    /**
     * Gets the value of the specComplexClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecComplexClasifierCode() {
        return specComplexClasifierCode;
    }

    /**
     * Sets the value of the specComplexClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecComplexClasifierCode(String value) {
        this.specComplexClasifierCode = value;
    }

    /**
     * Gets the value of the specComplexName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecComplexName() {
        return specComplexName;
    }

    /**
     * Sets the value of the specComplexName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecComplexName(String value) {
        this.specComplexName = value;
    }

    /**
     * Gets the value of the f5E property.
     * 
     */
    public int getF5E() {
        return f5E;
    }

    /**
     * Sets the value of the f5E property.
     * 
     */
    public void setF5E(int value) {
        this.f5E = value;
    }

}
