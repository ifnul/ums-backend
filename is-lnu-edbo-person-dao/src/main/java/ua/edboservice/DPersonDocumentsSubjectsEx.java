
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonDocumentsSubjectsEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonDocumentsSubjectsEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentSubject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Subject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdZnoSubject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDocumentSubjectValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DocumentNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZNOPin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocumentDateGet" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonDocumentsSubjectsEx", propOrder = {
    "idPersonDocument",
    "idPersonDocumentSubject",
    "idSubject",
    "idZnoSubject",
    "subjectName",
    "personDocumentSubjectValue",
    "documentNumbers",
    "znoPin",
    "documentDateGet"
})
public class DPersonDocumentsSubjectsEx {

    @XmlElement(name = "Id_PersonDocument")
    protected int idPersonDocument;
    @XmlElement(name = "Id_PersonDocumentSubject")
    protected int idPersonDocumentSubject;
    @XmlElement(name = "Id_Subject")
    protected int idSubject;
    @XmlElement(name = "IdZnoSubject")
    protected int idZnoSubject;
    @XmlElement(name = "SubjectName")
    protected String subjectName;
    @XmlElement(name = "PersonDocumentSubjectValue")
    protected double personDocumentSubjectValue;
    @XmlElement(name = "DocumentNumbers")
    protected String documentNumbers;
    @XmlElement(name = "ZNOPin")
    protected int znoPin;
    @XmlElement(name = "DocumentDateGet", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDateGet;

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
     * Gets the value of the idPersonDocumentSubject property.
     * 
     */
    public int getIdPersonDocumentSubject() {
        return idPersonDocumentSubject;
    }

    /**
     * Sets the value of the idPersonDocumentSubject property.
     * 
     */
    public void setIdPersonDocumentSubject(int value) {
        this.idPersonDocumentSubject = value;
    }

    /**
     * Gets the value of the idSubject property.
     * 
     */
    public int getIdSubject() {
        return idSubject;
    }

    /**
     * Sets the value of the idSubject property.
     * 
     */
    public void setIdSubject(int value) {
        this.idSubject = value;
    }

    /**
     * Gets the value of the idZnoSubject property.
     * 
     */
    public int getIdZnoSubject() {
        return idZnoSubject;
    }

    /**
     * Sets the value of the idZnoSubject property.
     * 
     */
    public void setIdZnoSubject(int value) {
        this.idZnoSubject = value;
    }

    /**
     * Gets the value of the subjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * Sets the value of the subjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName(String value) {
        this.subjectName = value;
    }

    /**
     * Gets the value of the personDocumentSubjectValue property.
     * 
     */
    public double getPersonDocumentSubjectValue() {
        return personDocumentSubjectValue;
    }

    /**
     * Sets the value of the personDocumentSubjectValue property.
     * 
     */
    public void setPersonDocumentSubjectValue(double value) {
        this.personDocumentSubjectValue = value;
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
     * Gets the value of the znoPin property.
     * 
     */
    public int getZNOPin() {
        return znoPin;
    }

    /**
     * Sets the value of the znoPin property.
     * 
     */
    public void setZNOPin(int value) {
        this.znoPin = value;
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

}
