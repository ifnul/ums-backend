
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
 *         &lt;element name="AcademicCouncilPersonTypeGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicCouncilPersonType" minOccurs="0"/>
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
    "academicCouncilPersonTypeGetResult"
})
@XmlRootElement(name = "AcademicCouncilPersonTypeGetResponse")
public class AcademicCouncilPersonTypeGetResponse {

    @XmlElement(name = "AcademicCouncilPersonTypeGetResult")
    protected ArrayOfDAcademicCouncilPersonType academicCouncilPersonTypeGetResult;

    /**
     * Gets the value of the academicCouncilPersonTypeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicCouncilPersonType }
     *     
     */
    public ArrayOfDAcademicCouncilPersonType getAcademicCouncilPersonTypeGetResult() {
        return academicCouncilPersonTypeGetResult;
    }

    /**
     * Sets the value of the academicCouncilPersonTypeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicCouncilPersonType }
     *     
     */
    public void setAcademicCouncilPersonTypeGetResult(ArrayOfDAcademicCouncilPersonType value) {
        this.academicCouncilPersonTypeGetResult = value;
    }

}
