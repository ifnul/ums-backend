
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAcademicReportsFactPriyomData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicReportsFactPriyomData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicReportsFactPriyomData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicReportsFactPriyom" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "dAcademicReportsFactPriyomData", propOrder = {
    "idAcademicReportsFactPriyomData",
    "idAcademicReportsFactPriyom",
    "scienceSpecialityCode",
    "scienceSpecialityClasifierCode",
    "scienceSpecialityName",
    "zVidrivom",
    "bezVidriva"
})
public class DAcademicReportsFactPriyomData {

    @XmlElement(name = "Id_AcademicReportsFactPriyomData")
    protected int idAcademicReportsFactPriyomData;
    @XmlElement(name = "Id_AcademicReportsFactPriyom")
    protected int idAcademicReportsFactPriyom;
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
     * Gets the value of the idAcademicReportsFactPriyomData property.
     * 
     */
    public int getIdAcademicReportsFactPriyomData() {
        return idAcademicReportsFactPriyomData;
    }

    /**
     * Sets the value of the idAcademicReportsFactPriyomData property.
     * 
     */
    public void setIdAcademicReportsFactPriyomData(int value) {
        this.idAcademicReportsFactPriyomData = value;
    }

    /**
     * Gets the value of the idAcademicReportsFactPriyom property.
     * 
     */
    public int getIdAcademicReportsFactPriyom() {
        return idAcademicReportsFactPriyom;
    }

    /**
     * Sets the value of the idAcademicReportsFactPriyom property.
     * 
     */
    public void setIdAcademicReportsFactPriyom(int value) {
        this.idAcademicReportsFactPriyom = value;
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
