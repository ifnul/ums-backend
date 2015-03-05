
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
 *         &lt;element name="UniversityBuildingDocumentsScanPagesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityBuildingDocumentsScanPages" minOccurs="0"/>
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
    "universityBuildingDocumentsScanPagesGetResult"
})
@XmlRootElement(name = "UniversityBuildingDocumentsScanPagesGetResponse")
public class UniversityBuildingDocumentsScanPagesGetResponse {

    @XmlElement(name = "UniversityBuildingDocumentsScanPagesGetResult")
    protected ArrayOfDUniversityBuildingDocumentsScanPages universityBuildingDocumentsScanPagesGetResult;

    /**
     * Gets the value of the universityBuildingDocumentsScanPagesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityBuildingDocumentsScanPages }
     *     
     */
    public ArrayOfDUniversityBuildingDocumentsScanPages getUniversityBuildingDocumentsScanPagesGetResult() {
        return universityBuildingDocumentsScanPagesGetResult;
    }

    /**
     * Sets the value of the universityBuildingDocumentsScanPagesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityBuildingDocumentsScanPages }
     *     
     */
    public void setUniversityBuildingDocumentsScanPagesGetResult(ArrayOfDUniversityBuildingDocumentsScanPages value) {
        this.universityBuildingDocumentsScanPagesGetResult = value;
    }

}
