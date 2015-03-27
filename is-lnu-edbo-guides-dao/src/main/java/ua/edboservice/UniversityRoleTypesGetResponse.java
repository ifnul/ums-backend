
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
 *         &lt;element name="UniversityRoleTypesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityRoleTypes" minOccurs="0"/>
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
    "universityRoleTypesGetResult"
})
@XmlRootElement(name = "UniversityRoleTypesGetResponse")
public class UniversityRoleTypesGetResponse {

    @XmlElement(name = "UniversityRoleTypesGetResult")
    protected ArrayOfDUniversityRoleTypes universityRoleTypesGetResult;

    /**
     * Gets the value of the universityRoleTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityRoleTypes }
     *     
     */
    public ArrayOfDUniversityRoleTypes getUniversityRoleTypesGetResult() {
        return universityRoleTypesGetResult;
    }

    /**
     * Sets the value of the universityRoleTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityRoleTypes }
     *     
     */
    public void setUniversityRoleTypesGetResult(ArrayOfDUniversityRoleTypes value) {
        this.universityRoleTypesGetResult = value;
    }

}
