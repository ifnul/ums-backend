
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityCertificates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityCertificates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityCertificates" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityCertificatesFilePasswordSendType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityCertificatesBeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityCertificatesExpiredDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityCertificatesDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityRegistration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityCertificates", propOrder = {
    "idUniversityCertificates",
    "universityCertificatesFilePasswordSendType",
    "universityCertificatesBeginDate",
    "universityCertificatesExpiredDate",
    "universityCertificatesDateLastChange",
    "number",
    "idUniversityRegistration",
    "universityKode"
})
public class DUniversityCertificates {

    @XmlElement(name = "Id_UniversityCertificates")
    protected int idUniversityCertificates;
    @XmlElement(name = "UniversityCertificatesFilePasswordSendType")
    protected int universityCertificatesFilePasswordSendType;
    @XmlElement(name = "UniversityCertificatesBeginDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityCertificatesBeginDate;
    @XmlElement(name = "UniversityCertificatesExpiredDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityCertificatesExpiredDate;
    @XmlElement(name = "UniversityCertificatesDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityCertificatesDateLastChange;
    @XmlElement(name = "Number")
    protected int number;
    @XmlElement(name = "Id_UniversityRegistration")
    protected int idUniversityRegistration;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;

    /**
     * Gets the value of the idUniversityCertificates property.
     * 
     */
    public int getIdUniversityCertificates() {
        return idUniversityCertificates;
    }

    /**
     * Sets the value of the idUniversityCertificates property.
     * 
     */
    public void setIdUniversityCertificates(int value) {
        this.idUniversityCertificates = value;
    }

    /**
     * Gets the value of the universityCertificatesFilePasswordSendType property.
     * 
     */
    public int getUniversityCertificatesFilePasswordSendType() {
        return universityCertificatesFilePasswordSendType;
    }

    /**
     * Sets the value of the universityCertificatesFilePasswordSendType property.
     * 
     */
    public void setUniversityCertificatesFilePasswordSendType(int value) {
        this.universityCertificatesFilePasswordSendType = value;
    }

    /**
     * Gets the value of the universityCertificatesBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityCertificatesBeginDate() {
        return universityCertificatesBeginDate;
    }

    /**
     * Sets the value of the universityCertificatesBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityCertificatesBeginDate(XMLGregorianCalendar value) {
        this.universityCertificatesBeginDate = value;
    }

    /**
     * Gets the value of the universityCertificatesExpiredDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityCertificatesExpiredDate() {
        return universityCertificatesExpiredDate;
    }

    /**
     * Sets the value of the universityCertificatesExpiredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityCertificatesExpiredDate(XMLGregorianCalendar value) {
        this.universityCertificatesExpiredDate = value;
    }

    /**
     * Gets the value of the universityCertificatesDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityCertificatesDateLastChange() {
        return universityCertificatesDateLastChange;
    }

    /**
     * Sets the value of the universityCertificatesDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityCertificatesDateLastChange(XMLGregorianCalendar value) {
        this.universityCertificatesDateLastChange = value;
    }

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the idUniversityRegistration property.
     * 
     */
    public int getIdUniversityRegistration() {
        return idUniversityRegistration;
    }

    /**
     * Sets the value of the idUniversityRegistration property.
     * 
     */
    public void setIdUniversityRegistration(int value) {
        this.idUniversityRegistration = value;
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

}
