
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityOrderRequestsCategories complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityOrderRequestsCategories">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityOrderRequestsCategories" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityOrderRequestsType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityOrderRequestsCategories" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityOrderRequestsCategories", propOrder = {
    "idUniversityOrderRequestsCategories",
    "idUniversityOrderRequestsType",
    "universityOrderRequestsCategories"
})
public class DUniversityOrderRequestsCategories {

    @XmlElement(name = "Id_UniversityOrderRequestsCategories")
    protected int idUniversityOrderRequestsCategories;
    @XmlElement(name = "Id_UniversityOrderRequestsType")
    protected int idUniversityOrderRequestsType;
    @XmlElement(name = "UniversityOrderRequestsCategories")
    protected String universityOrderRequestsCategories;

    /**
     * Gets the value of the idUniversityOrderRequestsCategories property.
     * 
     */
    public int getIdUniversityOrderRequestsCategories() {
        return idUniversityOrderRequestsCategories;
    }

    /**
     * Sets the value of the idUniversityOrderRequestsCategories property.
     * 
     */
    public void setIdUniversityOrderRequestsCategories(int value) {
        this.idUniversityOrderRequestsCategories = value;
    }

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
     * Gets the value of the universityOrderRequestsCategories property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityOrderRequestsCategories() {
        return universityOrderRequestsCategories;
    }

    /**
     * Sets the value of the universityOrderRequestsCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityOrderRequestsCategories(String value) {
        this.universityOrderRequestsCategories = value;
    }

}
