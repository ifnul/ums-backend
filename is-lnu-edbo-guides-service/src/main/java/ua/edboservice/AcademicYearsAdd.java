
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
 *         &lt;element name="SessionGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicYearName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicYearDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicYearDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicYearDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicYearDatelLastChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "sessionGUID",
    "academicYearName",
    "academicYearDescription",
    "academicYearDateBegin",
    "academicYearDateEnd",
    "academicYearDatelLastChange",
    "academicYearIsActive"
})
@XmlRootElement(name = "AcademicYearsAdd")
public class AcademicYearsAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "AcademicYearName")
    protected String academicYearName;
    @XmlElement(name = "AcademicYearDescription")
    protected String academicYearDescription;
    @XmlElement(name = "AcademicYearDateBegin")
    protected String academicYearDateBegin;
    @XmlElement(name = "AcademicYearDateEnd")
    protected String academicYearDateEnd;
    @XmlElement(name = "AcademicYearDatelLastChange")
    protected String academicYearDatelLastChange;
    @XmlElement(name = "AcademicYearIsActive")
    protected int academicYearIsActive;

    /**
     * Gets the value of the sessionGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionGUID() {
        return sessionGUID;
    }

    /**
     * Sets the value of the sessionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionGUID(String value) {
        this.sessionGUID = value;
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
     *     {@link String }
     *     
     */
    public String getAcademicYearDateBegin() {
        return academicYearDateBegin;
    }

    /**
     * Sets the value of the academicYearDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicYearDateBegin(String value) {
        this.academicYearDateBegin = value;
    }

    /**
     * Gets the value of the academicYearDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicYearDateEnd() {
        return academicYearDateEnd;
    }

    /**
     * Sets the value of the academicYearDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicYearDateEnd(String value) {
        this.academicYearDateEnd = value;
    }

    /**
     * Gets the value of the academicYearDatelLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicYearDatelLastChange() {
        return academicYearDatelLastChange;
    }

    /**
     * Sets the value of the academicYearDatelLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicYearDatelLastChange(String value) {
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
