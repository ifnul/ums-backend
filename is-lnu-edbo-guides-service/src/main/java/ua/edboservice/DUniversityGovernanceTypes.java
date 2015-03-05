
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityGovernanceTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityGovernanceTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityGovernanceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityGovernanceTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityGovernanceTypes", propOrder = {
    "idUniversityGovernanceType",
    "universityGovernanceTypeName"
})
public class DUniversityGovernanceTypes {

    @XmlElement(name = "Id_UniversityGovernanceType")
    protected int idUniversityGovernanceType;
    @XmlElement(name = "UniversityGovernanceTypeName")
    protected String universityGovernanceTypeName;

    /**
     * Gets the value of the idUniversityGovernanceType property.
     * 
     */
    public int getIdUniversityGovernanceType() {
        return idUniversityGovernanceType;
    }

    /**
     * Sets the value of the idUniversityGovernanceType property.
     * 
     */
    public void setIdUniversityGovernanceType(int value) {
        this.idUniversityGovernanceType = value;
    }

    /**
     * Gets the value of the universityGovernanceTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityGovernanceTypeName() {
        return universityGovernanceTypeName;
    }

    /**
     * Sets the value of the universityGovernanceTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityGovernanceTypeName(String value) {
        this.universityGovernanceTypeName = value;
    }

}
