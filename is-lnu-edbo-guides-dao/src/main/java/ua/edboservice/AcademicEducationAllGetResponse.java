
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
 *         &lt;element name="AcademicEducationAllGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicEducationAll" minOccurs="0"/>
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
    "academicEducationAllGetResult"
})
@XmlRootElement(name = "AcademicEducationAllGetResponse")
public class AcademicEducationAllGetResponse {

    @XmlElement(name = "AcademicEducationAllGetResult")
    protected ArrayOfDAcademicEducationAll academicEducationAllGetResult;

    /**
     * Gets the value of the academicEducationAllGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicEducationAll }
     *     
     */
    public ArrayOfDAcademicEducationAll getAcademicEducationAllGetResult() {
        return academicEducationAllGetResult;
    }

    /**
     * Sets the value of the academicEducationAllGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicEducationAll }
     *     
     */
    public void setAcademicEducationAllGetResult(ArrayOfDAcademicEducationAll value) {
        this.academicEducationAllGetResult = value;
    }

}
