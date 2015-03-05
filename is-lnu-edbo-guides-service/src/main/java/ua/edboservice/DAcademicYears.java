
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dAcademicYears complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicYears">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicYearName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicYearDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicYearDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AcademicYearDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AcademicYearDatelLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AcademicYearIsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicYears", propOrder = {
    "idAcademicYear",
    "academicYearName",
    "academicYearDescription",
    "academicYearDateBegin",
    "academicYearDateEnd",
    "academicYearDatelLastChange",
    "academicYearIsActive"
})
public class DAcademicYears {

    @XmlElement(name = "Id_AcademicYear")
    protected int idAcademicYear;
    @XmlElement(name = "AcademicYearName")
    protected String academicYearName;
    @XmlElement(name = "AcademicYearDescription")
    protected String academicYearDescription;
    @XmlElement(name = "AcademicYearDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar academicYearDateBegin;
    @XmlElement(name = "AcademicYearDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar academicYearDateEnd;
    @XmlElement(name = "AcademicYearDatelLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar academicYearDatelLastChange;
    @XmlElement(name = "AcademicYearIsActive")
    protected int academicYearIsActive;

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
     * Gets the value of the academicYearDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicYearDescription() {
        return academicYearDescription;
    }

    /**
     * Sets the value of the academicYearDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicYearDescription(String value) {
        this.academicYearDescription = value;
    }

    /**
     * Gets the value of the academicYearDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicYearDateBegin() {
        return academicYearDateBegin;
    }

    /**
     * Sets the value of the academicYearDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicYearDateBegin(XMLGregorianCalendar value) {
        this.academicYearDateBegin = value;
    }

    /**
     * Gets the value of the academicYearDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicYearDateEnd() {
        return academicYearDateEnd;
    }

    /**
     * Sets the value of the academicYearDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicYearDateEnd(XMLGregorianCalendar value) {
        this.academicYearDateEnd = value;
    }

    /**
     * Gets the value of the academicYearDatelLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicYearDatelLastChange() {
        return academicYearDatelLastChange;
    }

    /**
     * Sets the value of the academicYearDatelLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicYearDatelLastChange(XMLGregorianCalendar value) {
        this.academicYearDatelLastChange = value;
    }

    /**
     * Gets the value of the academicYearIsActive property.
     * 
     */
    public int getAcademicYearIsActive() {
        return academicYearIsActive;
    }

    /**
     * Sets the value of the academicYearIsActive property.
     * 
     */
    public void setAcademicYearIsActive(int value) {
        this.academicYearIsActive = value;
    }

}
