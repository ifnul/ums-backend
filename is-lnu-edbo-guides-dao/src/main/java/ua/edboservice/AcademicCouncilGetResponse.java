
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
 *         &lt;element name="AcademicCouncilGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicCouncil" minOccurs="0"/>
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
    "academicCouncilGetResult"
})
@XmlRootElement(name = "AcademicCouncilGetResponse")
public class AcademicCouncilGetResponse {

    @XmlElement(name = "AcademicCouncilGetResult")
    protected ArrayOfDAcademicCouncil academicCouncilGetResult;

    /**
     * Gets the value of the academicCouncilGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicCouncil }
     *     
     */
    public ArrayOfDAcademicCouncil getAcademicCouncilGetResult() {
        return academicCouncilGetResult;
    }

    /**
     * Sets the value of the academicCouncilGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicCouncil }
     *     
     */
    public void setAcademicCouncilGetResult(ArrayOfDAcademicCouncil value) {
        this.academicCouncilGetResult = value;
    }

}
