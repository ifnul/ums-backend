
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityFacultets2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityFacultets2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityFacultet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityFacultetDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_UniversityFacultetName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsAvailableForReceiptOfRequest" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAvailableForBindStudentPersons" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAvailableForBindStaffPersons" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Id_UniversityFacultetType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityFacultet_Parent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HId_UniversityFacultet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HId_UniversityFacultet_String" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FacultetPostIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FacultetStreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FacultetHouseNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MovedToAnowerUniversity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Block" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BlockDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPerepidgotovka" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetFullNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetShortNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityFacultets2", propOrder = {
    "idUniversityFacultet",
    "universityKode",
    "universityFacultetKode",
    "universityFacultetDateBegin",
    "universityFacultetDateEnd",
    "idUniversityFacultetName",
    "universityFacultetFullName",
    "universityFacultetShortName",
    "description",
    "idLanguage",
    "isAvailableForReceiptOfRequest",
    "isAvailableForBindStudentPersons",
    "isAvailableForBindStaffPersons",
    "idUniversityFacultetType",
    "universityFacultetTypeName",
    "idUniversityFacultetParent",
    "hIdUniversityFacultet",
    "hIdUniversityFacultetString",
    "facultetPostIndex",
    "koatuuCode",
    "koatuuName",
    "koatuuFullName",
    "facultetStreetName",
    "facultetHouseNumbers",
    "movedToAnowerUniversity",
    "block",
    "blockDescription",
    "isPerepidgotovka",
    "universityFacultetFullNameEn",
    "universityFacultetShortNameEn"
})
public class DUniversityFacultets2 {

