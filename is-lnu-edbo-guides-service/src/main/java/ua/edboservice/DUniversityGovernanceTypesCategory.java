
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityGovernanceTypesCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityGovernanceTypesCategory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityGovernanceTypesCategory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityGovernanceTypesCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityGovernanceTypesCategory", propOrder = {
    "idUniversityGovernanceTypesCategory",
    "universityGovernanceTypesCategory"
})
public class DUniversityGovernanceTypesCategory {

    @XmlElement(name = "Id_UniversityGovernanceTypesCategory")
    protected int idUniversityGovernanceTypesCategory;
    @XmlElement(name = "UniversityGovernanceTypesCategory")
    protected String universityGovernanceTypesCategory;

    /**
     * Gets the value of the idUniversityGovernanceTypesCategory property.
     * 
     */
    public int getIdUniversityGovernanceTypesCategory() {
        return idUniversityGovernanceTypesCategory;
    }

    /**
     * Sets the value of the idUniversityGovernanceTypesCategory property.
     * 
     */
    public void setIdUniversityGovernanceTypesCategory(int value) {
        this.idUniversityGovernanceTypesCategory = value;
    }

    /**
     * Gets the value of the universityGovernanceTypesCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityGovernanceTypesCategory() {
        return universityGovernanceTypesCategory;
    }

    /**
     * Sets the value of the universityGovernanceTypesCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityGovernanceTypesCategory(String value) {
        this.universityGovernanceTypesCategory = value;
    }

}
