
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
 *         &lt;element name="ReportEmploymentsAutoFillResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "reportEmploymentsAutoFillResult"
})
@XmlRootElement(name = "ReportEmploymentsAutoFillResponse")
public class ReportEmploymentsAutoFillResponse {

    @XmlElement(name = "ReportEmploymentsAutoFillResult")
    protected int reportEmploymentsAutoFillResult;

    /**
     * Gets the value of the reportEmploymentsAutoFillResult property.
     * 
     */
    public int getReportEmploymentsAutoFillResult() {
        return reportEmploymentsAutoFillResult;
    }

    /**
     * Sets the value of the reportEmploymentsAutoFillResult property.
     * 
     */
    public void setReportEmploymentsAutoFillResult(int value) {
        this.reportEmploymentsAutoFillResult = value;
    }

}
