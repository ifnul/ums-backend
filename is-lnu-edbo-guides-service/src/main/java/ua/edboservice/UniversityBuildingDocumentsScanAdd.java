
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
 *         &lt;element name="SessionGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityBuildingDocuments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityBuildingDocumentScans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sessionGUID",
    "idUniversityBuildingDocuments",
    "universityBuildingDocumentScans"
})
@XmlRootElement(name = "UniversityBuildingDocumentsScanAdd")
public class UniversityBuildingDocumentsScanAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_UniversityBuildingDocuments")
    protected int idUniversityBuildingDocuments;
    @XmlElement(name = "UniversityBuildingDocumentScans")
    protected String universityBuildingDocumentScans;

    /**
     * Gets the value of the sessionGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionGUID() {
        return sessionGUID;
    }

    /**
     * Sets the value of the sessionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionGUID(String value) {
        this.sessionGUID = value;
    }

    /**
     * Gets the value of the idUniversityBuildingDocuments property.
     * 
     */
    public int getIdUniversityBuildingDocuments() {
        return idUniversityBuildingDocuments;
    }

    /**
     * Sets the value of the idUniversityBuildingDocuments property.
     * 
     */
    public void setIdUniversityBuildingDocuments(int value) {
        this.idUniversityBuildingDocuments = value;
    }

    /**
     * Gets the value of the universityBuildingDocumentScans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBuildingDocumentScans() {
        return universityBuildingDocumentScans;
    }

    /**
     * Sets the value of the universityBuildingDocumentScans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBuildingDocumentScans(String value) {
        this.universityBuildingDocumentScans = value;
    }

}
