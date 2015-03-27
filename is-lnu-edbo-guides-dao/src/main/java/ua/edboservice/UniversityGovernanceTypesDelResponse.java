
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
 *         &lt;element name="UniversityGovernanceTypesDelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityGovernanceTypesDelResult"
})
@XmlRootElement(name = "UniversityGovernanceTypesDelResponse")
public class UniversityGovernanceTypesDelResponse {

    @XmlElement(name = "UniversityGovernanceTypesDelResult")
    protected int universityGovernanceTypesDelResult;

    /**
     * Gets the value of the universityGovernanceTypesDelResult property.
     * 
     */
    public int getUniversityGovernanceTypesDelResult() {
        return universityGovernanceTypesDelResult;
    }

    /**
     * Sets the value of the universityGovernanceTypesDelResult property.
     * 
     */
    public void setUniversityGovernanceTypesDelResult(int value) {
        this.universityGovernanceTypesDelResult = value;
    }

}
