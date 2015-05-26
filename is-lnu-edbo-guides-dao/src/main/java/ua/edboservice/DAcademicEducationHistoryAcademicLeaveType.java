
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAcademicEducationHistoryAcademicLeaveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicEducationHistoryAcademicLeaveType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicEducationHistoryAcademicLeaveType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicEducationHistoryAcademicLeaveTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicEducationHistoryAcademicLeaveType", propOrder = {
    "idAcademicEducationHistoryAcademicLeaveType",
    "academicEducationHistoryAcademicLeaveTypeName"
})
public class DAcademicEducationHistoryAcademicLeaveType {

    @XmlElement(name = "Id_AcademicEducationHistoryAcademicLeaveType")
    protected int idAcademicEducationHistoryAcademicLeaveType;
    @XmlElement(name = "AcademicEducationHistoryAcademicLeaveTypeName")
    protected String academicEducationHistoryAcademicLeaveTypeName;

    /**
     * Gets the value of the idAcademicEducationHistoryAcademicLeaveType property.
     * 
     */
    public int getIdAcademicEducationHistoryAcademicLeaveType() {
        return idAcademicEducationHistoryAcademicLeaveType;
    }

    /**
     * Sets the value of the idAcademicEducationHistoryAcademicLeaveType property.
     * 
     */
    public void setIdAcademicEducationHistoryAcademicLeaveType(int value) {
        this.idAcademicEducationHistoryAcademicLeaveType = value;
    }

    /**
     * Gets the value of the academicEducationHistoryAcademicLeaveTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationHistoryAcademicLeaveTypeName() {
        return academicEducationHistoryAcademicLeaveTypeName;
    }

    /**
     * Sets the value of the academicEducationHistoryAcademicLeaveTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationHistoryAcademicLeaveTypeName(String value) {
        this.academicEducationHistoryAcademicLeaveTypeName = value;
    }

}
