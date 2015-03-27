
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
 *         &lt;element name="UniversityBuildingDocumentsTypesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityBuildingDocumentsTypes" minOccurs="0"/>
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
    "universityBuildingDocumentsTypesGetResult"
})
@XmlRootElement(name = "UniversityBuildingDocumentsTypesGetResponse")
public class UniversityBuildingDocumentsTypesGetResponse {

    @XmlElement(name = "UniversityBuildingDocumentsTypesGetResult")
    protected ArrayOfDUniversityBuildingDocumentsTypes universityBuildingDocumentsTypesGetResult;

    /**
     * Gets the value of the universityBuildingDocumentsTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityBuildingDocumentsTypes }
     *     
     */
    public ArrayOfDUniversityBuildingDocumentsTypes getUniversityBuildingDocumentsTypesGetResult() {
        return universityBuildingDocumentsTypesGetResult;
    }

    /**
     * Sets the value of the universityBuildingDocumentsTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityBuildingDocumentsTypes }
     *     
     */
    public void setUniversityBuildingDocumentsTypesGetResult(ArrayOfDUniversityBuildingDocumentsTypes value) {
        this.universityBuildingDocumentsTypesGetResult = value;
    }

}
