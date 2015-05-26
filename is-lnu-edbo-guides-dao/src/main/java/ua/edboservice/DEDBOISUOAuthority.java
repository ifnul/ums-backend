
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dEDBOISUOAuthority complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dEDBOISUOAuthority">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_EDBO_ISUO_Authority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ISUO_Authority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parent_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="order_idx" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="phone_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="authorized_person" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownership_form_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="geo_point" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdatedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="short_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="full_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updated_at" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="is_active" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="oat_active_and" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="koatuu_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dEDBOISUOAuthority", propOrder = {
    "idEDBOISUOAuthority",
    "idISUOAuthority",
    "universityKode",
    "parentId",
    "orderIdx",
    "phoneCode",
    "phoneNumber",
    "typeId",
    "authorizedPerson",
    "ownershipFormId",
    "geoPoint",
    "updatedDateTime",
    "shortName",
    "fullName",
    "address",
    "manager",
    "email",
    "site",
    "updatedAt",
    "isActive",
    "oatActiveAnd",
    "koatuuId"
})
public class DEDBOISUOAuthority {

    @XmlElement(name = "Id_EDBO_ISUO_Authority")
    protected int idEDBOISUOAuthority;
    @XmlElement(name = "Id_ISUO_Authority")
    protected int idISUOAuthority;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "parent_id")
    protected int parentId;
    @XmlElement(name = "order_idx")
    protected int orderIdx;
    @XmlElement(name = "phone_code")
    protected String phoneCode;
    @XmlElement(name = "phone_number")
    protected String phoneNumber;
    @XmlElement(name = "type_id")
    protected int typeId;
    @XmlElement(name = "authorized_person")
    protected String authorizedPerson;
    @XmlElement(name = "ownership_form_id")
    protected int ownershipFormId;
    @XmlElement(name = "geo_point")
    protected String geoPoint;
    @XmlElement(name = "UpdatedDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDateTime;
    @XmlElement(name = "short_name")
    protected String shortName;
    @XmlElement(name = "full_name")
    protected String fullName;
    protected String address;
    protected String manager;
    protected String email;
    protected String site;
    @XmlElement(name = "updated_at", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedAt;
    @XmlElement(name = "is_active")
    protected int isActive;
    @XmlElement(name = "oat_active_and")
    protected int oatActiveAnd;
    @XmlElement(name = "koatuu_id")
    protected String koatuuId;

    /**
     * Gets the value of the idEDBOISUOAuthority property.
     * 
     */
    public int getIdEDBOISUOAuthority() {
        return idEDBOISUOAuthority;
    }

    /**
     * Sets the value of the idEDBOISUOAuthority property.
     * 
     */
    public void setIdEDBOISUOAuthority(int value) {
        this.idEDBOISUOAuthority = value;
    }

    /**
     * Gets the value of the idISUOAuthority property.
     * 
     */
    public int getIdISUOAuthority() {
        return idISUOAuthority;
    }

    /**
     * Sets the value of the idISUOAuthority property.
     * 
     */
    public void setIdISUOAuthority(int value) {
        this.idISUOAuthority = value;
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
     * Gets the value of the parentId property.
     * 
     */
    public int getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     */
    public void setParentId(int value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the orderIdx property.
     * 
     */
    public int getOrderIdx() {
        return orderIdx;
    }

    /**
     * Sets the value of the orderIdx property.
     * 
     */
    public void setOrderIdx(int value) {
        this.orderIdx = value;
    }

    /**
     * Gets the value of the phoneCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneCode() {
        return phoneCode;
    }

    /**
     * Sets the value of the phoneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneCode(String value) {
        this.phoneCode = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the typeId property.
     * 
     */
    public int getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     */
    public void setTypeId(int value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the authorizedPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedPerson() {
        return authorizedPerson;
    }

    /**
     * Sets the value of the authorizedPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedPerson(String value) {
        this.authorizedPerson = value;
    }

    /**
     * Gets the value of the ownershipFormId property.
     * 
     */
    public int getOwnershipFormId() {
        return ownershipFormId;
    }

    /**
     * Sets the value of the ownershipFormId property.
     * 
     */
    public void setOwnershipFormId(int value) {
        this.ownershipFormId = value;
    }

    /**
     * Gets the value of the geoPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoPoint() {
        return geoPoint;
    }

    /**
     * Sets the value of the geoPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoPoint(String value) {
        this.geoPoint = value;
    }

    /**
     * Gets the value of the updatedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedDateTime() {
        return updatedDateTime;
    }

    /**
     * Sets the value of the updatedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedDateTime(XMLGregorianCalendar value) {
        this.updatedDateTime = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
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
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager(String value) {
        this.manager = value;
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
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the updatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the value of the updatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedAt(XMLGregorianCalendar value) {
        this.updatedAt = value;
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
     * Gets the value of the oatActiveAnd property.
     * 
     */
    public int getOatActiveAnd() {
        return oatActiveAnd;
    }

    /**
     * Sets the value of the oatActiveAnd property.
     * 
     */
    public void setOatActiveAnd(int value) {
        this.oatActiveAnd = value;
    }

    /**
     * Gets the value of the koatuuId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoatuuId() {
        return koatuuId;
    }

    /**
     * Sets the value of the koatuuId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoatuuId(String value) {
        this.koatuuId = value;
    }

}
