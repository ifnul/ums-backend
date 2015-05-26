
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dImportDocFindByName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dImportDocFindByName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ImportDocData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ImportDocTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationDocumentSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityNameInOsvita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationDocumentDateGive" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityBossFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dImportDocFindByName", propOrder = {
    "idImportDocData",
    "fio",
    "birthday",
    "importDocTypeName",
    "educationDocumentSeries",
    "educationDocumentNumber",
    "universityNameInOsvita",
    "educationDocumentDateGive",
    "universityBossFIO"
})
public class DImportDocFindByName {

    @XmlElement(name = "Id_ImportDocData")
    protected int idImportDocData;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "Birthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "ImportDocTypeName")
    protected String importDocTypeName;
    @XmlElement(name = "EducationDocumentSeries")
    protected String educationDocumentSeries;
    @XmlElement(name = "EducationDocumentNumber")
    protected String educationDocumentNumber;
    @XmlElement(name = "UniversityNameInOsvita")
    protected String universityNameInOsvita;
    @XmlElement(name = "EducationDocumentDateGive", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar educationDocumentDateGive;
    @XmlElement(name = "UniversityBossFIO")
    protected String universityBossFIO;

    /**
     * Gets the value of the idImportDocData property.
     * 
     */
    public int getIdImportDocData() {
        return idImportDocData;
    }

    /**
     * Sets the value of the idImportDocData property.
     * 
     */
    public void setIdImportDocData(int value) {
        this.idImportDocData = value;
    }

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIO() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIO(String value) {
        this.fio = value;
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the importDocTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportDocTypeName() {
        return importDocTypeName;
    }

    /**
     * Sets the value of the importDocTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportDocTypeName(String value) {
        this.importDocTypeName = value;
    }

    /**
     * Gets the value of the educationDocumentSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationDocumentSeries() {
        return educationDocumentSeries;
    }

    /**
     * Sets the value of the educationDocumentSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationDocumentSeries(String value) {
        this.educationDocumentSeries = value;
    }

    /**
     * Gets the value of the educationDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationDocumentNumber() {
        return educationDocumentNumber;
    }

    /**
     * Sets the value of the educationDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationDocumentNumber(String value) {
        this.educationDocumentNumber = value;
    }

    /**
     * Gets the value of the universityNameInOsvita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityNameInOsvita() {
        return universityNameInOsvita;
    }

    /**
     * Sets the value of the universityNameInOsvita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityNameInOsvita(String value) {
        this.universityNameInOsvita = value;
    }

    /**
     * Gets the value of the educationDocumentDateGive property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEducationDocumentDateGive() {
        return educationDocumentDateGive;
    }

    /**
     * Sets the value of the educationDocumentDateGive property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEducationDocumentDateGive(XMLGregorianCalendar value) {
        this.educationDocumentDateGive = value;
    }

    /**
     * Gets the value of the universityBossFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBossFIO() {
        return universityBossFIO;
    }

    /**
     * Sets the value of the universityBossFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBossFIO(String value) {
        this.universityBossFIO = value;
    }

}
