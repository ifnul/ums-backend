
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
 *         &lt;element name="UniversityCertificatesPasswordsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityCertificatesPasswords" minOccurs="0"/>
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
    "universityCertificatesPasswordsGetResult"
})
@XmlRootElement(name = "UniversityCertificatesPasswordsGetResponse")
public class UniversityCertificatesPasswordsGetResponse {

    @XmlElement(name = "UniversityCertificatesPasswordsGetResult")
    protected ArrayOfDUniversityCertificatesPasswords universityCertificatesPasswordsGetResult;

    /**
     * Gets the value of the universityCertificatesPasswordsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityCertificatesPasswords }
     *     
     */
    public ArrayOfDUniversityCertificatesPasswords getUniversityCertificatesPasswordsGetResult() {
        return universityCertificatesPasswordsGetResult;
    }

    /**
     * Sets the value of the universityCertificatesPasswordsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityCertificatesPasswords }
     *     
     */
    public void setUniversityCertificatesPasswordsGetResult(ArrayOfDUniversityCertificatesPasswords value) {
        this.universityCertificatesPasswordsGetResult = value;
    }

}
