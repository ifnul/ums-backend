
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dRegulationDocumentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dRegulationDocumentData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_RegulationDocumentData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentDataTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IntId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniqId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentDataDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsVerified" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Uid1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dRegulationDocumentData", propOrder = {
    "idRegulationDocumentData",
    "idRegulationDocumentDataTypes",
    "idRegulationDocument",
    "intId",
    "uniqId",
    "regulationDocumentDataDateLastChange",
    "isVerified",
    "id1",
    "id2",
    "uid1",
    "name1",
    "name2",
    "name3",
    "name4",
    "name5"
})
public class DRegulationDocumentData {

    @XmlElement(name = "Id_RegulationDocumentData")
    protected int idRegulationDocumentData;
    @XmlElement(name = "Id_RegulationDocumentDataTypes")
    protected int idRegulationDocumentDataTypes;
    @XmlElement(name = "Id_RegulationDocument")
    protected int idRegulationDocument;
    @XmlElement(name = "IntId")
    protected int intId;
    @XmlElement(name = "UniqId")
    protected String uniqId;
    @XmlElement(name = "RegulationDocumentDataDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regulationDocumentDataDateLastChange;
    @XmlElement(name = "IsVerified")
    protected int isVerified;
    @XmlElement(name = "Id1")
    protected int id1;
    @XmlElement(name = "Id2")
    protected int id2;
    @XmlElement(name = "Uid1")
    protected String uid1;
    @XmlElement(name = "Name1")
    protected String name1;
    @XmlElement(name = "Name2")
    protected String name2;
    @XmlElement(name = "Name3")
    protected String name3;
    @XmlElement(name = "Name4")
    protected String name4;
    @XmlElement(name = "Name5")
    protected String name5;

    /**
     * Gets the value of the idRegulationDocumentData property.
     * 
     */
    public int getIdRegulationDocumentData() {
        return idRegulationDocumentData;
    }

    /**
     * Sets the value of the idRegulationDocumentData property.
     * 
     */
    public void setIdRegulationDocumentData(int value) {
        this.idRegulationDocumentData = value;
    }

    /**
     * Gets the value of the idRegulationDocumentDataTypes property.
     * 
     */
    public int getIdRegulationDocumentDataTypes() {
        return idRegulationDocumentDataTypes;
    }

    /**
     * Sets the value of the idRegulationDocumentDataTypes property.
     * 
     */
    public void setIdRegulationDocumentDataTypes(int value) {
        this.idRegulationDocumentDataTypes = value;
    }

    /**
     * Gets the value of the idRegulationDocument property.
     * 
     */
    public int getIdRegulationDocument() {
        return idRegulationDocument;
    }

    /**
     * Sets the value of the idRegulationDocument property.
     * 
     */
    public void setIdRegulationDocument(int value) {
        this.idRegulationDocument = value;
    }

    /**
     * Gets the value of the intId property.
     * 
     */
    public int getIntId() {
        return intId;
    }

    /**
     * Sets the value of the intId property.
     * 
     */
    public void setIntId(int value) {
        this.intId = value;
    }

    /**
     * Gets the value of the uniqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqId() {
        return uniqId;
    }

    /**
     * Sets the value of the uniqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqId(String value) {
        this.uniqId = value;
    }

    /**
     * Gets the value of the regulationDocumentDataDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegulationDocumentDataDateLastChange() {
        return regulationDocumentDataDateLastChange;
    }

    /**
     * Sets the value of the regulationDocumentDataDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegulationDocumentDataDateLastChange(XMLGregorianCalendar value) {
        this.regulationDocumentDataDateLastChange = value;
    }

    /**
     * Gets the value of the isVerified property.
     * 
     */
    public int getIsVerified() {
        return isVerified;
    }

    /**
     * Sets the value of the isVerified property.
     * 
     */
    public void setIsVerified(int value) {
        this.isVerified = value;
    }

    /**
     * Gets the value of the id1 property.
     * 
     */
    public int getId1() {
        return id1;
    }

    /**
     * Sets the value of the id1 property.
     * 
     */
    public void setId1(int value) {
        this.id1 = value;
    }

    /**
     * Gets the value of the id2 property.
     * 
     */
    public int getId2() {
        return id2;
    }

    /**
     * Sets the value of the id2 property.
     * 
     */
    public void setId2(int value) {
        this.id2 = value;
    }

    /**
     * Gets the value of the uid1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid1() {
        return uid1;
    }

    /**
     * Sets the value of the uid1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid1(String value) {
        this.uid1 = value;
    }

    /**
     * Gets the value of the name1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName1() {
        return name1;
    }

    /**
     * Sets the value of the name1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName1(String value) {
        this.name1 = value;
    }

    /**
     * Gets the value of the name2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName2() {
        return name2;
    }

    /**
     * Sets the value of the name2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName2(String value) {
        this.name2 = value;
    }

    /**
     * Gets the value of the name3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName3() {
        return name3;
    }

    /**
     * Sets the value of the name3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName3(String value) {
        this.name3 = value;
    }

    /**
     * Gets the value of the name4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName4() {
        return name4;
    }

    /**
     * Sets the value of the name4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName4(String value) {
        this.name4 = value;
    }

    /**
     * Gets the value of the name5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName5() {
        return name5;
    }

    /**
     * Sets the value of the name5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName5(String value) {
        this.name5 = value;
    }

}
