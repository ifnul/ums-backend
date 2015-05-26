
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
 *         &lt;element name="AcademicReportsPlanPriyomEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "academicReportsPlanPriyomEditResult"
})
@XmlRootElement(name = "AcademicReportsPlanPriyomEditResponse")
public class AcademicReportsPlanPriyomEditResponse {

    @XmlElement(name = "AcademicReportsPlanPriyomEditResult")
    protected int academicReportsPlanPriyomEditResult;

    /**
     * Gets the value of the academicReportsPlanPriyomEditResult property.
     * 
     */
    public int getAcademicReportsPlanPriyomEditResult() {
        return academicReportsPlanPriyomEditResult;
    }

    /**
     * Sets the value of the academicReportsPlanPriyomEditResult property.
     * 
     */
    public void setAcademicReportsPlanPriyomEditResult(int value) {
        this.academicReportsPlanPriyomEditResult = value;
    }

}
