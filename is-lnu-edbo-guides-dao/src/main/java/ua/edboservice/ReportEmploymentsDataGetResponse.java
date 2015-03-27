
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
 *         &lt;element name="ReportEmploymentsDataGetResult" type="{http://edboservice.ua/}ArrayOfDReportEmploymentsData" minOccurs="0"/>
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
    "reportEmploymentsDataGetResult"
})
@XmlRootElement(name = "ReportEmploymentsDataGetResponse")
public class ReportEmploymentsDataGetResponse {

    @XmlElement(name = "ReportEmploymentsDataGetResult")
    protected ArrayOfDReportEmploymentsData reportEmploymentsDataGetResult;

    /**
     * Gets the value of the reportEmploymentsDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDReportEmploymentsData }
     *     
     */
    public ArrayOfDReportEmploymentsData getReportEmploymentsDataGetResult() {
        return reportEmploymentsDataGetResult;
    }

    /**
     * Sets the value of the reportEmploymentsDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDReportEmploymentsData }
     *     
     */
    public void setReportEmploymentsDataGetResult(ArrayOfDReportEmploymentsData value) {
        this.reportEmploymentsDataGetResult = value;
    }

}
