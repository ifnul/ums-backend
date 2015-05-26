
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityOrderRequestsTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityOrderRequestsTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityOrderRequestsType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityOrderRequestsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityOrderRequestsTypes", propOrder = {
    "idUniversityOrderRequestsType",
    "universityOrderRequestsType"
})
public class DUniversityOrderRequestsTypes {

    @XmlElement(name = "Id_UniversityOrderRequestsType")
    protected int idUniversityOrderRequestsType;
    @XmlElement(name = "UniversityOrderRequestsType")
    protected String universityOrderRequestsType;

    /**
     * Gets the value of the idUniversityOrderRequestsType property.
     * 
     */
    public int getIdUniversityOrderRequestsType() {
        return idUniversityOrderRequestsType;
    }

    /**
     * Sets the value of the idUniversityOrderRequestsType property.
     * 
     */
    public void setIdUniversityOrderRequestsType(int value) {
        this.idUniversityOrderRequestsType = value;
    }

    /**
     * Gets the value of the universityOrderRequestsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityOrderRequestsType() {
        return universityOrderRequestsType;
    }

    /**
     * Sets the value of the universityOrderRequestsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityOrderRequestsType(String value) {
        this.universityOrderRequestsType = value;
    }

}
