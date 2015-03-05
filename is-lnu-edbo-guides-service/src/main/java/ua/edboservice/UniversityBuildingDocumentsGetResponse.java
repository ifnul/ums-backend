
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
 *         &lt;element name="UniversityBuildingDocumentsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityBuildingDocuments" minOccurs="0"/>
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
    "universityBuildingDocumentsGetResult"
})
@XmlRootElement(name = "UniversityBuildingDocumentsGetResponse")
public class UniversityBuildingDocumentsGetResponse {

    @XmlElement(name = "UniversityBuildingDocumentsGetResult")
    protected ArrayOfDUniversityBuildingDocuments universityBuildingDocumentsGetResult;

    /**
     * Gets the value of the universityBuildingDocumentsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityBuildingDocuments }
     *     
     */
    public ArrayOfDUniversityBuildingDocuments getUniversityBuildingDocumentsGetResult() {
        return universityBuildingDocumentsGetResult;
    }

    /**
     * Sets the value of the universityBuildingDocumentsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityBuildingDocuments }
     *     
     */
    public void setUniversityBuildingDocumentsGetResult(ArrayOfDUniversityBuildingDocuments value) {
        this.universityBuildingDocumentsGetResult = value;
    }

}
