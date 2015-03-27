
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
 *         &lt;element name="VakAcademicAttestationCaseGetResult" type="{http://edboservice.ua/}ArrayOfDVakAcademicAttestationCase" minOccurs="0"/>
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
    "vakAcademicAttestationCaseGetResult"
})
@XmlRootElement(name = "VakAcademicAttestationCaseGetResponse")
public class VakAcademicAttestationCaseGetResponse {

    @XmlElement(name = "VakAcademicAttestationCaseGetResult")
    protected ArrayOfDVakAcademicAttestationCase vakAcademicAttestationCaseGetResult;

    /**
     * Gets the value of the vakAcademicAttestationCaseGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDVakAcademicAttestationCase }
     *     
     */
    public ArrayOfDVakAcademicAttestationCase getVakAcademicAttestationCaseGetResult() {
        return vakAcademicAttestationCaseGetResult;
    }

    /**
     * Sets the value of the vakAcademicAttestationCaseGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDVakAcademicAttestationCase }
     *     
     */
    public void setVakAcademicAttestationCaseGetResult(ArrayOfDVakAcademicAttestationCase value) {
        this.vakAcademicAttestationCaseGetResult = value;
    }

}
