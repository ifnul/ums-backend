
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
 *         &lt;element name="ReportEmploymentsMonCheckChangeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "reportEmploymentsMonCheckChangeResult"
})
@XmlRootElement(name = "ReportEmploymentsMonCheckChangeResponse")
public class ReportEmploymentsMonCheckChangeResponse {

    @XmlElement(name = "ReportEmploymentsMonCheckChangeResult")
    protected int reportEmploymentsMonCheckChangeResult;

    /**
     * Gets the value of the reportEmploymentsMonCheckChangeResult property.
     * 
     */
    public int getReportEmploymentsMonCheckChangeResult() {
        return reportEmploymentsMonCheckChangeResult;
    }

    /**
     * Sets the value of the reportEmploymentsMonCheckChangeResult property.
     * 
     */
    public void setReportEmploymentsMonCheckChangeResult(int value) {
        this.reportEmploymentsMonCheckChangeResult = value;
    }

}
