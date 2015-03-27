
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAcademicReportsPlanPriyomData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicReportsPlanPriyomData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicReportsPlanPriyomData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicReportsPlanPriyom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsOnce" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ZVidrivom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BezVidriva" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicReportsPlanPriyomData", propOrder = {
    "idAcademicReportsPlanPriyomData",
    "idAcademicReportsPlanPriyom",
    "scienceSpecialityCode",
    "scienceSpecialityClasifierCode",
    "scienceSpecialityName",
    "universityKode",
    "idUniversity",
    "universityFullName",
    "isOnce",
    "zVidrivom",
    "bezVidriva"
})
public class DAcademicReportsPlanPriyomData {

    @XmlElement(name = "Id_AcademicReportsPlanPriyomData")
    protected int idAcademicReportsPlanPriyomData;
    @XmlElement(name = "Id_AcademicReportsPlanPriyom")
    protected int idAcademicReportsPlanPriyom;
    @XmlElement(name = "ScienceSpecialityCode")
    protected String scienceSpecialityCode;
    @XmlElement(name = "ScienceSpecialityClasifierCode")
    protected String scienceSpecialityClasifierCode;
    @XmlElement(name = "ScienceSpecialityName")
    protected String scienceSpecialityName;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "IsOnce")
    protected int isOnce;
    @XmlElement(name = "ZVidrivom")
    protected int zVidrivom;
    @XmlElement(name = "BezVidriva")
    protected int bezVidriva;

    /**
     * Gets the value of the idAcademicReportsPlanPriyomData property.
     * 
     */
    public int getIdAcademicReportsPlanPriyomData() {
        return idAcademicReportsPlanPriyomData;
    }

    /**
     * Sets the value of the idAcademicReportsPlanPriyomData property.
     * 
     */
    public void setIdAcademicReportsPlanPriyomData(int value) {
        this.idAcademicReportsPlanPriyomData = value;
    }

    /**
     * Gets the value of the idAcademicReportsPlanPriyom property.
     * 
     */
    public int getIdAcademicReportsPlanPriyom() {
        return idAcademicReportsPlanPriyom;
    }

    /**
     * Sets the value of the idAcademicReportsPlanPriyom property.
     * 
     */
    public void setIdAcademicReportsPlanPriyom(int value) {
        this.idAcademicReportsPlanPriyom = value;
    }

    /**
     * Gets the value of the scienceSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityCode() {
        return scienceSpecialityCode;
    }

    /**
     * Sets the value of the scienceSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityCode(String value) {
        this.scienceSpecialityCode = value;
    }

    /**
     * Gets the value of the scienceSpecialityClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityClasifierCode() {
        return scienceSpecialityClasifierCode;
    }

    /**
     * Sets the value of the scienceSpecialityClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityClasifierCode(String value) {
        this.scienceSpecialityClasifierCode = value;
    }

    /**
     * Gets the value of the scienceSpecialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityName() {
        return scienceSpecialityName;
    }

    /**
     * Sets the value of the scienceSpecialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityName(String value) {
        this.scienceSpecialityName = value;
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
     * Gets the value of the idUniversity property.
     * 
     */
    public int getIdUniversity() {
        return idUniversity;
    }

    /**
     * Sets the value of the idUniversity property.
     * 
     */
    public void setIdUniversity(int value) {
        this.idUniversity = value;
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
     * Gets the value of the isOnce property.
     * 
     */
    public int getIsOnce() {
        return isOnce;
    }

    /**
     * Sets the value of the isOnce property.
     * 
     */
    public void setIsOnce(int value) {
        this.isOnce = value;
    }

    /**
     * Gets the value of the zVidrivom property.
     * 
     */
    public int getZVidrivom() {
        return zVidrivom;
    }

    /**
     * Sets the value of the zVidrivom property.
     * 
     */
    public void setZVidrivom(int value) {
        this.zVidrivom = value;
    }

    /**
     * Gets the value of the bezVidriva property.
     * 
     */
    public int getBezVidriva() {
        return bezVidriva;
    }

    /**
     * Sets the value of the bezVidriva property.
     * 
     */
    public void setBezVidriva(int value) {
        this.bezVidriva = value;
    }

}
