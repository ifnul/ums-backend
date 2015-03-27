
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonRequestsStatuses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonRequestsStatuses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonRequestStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequestStatusType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonRequestStatusTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonRequestStatusTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Descryption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityEntrantWave" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsBudejt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsContract" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityEntrantWaveName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonRequestsStatuses", propOrder = {
    "idPersonRequestStatus",
    "idPersonRequest",
    "idPersonRequestStatusType",
    "personRequestStatusTypeName",
    "personRequestStatusTypeDescription",
    "dateLastChange",
    "descryption",
    "isActive",
    "idUniversityEntrantWave",
    "isBudejt",
    "isContract",
    "universityEntrantWaveName"
})
public class DPersonRequestsStatuses {

    @XmlElement(name = "Id_PersonRequestStatus")
    protected int idPersonRequestStatus;
    @XmlElement(name = "Id_PersonRequest")
    protected int idPersonRequest;
    @XmlElement(name = "Id_PersonRequestStatusType")
    protected int idPersonRequestStatusType;
    @XmlElement(name = "PersonRequestStatusTypeName")
    protected String personRequestStatusTypeName;
    @XmlElement(name = "PersonRequestStatusTypeDescription")
    protected String personRequestStatusTypeDescription;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "Descryption")
    protected String descryption;
    @XmlElement(name = "IsActive")
    protected int isActive;
    @XmlElement(name = "Id_UniversityEntrantWave")
    protected int idUniversityEntrantWave;
    @XmlElement(name = "IsBudejt")
    protected int isBudejt;
    @XmlElement(name = "IsContract")
    protected int isContract;
    @XmlElement(name = "UniversityEntrantWaveName")
    protected String universityEntrantWaveName;

    /**
     * Gets the value of the idPersonRequestStatus property.
     * 
     */
    public int getIdPersonRequestStatus() {
        return idPersonRequestStatus;
    }

    /**
     * Sets the value of the idPersonRequestStatus property.
     * 
     */
    public void setIdPersonRequestStatus(int value) {
        this.idPersonRequestStatus = value;
    }

    /**
     * Gets the value of the idPersonRequest property.
     * 
     */
    public int getIdPersonRequest() {
        return idPersonRequest;
    }

    /**
     * Sets the value of the idPersonRequest property.
     * 
     */
    public void setIdPersonRequest(int value) {
        this.idPersonRequest = value;
    }

    /**
     * Gets the value of the idPersonRequestStatusType property.
     * 
     */
    public int getIdPersonRequestStatusType() {
        return idPersonRequestStatusType;
    }

    /**
     * Sets the value of the idPersonRequestStatusType property.
     * 
     */
    public void setIdPersonRequestStatusType(int value) {
        this.idPersonRequestStatusType = value;
    }

    /**
     * Gets the value of the personRequestStatusTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRequestStatusTypeName() {
        return personRequestStatusTypeName;
    }

    /**
     * Sets the value of the personRequestStatusTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRequestStatusTypeName(String value) {
        this.personRequestStatusTypeName = value;
    }

    /**
     * Gets the value of the personRequestStatusTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRequestStatusTypeDescription() {
        return personRequestStatusTypeDescription;
    }

    /**
     * Sets the value of the personRequestStatusTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRequestStatusTypeDescription(String value) {
        this.personRequestStatusTypeDescription = value;
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
     * Gets the value of the descryption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescryption() {
        return descryption;
    }

    /**
     * Sets the value of the descryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescryption(String value) {
        this.descryption = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
    public int getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(int value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the idUniversityEntrantWave property.
     * 
     */
    public int getIdUniversityEntrantWave() {
        return idUniversityEntrantWave;
    }

    /**
     * Sets the value of the idUniversityEntrantWave property.
     * 
     */
    public void setIdUniversityEntrantWave(int value) {
        this.idUniversityEntrantWave = value;
    }

    /**
     * Gets the value of the isBudejt property.
     * 
     */
    public int getIsBudejt() {
        return isBudejt;
    }

    /**
     * Sets the value of the isBudejt property.
     * 
     */
    public void setIsBudejt(int value) {
        this.isBudejt = value;
    }

    /**
     * Gets the value of the isContract property.
     * 
     */
    public int getIsContract() {
        return isContract;
    }

    /**
     * Sets the value of the isContract property.
     * 
     */
    public void setIsContract(int value) {
        this.isContract = value;
    }

    /**
     * Gets the value of the universityEntrantWaveName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityEntrantWaveName() {
        return universityEntrantWaveName;
    }

    /**
     * Sets the value of the universityEntrantWaveName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityEntrantWaveName(String value) {
        this.universityEntrantWaveName = value;
    }

}
