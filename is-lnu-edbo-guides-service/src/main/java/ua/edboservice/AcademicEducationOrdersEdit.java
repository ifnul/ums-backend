
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
 *         &lt;element name="Id_AcademicEducationOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicEducationOrdersUniversityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicEducationOrdersUniversityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idAcademicEducationOrders",
    "academicEducationOrdersUniversityDate",
    "academicEducationOrdersUniversityNumber",
    "universityFacultetKode"
})
@XmlRootElement(name = "AcademicEducationOrdersEdit")
public class AcademicEducationOrdersEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_AcademicEducationOrders")
    protected int idAcademicEducationOrders;
    @XmlElement(name = "AcademicEducationOrdersUniversityDate")
    protected String academicEducationOrdersUniversityDate;
    @XmlElement(name = "AcademicEducationOrdersUniversityNumber")
    protected String academicEducationOrdersUniversityNumber;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;

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
     * Gets the value of the idAcademicEducationOrders property.
     * 
     */
    public int getIdAcademicEducationOrders() {
        return idAcademicEducationOrders;
    }

    /**
     * Sets the value of the idAcademicEducationOrders property.
     * 
     */
    public void setIdAcademicEducationOrders(int value) {
        this.idAcademicEducationOrders = value;
    }

    /**
     * Gets the value of the academicEducationOrdersUniversityDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationOrdersUniversityDate() {
        return academicEducationOrdersUniversityDate;
    }

    /**
     * Sets the value of the academicEducationOrdersUniversityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationOrdersUniversityDate(String value) {
        this.academicEducationOrdersUniversityDate = value;
    }

    /**
     * Gets the value of the academicEducationOrdersUniversityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationOrdersUniversityNumber() {
        return academicEducationOrdersUniversityNumber;
    }

    /**
     * Sets the value of the academicEducationOrdersUniversityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationOrdersUniversityNumber(String value) {
        this.academicEducationOrdersUniversityNumber = value;
    }

    /**
     * Gets the value of the universityFacultetKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetKode() {
        return universityFacultetKode;
    }

    /**
     * Sets the value of the universityFacultetKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetKode(String value) {
        this.universityFacultetKode = value;
    }

}
