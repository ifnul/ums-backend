
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
 *         &lt;element name="UniversityCertificatesScanChangeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityCertificatesScanChangeResult"
})
@XmlRootElement(name = "UniversityCertificatesScanChangeResponse")
public class UniversityCertificatesScanChangeResponse {

    @XmlElement(name = "UniversityCertificatesScanChangeResult")
    protected int universityCertificatesScanChangeResult;

    /**
     * Gets the value of the universityCertificatesScanChangeResult property.
     * 
     */
    public int getUniversityCertificatesScanChangeResult() {
        return universityCertificatesScanChangeResult;
    }

    /**
     * Sets the value of the universityCertificatesScanChangeResult property.
     * 
     */
    public void setUniversityCertificatesScanChangeResult(int value) {
        this.universityCertificatesScanChangeResult = value;
    }

}
