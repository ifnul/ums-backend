
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAcademicReportsPlanVipuskData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicReportsPlanVipuskData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicReportsPlanVipuskData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicReportsPlanVipusk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "dAcademicReportsPlanVipuskData", propOrder = {
    "idAcademicReportsPlanVipuskData",
    "idAcademicReportsPlanVipusk",
    "scienceSpecialityCode",
    "scienceSpecialityClasifierCode",
    "scienceSpecialityName",
    "zVidrivom",
    "bezVidriva"
})
public class DAcademicReportsPlanVipuskData {

    @XmlElement(name = "Id_AcademicReportsPlanVipuskData")
    protected int idAcademicReportsPlanVipuskData;
    @XmlElement(name = "Id_AcademicReportsPlanVipusk")
    protected int idAcademicReportsPlanVipusk;
    @XmlElement(name = "ScienceSpecialityCode")
    protected String scienceSpecialityCode;
    @XmlElement(name = "ScienceSpecialityClasifierCode")
    protected String scienceSpecialityClasifierCode;
    @XmlElement(name = "ScienceSpecialityName")
    protected String scienceSpecialityName;
    @XmlElement(name = "ZVidrivom")
    protected int zVidrivom;
    @XmlElement(name = "BezVidriva")
    protected int bezVidriva;

    /**
     * Gets the value of the idAcademicReportsPlanVipuskData property.
     * 
     */
    public int getIdAcademicReportsPlanVipuskData() {
        return idAcademicReportsPlanVipuskData;
    }

    /**
     * Sets the value of the idAcademicReportsPlanVipuskData property.
     * 
     */
    public void setIdAcademicReportsPlanVipuskData(int value) {
        this.idAcademicReportsPlanVipuskData = value;
    }

    /**
     * Gets the value of the idAcademicReportsPlanVipusk property.
     * 
     */
    public int getIdAcademicReportsPlanVipusk() {
        return idAcademicReportsPlanVipusk;
    }

    /**
     * Sets the value of the idAcademicReportsPlanVipusk property.
     * 
     */
    public void setIdAcademicReportsPlanVipusk(int value) {
        this.idAcademicReportsPlanVipusk = value;
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
