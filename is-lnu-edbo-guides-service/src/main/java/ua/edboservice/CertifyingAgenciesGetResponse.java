
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
 *         &lt;element name="CertifyingAgenciesGetResult" type="{http://edboservice.ua/}ArrayOfDCertifyingAgencies" minOccurs="0"/>
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
    "certifyingAgenciesGetResult"
})
@XmlRootElement(name = "CertifyingAgenciesGetResponse")
public class CertifyingAgenciesGetResponse {

    @XmlElement(name = "CertifyingAgenciesGetResult")
    protected ArrayOfDCertifyingAgencies certifyingAgenciesGetResult;

    /**
     * Gets the value of the certifyingAgenciesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDCertifyingAgencies }
     *     
     */
    public ArrayOfDCertifyingAgencies getCertifyingAgenciesGetResult() {
        return certifyingAgenciesGetResult;
    }

    /**
     * Sets the value of the certifyingAgenciesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDCertifyingAgencies }
     *     
     */
    public void setCertifyingAgenciesGetResult(ArrayOfDCertifyingAgencies value) {
        this.certifyingAgenciesGetResult = value;
    }

}
