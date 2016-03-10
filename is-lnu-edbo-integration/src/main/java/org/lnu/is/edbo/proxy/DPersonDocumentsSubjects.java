
package org.lnu.is.edbo.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonDocumentsSubjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonDocumentsSubjects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentSubject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Subject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdZnoSubject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDocumentSubjectValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonDocumentsSubjects", propOrder = {
    "idPersonDocument",
    "idPersonDocumentSubject",
    "idSubject",
    "idZnoSubject",
    "subjectName",
    "personDocumentSubjectValue"
})
public class DPersonDocumentsSubjects {

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

}
