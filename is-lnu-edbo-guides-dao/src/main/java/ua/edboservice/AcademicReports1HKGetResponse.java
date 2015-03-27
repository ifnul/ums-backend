
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
 *         &lt;element name="AcademicReports1HKGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicReports1HK" minOccurs="0"/>
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
    "academicReports1HKGetResult"
})
@XmlRootElement(name = "AcademicReports1HKGetResponse")
public class AcademicReports1HKGetResponse {

    @XmlElement(name = "AcademicReports1HKGetResult")
    protected ArrayOfDAcademicReports1HK academicReports1HKGetResult;

    /**
     * Gets the value of the academicReports1HKGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicReports1HK }
     *     
     */
    public ArrayOfDAcademicReports1HK getAcademicReports1HKGetResult() {
        return academicReports1HKGetResult;
    }

    /**
     * Sets the value of the academicReports1HKGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicReports1HK }
     *     
     */
    public void setAcademicReports1HKGetResult(ArrayOfDAcademicReports1HK value) {
        this.academicReports1HKGetResult = value;
    }

}
