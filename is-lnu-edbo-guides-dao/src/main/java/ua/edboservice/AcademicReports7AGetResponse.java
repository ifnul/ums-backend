
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
 *         &lt;element name="AcademicReports7AGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicReports7A" minOccurs="0"/>
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
    "academicReports7AGetResult"
})
@XmlRootElement(name = "AcademicReports7AGetResponse")
public class AcademicReports7AGetResponse {

    @XmlElement(name = "AcademicReports7AGetResult")
    protected ArrayOfDAcademicReports7A academicReports7AGetResult;

    /**
     * Gets the value of the academicReports7AGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicReports7A }
     *     
     */
    public ArrayOfDAcademicReports7A getAcademicReports7AGetResult() {
        return academicReports7AGetResult;
    }

    /**
     * Sets the value of the academicReports7AGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicReports7A }
     *     
     */
    public void setAcademicReports7AGetResult(ArrayOfDAcademicReports7A value) {
        this.academicReports7AGetResult = value;
    }

}
