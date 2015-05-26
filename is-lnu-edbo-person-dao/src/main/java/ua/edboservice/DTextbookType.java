
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dTextbookType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dTextbookType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_TextbookType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TextbookTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TextbookTypeDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dTextbookType", propOrder = {
    "idTextbookType",
    "textbookTypeName",
    "textbookTypeDateLastChange"
})
public class DTextbookType {

    @XmlElement(name = "Id_TextbookType")
    protected int idTextbookType;
    @XmlElement(name = "TextbookTypeName")
    protected String textbookTypeName;
    @XmlElement(name = "TextbookTypeDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar textbookTypeDateLastChange;

    /**
     * Gets the value of the idTextbookType property.
     * 
     */
    public int getIdTextbookType() {
        return idTextbookType;
    }

    /**
     * Sets the value of the idTextbookType property.
     * 
     */
    public void setIdTextbookType(int value) {
        this.idTextbookType = value;
    }

    /**
     * Gets the value of the textbookTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextbookTypeName() {
        return textbookTypeName;
    }

    /**
     * Sets the value of the textbookTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextbookTypeName(String value) {
        this.textbookTypeName = value;
    }

    /**
     * Gets the value of the textbookTypeDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTextbookTypeDateLastChange() {
        return textbookTypeDateLastChange;
    }

    /**
     * Sets the value of the textbookTypeDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTextbookTypeDateLastChange(XMLGregorianCalendar value) {
        this.textbookTypeDateLastChange = value;
    }

}
