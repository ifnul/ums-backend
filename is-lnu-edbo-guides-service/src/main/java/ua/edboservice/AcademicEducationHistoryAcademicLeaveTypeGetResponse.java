
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
 *         &lt;element name="AcademicEducationHistoryAcademicLeaveTypeGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicEducationHistoryAcademicLeaveType" minOccurs="0"/>
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
    "academicEducationHistoryAcademicLeaveTypeGetResult"
})
@XmlRootElement(name = "AcademicEducationHistoryAcademicLeaveTypeGetResponse")
public class AcademicEducationHistoryAcademicLeaveTypeGetResponse {

    @XmlElement(name = "AcademicEducationHistoryAcademicLeaveTypeGetResult")
    protected ArrayOfDAcademicEducationHistoryAcademicLeaveType academicEducationHistoryAcademicLeaveTypeGetResult;

    /**
     * Gets the value of the academicEducationHistoryAcademicLeaveTypeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicEducationHistoryAcademicLeaveType }
     *     
     */
    public ArrayOfDAcademicEducationHistoryAcademicLeaveType getAcademicEducationHistoryAcademicLeaveTypeGetResult() {
        return academicEducationHistoryAcademicLeaveTypeGetResult;
    }

    /**
     * Sets the value of the academicEducationHistoryAcademicLeaveTypeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicEducationHistoryAcademicLeaveType }
     *     
     */
    public void setAcademicEducationHistoryAcademicLeaveTypeGetResult(ArrayOfDAcademicEducationHistoryAcademicLeaveType value) {
        this.academicEducationHistoryAcademicLeaveTypeGetResult = value;
    }

}
