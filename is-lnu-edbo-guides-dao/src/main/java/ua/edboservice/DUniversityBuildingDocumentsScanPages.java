
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityBuildingDocumentsScanPages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityBuildingDocumentsScanPages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityBuildingDocumentScans" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityBuildingDocumentsScanPages", propOrder = {
    "pageNumber",
    "idUniversityBuildingDocumentScans"
})
public class DUniversityBuildingDocumentsScanPages {

    @XmlElement(name = "PageNumber")
    protected int pageNumber;
    @XmlElement(name = "Id_UniversityBuildingDocumentScans")
    protected int idUniversityBuildingDocumentScans;

    /**
     * Gets the value of the pageNumber property.
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the idUniversityBuildingDocumentScans property.
     * 
     */
    public int getIdUniversityBuildingDocumentScans() {
        return idUniversityBuildingDocumentScans;
    }

    /**
     * Sets the value of the idUniversityBuildingDocumentScans property.
     * 
     */
    public void setIdUniversityBuildingDocumentScans(int value) {
        this.idUniversityBuildingDocumentScans = value;
    }

}
