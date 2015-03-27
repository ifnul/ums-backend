
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
 *         &lt;element name="Id_PersonTextbook" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_TextbookType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonTextbookPageNumbers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonTextBookName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "sessionGUID",
    "idPersonTextbook",
    "idTextbookType",
    "personTextbookPageNumbers",
    "personTextBookName",
    "characterBook",
    "outputData",
    "personTextbookAllPageNumbers",
    "collaborators",
    "publishYear"
})
@XmlRootElement(name = "PersonTextbooksEdit")
public class PersonTextbooksEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_PersonTextbook")
    protected int idPersonTextbook;
    @XmlElement(name = "Id_TextbookType")
    protected int idTextbookType;
    @XmlElement(name = "PersonTextbookPageNumbers")
    protected int personTextbookPageNumbers;
    @XmlElement(name = "PersonTextBookName")
    protected String personTextBookName;
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
