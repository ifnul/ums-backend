
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
 *         &lt;element name="AcademicAttestationCaseSatusHistoryTypeGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicAttestationCaseSatusHistoryType" minOccurs="0"/>
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
    "academicAttestationCaseSatusHistoryTypeGetResult"
})
@XmlRootElement(name = "AcademicAttestationCaseSatusHistoryTypeGetResponse")
public class AcademicAttestationCaseSatusHistoryTypeGetResponse {

    @XmlElement(name = "AcademicAttestationCaseSatusHistoryTypeGetResult")
    protected ArrayOfDAcademicAttestationCaseSatusHistoryType academicAttestationCaseSatusHistoryTypeGetResult;

    /**
     * Gets the value of the academicAttestationCaseSatusHistoryTypeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicAttestationCaseSatusHistoryType }
     *     
     */
    public ArrayOfDAcademicAttestationCaseSatusHistoryType getAcademicAttestationCaseSatusHistoryTypeGetResult() {
        return academicAttestationCaseSatusHistoryTypeGetResult;
    }

    /**
     * Sets the value of the academicAttestationCaseSatusHistoryTypeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicAttestationCaseSatusHistoryType }
     *     
     */
    public void setAcademicAttestationCaseSatusHistoryTypeGetResult(ArrayOfDAcademicAttestationCaseSatusHistoryType value) {
        this.academicAttestationCaseSatusHistoryTypeGetResult = value;
    }

}
