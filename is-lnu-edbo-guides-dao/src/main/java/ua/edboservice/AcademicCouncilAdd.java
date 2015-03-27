
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
 *         &lt;element name="AcademicCouncilOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicCouncilOrderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicCouncilDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicCouncilDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicCouncilType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicCouncilNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Web" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU_Head" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO_Head" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU_HeadDeputy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO_HeadDeputy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU_Secretary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO_Secretary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsSingle" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "academicCouncilOrderNumber",
    "academicCouncilOrderDate",
    "universityKode",
    "academicCouncilDateBegin",
    "academicCouncilDateEnd",
    "universityFacultetKode",
    "idAcademicCouncilType",
    "academicCouncilNumber",
    "address",
    "phone",
    "fax",
    "email",
    "web",
    "personCodeUHead",
    "fioHead",
    "personCodeUHeadDeputy",
    "fioHeadDeputy",
    "personCodeUSecretary",
    "fioSecretary",
    "isSingle"
})
@XmlRootElement(name = "AcademicCouncilAdd")
public class AcademicCouncilAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "AcademicCouncilOrderNumber")
    protected String academicCouncilOrderNumber;
    @XmlElement(name = "AcademicCouncilOrderDate")
    protected String academicCouncilOrderDate;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "AcademicCouncilDateBegin")
    protected String academicCouncilDateBegin;
    @XmlElement(name = "AcademicCouncilDateEnd")
    protected String academicCouncilDateEnd;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "Id_AcademicCouncilType")
    protected int idAcademicCouncilType;
    @XmlElement(name = "AcademicCouncilNumber")
    protected String academicCouncilNumber;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Web")
    protected String web;
    @XmlElement(name = "PersonCodeU_Head")
    protected String personCodeUHead;
    @XmlElement(name = "FIO_Head")
    protected String fioHead;
    @XmlElement(name = "PersonCodeU_HeadDeputy")
    protected String personCodeUHeadDeputy;
    @XmlElement(name = "FIO_HeadDeputy")
    protected String fioHeadDeputy;
    @XmlElement(name = "PersonCodeU_Secretary")
    protected String personCodeUSecretary;
    @XmlElement(name = "FIO_Secretary")
    protected String fioSecretary;
    @XmlElement(name = "IsSingle")
    protected int isSingle;

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
     * Gets the value of the academicCouncilOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicCouncilOrderNumber() {
        return academicCouncilOrderNumber;
    }

    /**
     * Sets the value of the academicCouncilOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicCouncilOrderNumber(String value) {
        this.academicCouncilOrderNumber = value;
    }

    /**
     * Gets the value of the academicCouncilOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicCouncilOrderDate() {
        return academicCouncilOrderDate;
    }

    /**
     * Sets the value of the academicCouncilOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicCouncilOrderDate(String value) {
        this.academicCouncilOrderDate = value;
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
     * Gets the value of the academicCouncilDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicCouncilDateBegin() {
        return academicCouncilDateBegin;
    }

    /**
     * Sets the value of the academicCouncilDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicCouncilDateBegin(String value) {
        this.academicCouncilDateBegin = value;
    }

    /**
     * Gets the value of the academicCouncilDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicCouncilDateEnd() {
        return academicCouncilDateEnd;
    }

    /**
     * Sets the value of the academicCouncilDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicCouncilDateEnd(String value) {
        this.academicCouncilDateEnd = value;
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
     * Gets the value of the idAcademicCouncilType property.
     * 
     */
    public int getIdAcademicCouncilType() {
        return idAcademicCouncilType;
    }

    /**
     * Sets the value of the idAcademicCouncilType property.
     * 
     */
    public void setIdAcademicCouncilType(int value) {
        this.idAcademicCouncilType = value;
    }

    /**
     * Gets the value of the academicCouncilNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicCouncilNumber() {
        return academicCouncilNumber;
    }

    /**
     * Sets the value of the academicCouncilNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicCouncilNumber(String value) {
        this.academicCouncilNumber = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
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
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
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
     * Gets the value of the web property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeb() {
        return web;
    }

    /**
     * Sets the value of the web property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeb(String value) {
        this.web = value;
    }

    /**
     * Gets the value of the personCodeUHead property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeUHead() {
        return personCodeUHead;
    }

    /**
     * Sets the value of the personCodeUHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeUHead(String value) {
        this.personCodeUHead = value;
    }

    /**
     * Gets the value of the fioHead property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIOHead() {
        return fioHead;
    }

    /**
     * Sets the value of the fioHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIOHead(String value) {
        this.fioHead = value;
    }

    /**
     * Gets the value of the personCodeUHeadDeputy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeUHeadDeputy() {
        return personCodeUHeadDeputy;
    }

    /**
     * Sets the value of the personCodeUHeadDeputy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeUHeadDeputy(String value) {
        this.personCodeUHeadDeputy = value;
    }

    /**
     * Gets the value of the fioHeadDeputy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIOHeadDeputy() {
        return fioHeadDeputy;
    }

    /**
     * Sets the value of the fioHeadDeputy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIOHeadDeputy(String value) {
        this.fioHeadDeputy = value;
    }

    /**
     * Gets the value of the personCodeUSecretary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeUSecretary() {
        return personCodeUSecretary;
    }

    /**
     * Sets the value of the personCodeUSecretary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeUSecretary(String value) {
        this.personCodeUSecretary = value;
    }

    /**
     * Gets the value of the fioSecretary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIOSecretary() {
        return fioSecretary;
    }

    /**
     * Sets the value of the fioSecretary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIOSecretary(String value) {
        this.fioSecretary = value;
    }

    /**
     * Gets the value of the isSingle property.
     * 
     */
    public int getIsSingle() {
        return isSingle;
    }

    /**
     * Sets the value of the isSingle property.
     * 
     */
    public void setIsSingle(int value) {
        this.isSingle = value;
    }

}
