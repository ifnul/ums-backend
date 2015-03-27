
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
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentsFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentsFileType" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idRegulationDocument",
    "pageNumber",
    "idRegulationDocumentsFile",
    "idRegulationDocumentsFileType"
})
@XmlRootElement(name = "RegulationDocumentsPageFileGet")
public class RegulationDocumentsPageFileGet {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_RegulationDocument")
    protected int idRegulationDocument;
    @XmlElement(name = "PageNumber")
    protected int pageNumber;
    @XmlElement(name = "Id_RegulationDocumentsFile")
    protected int idRegulationDocumentsFile;
    @XmlElement(name = "Id_RegulationDocumentsFileType")
    protected int idRegulationDocumentsFileType;

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
     * Gets the value of the idRegulationDocument property.
     * 
     */
    public int getIdRegulationDocument() {
        return idRegulationDocument;
    }

    /**
     * Sets the value of the idRegulationDocument property.
     * 
     */
    public void setIdRegulationDocument(int value) {
        this.idRegulationDocument = value;
    }

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
     * Gets the value of the idRegulationDocumentsFile property.
     * 
     */
    public int getIdRegulationDocumentsFile() {
        return idRegulationDocumentsFile;
    }

    /**
     * Sets the value of the idRegulationDocumentsFile property.
     * 
     */
    public void setIdRegulationDocumentsFile(int value) {
        this.idRegulationDocumentsFile = value;
    }

    /**
     * Gets the value of the idRegulationDocumentsFileType property.
     * 
     */
    public int getIdRegulationDocumentsFileType() {
        return idRegulationDocumentsFileType;
    }

    /**
     * Sets the value of the idRegulationDocumentsFileType property.
     * 
     */
    public void setIdRegulationDocumentsFileType(int value) {
        this.idRegulationDocumentsFileType = value;
    }

}
