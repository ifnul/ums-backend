
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
 *         &lt;element name="AcademicReports8DGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicReports8D" minOccurs="0"/>
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
    "academicReports8DGetResult"
})
@XmlRootElement(name = "AcademicReports8DGetResponse")
public class AcademicReports8DGetResponse {

    @XmlElement(name = "AcademicReports8DGetResult")
    protected ArrayOfDAcademicReports8D academicReports8DGetResult;

    /**
     * Gets the value of the academicReports8DGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicReports8D }
     *     
     */
    public ArrayOfDAcademicReports8D getAcademicReports8DGetResult() {
        return academicReports8DGetResult;
    }

    /**
     * Sets the value of the academicReports8DGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicReports8D }
     *     
     */
    public void setAcademicReports8DGetResult(ArrayOfDAcademicReports8D value) {
        this.academicReports8DGetResult = value;
    }

}
