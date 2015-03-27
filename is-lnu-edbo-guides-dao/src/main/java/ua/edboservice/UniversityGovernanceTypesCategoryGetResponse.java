
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
 *         &lt;element name="UniversityGovernanceTypesCategoryGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityGovernanceTypesCategory" minOccurs="0"/>
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
    "universityGovernanceTypesCategoryGetResult"
})
@XmlRootElement(name = "UniversityGovernanceTypesCategoryGetResponse")
public class UniversityGovernanceTypesCategoryGetResponse {

    @XmlElement(name = "UniversityGovernanceTypesCategoryGetResult")
    protected ArrayOfDUniversityGovernanceTypesCategory universityGovernanceTypesCategoryGetResult;

    /**
     * Gets the value of the universityGovernanceTypesCategoryGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityGovernanceTypesCategory }
     *     
     */
    public ArrayOfDUniversityGovernanceTypesCategory getUniversityGovernanceTypesCategoryGetResult() {
        return universityGovernanceTypesCategoryGetResult;
    }

    /**
     * Sets the value of the universityGovernanceTypesCategoryGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityGovernanceTypesCategory }
     *     
     */
    public void setUniversityGovernanceTypesCategoryGetResult(ArrayOfDUniversityGovernanceTypesCategory value) {
        this.universityGovernanceTypesCategoryGetResult = value;
    }

}
