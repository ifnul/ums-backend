
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonAcademiesGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonAcademiesGet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonAcademy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcandemyType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonAcademyDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonAcademyDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonAcademyDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AcandemyTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonAcademiesGet", propOrder = {
    "idPersonAcademy",
    "idAcandemyType",
    "personCodeU",
    "personAcademyDateBegin",
    "personAcademyDateEnd",
    "personAcademyDateLastChange",
    "acandemyTypeName"
})
public class DPersonAcademiesGet {

    @XmlElement(name = "Id_PersonAcademy")
    protected int idPersonAcademy;
    @XmlElement(name = "Id_AcandemyType")
    protected int idAcandemyType;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "PersonAcademyDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personAcademyDateBegin;
    @XmlElement(name = "PersonAcademyDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personAcademyDateEnd;
    @XmlElement(name = "PersonAcademyDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personAcademyDateLastChange;
    @XmlElement(name = "AcandemyTypeName")
    protected String acandemyTypeName;

    /**
     * Gets the value of the idPersonAcademy property.
     * 
     */
    public int getIdPersonAcademy() {
        return idPersonAcademy;
    }

    /**
     * Sets the value of the idPersonAcademy property.
     * 
     */
    public void setIdPersonAcademy(int value) {
        this.idPersonAcademy = value;
    }

    /**
     * Gets the value of the idAcandemyType property.
     * 
     */
    public int getIdAcandemyType() {
        return idAcandemyType;
    }

    /**
     * Sets the value of the idAcandemyType property.
     * 
     */
    public void setIdAcandemyType(int value) {
        this.idAcandemyType = value;
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
     * Gets the value of the personAcademyDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonAcademyDateBegin() {
        return personAcademyDateBegin;
    }

    /**
     * Sets the value of the personAcademyDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonAcademyDateBegin(XMLGregorianCalendar value) {
        this.personAcademyDateBegin = value;
    }

    /**
     * Gets the value of the personAcademyDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonAcademyDateEnd() {
        return personAcademyDateEnd;
    }

    /**
     * Sets the value of the personAcademyDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonAcademyDateEnd(XMLGregorianCalendar value) {
        this.personAcademyDateEnd = value;
    }

    /**
     * Gets the value of the personAcademyDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonAcademyDateLastChange() {
        return personAcademyDateLastChange;
    }

    /**
     * Sets the value of the personAcademyDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonAcademyDateLastChange(XMLGregorianCalendar value) {
        this.personAcademyDateLastChange = value;
    }

    /**
     * Gets the value of the acandemyTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcandemyTypeName() {
        return acandemyTypeName;
    }

    /**
     * Sets the value of the acandemyTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcandemyTypeName(String value) {
        this.acandemyTypeName = value;
    }

}
