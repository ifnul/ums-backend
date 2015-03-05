
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityLicensesRegNumbers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityLicensesRegNumbers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityLicensesRegNumbers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityLicense" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityLicensesRegNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityLicensesRegNumbers", propOrder = {
    "idUniversityLicensesRegNumbers",
    "idUniversityLicense",
    "universityLicensesRegNumber"
})
public class DUniversityLicensesRegNumbers {

    @XmlElement(name = "Id_UniversityLicensesRegNumbers")
    protected int idUniversityLicensesRegNumbers;
    @XmlElement(name = "Id_UniversityLicense")
    protected int idUniversityLicense;
    @XmlElement(name = "UniversityLicensesRegNumber")
    protected String universityLicensesRegNumber;

    /**
     * Gets the value of the idUniversityLicensesRegNumbers property.
     * 
     */
    public int getIdUniversityLicensesRegNumbers() {
        return idUniversityLicensesRegNumbers;
    }

    /**
     * Sets the value of the idUniversityLicensesRegNumbers property.
     * 
     */
    public void setIdUniversityLicensesRegNumbers(int value) {
        this.idUniversityLicensesRegNumbers = value;
    }

    /**
     * Gets the value of the idUniversityLicense property.
     * 
     */
    public int getIdUniversityLicense() {
        return idUniversityLicense;
    }

    /**
     * Sets the value of the idUniversityLicense property.
     * 
     */
    public void setIdUniversityLicense(int value) {
        this.idUniversityLicense = value;
    }

    /**
     * Gets the value of the universityLicensesRegNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicensesRegNumber() {
        return universityLicensesRegNumber;
    }

    /**
     * Sets the value of the universityLicensesRegNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicensesRegNumber(String value) {
        this.universityLicensesRegNumber = value;
    }

}
