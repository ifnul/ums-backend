
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
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Vart_Zvit_PrevYearDenna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vart_Plan_CurYearDenna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vart_Prognoz_NextYearDenna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicReports8DData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "universityKode",
    "year",
    "vartZvitPrevYearDenna",
    "vartPlanCurYearDenna",
    "vartPrognozNextYearDenna",
    "academicReports8DData"
})
@XmlRootElement(name = "AcademicReports8DAdd")
public class AcademicReports8DAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "Vart_Zvit_PrevYearDenna")
    protected String vartZvitPrevYearDenna;
    @XmlElement(name = "Vart_Plan_CurYearDenna")
    protected String vartPlanCurYearDenna;
    @XmlElement(name = "Vart_Prognoz_NextYearDenna")
    protected String vartPrognozNextYearDenna;
    @XmlElement(name = "AcademicReports8DData")
    protected String academicReports8DData;

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
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the vartZvitPrevYearDenna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVartZvitPrevYearDenna() {
        return vartZvitPrevYearDenna;
    }

    /**
     * Sets the value of the vartZvitPrevYearDenna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVartZvitPrevYearDenna(String value) {
        this.vartZvitPrevYearDenna = value;
    }

    /**
     * Gets the value of the vartPlanCurYearDenna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVartPlanCurYearDenna() {
        return vartPlanCurYearDenna;
    }

    /**
     * Sets the value of the vartPlanCurYearDenna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVartPlanCurYearDenna(String value) {
        this.vartPlanCurYearDenna = value;
    }

    /**
     * Gets the value of the vartPrognozNextYearDenna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVartPrognozNextYearDenna() {
        return vartPrognozNextYearDenna;
    }

    /**
     * Sets the value of the vartPrognozNextYearDenna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVartPrognozNextYearDenna(String value) {
        this.vartPrognozNextYearDenna = value;
    }

    /**
     * Gets the value of the academicReports8DData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicReports8DData() {
        return academicReports8DData;
    }

    /**
     * Sets the value of the academicReports8DData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicReports8DData(String value) {
        this.academicReports8DData = value;
    }

}
