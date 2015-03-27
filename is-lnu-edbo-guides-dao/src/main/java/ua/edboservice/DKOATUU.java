
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dKOATUU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dKOATUU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_KOATUU" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KOATUUCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_KOATUUName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KOATUUName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="KOATUUDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KOATUUCodeL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUCodeL2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUCodeL3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dKOATUU", propOrder = {
    "idKOATUU",
    "koatuuCode",
    "type",
    "idKOATUUName",
    "koatuuName",
    "koatuuFullName",
    "koatuuDateBegin",
    "koatuuDateEnd",
    "idLanguage",
    "koatuuCodeL1",
    "koatuuCodeL2",
    "koatuuCodeL3"
})
public class DKOATUU {

    @XmlElement(name = "Id_KOATUU")
    protected int idKOATUU;
    @XmlElement(name = "KOATUUCode")
    protected String koatuuCode;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Id_KOATUUName")
    protected int idKOATUUName;
    @XmlElement(name = "KOATUUName")
    protected String koatuuName;
    @XmlElement(name = "KOATUUFullName")
    protected String koatuuFullName;
    @XmlElement(name = "KOATUUDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar koatuuDateBegin;
    @XmlElement(name = "KOATUUDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar koatuuDateEnd;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "KOATUUCodeL1")
    protected String koatuuCodeL1;
    @XmlElement(name = "KOATUUCodeL2")
    protected String koatuuCodeL2;
    @XmlElement(name = "KOATUUCodeL3")
    protected String koatuuCodeL3;

    /**
     * Gets the value of the idKOATUU property.
     * 
     */
    public int getIdKOATUU() {
        return idKOATUU;
    }

    /**
     * Sets the value of the idKOATUU property.
     * 
     */
    public void setIdKOATUU(int value) {
        this.idKOATUU = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the idKOATUUName property.
     * 
     */
    public int getIdKOATUUName() {
        return idKOATUUName;
    }

    /**
     * Sets the value of the idKOATUUName property.
     * 
     */
    public void setIdKOATUUName(int value) {
        this.idKOATUUName = value;
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
     * Gets the value of the koatuuDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKOATUUDateBegin() {
        return koatuuDateBegin;
    }

    /**
     * Sets the value of the koatuuDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKOATUUDateBegin(XMLGregorianCalendar value) {
        this.koatuuDateBegin = value;
    }

    /**
     * Gets the value of the koatuuDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKOATUUDateEnd() {
        return koatuuDateEnd;
    }

    /**
     * Sets the value of the koatuuDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKOATUUDateEnd(XMLGregorianCalendar value) {
        this.koatuuDateEnd = value;
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
     * Gets the value of the koatuuCodeL1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUCodeL1() {
        return koatuuCodeL1;
    }

    /**
     * Sets the value of the koatuuCodeL1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUCodeL1(String value) {
        this.koatuuCodeL1 = value;
    }

    /**
     * Gets the value of the koatuuCodeL2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUCodeL2() {
        return koatuuCodeL2;
    }

    /**
     * Sets the value of the koatuuCodeL2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUCodeL2(String value) {
        this.koatuuCodeL2 = value;
    }

    /**
     * Gets the value of the koatuuCodeL3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUCodeL3() {
        return koatuuCodeL3;
    }

    /**
     * Sets the value of the koatuuCodeL3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUCodeL3(String value) {
        this.koatuuCodeL3 = value;
    }

}
