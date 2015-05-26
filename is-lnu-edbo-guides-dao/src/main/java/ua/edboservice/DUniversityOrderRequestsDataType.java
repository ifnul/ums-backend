
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityOrderRequestsDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityOrderRequestsDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityOrderRequestsDataType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityOrderRequestsDataTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityOrderRequestsDataType", propOrder = {
    "idUniversityOrderRequestsDataType",
    "universityOrderRequestsDataTypeName"
})
public class DUniversityOrderRequestsDataType {

    @XmlElement(name = "Id_UniversityOrderRequestsDataType")
    protected int idUniversityOrderRequestsDataType;
    @XmlElement(name = "UniversityOrderRequestsDataTypeName")
    protected String universityOrderRequestsDataTypeName;

    /**
     * Gets the value of the idUniversityOrderRequestsDataType property.
     * 
     */
    public int getIdUniversityOrderRequestsDataType() {
        return idUniversityOrderRequestsDataType;
    }

    /**
     * Sets the value of the idUniversityOrderRequestsDataType property.
     * 
     */
    public void setIdUniversityOrderRequestsDataType(int value) {
        this.idUniversityOrderRequestsDataType = value;
    }

    /**
     * Gets the value of the universityOrderRequestsDataTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityOrderRequestsDataTypeName() {
        return universityOrderRequestsDataTypeName;
    }

    /**
     * Sets the value of the universityOrderRequestsDataTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityOrderRequestsDataTypeName(String value) {
        this.universityOrderRequestsDataTypeName = value;
    }

}
