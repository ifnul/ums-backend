
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAcademicLeaveTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicLeaveTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicLeaveType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicLeaveTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicLeaveTypes", propOrder = {
    "idAcademicLeaveType",
    "academicLeaveTypeName"
})
public class DAcademicLeaveTypes {

    @XmlElement(name = "Id_AcademicLeaveType")
    protected int idAcademicLeaveType;
    @XmlElement(name = "AcademicLeaveTypeName")
    protected String academicLeaveTypeName;

    /**
     * Gets the value of the idAcademicLeaveType property.
     * 
     */
    public int getIdAcademicLeaveType() {
        return idAcademicLeaveType;
    }

    /**
     * Sets the value of the idAcademicLeaveType property.
     * 
     */
    public void setIdAcademicLeaveType(int value) {
        this.idAcademicLeaveType = value;
    }

    /**
     * Gets the value of the academicLeaveTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicLeaveTypeName() {
        return academicLeaveTypeName;
    }

    /**
     * Sets the value of the academicLeaveTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicLeaveTypeName(String value) {
        this.academicLeaveTypeName = value;
    }

}
