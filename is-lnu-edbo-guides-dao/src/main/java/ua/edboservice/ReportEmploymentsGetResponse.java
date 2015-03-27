
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
 *         &lt;element name="ReportEmploymentsGetResult" type="{http://edboservice.ua/}ArrayOfDReportEmployments" minOccurs="0"/>
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
    "reportEmploymentsGetResult"
})
@XmlRootElement(name = "ReportEmploymentsGetResponse")
public class ReportEmploymentsGetResponse {

    @XmlElement(name = "ReportEmploymentsGetResult")
    protected ArrayOfDReportEmployments reportEmploymentsGetResult;

    /**
     * Gets the value of the reportEmploymentsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDReportEmployments }
     *     
     */
    public ArrayOfDReportEmployments getReportEmploymentsGetResult() {
        return reportEmploymentsGetResult;
    }

    /**
     * Sets the value of the reportEmploymentsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDReportEmployments }
     *     
     */
    public void setReportEmploymentsGetResult(ArrayOfDReportEmployments value) {
        this.reportEmploymentsGetResult = value;
    }

}
