
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dRegulationDocumentsFilePages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dRegulationDocumentsFilePages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_RegulationDocumentsFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentsFileDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsOldVersionFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentsFileType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentsFileTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubPageNumbers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dRegulationDocumentsFilePages", propOrder = {
    "idRegulationDocumentsFile",
    "idRegulationDocument",
    "pageNumber",
    "regulationDocumentsFileDateLastChange",
    "isOldVersionFile",
    "idRegulationDocumentsFileType",
    "regulationDocumentsFileTypeName",
    "subPageNumbers"
})
public class DRegulationDocumentsFilePages {

    @XmlElement(name = "Id_RegulationDocumentsFile")
    protected int idRegulationDocumentsFile;
    @XmlElement(name = "Id_RegulationDocument")
    protected int idRegulationDocument;
    @XmlElement(name = "PageNumber")
    protected int pageNumber;
    @XmlElement(name = "RegulationDocumentsFileDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regulationDocumentsFileDateLastChange;
    @XmlElement(name = "IsOldVersionFile")
    protected int isOldVersionFile;
    @XmlElement(name = "Id_RegulationDocumentsFileType")
    protected int idRegulationDocumentsFileType;
    @XmlElement(name = "RegulationDocumentsFileTypeName")
    protected String regulationDocumentsFileTypeName;
    @XmlElement(name = "SubPageNumbers")
    protected int subPageNumbers;

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
     * Gets the value of the regulationDocumentsFileDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegulationDocumentsFileDateLastChange() {
        return regulationDocumentsFileDateLastChange;
    }

    /**
     * Sets the value of the regulationDocumentsFileDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegulationDocumentsFileDateLastChange(XMLGregorianCalendar value) {
        this.regulationDocumentsFileDateLastChange = value;
    }

    /**
     * Gets the value of the isOldVersionFile property.
     * 
     */
    public int getIsOldVersionFile() {
        return isOldVersionFile;
    }

    /**
     * Sets the value of the isOldVersionFile property.
     * 
     */
    public void setIsOldVersionFile(int value) {
        this.isOldVersionFile = value;
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
     * Gets the value of the subPageNumbers property.
     * 
     */
    public int getSubPageNumbers() {
        return subPageNumbers;
    }

    /**
     * Sets the value of the subPageNumbers property.
     * 
     */
    public void setSubPageNumbers(int value) {
        this.subPageNumbers = value;
    }

}