    @XmlElement(name = "Id_UniversityFacultet")
    protected int idUniversityFacultet;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "UniversityFacultetDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityFacultetDateBegin;
    @XmlElement(name = "UniversityFacultetDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityFacultetDateEnd;
    @XmlElement(name = "Id_UniversityFacultetName")
    protected int idUniversityFacultetName;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "UniversityFacultetShortName")
    protected String universityFacultetShortName;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "IsAvailableForReceiptOfRequest")
    protected boolean isAvailableForReceiptOfRequest;
    @XmlElement(name = "IsAvailableForBindStudentPersons")
    protected boolean isAvailableForBindStudentPersons;
    @XmlElement(name = "IsAvailableForBindStaffPersons")
    protected boolean isAvailableForBindStaffPersons;
    @XmlElement(name = "Id_UniversityFacultetType")
    protected int idUniversityFacultetType;
    @XmlElement(name = "UniversityFacultetTypeName")
    protected String universityFacultetTypeName;
    @XmlElement(name = "Id_UniversityFacultet_Parent")
    protected int idUniversityFacultetParent;
    @XmlElement(name = "HId_UniversityFacultet")
    protected String hIdUniversityFacultet;
    @XmlElement(name = "HId_UniversityFacultet_String")
    protected String hIdUniversityFacultetString;
    @XmlElement(name = "FacultetPostIndex")
    protected String facultetPostIndex;
    @XmlElement(name = "KOATUUCode")
    protected String koatuuCode;
    @XmlElement(name = "KOATUUName")
    protected String koatuuName;
    @XmlElement(name = "KOATUUFullName")
    protected String koatuuFullName;
    @XmlElement(name = "FacultetStreetName")
    protected String facultetStreetName;
    @XmlElement(name = "FacultetHouseNumbers")
    protected String facultetHouseNumbers;
    @XmlElement(name = "MovedToAnowerUniversity")
    protected int movedToAnowerUniversity;
    @XmlElement(name = "Block")
    protected int block;
    @XmlElement(name = "BlockDescription")
    protected String blockDescription;
    @XmlElement(name = "IsPerepidgotovka")
    protected int isPerepidgotovka;
    @XmlElement(name = "UniversityFacultetFullNameEn")
    protected String universityFacultetFullNameEn;
    @XmlElement(name = "UniversityFacultetShortNameEn")
    protected String universityFacultetShortNameEn;

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
     * Gets the value of the universityFacultetDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityFacultetDateBegin() {
        return universityFacultetDateBegin;
    }

    /**
     * Sets the value of the universityFacultetDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityFacultetDateBegin(XMLGregorianCalendar value) {
        this.universityFacultetDateBegin = value;
    }

    /**
     * Gets the value of the universityFacultetDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityFacultetDateEnd() {
        return universityFacultetDateEnd;
    }

    /**
     * Sets the value of the universityFacultetDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityFacultetDateEnd(XMLGregorianCalendar value) {
        this.universityFacultetDateEnd = value;
    }

    /**
     * Gets the value of the idUniversityFacultetName property.
     * 
     */
    public int getIdUniversityFacultetName() {
        return idUniversityFacultetName;
    }

    /**
     * Sets the value of the idUniversityFacultetName property.
     * 
     */
    public void setIdUniversityFacultetName(int value) {
        this.idUniversityFacultetName = value;
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
     * Gets the value of the universityFacultetShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetShortName() {
        return universityFacultetShortName;
    }

    /**
     * Sets the value of the universityFacultetShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetShortName(String value) {
        this.universityFacultetShortName = value;
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
     * Gets the value of the idLanguage property.
     * 
     */
    public int getIdLanguage() {
        return idLanguage;
    }

    /**
     * Sets the value of the idLanguage property.
     * 
     */
    public void setIdLanguage(int value) {
        this.idLanguage = value;
    }

    /**
     * Gets the value of the isAvailableForReceiptOfRequest property.
     * 
     */
    public boolean isIsAvailableForReceiptOfRequest() {
        return isAvailableForReceiptOfRequest;
    }

    /**
     * Sets the value of the isAvailableForReceiptOfRequest property.
     * 
     */
    public void setIsAvailableForReceiptOfRequest(boolean value) {
        this.isAvailableForReceiptOfRequest = value;
    }

    /**
     * Gets the value of the isAvailableForBindStudentPersons property.
     * 
     */
    public boolean isIsAvailableForBindStudentPersons() {
        return isAvailableForBindStudentPersons;
    }

    /**
     * Sets the value of the isAvailableForBindStudentPersons property.
     * 
     */
    public void setIsAvailableForBindStudentPersons(boolean value) {
        this.isAvailableForBindStudentPersons = value;
    }

    /**
     * Gets the value of the isAvailableForBindStaffPersons property.
     * 
     */
    public boolean isIsAvailableForBindStaffPersons() {
        return isAvailableForBindStaffPersons;
    }

    /**
     * Sets the value of the isAvailableForBindStaffPersons property.
     * 
     */
    public void setIsAvailableForBindStaffPersons(boolean value) {
        this.isAvailableForBindStaffPersons = value;
    }

    /**
     * Gets the value of the idUniversityFacultetType property.
     * 
     */
    public int getIdUniversityFacultetType() {
        return idUniversityFacultetType;
    }

    /**
     * Sets the value of the idUniversityFacultetType property.
     * 
     */
    public void setIdUniversityFacultetType(int value) {
        this.idUniversityFacultetType = value;
    }

    /**
     * Gets the value of the universityFacultetTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetTypeName() {
        return universityFacultetTypeName;
    }

    /**
     * Sets the value of the universityFacultetTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetTypeName(String value) {
        this.universityFacultetTypeName = value;
    }

    /**
     * Gets the value of the idUniversityFacultetParent property.
     * 
     */
    public int getIdUniversityFacultetParent() {
        return idUniversityFacultetParent;
    }

    /**
     * Sets the value of the idUniversityFacultetParent property.
     * 
     */
    public void setIdUniversityFacultetParent(int value) {
        this.idUniversityFacultetParent = value;
    }

    /**
     * Gets the value of the hIdUniversityFacultet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHIdUniversityFacultet() {
        return hIdUniversityFacultet;
    }

    /**
     * Sets the value of the hIdUniversityFacultet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHIdUniversityFacultet(String value) {
        this.hIdUniversityFacultet = value;
    }

    /**
     * Gets the value of the hIdUniversityFacultetString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHIdUniversityFacultetString() {
        return hIdUniversityFacultetString;
    }

    /**
     * Sets the value of the hIdUniversityFacultetString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHIdUniversityFacultetString(String value) {
        this.hIdUniversityFacultetString = value;
    }

    /**
     * Gets the value of the facultetPostIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacultetPostIndex() {
        return facultetPostIndex;
    }

    /**
     * Sets the value of the facultetPostIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacultetPostIndex(String value) {
        this.facultetPostIndex = value;
    }

    /**
     * Gets the value of the koatuuCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUCode() {
        return koatuuCode;
    }

    /**
     * Sets the value of the koatuuCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUCode(String value) {
        this.koatuuCode = value;
    }

    /**
     * Gets the value of the koatuuName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUName() {
        return koatuuName;
    }

    /**
     * Sets the value of the koatuuName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUName(String value) {
        this.koatuuName = value;
    }

    /**
     * Gets the value of the koatuuFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUFullName() {
        return koatuuFullName;
    }

    /**
     * Sets the value of the koatuuFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUFullName(String value) {
        this.koatuuFullName = value;
    }

    /**
     * Gets the value of the facultetStreetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacultetStreetName() {
        return facultetStreetName;
    }

    /**
     * Sets the value of the facultetStreetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacultetStreetName(String value) {
        this.facultetStreetName = value;
    }

    /**
     * Gets the value of the facultetHouseNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacultetHouseNumbers() {
        return facultetHouseNumbers;
    }

    /**
     * Sets the value of the facultetHouseNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacultetHouseNumbers(String value) {
        this.facultetHouseNumbers = value;
    }

    /**
     * Gets the value of the movedToAnowerUniversity property.
     * 
     */
    public int getMovedToAnowerUniversity() {
        return movedToAnowerUniversity;
    }

    /**
     * Sets the value of the movedToAnowerUniversity property.
     * 
     */
    public void setMovedToAnowerUniversity(int value) {
        this.movedToAnowerUniversity = value;
    }

    /**
     * Gets the value of the block property.
     * 
     */
    public int getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     */
    public void setBlock(int value) {
        this.block = value;
    }

    /**
     * Gets the value of the blockDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockDescription() {
        return blockDescription;
    }

    /**
     * Sets the value of the blockDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockDescription(String value) {
        this.blockDescription = value;
    }

    /**
     * Gets the value of the isPerepidgotovka property.
     * 
     */
    public int getIsPerepidgotovka() {
        return isPerepidgotovka;
    }

    /**
     * Sets the value of the isPerepidgotovka property.
     * 
     */
    public void setIsPerepidgotovka(int value) {
        this.isPerepidgotovka = value;
    }

    /**
     * Gets the value of the universityFacultetFullNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetFullNameEn() {
        return universityFacultetFullNameEn;
    }

    /**
     * Sets the value of the universityFacultetFullNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetFullNameEn(String value) {
        this.universityFacultetFullNameEn = value;
    }

    /**
     * Gets the value of the universityFacultetShortNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetShortNameEn() {
        return universityFacultetShortNameEn;
    }

    /**
     * Sets the value of the universityFacultetShortNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetShortNameEn(String value) {
        this.universityFacultetShortNameEn = value;
    }

}
