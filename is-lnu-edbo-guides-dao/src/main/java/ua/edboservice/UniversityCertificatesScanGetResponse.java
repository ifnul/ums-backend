
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
 *         &lt;element name="UniversityCertificatesScanGetResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "universityCertificatesScanGetResult"
})
@XmlRootElement(name = "UniversityCertificatesScanGetResponse")
public class UniversityCertificatesScanGetResponse {

    @XmlElement(name = "UniversityCertificatesScanGetResult")
    protected String universityCertificatesScanGetResult;

    /**
     * Gets the value of the universityCertificatesScanGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCertificatesScanGetResult() {
        return universityCertificatesScanGetResult;
    }

    /**
     * Sets the value of the universityCertificatesScanGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCertificatesScanGetResult(String value) {
        this.universityCertificatesScanGetResult = value;
    }

}
