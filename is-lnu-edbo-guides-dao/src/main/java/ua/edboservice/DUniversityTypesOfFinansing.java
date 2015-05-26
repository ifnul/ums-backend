
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityTypesOfFinansing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityTypesOfFinansing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityTypeOfFinansing" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityTypeOfFinansingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityTypesOfFinansing", propOrder = {
    "idUniversityTypeOfFinansing",
    "universityTypeOfFinansingName"
})
public class DUniversityTypesOfFinansing {

    @XmlElement(name = "Id_UniversityTypeOfFinansing")
    protected int idUniversityTypeOfFinansing;
    @XmlElement(name = "UniversityTypeOfFinansingName")
    protected String universityTypeOfFinansingName;

    /**
     * Gets the value of the idUniversityTypeOfFinansing property.
     * 
     */
    public int getIdUniversityTypeOfFinansing() {
        return idUniversityTypeOfFinansing;
    }

    /**
     * Sets the value of the idUniversityTypeOfFinansing property.
     * 
     */
    public void setIdUniversityTypeOfFinansing(int value) {
        this.idUniversityTypeOfFinansing = value;
    }

    /**
     * Gets the value of the universityTypeOfFinansingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityTypeOfFinansingName() {
        return universityTypeOfFinansingName;
    }

    /**
     * Sets the value of the universityTypeOfFinansingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityTypeOfFinansingName(String value) {
        this.universityTypeOfFinansingName = value;
    }

}
