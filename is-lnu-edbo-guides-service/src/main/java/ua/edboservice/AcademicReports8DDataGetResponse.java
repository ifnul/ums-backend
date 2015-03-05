
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
 *         &lt;element name="AcademicReports8DDataGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicReports8DData" minOccurs="0"/>
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
    "academicReports8DDataGetResult"
})
@XmlRootElement(name = "AcademicReports8DDataGetResponse")
public class AcademicReports8DDataGetResponse {

    @XmlElement(name = "AcademicReports8DDataGetResult")
    protected ArrayOfDAcademicReports8DData academicReports8DDataGetResult;

    /**
     * Gets the value of the academicReports8DDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicReports8DData }
     *     
     */
    public ArrayOfDAcademicReports8DData getAcademicReports8DDataGetResult() {
        return academicReports8DDataGetResult;
    }

    /**
     * Sets the value of the academicReports8DDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicReports8DData }
     *     
     */
    public void setAcademicReports8DDataGetResult(ArrayOfDAcademicReports8DData value) {
        this.academicReports8DDataGetResult = value;
    }

}
