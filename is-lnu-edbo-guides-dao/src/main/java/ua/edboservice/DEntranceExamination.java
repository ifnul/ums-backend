
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dEntranceExamination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dEntranceExamination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_EntranceExamination" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequestSeasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BossName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Adress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_EntranceExaminationTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EntranceExaminationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HeadBossName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EntranceExaminationIsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityFacultet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdressDocumentGet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dEntranceExamination", propOrder = {
    "idEntranceExamination",
    "idPersonRequestSeasons",
    "universityKode",
    "bossName",
    "adress",
    "email",
    "phone",
    "webSite",
    "description",
    "dateLastChange",
    "idEntranceExaminationTypes",
    "entranceExaminationTypeName",
    "headBossName",
    "dateBegin",
    "dateEnd",
    "entranceExaminationIsActive",
    "universityFacultetKode",
    "idUniversityFacultet",
    "universityFacultetFullName",
    "adressDocumentGet"
})
public class DEntranceExamination {

    @XmlElement(name = "Id_EntranceExamination")
    protected int idEntranceExamination;
    @XmlElement(name = "Id_PersonRequestSeasons")
    protected int idPersonRequestSeasons;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "BossName")
    protected String bossName;
    @XmlElement(name = "Adress")
    protected String adress;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "WebSite")
    protected String webSite;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "Id_EntranceExaminationTypes")
    protected int idEntranceExaminationTypes;
    @XmlElement(name = "EntranceExaminationTypeName")
    protected String entranceExaminationTypeName;
    @XmlElement(name = "HeadBossName")
    protected String headBossName;
    @XmlElement(name = "DateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateBegin;
    @XmlElement(name = "DateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateEnd;
    @XmlElement(name = "EntranceExaminationIsActive")
    protected int entranceExaminationIsActive;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "Id_UniversityFacultet")
    protected int idUniversityFacultet;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "AdressDocumentGet")
    protected String adressDocumentGet;

    /**
     * Gets the value of the idEntranceExamination property.
     * 
     */
    public int getIdEntranceExamination() {
        return idEntranceExamination;
    }

    /**
     * Sets the value of the idEntranceExamination property.
     * 
     */
    public void setIdEntranceExamination(int value) {
        this.idEntranceExamination = value;
    }

    /**
     * Gets the value of the idPersonRequestSeasons property.
     * 
     */
    public int getIdPersonRequestSeasons() {
        return idPersonRequestSeasons;
    }

    /**
     * Sets the value of the idPersonRequestSeasons property.
     * 
     */
    public void setIdPersonRequestSeasons(int value) {
        this.idPersonRequestSeasons = value;
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
     * Gets the value of the bossName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBossName() {
        return bossName;
    }

    /**
     * Sets the value of the bossName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBossName(String value) {
        this.bossName = value;
    }

    /**
     * Gets the value of the adress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdress() {
        return adress;
    }

    /**
     * Sets the value of the adress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdress(String value) {
        this.adress = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the webSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebSite() {
        return webSite;
    }

    /**
     * Sets the value of the webSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebSite(String value) {
        this.webSite = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the idEntranceExaminationTypes property.
     * 
     */
    public int getIdEntranceExaminationTypes() {
        return idEntranceExaminationTypes;
    }

    /**
     * Sets the value of the idEntranceExaminationTypes property.
     * 
     */
    public void setIdEntranceExaminationTypes(int value) {
        this.idEntranceExaminationTypes = value;
    }

    /**
     * Gets the value of the entranceExaminationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntranceExaminationTypeName() {
        return entranceExaminationTypeName;
    }

    /**
     * Sets the value of the entranceExaminationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntranceExaminationTypeName(String value) {
        this.entranceExaminationTypeName = value;
    }

    /**
     * Gets the value of the headBossName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadBossName() {
        return headBossName;
    }

    /**
     * Sets the value of the headBossName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadBossName(String value) {
        this.headBossName = value;
    }

    /**
     * Gets the value of the dateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateBegin() {
        return dateBegin;
    }

    /**
     * Sets the value of the dateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateBegin(XMLGregorianCalendar value) {
        this.dateBegin = value;
    }

    /**
     * Gets the value of the dateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEnd() {
        return dateEnd;
    }

    /**
     * Sets the value of the dateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEnd(XMLGregorianCalendar value) {
        this.dateEnd = value;
    }

    /**
     * Gets the value of the entranceExaminationIsActive property.
     * 
     */
    public int getEntranceExaminationIsActive() {
        return entranceExaminationIsActive;
    }

    /**
     * Sets the value of the entranceExaminationIsActive property.
     * 
     */
    public void setEntranceExaminationIsActive(int value) {
        this.entranceExaminationIsActive = value;
    }

    /**
     * Gets the value of the universityFacultetKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetKode() {
        return universityFacultetKode;
    }

    /**
     * Sets the value of the universityFacultetKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetKode(String value) {
        this.universityFacultetKode = value;
    }

    /**
     * Gets the value of the idUniversityFacultet property.
     * 
     */
    public int getIdUniversityFacultet() {
        return idUniversityFacultet;
    }

    /**
     * Sets the value of the idUniversityFacultet property.
     * 
     */
    public void setIdUniversityFacultet(int value) {
        this.idUniversityFacultet = value;
    }

    /**
     * Gets the value of the universityFacultetFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetFullName() {
        return universityFacultetFullName;
    }

    /**
     * Sets the value of the universityFacultetFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetFullName(String value) {
        this.universityFacultetFullName = value;
    }

    /**
     * Gets the value of the adressDocumentGet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdressDocumentGet() {
        return adressDocumentGet;
    }

    /**
     * Sets the value of the adressDocumentGet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdressDocumentGet(String value) {
        this.adressDocumentGet = value;
    }

}
