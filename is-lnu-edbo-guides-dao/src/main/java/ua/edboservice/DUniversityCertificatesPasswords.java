
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityCertificatesPasswords complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityCertificatesPasswords">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniversityCertificatesFilePassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityCertificatesPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityCertificatesPasswords", propOrder = {
    "universityCertificatesFilePassword",
    "universityCertificatesPassword"
})
public class DUniversityCertificatesPasswords {

    @XmlElement(name = "UniversityCertificatesFilePassword")
    protected String universityCertificatesFilePassword;
    @XmlElement(name = "UniversityCertificatesPassword")
    protected String universityCertificatesPassword;

    /**
     * Gets the value of the universityCertificatesFilePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCertificatesFilePassword() {
        return universityCertificatesFilePassword;
    }

    /**
     * Sets the value of the universityCertificatesFilePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCertificatesFilePassword(String value) {
        this.universityCertificatesFilePassword = value;
    }

    /**
     * Gets the value of the universityCertificatesPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCertificatesPassword() {
        return universityCertificatesPassword;
    }

    /**
     * Sets the value of the universityCertificatesPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCertificatesPassword(String value) {
        this.universityCertificatesPassword = value;
    }

}
