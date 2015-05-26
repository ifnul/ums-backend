
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
 *         &lt;element name="AcademicReportsPlanPriyomDataGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicReportsPlanPriyomData" minOccurs="0"/>
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
    "academicReportsPlanPriyomDataGetResult"
})
@XmlRootElement(name = "AcademicReportsPlanPriyomDataGetResponse")
public class AcademicReportsPlanPriyomDataGetResponse {

    @XmlElement(name = "AcademicReportsPlanPriyomDataGetResult")
    protected ArrayOfDAcademicReportsPlanPriyomData academicReportsPlanPriyomDataGetResult;

    /**
     * Gets the value of the academicReportsPlanPriyomDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicReportsPlanPriyomData }
     *     
     */
    public ArrayOfDAcademicReportsPlanPriyomData getAcademicReportsPlanPriyomDataGetResult() {
        return academicReportsPlanPriyomDataGetResult;
    }

    /**
     * Sets the value of the academicReportsPlanPriyomDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicReportsPlanPriyomData }
     *     
     */
    public void setAcademicReportsPlanPriyomDataGetResult(ArrayOfDAcademicReportsPlanPriyomData value) {
        this.academicReportsPlanPriyomDataGetResult = value;
    }

}
