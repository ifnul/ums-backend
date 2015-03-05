
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dWebPersonStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dWebPersonStatement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_WebPersonStatement" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UserAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FIOAddUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UserAddPerson" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FIOAddUserPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AllAnketsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NotImportedAnketsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ImportedAnketsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ErrorAnketsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dWebPersonStatement", propOrder = {
    "idWebPersonStatement",
    "universityKode",
    "idUserAdd",
    "fioAddUser",
    "idUserAddPerson",
    "fioAddUserPerson",
    "dateCreate",
    "dateLastChange",
    "allAnketsCount",
    "notImportedAnketsCount",
    "importedAnketsCount",
    "errorAnketsCount",
    "idUniversity",
    "universityFullName",
    "fileName"
})
public class DWebPersonStatement {

    @XmlElement(name = "Id_WebPersonStatement")
    protected int idWebPersonStatement;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_UserAdd")
    protected int idUserAdd;
    @XmlElement(name = "FIOAddUser")
    protected String fioAddUser;
    @XmlElement(name = "Id_UserAddPerson")
    protected int idUserAddPerson;
    @XmlElement(name = "FIOAddUserPerson")
    protected String fioAddUserPerson;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "AllAnketsCount")
    protected int allAnketsCount;
    @XmlElement(name = "NotImportedAnketsCount")
    protected int notImportedAnketsCount;
    @XmlElement(name = "ImportedAnketsCount")
    protected int importedAnketsCount;
    @XmlElement(name = "ErrorAnketsCount")
    protected int errorAnketsCount;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "FileName")
    protected String fileName;

    /**
     * Gets the value of the idWebPersonStatement property.
     * 
     */
    public int getIdWebPersonStatement() {
        return idWebPersonStatement;
    }

    /**
     * Sets the value of the idWebPersonStatement property.
     * 
     */
    public void setIdWebPersonStatement(int value) {
        this.idWebPersonStatement = value;
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
     * Gets the value of the idUserAdd property.
     * 
     */
    public int getIdUserAdd() {
        return idUserAdd;
    }

    /**
     * Sets the value of the idUserAdd property.
     * 
     */
    public void setIdUserAdd(int value) {
        this.idUserAdd = value;
    }

    /**
     * Gets the value of the fioAddUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIOAddUser() {
        return fioAddUser;
    }

    /**
     * Sets the value of the fioAddUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIOAddUser(String value) {
        this.fioAddUser = value;
    }

    /**
     * Gets the value of the idUserAddPerson property.
     * 
     */
    public int getIdUserAddPerson() {
        return idUserAddPerson;
    }

    /**
     * Sets the value of the idUserAddPerson property.
     * 
     */
    public void setIdUserAddPerson(int value) {
        this.idUserAddPerson = value;
    }

    /**
     * Gets the value of the fioAddUserPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIOAddUserPerson() {
        return fioAddUserPerson;
    }

    /**
     * Sets the value of the fioAddUserPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIOAddUserPerson(String value) {
        this.fioAddUserPerson = value;
    }

    /**
     * Gets the value of the dateCreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreate() {
        return dateCreate;
    }

    /**
     * Sets the value of the dateCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreate(XMLGregorianCalendar value) {
        this.dateCreate = value;
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
     * Gets the value of the allAnketsCount property.
     * 
     */
    public int getAllAnketsCount() {
        return allAnketsCount;
    }

    /**
     * Sets the value of the allAnketsCount property.
     * 
     */
    public void setAllAnketsCount(int value) {
        this.allAnketsCount = value;
    }

    /**
     * Gets the value of the notImportedAnketsCount property.
     * 
     */
    public int getNotImportedAnketsCount() {
        return notImportedAnketsCount;
    }

    /**
     * Sets the value of the notImportedAnketsCount property.
     * 
     */
    public void setNotImportedAnketsCount(int value) {
        this.notImportedAnketsCount = value;
    }

    /**
     * Gets the value of the importedAnketsCount property.
     * 
     */
    public int getImportedAnketsCount() {
        return importedAnketsCount;
    }

    /**
     * Sets the value of the importedAnketsCount property.
     * 
     */
    public void setImportedAnketsCount(int value) {
        this.importedAnketsCount = value;
    }

    /**
     * Gets the value of the errorAnketsCount property.
     * 
     */
    public int getErrorAnketsCount() {
        return errorAnketsCount;
    }

    /**
     * Sets the value of the errorAnketsCount property.
     * 
     */
    public void setErrorAnketsCount(int value) {
        this.errorAnketsCount = value;
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

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

}
