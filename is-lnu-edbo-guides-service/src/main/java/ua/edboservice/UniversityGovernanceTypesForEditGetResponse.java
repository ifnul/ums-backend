
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
 *         &lt;element name="UniversityGovernanceTypesForEditGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityGovernanceTypesForEdit" minOccurs="0"/>
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
    "universityGovernanceTypesForEditGetResult"
})
@XmlRootElement(name = "UniversityGovernanceTypesForEditGetResponse")
public class UniversityGovernanceTypesForEditGetResponse {

    @XmlElement(name = "UniversityGovernanceTypesForEditGetResult")
    protected ArrayOfDUniversityGovernanceTypesForEdit universityGovernanceTypesForEditGetResult;

    /**
     * Gets the value of the universityGovernanceTypesForEditGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityGovernanceTypesForEdit }
     *     
     */
    public ArrayOfDUniversityGovernanceTypesForEdit getUniversityGovernanceTypesForEditGetResult() {
        return universityGovernanceTypesForEditGetResult;
    }

    /**
     * Sets the value of the universityGovernanceTypesForEditGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityGovernanceTypesForEdit }
     *     
     */
    public void setUniversityGovernanceTypesForEditGetResult(ArrayOfDUniversityGovernanceTypesForEdit value) {
        this.universityGovernanceTypesForEditGetResult = value;
    }

}
