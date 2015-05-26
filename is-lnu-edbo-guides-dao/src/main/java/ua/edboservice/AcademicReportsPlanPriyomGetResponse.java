
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
 *         &lt;element name="AcademicReportsPlanPriyomGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicReportsPlanPriyom" minOccurs="0"/>
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
    "academicReportsPlanPriyomGetResult"
})
@XmlRootElement(name = "AcademicReportsPlanPriyomGetResponse")
public class AcademicReportsPlanPriyomGetResponse {

    @XmlElement(name = "AcademicReportsPlanPriyomGetResult")
    protected ArrayOfDAcademicReportsPlanPriyom academicReportsPlanPriyomGetResult;

    /**
     * Gets the value of the academicReportsPlanPriyomGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicReportsPlanPriyom }
     *     
     */
    public ArrayOfDAcademicReportsPlanPriyom getAcademicReportsPlanPriyomGetResult() {
        return academicReportsPlanPriyomGetResult;
    }

    /**
     * Sets the value of the academicReportsPlanPriyomGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicReportsPlanPriyom }
     *     
     */
    public void setAcademicReportsPlanPriyomGetResult(ArrayOfDAcademicReportsPlanPriyom value) {
        this.academicReportsPlanPriyomGetResult = value;
    }

}
