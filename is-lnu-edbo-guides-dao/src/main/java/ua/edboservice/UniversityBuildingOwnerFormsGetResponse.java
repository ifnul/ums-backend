
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
 *         &lt;element name="UniversityBuildingOwnerFormsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityBuildingOwnerForms" minOccurs="0"/>
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
    "universityBuildingOwnerFormsGetResult"
})
@XmlRootElement(name = "UniversityBuildingOwnerFormsGetResponse")
public class UniversityBuildingOwnerFormsGetResponse {

    @XmlElement(name = "UniversityBuildingOwnerFormsGetResult")
    protected ArrayOfDUniversityBuildingOwnerForms universityBuildingOwnerFormsGetResult;

    /**
     * Gets the value of the universityBuildingOwnerFormsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityBuildingOwnerForms }
     *     
     */
    public ArrayOfDUniversityBuildingOwnerForms getUniversityBuildingOwnerFormsGetResult() {
        return universityBuildingOwnerFormsGetResult;
    }

    /**
     * Sets the value of the universityBuildingOwnerFormsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityBuildingOwnerForms }
     *     
     */
    public void setUniversityBuildingOwnerFormsGetResult(ArrayOfDUniversityBuildingOwnerForms value) {
        this.universityBuildingOwnerFormsGetResult = value;
    }

}
