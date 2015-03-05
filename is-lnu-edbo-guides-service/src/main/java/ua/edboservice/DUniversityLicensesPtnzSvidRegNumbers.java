
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityLicensesPtnzSvidRegNumbers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityLicensesPtnzSvidRegNumbers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityLicensesPtnzSvidRegNumbers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityLicensePtnzSvid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityLicensesPtnzSvidRegNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityLicensesPtnzSvidRegNumbers", propOrder = {
    "idUniversityLicensesPtnzSvidRegNumbers",
    "idUniversityLicensePtnzSvid",
    "universityLicensesPtnzSvidRegNumbers"
})
public class DUniversityLicensesPtnzSvidRegNumbers {

    @XmlElement(name = "Id_UniversityLicensesPtnzSvidRegNumbers")
    protected int idUniversityLicensesPtnzSvidRegNumbers;
    @XmlElement(name = "Id_UniversityLicensePtnzSvid")
    protected int idUniversityLicensePtnzSvid;
    @XmlElement(name = "UniversityLicensesPtnzSvidRegNumbers")
    protected String universityLicensesPtnzSvidRegNumbers;

    /**
     * Gets the value of the idUniversityLicensesPtnzSvidRegNumbers property.
     * 
     */
    public int getIdUniversityLicensesPtnzSvidRegNumbers() {
        return idUniversityLicensesPtnzSvidRegNumbers;
    }

    /**
     * Sets the value of the idUniversityLicensesPtnzSvidRegNumbers property.
     * 
     */
    public void setIdUniversityLicensesPtnzSvidRegNumbers(int value) {
        this.idUniversityLicensesPtnzSvidRegNumbers = value;
    }

    /**
     * Gets the value of the idUniversityLicensePtnzSvid property.
     * 
     */
    public int getIdUniversityLicensePtnzSvid() {
        return idUniversityLicensePtnzSvid;
    }

    /**
     * Sets the value of the idUniversityLicensePtnzSvid property.
     * 
     */
    public void setIdUniversityLicensePtnzSvid(int value) {
        this.idUniversityLicensePtnzSvid = value;
    }

    /**
     * Gets the value of the universityLicensesPtnzSvidRegNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicensesPtnzSvidRegNumbers() {
        return universityLicensesPtnzSvidRegNumbers;
    }

    /**
     * Sets the value of the universityLicensesPtnzSvidRegNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicensesPtnzSvidRegNumbers(String value) {
        this.universityLicensesPtnzSvidRegNumbers = value;
    }

}
