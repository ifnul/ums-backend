
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
 *         &lt;element name="UniversityGovernanceTypesRestoreResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityGovernanceTypesRestoreResult"
})
@XmlRootElement(name = "UniversityGovernanceTypesRestoreResponse")
public class UniversityGovernanceTypesRestoreResponse {

    @XmlElement(name = "UniversityGovernanceTypesRestoreResult")
    protected int universityGovernanceTypesRestoreResult;

    /**
     * Gets the value of the universityGovernanceTypesRestoreResult property.
     * 
     */
    public int getUniversityGovernanceTypesRestoreResult() {
        return universityGovernanceTypesRestoreResult;
    }

    /**
     * Sets the value of the universityGovernanceTypesRestoreResult property.
     * 
     */
    public void setUniversityGovernanceTypesRestoreResult(int value) {
        this.universityGovernanceTypesRestoreResult = value;
    }

}
