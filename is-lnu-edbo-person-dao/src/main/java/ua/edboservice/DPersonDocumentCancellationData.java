
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonDocumentCancellationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonDocumentCancellationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonDocumentCancellationData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentCancellation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonDocumentCancellationDataLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocumentSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Person" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cancellad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_PersonDocumentCancellationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonDocumentCancellationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonDocumentCancellationData", propOrder = {
    "idPersonDocumentCancellationData",
    "idPersonDocument",
    "idPersonDocumentCancellation",
    "personDocumentCancellationDataLastChange",
    "documentSeries",
    "documentNumbers",
    "fio",
    "personCodeU",
    "idPerson",
    "cancellad",
    "birthday",
    "idPersonDocumentCancellationType",
    "personDocumentCancellationTypeName"
})
public class DPersonDocumentCancellationData {

    @XmlElement(name = "Id_PersonDocumentCancellationData")
    protected int idPersonDocumentCancellationData;
    @XmlElement(name = "Id_PersonDocument")
    protected int idPersonDocument;
    @XmlElement(name = "Id_PersonDocumentCancellation")
    protected int idPersonDocumentCancellation;
    @XmlElement(name = "PersonDocumentCancellationDataLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personDocumentCancellationDataLastChange;
    @XmlElement(name = "DocumentSeries")
    protected String documentSeries;
    @XmlElement(name = "DocumentNumbers")
    protected String documentNumbers;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "Id_Person")
    protected int idPerson;
    @XmlElement(name = "Cancellad")
    protected int cancellad;
    @XmlElement(name = "Birthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "Id_PersonDocumentCancellationType")
    protected int idPersonDocumentCancellationType;
    @XmlElement(name = "PersonDocumentCancellationTypeName")
    protected String personDocumentCancellationTypeName;

    /**
     * Gets the value of the idPersonDocumentCancellationData property.
     * 
     */
    public int getIdPersonDocumentCancellationData() {
        return idPersonDocumentCancellationData;
    }

    /**
     * Sets the value of the idPersonDocumentCancellationData property.
     * 
     */
    public void setIdPersonDocumentCancellationData(int value) {
        this.idPersonDocumentCancellationData = value;
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
     * Gets the value of the idPersonDocumentCancellation property.
     * 
     */
    public int getIdPersonDocumentCancellation() {
        return idPersonDocumentCancellation;
    }

    /**
     * Sets the value of the idPersonDocumentCancellation property.
     * 
     */
    public void setIdPersonDocumentCancellation(int value) {
        this.idPersonDocumentCancellation = value;
    }

    /**
     * Gets the value of the personDocumentCancellationDataLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonDocumentCancellationDataLastChange() {
        return personDocumentCancellationDataLastChange;
    }

    /**
     * Sets the value of the personDocumentCancellationDataLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonDocumentCancellationDataLastChange(XMLGregorianCalendar value) {
        this.personDocumentCancellationDataLastChange = value;
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
     * Gets the value of the idPerson property.
     * 
     */
    public int getIdPerson() {
        return idPerson;
    }

    /**
     * Sets the value of the idPerson property.
     * 
     */
    public void setIdPerson(int value) {
        this.idPerson = value;
    }

    /**
     * Gets the value of the cancellad property.
     * 
     */
    public int getCancellad() {
        return cancellad;
    }

    /**
     * Sets the value of the cancellad property.
     * 
     */
    public void setCancellad(int value) {
        this.cancellad = value;
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
     * Gets the value of the idPersonDocumentCancellationType property.
     * 
     */
    public int getIdPersonDocumentCancellationType() {
        return idPersonDocumentCancellationType;
    }

    /**
     * Sets the value of the idPersonDocumentCancellationType property.
     * 
     */
    public void setIdPersonDocumentCancellationType(int value) {
        this.idPersonDocumentCancellationType = value;
    }

    /**
     * Gets the value of the personDocumentCancellationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonDocumentCancellationTypeName() {
        return personDocumentCancellationTypeName;
    }

    /**
     * Sets the value of the personDocumentCancellationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonDocumentCancellationTypeName(String value) {
        this.personDocumentCancellationTypeName = value;
    }

}
