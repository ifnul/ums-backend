
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dAcandemyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcandemyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcandemyType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcandemyTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcandemyTypeDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcandemyType", propOrder = {
    "idAcandemyType",
    "acandemyTypeName",
    "acandemyTypeDateLastChange"
})
public class DAcandemyType {

    @XmlElement(name = "Id_AcandemyType")
    protected int idAcandemyType;
    @XmlElement(name = "AcandemyTypeName")
    protected String acandemyTypeName;
    @XmlElement(name = "AcandemyTypeDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acandemyTypeDateLastChange;

    /**
     * Gets the value of the idAcandemyType property.
     * 
     */
    public int getIdAcandemyType() {
        return idAcandemyType;
    }

    /**
     * Sets the value of the idAcandemyType property.
     * 
     */
    public void setIdAcandemyType(int value) {
        this.idAcandemyType = value;
    }

    /**
     * Gets the value of the acandemyTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcandemyTypeName() {
        return acandemyTypeName;
    }

    /**
     * Sets the value of the acandemyTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcandemyTypeName(String value) {
        this.acandemyTypeName = value;
    }

    /**
     * Gets the value of the acandemyTypeDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcandemyTypeDateLastChange() {
        return acandemyTypeDateLastChange;
    }

    /**
     * Sets the value of the acandemyTypeDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcandemyTypeDateLastChange(XMLGregorianCalendar value) {
        this.acandemyTypeDateLastChange = value;
    }

}
