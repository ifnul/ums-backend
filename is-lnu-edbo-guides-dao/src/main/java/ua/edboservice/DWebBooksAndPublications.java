
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dWebBooksAndPublications complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dWebBooksAndPublications">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_WebBooksAndPublications" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonTextBookName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_TextbookType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutputData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonTextbookPageNumbers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonTextbookAllPageNumbers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Collaborators" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_WebPersons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TextbookTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dWebBooksAndPublications", propOrder = {
    "idWebBooksAndPublications",
    "personTextBookName",
    "idTextbookType",
    "outputData",
    "year",
    "personTextbookPageNumbers",
    "personTextbookAllPageNumbers",
    "collaborators",
    "idWebPersons",
    "textbookTypeName"
})
public class DWebBooksAndPublications {

    @XmlElement(name = "Id_WebBooksAndPublications")
    protected int idWebBooksAndPublications;
    @XmlElement(name = "PersonTextBookName")
    protected String personTextBookName;
    @XmlElement(name = "Id_TextbookType")
    protected int idTextbookType;
    @XmlElement(name = "OutputData")
    protected String outputData;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "PersonTextbookPageNumbers")
    protected int personTextbookPageNumbers;
    @XmlElement(name = "PersonTextbookAllPageNumbers")
    protected int personTextbookAllPageNumbers;
    @XmlElement(name = "Collaborators")
    protected String collaborators;
    @XmlElement(name = "Id_WebPersons")
    protected int idWebPersons;
    @XmlElement(name = "TextbookTypeName")
    protected String textbookTypeName;

    /**
     * Gets the value of the idWebBooksAndPublications property.
     * 
     */
    public int getIdWebBooksAndPublications() {
        return idWebBooksAndPublications;
    }

    /**
     * Sets the value of the idWebBooksAndPublications property.
     * 
     */
    public void setIdWebBooksAndPublications(int value) {
        this.idWebBooksAndPublications = value;
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
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
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
     * Gets the value of the idWebPersons property.
     * 
     */
    public int getIdWebPersons() {
        return idWebPersons;
    }

    /**
     * Sets the value of the idWebPersons property.
     * 
     */
    public void setIdWebPersons(int value) {
        this.idWebPersons = value;
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

}
