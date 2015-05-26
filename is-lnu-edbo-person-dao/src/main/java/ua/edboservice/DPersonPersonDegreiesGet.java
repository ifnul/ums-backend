
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonPersonDegreiesGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonPersonDegreiesGet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonDegree" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Degree" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDegreeDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonDegreeDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonDegreeDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DegreeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDocumentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonDocumentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocumentSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentDateGet" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocumentExpiredDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocumentIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDocumentBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonDocumentEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsCheckForPaperCopy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsForeinghEntrantDocumet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonPersonDegreiesGet", propOrder = {
    "idPersonDegree",
    "idDegree",
    "idPersonDocument",
    "personCodeU",
    "personDegreeDateBegin",
    "personDegreeDateEnd",
    "personDegreeDateLastChange",
    "degreeName",
    "personDocumentTypeName",
    "idPersonDocumentType",
    "idPersonEducation",
    "documentSeries",
    "documentNumbers",
    "documentDateGet",
    "documentExpiredDate",
    "documentIssued",
    "documentDescription",
    "personDocumentBegin",
    "personDocumentEnd",
    "dateLastChange",
    "isCheckForPaperCopy",
    "isForeinghEntrantDocumet"
})
public class DPersonPersonDegreiesGet {

    @XmlElement(name = "Id_PersonDegree")
    protected int idPersonDegree;
    @XmlElement(name = "Id_Degree")
    protected int idDegree;
    @XmlElement(name = "Id_PersonDocument")
    protected int idPersonDocument;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "PersonDegreeDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personDegreeDateBegin;
    @XmlElement(name = "PersonDegreeDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personDegreeDateEnd;
    @XmlElement(name = "PersonDegreeDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personDegreeDateLastChange;
    @XmlElement(name = "DegreeName")
    protected String degreeName;
    @XmlElement(name = "PersonDocumentTypeName")
    protected String personDocumentTypeName;
    @XmlElement(name = "Id_PersonDocumentType")
    protected int idPersonDocumentType;
    @XmlElement(name = "Id_PersonEducation")
    protected int idPersonEducation;
    @XmlElement(name = "DocumentSeries")
    protected String documentSeries;
    @XmlElement(name = "DocumentNumbers")
    protected String documentNumbers;
    @XmlElement(name = "DocumentDateGet", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDateGet;
    @XmlElement(name = "DocumentExpiredDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentExpiredDate;
    @XmlElement(name = "DocumentIssued")
    protected String documentIssued;
    @XmlElement(name = "DocumentDescription")
    protected String documentDescription;
    @XmlElement(name = "PersonDocumentBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personDocumentBegin;
    @XmlElement(name = "PersonDocumentEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personDocumentEnd;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "IsCheckForPaperCopy")
    protected int isCheckForPaperCopy;
    @XmlElement(name = "IsForeinghEntrantDocumet")
    protected int isForeinghEntrantDocumet;

    /**
     * Gets the value of the idPersonDegree property.
     * 
     */
    public int getIdPersonDegree() {
        return idPersonDegree;
    }

    /**
     * Sets the value of the idPersonDegree property.
     * 
     */
    public void setIdPersonDegree(int value) {
        this.idPersonDegree = value;
    }

    /**
     * Gets the value of the idDegree property.
     * 
     */
    public int getIdDegree() {
        return idDegree;
    }

    /**
     * Sets the value of the idDegree property.
     * 
     */
    public void setIdDegree(int value) {
        this.idDegree = value;
    }

    /**
     * Gets the value of the idPersonDocument property.
     * 
     */
    public int getIdPersonDocument() {
        return idPersonDocument;
    }

    /**
     * Sets the value of the idPersonDocument property.
     * 
     */
    public void setIdPersonDocument(int value) {
        this.idPersonDocument = value;
    }

    /**
     * Gets the value of the personCodeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeU() {
        return personCodeU;
    }

    /**
     * Sets the value of the personCodeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeU(String value) {
        this.personCodeU = value;
    }

    /**
     * Gets the value of the personDegreeDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonDegreeDateBegin() {
        return personDegreeDateBegin;
    }

    /**
     * Sets the value of the personDegreeDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonDegreeDateBegin(XMLGregorianCalendar value) {
        this.personDegreeDateBegin = value;
    }

    /**
     * Gets the value of the personDegreeDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonDegreeDateEnd() {
        return personDegreeDateEnd;
    }

    /**
     * Sets the value of the personDegreeDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonDegreeDateEnd(XMLGregorianCalendar value) {
        this.personDegreeDateEnd = value;
    }

    /**
     * Gets the value of the personDegreeDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonDegreeDateLastChange() {
        return personDegreeDateLastChange;
    }

    /**
     * Sets the value of the personDegreeDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonDegreeDateLastChange(XMLGregorianCalendar value) {
        this.personDegreeDateLastChange = value;
    }

    /**
     * Gets the value of the degreeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDegreeName() {
        return degreeName;
    }

    /**
     * Sets the value of the degreeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDegreeName(String value) {
        this.degreeName = value;
    }

    /**
     * Gets the value of the personDocumentTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonDocumentTypeName() {
        return personDocumentTypeName;
    }

    /**
     * Sets the value of the personDocumentTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonDocumentTypeName(String value) {
        this.personDocumentTypeName = value;
    }

    /**
     * Gets the value of the idPersonDocumentType property.
     * 
     */
    public int getIdPersonDocumentType() {
        return idPersonDocumentType;
    }

    /**
     * Sets the value of the idPersonDocumentType property.
     * 
     */
    public void setIdPersonDocumentType(int value) {
        this.idPersonDocumentType = value;
    }

    /**
     * Gets the value of the idPersonEducation property.
     * 
     */
    public int getIdPersonEducation() {
        return idPersonEducation;
    }

    /**
     * Sets the value of the idPersonEducation property.
     * 
     */
    public void setIdPersonEducation(int value) {
        this.idPersonEducation = value;
    }

    /**
     * Gets the value of the documentSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentSeries() {
        return documentSeries;
    }

    /**
     * Sets the value of the documentSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentSeries(String value) {
        this.documentSeries = value;
    }

    /**
     * Gets the value of the documentNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumbers() {
        return documentNumbers;
    }

    /**
     * Sets the value of the documentNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumbers(String value) {
        this.documentNumbers = value;
    }

    /**
     * Gets the value of the documentDateGet property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDateGet() {
        return documentDateGet;
    }

    /**
     * Sets the value of the documentDateGet property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDateGet(XMLGregorianCalendar value) {
        this.documentDateGet = value;
    }

    /**
     * Gets the value of the documentExpiredDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentExpiredDate() {
        return documentExpiredDate;
    }

    /**
     * Sets the value of the documentExpiredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentExpiredDate(XMLGregorianCalendar value) {
        this.documentExpiredDate = value;
    }

    /**
     * Gets the value of the documentIssued property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentIssued() {
        return documentIssued;
    }

    /**
     * Sets the value of the documentIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentIssued(String value) {
        this.documentIssued = value;
    }

    /**
     * Gets the value of the documentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDescription() {
        return documentDescription;
    }

    /**
     * Sets the value of the documentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDescription(String value) {
        this.documentDescription = value;
    }

    /**
     * Gets the value of the personDocumentBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonDocumentBegin() {
        return personDocumentBegin;
    }

    /**
     * Sets the value of the personDocumentBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonDocumentBegin(XMLGregorianCalendar value) {
        this.personDocumentBegin = value;
    }

    /**
     * Gets the value of the personDocumentEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonDocumentEnd() {
        return personDocumentEnd;
    }

    /**
     * Sets the value of the personDocumentEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonDocumentEnd(XMLGregorianCalendar value) {
        this.personDocumentEnd = value;
    }

    /**
     * Gets the value of the dateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastChange() {
        return dateLastChange;
    }

    /**
     * Sets the value of the dateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastChange(XMLGregorianCalendar value) {
        this.dateLastChange = value;
    }

    /**
     * Gets the value of the isCheckForPaperCopy property.
     * 
     */
    public int getIsCheckForPaperCopy() {
        return isCheckForPaperCopy;
    }

    /**
     * Sets the value of the isCheckForPaperCopy property.
     * 
     */
    public void setIsCheckForPaperCopy(int value) {
        this.isCheckForPaperCopy = value;
    }

    /**
     * Gets the value of the isForeinghEntrantDocumet property.
     * 
     */
    public int getIsForeinghEntrantDocumet() {
        return isForeinghEntrantDocumet;
    }

    /**
     * Sets the value of the isForeinghEntrantDocumet property.
     * 
     */
    public void setIsForeinghEntrantDocumet(int value) {
        this.isForeinghEntrantDocumet = value;
    }

}
