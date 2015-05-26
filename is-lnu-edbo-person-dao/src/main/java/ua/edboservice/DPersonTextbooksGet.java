
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonTextbooksGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonTextbooksGet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonTextbook" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_TextbookType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonTextbookPageNumbers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonTextbookDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TextbookTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonTextBookName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UserAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CharacterBook" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutputData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonTextbookAllPageNumbers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Collaborators" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublishYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonTextbooksGet", propOrder = {
    "idPersonTextbook",
    "personCodeU",
    "idTextbookType",
    "personTextbookPageNumbers",
    "personTextbookDateLastChange",
    "textbookTypeName",
    "personTextBookName",
    "idUserAdd",
    "fio",
    "universityKode",
    "idUniversity",
    "universityFullName",
    "characterBook",
    "outputData",
    "personTextbookAllPageNumbers",
    "collaborators",
    "publishYear"
})
public class DPersonTextbooksGet {

    @XmlElement(name = "Id_PersonTextbook")
    protected int idPersonTextbook;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "Id_TextbookType")
    protected int idTextbookType;
    @XmlElement(name = "PersonTextbookPageNumbers")
    protected int personTextbookPageNumbers;
    @XmlElement(name = "PersonTextbookDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personTextbookDateLastChange;
    @XmlElement(name = "TextbookTypeName")
    protected String textbookTypeName;
    @XmlElement(name = "PersonTextBookName")
    protected String personTextBookName;
    @XmlElement(name = "Id_UserAdd")
    protected int idUserAdd;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "CharacterBook")
    protected String characterBook;
    @XmlElement(name = "OutputData")
    protected String outputData;
    @XmlElement(name = "PersonTextbookAllPageNumbers")
    protected int personTextbookAllPageNumbers;
    @XmlElement(name = "Collaborators")
    protected String collaborators;
    @XmlElement(name = "PublishYear")
    protected int publishYear;

    /**
     * Gets the value of the idPersonTextbook property.
     * 
     */
    public int getIdPersonTextbook() {
        return idPersonTextbook;
    }

    /**
     * Sets the value of the idPersonTextbook property.
     * 
     */
    public void setIdPersonTextbook(int value) {
        this.idPersonTextbook = value;
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
     * Gets the value of the idTextbookType property.
     * 
     */
    public int getIdTextbookType() {
        return idTextbookType;
    }

    /**
     * Sets the value of the idTextbookType property.
     * 
     */
    public void setIdTextbookType(int value) {
        this.idTextbookType = value;
    }

    /**
     * Gets the value of the personTextbookPageNumbers property.
     * 
     */
    public int getPersonTextbookPageNumbers() {
        return personTextbookPageNumbers;
    }

    /**
     * Sets the value of the personTextbookPageNumbers property.
     * 
     */
    public void setPersonTextbookPageNumbers(int value) {
        this.personTextbookPageNumbers = value;
    }

    /**
     * Gets the value of the personTextbookDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonTextbookDateLastChange() {
        return personTextbookDateLastChange;
    }

    /**
     * Sets the value of the personTextbookDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonTextbookDateLastChange(XMLGregorianCalendar value) {
        this.personTextbookDateLastChange = value;
    }

    /**
     * Gets the value of the textbookTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextbookTypeName() {
        return textbookTypeName;
    }

    /**
     * Sets the value of the textbookTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextbookTypeName(String value) {
        this.textbookTypeName = value;
    }

    /**
     * Gets the value of the personTextBookName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonTextBookName() {
        return personTextBookName;
    }

    /**
     * Sets the value of the personTextBookName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonTextBookName(String value) {
        this.personTextBookName = value;
    }

    /**
     * Gets the value of the idUserAdd property.
     * 
     */
    public int getIdUserAdd() {
        return idUserAdd;
    }

    /**
     * Sets the value of the idUserAdd property.
     * 
     */
    public void setIdUserAdd(int value) {
        this.idUserAdd = value;
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
     * Gets the value of the universityKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKode() {
        return universityKode;
    }

    /**
     * Sets the value of the universityKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKode(String value) {
        this.universityKode = value;
    }

    /**
     * Gets the value of the idUniversity property.
     * 
     */
    public int getIdUniversity() {
        return idUniversity;
    }

    /**
     * Sets the value of the idUniversity property.
     * 
     */
    public void setIdUniversity(int value) {
        this.idUniversity = value;
    }

    /**
     * Gets the value of the universityFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullName() {
        return universityFullName;
    }

    /**
     * Sets the value of the universityFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullName(String value) {
        this.universityFullName = value;
    }

    /**
     * Gets the value of the characterBook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacterBook() {
        return characterBook;
    }

    /**
     * Sets the value of the characterBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacterBook(String value) {
        this.characterBook = value;
    }

    /**
     * Gets the value of the outputData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputData() {
        return outputData;
    }

    /**
     * Sets the value of the outputData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputData(String value) {
        this.outputData = value;
    }

    /**
     * Gets the value of the personTextbookAllPageNumbers property.
     * 
     */
    public int getPersonTextbookAllPageNumbers() {
        return personTextbookAllPageNumbers;
    }

    /**
     * Sets the value of the personTextbookAllPageNumbers property.
     * 
     */
    public void setPersonTextbookAllPageNumbers(int value) {
        this.personTextbookAllPageNumbers = value;
    }

    /**
     * Gets the value of the collaborators property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollaborators() {
        return collaborators;
    }

    /**
     * Sets the value of the collaborators property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollaborators(String value) {
        this.collaborators = value;
    }

    /**
     * Gets the value of the publishYear property.
     * 
     */
    public int getPublishYear() {
        return publishYear;
    }

    /**
     * Sets the value of the publishYear property.
     * 
     */
    public void setPublishYear(int value) {
        this.publishYear = value;
    }

}
