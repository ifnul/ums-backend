
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
 *         &lt;element name="AcademicReportsPlanPriyomDelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "academicReportsPlanPriyomDelResult"
})
@XmlRootElement(name = "AcademicReportsPlanPriyomDelResponse")
public class AcademicReportsPlanPriyomDelResponse {

    @XmlElement(name = "AcademicReportsPlanPriyomDelResult")
    protected int academicReportsPlanPriyomDelResult;

    /**
     * Gets the value of the academicReportsPlanPriyomDelResult property.
     * 
     */
    public int getAcademicReportsPlanPriyomDelResult() {
        return academicReportsPlanPriyomDelResult;
    }

    /**
     * Sets the value of the academicReportsPlanPriyomDelResult property.
     * 
     */
    public void setAcademicReportsPlanPriyomDelResult(int value) {
        this.academicReportsPlanPriyomDelResult = value;
    }

}
