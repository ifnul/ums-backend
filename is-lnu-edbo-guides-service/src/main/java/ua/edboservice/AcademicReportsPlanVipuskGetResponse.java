
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
 *         &lt;element name="AcademicReportsPlanVipuskGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicReportsPlanVipusk" minOccurs="0"/>
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
    "academicReportsPlanVipuskGetResult"
})
@XmlRootElement(name = "AcademicReportsPlanVipuskGetResponse")
public class AcademicReportsPlanVipuskGetResponse {

    @XmlElement(name = "AcademicReportsPlanVipuskGetResult")
    protected ArrayOfDAcademicReportsPlanVipusk academicReportsPlanVipuskGetResult;

    /**
     * Gets the value of the academicReportsPlanVipuskGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicReportsPlanVipusk }
     *     
     */
    public ArrayOfDAcademicReportsPlanVipusk getAcademicReportsPlanVipuskGetResult() {
        return academicReportsPlanVipuskGetResult;
    }

    /**
     * Sets the value of the academicReportsPlanVipuskGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicReportsPlanVipusk }
     *     
     */
    public void setAcademicReportsPlanVipuskGetResult(ArrayOfDAcademicReportsPlanVipusk value) {
        this.academicReportsPlanVipuskGetResult = value;
    }

}
