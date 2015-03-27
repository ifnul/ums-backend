
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
 *         &lt;element name="PersonAcademicRankScanGetResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "personAcademicRankScanGetResult"
})
@XmlRootElement(name = "PersonAcademicRankScanGetResponse")
public class PersonAcademicRankScanGetResponse {

    @XmlElement(name = "PersonAcademicRankScanGetResult")
    protected String personAcademicRankScanGetResult;

    /**
     * Gets the value of the personAcademicRankScanGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonAcademicRankScanGetResult() {
        return personAcademicRankScanGetResult;
    }

    /**
     * Sets the value of the personAcademicRankScanGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonAcademicRankScanGetResult(String value) {
        this.personAcademicRankScanGetResult = value;
    }

}
