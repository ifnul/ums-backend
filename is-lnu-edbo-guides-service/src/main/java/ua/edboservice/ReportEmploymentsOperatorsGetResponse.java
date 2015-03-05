
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
 *         &lt;element name="ReportEmploymentsOperatorsGetResult" type="{http://edboservice.ua/}ArrayOfDReportEmploymentsOperators" minOccurs="0"/>
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
    "reportEmploymentsOperatorsGetResult"
})
@XmlRootElement(name = "ReportEmploymentsOperatorsGetResponse")
public class ReportEmploymentsOperatorsGetResponse {

    @XmlElement(name = "ReportEmploymentsOperatorsGetResult")
    protected ArrayOfDReportEmploymentsOperators reportEmploymentsOperatorsGetResult;

    /**
     * Gets the value of the reportEmploymentsOperatorsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDReportEmploymentsOperators }
     *     
     */
    public ArrayOfDReportEmploymentsOperators getReportEmploymentsOperatorsGetResult() {
        return reportEmploymentsOperatorsGetResult;
    }

    /**
     * Sets the value of the reportEmploymentsOperatorsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDReportEmploymentsOperators }
     *     
     */
    public void setReportEmploymentsOperatorsGetResult(ArrayOfDReportEmploymentsOperators value) {
        this.reportEmploymentsOperatorsGetResult = value;
    }

}
