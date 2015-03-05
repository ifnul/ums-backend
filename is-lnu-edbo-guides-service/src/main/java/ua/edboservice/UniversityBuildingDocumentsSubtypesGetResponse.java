
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
 *         &lt;element name="UniversityBuildingDocumentsSubtypesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityBuildingDocumentsSubtypes" minOccurs="0"/>
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
    "universityBuildingDocumentsSubtypesGetResult"
})
@XmlRootElement(name = "UniversityBuildingDocumentsSubtypesGetResponse")
public class UniversityBuildingDocumentsSubtypesGetResponse {

    @XmlElement(name = "UniversityBuildingDocumentsSubtypesGetResult")
    protected ArrayOfDUniversityBuildingDocumentsSubtypes universityBuildingDocumentsSubtypesGetResult;

    /**
     * Gets the value of the universityBuildingDocumentsSubtypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityBuildingDocumentsSubtypes }
     *     
     */
    public ArrayOfDUniversityBuildingDocumentsSubtypes getUniversityBuildingDocumentsSubtypesGetResult() {
        return universityBuildingDocumentsSubtypesGetResult;
    }

    /**
     * Sets the value of the universityBuildingDocumentsSubtypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityBuildingDocumentsSubtypes }
     *     
     */
    public void setUniversityBuildingDocumentsSubtypesGetResult(ArrayOfDUniversityBuildingDocumentsSubtypes value) {
        this.universityBuildingDocumentsSubtypesGetResult = value;
    }

}
