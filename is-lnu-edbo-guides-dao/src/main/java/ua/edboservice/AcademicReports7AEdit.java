
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
 *         &lt;element name="Id_AcademicReports7A" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Vart_Zvit_PrevYearDenna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vart_Zvit_PrevYearZaoch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vart_Plan_CurYearDenna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vart_Plan_CurYearZaoch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vart_Prognoz_NextYearDenna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vart_Prognoz_NextYearZaoch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicReports7AData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idAcademicReports7A",
    "year",
    "vartZvitPrevYearDenna",
    "vartZvitPrevYearZaoch",
    "vartPlanCurYearDenna",
    "vartPlanCurYearZaoch",
    "vartPrognozNextYearDenna",
    "vartPrognozNextYearZaoch",
    "academicReports7AData"
})
@XmlRootElement(name = "AcademicReports7AEdit")
public class AcademicReports7AEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_AcademicReports7A")
    protected int idAcademicReports7A;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "Vart_Zvit_PrevYearDenna")
    protected String vartZvitPrevYearDenna;
    @XmlElement(name = "Vart_Zvit_PrevYearZaoch")
    protected String vartZvitPrevYearZaoch;
    @XmlElement(name = "Vart_Plan_CurYearDenna")
    protected String vartPlanCurYearDenna;
    @XmlElement(name = "Vart_Plan_CurYearZaoch")
    protected String vartPlanCurYearZaoch;
    @XmlElement(name = "Vart_Prognoz_NextYearDenna")
    protected String vartPrognozNextYearDenna;
    @XmlElement(name = "Vart_Prognoz_NextYearZaoch")
    protected String vartPrognozNextYearZaoch;
    @XmlElement(name = "AcademicReports7AData")
    protected String academicReports7AData;

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
     * Gets the value of the idAcademicReports7A property.
     * 
     */
    public int getIdAcademicReports7A() {
        return idAcademicReports7A;
    }

    /**
     * Sets the value of the idAcademicReports7A property.
     * 
     */
    public void setIdAcademicReports7A(int value) {
        this.idAcademicReports7A = value;
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
     * Gets the value of the vartZvitPrevYearZaoch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVartZvitPrevYearZaoch() {
        return vartZvitPrevYearZaoch;
    }

    /**
     * Sets the value of the vartZvitPrevYearZaoch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVartZvitPrevYearZaoch(String value) {
        this.vartZvitPrevYearZaoch = value;
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
     * Gets the value of the vartPlanCurYearZaoch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVartPlanCurYearZaoch() {
        return vartPlanCurYearZaoch;
    }

    /**
     * Sets the value of the vartPlanCurYearZaoch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVartPlanCurYearZaoch(String value) {
        this.vartPlanCurYearZaoch = value;
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
     * Gets the value of the vartPrognozNextYearZaoch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVartPrognozNextYearZaoch() {
        return vartPrognozNextYearZaoch;
    }

    /**
     * Sets the value of the vartPrognozNextYearZaoch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVartPrognozNextYearZaoch(String value) {
        this.vartPrognozNextYearZaoch = value;
    }

    /**
     * Gets the value of the academicReports7AData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicReports7AData() {
        return academicReports7AData;
    }

    /**
     * Sets the value of the academicReports7AData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicReports7AData(String value) {
        this.academicReports7AData = value;
    }

}
