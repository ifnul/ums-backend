
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
 *         &lt;element name="Id_UniversityCertificates" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityCertificatesImageScanBase64String" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idUniversityCertificates",
    "universityCertificatesImageScanBase64String"
})
@XmlRootElement(name = "UniversityCertificatesScanChange")
public class UniversityCertificatesScanChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_UniversityCertificates")
    protected int idUniversityCertificates;
    @XmlElement(name = "UniversityCertificatesImageScanBase64String")
    protected String universityCertificatesImageScanBase64String;

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
     * Gets the value of the idUniversityCertificates property.
     * 
     */
    public int getIdUniversityCertificates() {
        return idUniversityCertificates;
    }

    /**
     * Sets the value of the idUniversityCertificates property.
     * 
     */
    public void setIdUniversityCertificates(int value) {
        this.idUniversityCertificates = value;
    }

    /**
     * Gets the value of the universityCertificatesImageScanBase64String property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCertificatesImageScanBase64String() {
        return universityCertificatesImageScanBase64String;
    }

    /**
     * Sets the value of the universityCertificatesImageScanBase64String property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCertificatesImageScanBase64String(String value) {
        this.universityCertificatesImageScanBase64String = value;
    }

}
