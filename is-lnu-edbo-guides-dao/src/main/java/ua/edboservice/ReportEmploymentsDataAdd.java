
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
    "f10"
})
@XmlRootElement(name = "ReportEmploymentsDataAdd")
public class ReportEmploymentsDataAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
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

}
