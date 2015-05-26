
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
 *         &lt;element name="AcademicReports1HKDataGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicReports1HKData" minOccurs="0"/>
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
    "academicReports1HKDataGetResult"
})
@XmlRootElement(name = "AcademicReports1HKDataGetResponse")
public class AcademicReports1HKDataGetResponse {

    @XmlElement(name = "AcademicReports1HKDataGetResult")
    protected ArrayOfDAcademicReports1HKData academicReports1HKDataGetResult;

    /**
     * Gets the value of the academicReports1HKDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicReports1HKData }
     *     
     */
    public ArrayOfDAcademicReports1HKData getAcademicReports1HKDataGetResult() {
        return academicReports1HKDataGetResult;
    }

    /**
     * Sets the value of the academicReports1HKDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicReports1HKData }
     *     
     */
    public void setAcademicReports1HKDataGetResult(ArrayOfDAcademicReports1HKData value) {
        this.academicReports1HKDataGetResult = value;
    }

}
