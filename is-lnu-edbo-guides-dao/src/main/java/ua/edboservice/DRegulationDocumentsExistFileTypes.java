
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dRegulationDocumentsExistFileTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dRegulationDocumentsExistFileTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_RegulationDocumentsFileType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentsFileTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PagesCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dRegulationDocumentsExistFileTypes", propOrder = {
    "idRegulationDocumentsFileType",
    "idRegulationDocumentType",
    "regulationDocumentsFileTypeName",
    "pagesCount"
})
public class DRegulationDocumentsExistFileTypes {

    @XmlElement(name = "Id_RegulationDocumentsFileType")
    protected int idRegulationDocumentsFileType;
    @XmlElement(name = "Id_RegulationDocumentType")
    protected int idRegulationDocumentType;
    @XmlElement(name = "RegulationDocumentsFileTypeName")
    protected String regulationDocumentsFileTypeName;
    @XmlElement(name = "PagesCount")
    protected int pagesCount;

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

    /**
     * Gets the value of the idRegulationDocumentType property.
     * 
     */
    public int getIdRegulationDocumentType() {
        return idRegulationDocumentType;
    }

    /**
     * Sets the value of the idRegulationDocumentType property.
     * 
     */
    public void setIdRegulationDocumentType(int value) {
        this.idRegulationDocumentType = value;
    }

    /**
     * Gets the value of the regulationDocumentsFileTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentsFileTypeName() {
        return regulationDocumentsFileTypeName;
    }

    /**
     * Sets the value of the regulationDocumentsFileTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentsFileTypeName(String value) {
        this.regulationDocumentsFileTypeName = value;
    }

    /**
     * Gets the value of the pagesCount property.
     * 
     */
    public int getPagesCount() {
        return pagesCount;
    }

    /**
     * Sets the value of the pagesCount property.
     * 
     */
    public void setPagesCount(int value) {
        this.pagesCount = value;
    }

}
