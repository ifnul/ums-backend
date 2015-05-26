
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
 *         &lt;element name="UniversityCertificatesMaxNumberGetResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityCertificatesMaxNumberGetResult"
})
@XmlRootElement(name = "UniversityCertificatesMaxNumberGetResponse")
public class UniversityCertificatesMaxNumberGetResponse {

    @XmlElement(name = "UniversityCertificatesMaxNumberGetResult")
    protected int universityCertificatesMaxNumberGetResult;

    /**
     * Gets the value of the universityCertificatesMaxNumberGetResult property.
     * 
     */
    public int getUniversityCertificatesMaxNumberGetResult() {
        return universityCertificatesMaxNumberGetResult;
    }

    /**
     * Sets the value of the universityCertificatesMaxNumberGetResult property.
     * 
     */
    public void setUniversityCertificatesMaxNumberGetResult(int value) {
        this.universityCertificatesMaxNumberGetResult = value;
    }

}
