
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
 *         &lt;element name="ReportEmploymentsChildGetResult" type="{http://edboservice.ua/}ArrayOfDReportEmploymentsChild" minOccurs="0"/>
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
    "reportEmploymentsChildGetResult"
})
@XmlRootElement(name = "ReportEmploymentsChildGetResponse")
public class ReportEmploymentsChildGetResponse {

    @XmlElement(name = "ReportEmploymentsChildGetResult")
    protected ArrayOfDReportEmploymentsChild reportEmploymentsChildGetResult;

    /**
     * Gets the value of the reportEmploymentsChildGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDReportEmploymentsChild }
     *     
     */
    public ArrayOfDReportEmploymentsChild getReportEmploymentsChildGetResult() {
        return reportEmploymentsChildGetResult;
    }

    /**
     * Sets the value of the reportEmploymentsChildGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDReportEmploymentsChild }
     *     
     */
    public void setReportEmploymentsChildGetResult(ArrayOfDReportEmploymentsChild value) {
        this.reportEmploymentsChildGetResult = value;
    }

}
