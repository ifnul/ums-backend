
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dSpecRedactions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dSpecRedactions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_SpecRedactions" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecRedactionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecRedactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dSpecRedactions", propOrder = {
    "idSpecRedactions",
    "specRedactionName",
    "specRedactionCode",
    "dateLastChange"
})
public class DSpecRedactions {

    @XmlElement(name = "Id_SpecRedactions")
    protected int idSpecRedactions;
    @XmlElement(name = "SpecRedactionName")
    protected String specRedactionName;
    @XmlElement(name = "SpecRedactionCode")
    protected String specRedactionCode;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;

    /**
     * Gets the value of the idSpecRedactions property.
     * 
     */
    public int getIdSpecRedactions() {
        return idSpecRedactions;
    }

    /**
     * Sets the value of the idSpecRedactions property.
     * 
     */
    public void setIdSpecRedactions(int value) {
        this.idSpecRedactions = value;
    }

    /**
     * Gets the value of the specRedactionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecRedactionName() {
        return specRedactionName;
    }

    /**
     * Sets the value of the specRedactionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecRedactionName(String value) {
        this.specRedactionName = value;
    }

    /**
     * Gets the value of the specRedactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecRedactionCode() {
        return specRedactionCode;
    }

    /**
     * Sets the value of the specRedactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecRedactionCode(String value) {
        this.specRedactionCode = value;
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

}
