
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
 *         &lt;element name="UniversityCertificatesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityCertificates" minOccurs="0"/>
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
    "universityCertificatesGetResult"
})
@XmlRootElement(name = "UniversityCertificatesGetResponse")
public class UniversityCertificatesGetResponse {

    @XmlElement(name = "UniversityCertificatesGetResult")
    protected ArrayOfDUniversityCertificates universityCertificatesGetResult;

    /**
     * Gets the value of the universityCertificatesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityCertificates }
     *     
     */
    public ArrayOfDUniversityCertificates getUniversityCertificatesGetResult() {
        return universityCertificatesGetResult;
    }

    /**
     * Sets the value of the universityCertificatesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityCertificates }
     *     
     */
    public void setUniversityCertificatesGetResult(ArrayOfDUniversityCertificates value) {
        this.universityCertificatesGetResult = value;
    }

}
