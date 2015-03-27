
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
 *         &lt;element name="UniversityBuildingDocumentsScanChangeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityBuildingDocumentsScanChangeResult"
})
@XmlRootElement(name = "UniversityBuildingDocumentsScanChangeResponse")
public class UniversityBuildingDocumentsScanChangeResponse {

    @XmlElement(name = "UniversityBuildingDocumentsScanChangeResult")
    protected int universityBuildingDocumentsScanChangeResult;

    /**
     * Gets the value of the universityBuildingDocumentsScanChangeResult property.
     * 
     */
    public int getUniversityBuildingDocumentsScanChangeResult() {
        return universityBuildingDocumentsScanChangeResult;
    }

    /**
     * Sets the value of the universityBuildingDocumentsScanChangeResult property.
     * 
     */
    public void setUniversityBuildingDocumentsScanChangeResult(int value) {
        this.universityBuildingDocumentsScanChangeResult = value;
    }

}
