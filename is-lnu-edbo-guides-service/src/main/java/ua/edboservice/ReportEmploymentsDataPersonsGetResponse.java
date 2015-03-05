
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
 *         &lt;element name="ReportEmploymentsDataPersonsGetResult" type="{http://edboservice.ua/}ArrayOfDReportEmploymentsDataPersons" minOccurs="0"/>
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
    "reportEmploymentsDataPersonsGetResult"
})
@XmlRootElement(name = "ReportEmploymentsDataPersonsGetResponse")
public class ReportEmploymentsDataPersonsGetResponse {

    @XmlElement(name = "ReportEmploymentsDataPersonsGetResult")
    protected ArrayOfDReportEmploymentsDataPersons reportEmploymentsDataPersonsGetResult;

    /**
     * Gets the value of the reportEmploymentsDataPersonsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDReportEmploymentsDataPersons }
     *     
     */
    public ArrayOfDReportEmploymentsDataPersons getReportEmploymentsDataPersonsGetResult() {
        return reportEmploymentsDataPersonsGetResult;
    }

    /**
     * Sets the value of the reportEmploymentsDataPersonsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDReportEmploymentsDataPersons }
     *     
     */
    public void setReportEmploymentsDataPersonsGetResult(ArrayOfDReportEmploymentsDataPersons value) {
        this.reportEmploymentsDataPersonsGetResult = value;
    }

}
