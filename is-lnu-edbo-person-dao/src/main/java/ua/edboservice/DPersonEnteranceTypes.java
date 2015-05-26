
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonEnteranceTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonEnteranceTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonEnteranceTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEnteranceTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "dPersonEnteranceTypes", propOrder = {
    "idPersonEnteranceTypes",
    "personEnteranceTypeName",
    "dateLastChange"
})
public class DPersonEnteranceTypes {

    @XmlElement(name = "Id_PersonEnteranceTypes")
    protected int idPersonEnteranceTypes;
    @XmlElement(name = "PersonEnteranceTypeName")
    protected String personEnteranceTypeName;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;

    /**
     * Gets the value of the idPersonEnteranceTypes property.
     * 
     */
    public int getIdPersonEnteranceTypes() {
        return idPersonEnteranceTypes;
    }

    /**
     * Sets the value of the idPersonEnteranceTypes property.
     * 
     */
    public void setIdPersonEnteranceTypes(int value) {
        this.idPersonEnteranceTypes = value;
    }

    /**
     * Gets the value of the personEnteranceTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEnteranceTypeName() {
        return personEnteranceTypeName;
    }

    /**
     * Sets the value of the personEnteranceTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEnteranceTypeName(String value) {
        this.personEnteranceTypeName = value;
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
