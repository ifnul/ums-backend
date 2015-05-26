
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonDocumentsValuesFull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonDocumentsValuesFull">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonDocumentUniversityAttestatValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDocumentUniversityAttestatValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonDocumentsValuesFull", propOrder = {
    "idPersonDocumentUniversityAttestatValue",
    "idPersonDocument",
    "universityKode",
    "personDocumentUniversityAttestatValue",
    "dateLastChange",
    "idUniversity",
    "universityFullName"
})
public class DPersonDocumentsValuesFull {

    @XmlElement(name = "Id_PersonDocumentUniversityAttestatValue")
    protected int idPersonDocumentUniversityAttestatValue;
    @XmlElement(name = "Id_PersonDocument")
    protected int idPersonDocument;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "PersonDocumentUniversityAttestatValue", required = true)
    protected BigDecimal personDocumentUniversityAttestatValue;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;

    /**
     * Gets the value of the idPersonDocumentUniversityAttestatValue property.
     * 
     */
    public int getIdPersonDocumentUniversityAttestatValue() {
        return idPersonDocumentUniversityAttestatValue;
    }

    /**
     * Sets the value of the idPersonDocumentUniversityAttestatValue property.
     * 
     */
    public void setIdPersonDocumentUniversityAttestatValue(int value) {
        this.idPersonDocumentUniversityAttestatValue = value;
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
     * Gets the value of the personDocumentUniversityAttestatValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPersonDocumentUniversityAttestatValue() {
        return personDocumentUniversityAttestatValue;
    }

    /**
     * Sets the value of the personDocumentUniversityAttestatValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPersonDocumentUniversityAttestatValue(BigDecimal value) {
        this.personDocumentUniversityAttestatValue = value;
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

}
