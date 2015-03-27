
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonAcademicPublicationsGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonAcademicPublicationsGet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonAcademicPublication" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicPublicationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonAcademicPublicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonAcademicPublicationPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonAcademicPublicationYear" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonAcademicPublicationPublishing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicPublicationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonAcademicPublicationsGet", propOrder = {
    "idPersonAcademicPublication",
    "personCodeU",
    "idAcademicPublicationType",
    "personAcademicPublicationName",
    "personAcademicPublicationPages",
    "personAcademicPublicationYear",
    "personAcademicPublicationPublishing",
    "academicPublicationTypeName"
})
public class DPersonAcademicPublicationsGet {

    @XmlElement(name = "Id_PersonAcademicPublication")
    protected int idPersonAcademicPublication;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "Id_AcademicPublicationType")
    protected int idAcademicPublicationType;
    @XmlElement(name = "PersonAcademicPublicationName")
    protected String personAcademicPublicationName;
    @XmlElement(name = "PersonAcademicPublicationPages")
    protected int personAcademicPublicationPages;
    @XmlElement(name = "PersonAcademicPublicationYear", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personAcademicPublicationYear;
    @XmlElement(name = "PersonAcademicPublicationPublishing")
    protected String personAcademicPublicationPublishing;
    @XmlElement(name = "AcademicPublicationTypeName")
    protected String academicPublicationTypeName;

    /**
     * Gets the value of the idPersonAcademicPublication property.
     * 
     */
    public int getIdPersonAcademicPublication() {
        return idPersonAcademicPublication;
    }

    /**
     * Sets the value of the idPersonAcademicPublication property.
     * 
     */
    public void setIdPersonAcademicPublication(int value) {
        this.idPersonAcademicPublication = value;
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
     * Gets the value of the idAcademicPublicationType property.
     * 
     */
    public int getIdAcademicPublicationType() {
        return idAcademicPublicationType;
    }

    /**
     * Sets the value of the idAcademicPublicationType property.
     * 
     */
    public void setIdAcademicPublicationType(int value) {
        this.idAcademicPublicationType = value;
    }

    /**
     * Gets the value of the personAcademicPublicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonAcademicPublicationName() {
        return personAcademicPublicationName;
    }

    /**
     * Sets the value of the personAcademicPublicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonAcademicPublicationName(String value) {
        this.personAcademicPublicationName = value;
    }

    /**
     * Gets the value of the personAcademicPublicationPages property.
     * 
     */
    public int getPersonAcademicPublicationPages() {
        return personAcademicPublicationPages;
    }

    /**
     * Sets the value of the personAcademicPublicationPages property.
     * 
     */
    public void setPersonAcademicPublicationPages(int value) {
        this.personAcademicPublicationPages = value;
    }

    /**
     * Gets the value of the personAcademicPublicationYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonAcademicPublicationYear() {
        return personAcademicPublicationYear;
    }

    /**
     * Sets the value of the personAcademicPublicationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonAcademicPublicationYear(XMLGregorianCalendar value) {
        this.personAcademicPublicationYear = value;
    }

    /**
     * Gets the value of the personAcademicPublicationPublishing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonAcademicPublicationPublishing() {
        return personAcademicPublicationPublishing;
    }

    /**
     * Sets the value of the personAcademicPublicationPublishing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonAcademicPublicationPublishing(String value) {
        this.personAcademicPublicationPublishing = value;
    }

    /**
     * Gets the value of the academicPublicationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicPublicationTypeName() {
        return academicPublicationTypeName;
    }

    /**
     * Sets the value of the academicPublicationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicPublicationTypeName(String value) {
        this.academicPublicationTypeName = value;
    }

}
