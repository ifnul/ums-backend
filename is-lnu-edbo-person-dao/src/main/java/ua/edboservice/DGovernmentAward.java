
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dGovernmentAward complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dGovernmentAward">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_GovernmentAward" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GovernmentAwardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GovernmentAwardDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GovernmentAwardDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GovernmentAwardDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_GovernmentAwardsTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GovernmentAwardsTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dGovernmentAward", propOrder = {
    "idGovernmentAward",
    "governmentAwardName",
    "governmentAwardDateBegin",
    "governmentAwardDateEnd",
    "governmentAwardDateLastChange",
    "idGovernmentAwardsTypes",
    "governmentAwardsTypesName"
})
public class DGovernmentAward {

    @XmlElement(name = "Id_GovernmentAward")
    protected int idGovernmentAward;
    @XmlElement(name = "GovernmentAwardName")
    protected String governmentAwardName;
    @XmlElement(name = "GovernmentAwardDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar governmentAwardDateBegin;
    @XmlElement(name = "GovernmentAwardDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar governmentAwardDateEnd;
    @XmlElement(name = "GovernmentAwardDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar governmentAwardDateLastChange;
    @XmlElement(name = "Id_GovernmentAwardsTypes")
    protected int idGovernmentAwardsTypes;
    @XmlElement(name = "GovernmentAwardsTypesName")
    protected String governmentAwardsTypesName;

    /**
     * Gets the value of the idGovernmentAward property.
     * 
     */
    public int getIdGovernmentAward() {
        return idGovernmentAward;
    }

    /**
     * Sets the value of the idGovernmentAward property.
     * 
     */
    public void setIdGovernmentAward(int value) {
        this.idGovernmentAward = value;
    }

    /**
     * Gets the value of the governmentAwardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentAwardName() {
        return governmentAwardName;
    }

    /**
     * Sets the value of the governmentAwardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentAwardName(String value) {
        this.governmentAwardName = value;
    }

    /**
     * Gets the value of the governmentAwardDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGovernmentAwardDateBegin() {
        return governmentAwardDateBegin;
    }

    /**
     * Sets the value of the governmentAwardDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGovernmentAwardDateBegin(XMLGregorianCalendar value) {
        this.governmentAwardDateBegin = value;
    }

    /**
     * Gets the value of the governmentAwardDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGovernmentAwardDateEnd() {
        return governmentAwardDateEnd;
    }

    /**
     * Sets the value of the governmentAwardDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGovernmentAwardDateEnd(XMLGregorianCalendar value) {
        this.governmentAwardDateEnd = value;
    }

    /**
     * Gets the value of the governmentAwardDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGovernmentAwardDateLastChange() {
        return governmentAwardDateLastChange;
    }

    /**
     * Sets the value of the governmentAwardDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGovernmentAwardDateLastChange(XMLGregorianCalendar value) {
        this.governmentAwardDateLastChange = value;
    }

    /**
     * Gets the value of the idGovernmentAwardsTypes property.
     * 
     */
    public int getIdGovernmentAwardsTypes() {
        return idGovernmentAwardsTypes;
    }

    /**
     * Sets the value of the idGovernmentAwardsTypes property.
     * 
     */
    public void setIdGovernmentAwardsTypes(int value) {
        this.idGovernmentAwardsTypes = value;
    }

    /**
     * Gets the value of the governmentAwardsTypesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentAwardsTypesName() {
        return governmentAwardsTypesName;
    }

    /**
     * Sets the value of the governmentAwardsTypesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentAwardsTypesName(String value) {
        this.governmentAwardsTypesName = value;
    }

}
