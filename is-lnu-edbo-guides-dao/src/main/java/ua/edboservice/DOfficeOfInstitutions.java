
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dOfficeOfInstitutions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dOfficeOfInstitutions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_OfficeOfInstitutions" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OfficeOfInstitutionsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dOfficeOfInstitutions", propOrder = {
    "idOfficeOfInstitutions",
    "officeOfInstitutionsName"
})
public class DOfficeOfInstitutions {

    @XmlElement(name = "Id_OfficeOfInstitutions")
    protected int idOfficeOfInstitutions;
    @XmlElement(name = "OfficeOfInstitutionsName")
    protected String officeOfInstitutionsName;

    /**
     * Gets the value of the idOfficeOfInstitutions property.
     * 
     */
    public int getIdOfficeOfInstitutions() {
        return idOfficeOfInstitutions;
    }

    /**
     * Sets the value of the idOfficeOfInstitutions property.
     * 
     */
    public void setIdOfficeOfInstitutions(int value) {
        this.idOfficeOfInstitutions = value;
    }

    /**
     * Gets the value of the officeOfInstitutionsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeOfInstitutionsName() {
        return officeOfInstitutionsName;
    }

    /**
     * Sets the value of the officeOfInstitutionsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeOfInstitutionsName(String value) {
        this.officeOfInstitutionsName = value;
    }

}
