
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
 *         &lt;element name="AcademicCouncilTypeGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicCouncilType" minOccurs="0"/>
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
    "academicCouncilTypeGetResult"
})
@XmlRootElement(name = "AcademicCouncilTypeGetResponse")
public class AcademicCouncilTypeGetResponse {

    @XmlElement(name = "AcademicCouncilTypeGetResult")
    protected ArrayOfDAcademicCouncilType academicCouncilTypeGetResult;

    /**
     * Gets the value of the academicCouncilTypeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicCouncilType }
     *     
     */
    public ArrayOfDAcademicCouncilType getAcademicCouncilTypeGetResult() {
        return academicCouncilTypeGetResult;
    }

    /**
     * Sets the value of the academicCouncilTypeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicCouncilType }
     *     
     */
    public void setAcademicCouncilTypeGetResult(ArrayOfDAcademicCouncilType value) {
        this.academicCouncilTypeGetResult = value;
    }

}
