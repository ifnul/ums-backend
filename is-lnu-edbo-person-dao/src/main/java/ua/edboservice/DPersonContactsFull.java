
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonContactsFull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonContactsFull">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonContact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Person" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonContactType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonContactTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Defaull" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonContactsFull", propOrder = {
    "idPersonContact",
    "idPerson",
    "idPersonContactType",
    "personContactTypeName",
    "value",
    "defaull",
    "idLanguage"
})
public class DPersonContactsFull {

    @XmlElement(name = "Id_PersonContact")
    protected int idPersonContact;
    @XmlElement(name = "Id_Person")
    protected int idPerson;
    @XmlElement(name = "Id_PersonContactType")
    protected int idPersonContactType;
    @XmlElement(name = "PersonContactTypeName")
    protected String personContactTypeName;
    @XmlElement(name = "Value")
    protected String value;
    @XmlElement(name = "Defaull")
    protected int defaull;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;

    /**
     * Gets the value of the idPersonContact property.
     * 
     */
    public int getIdPersonContact() {
        return idPersonContact;
    }

    /**
     * Sets the value of the idPersonContact property.
     * 
     */
    public void setIdPersonContact(int value) {
        this.idPersonContact = value;
    }

    /**
     * Gets the value of the idPerson property.
     * 
     */
    public int getIdPerson() {
        return idPerson;
    }

    /**
     * Sets the value of the idPerson property.
     * 
     */
    public void setIdPerson(int value) {
        this.idPerson = value;
    }

    /**
     * Gets the value of the idPersonContactType property.
     * 
     */
    public int getIdPersonContactType() {
        return idPersonContactType;
    }

    /**
     * Sets the value of the idPersonContactType property.
     * 
     */
    public void setIdPersonContactType(int value) {
        this.idPersonContactType = value;
    }

    /**
     * Gets the value of the personContactTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonContactTypeName() {
        return personContactTypeName;
    }

    /**
     * Sets the value of the personContactTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonContactTypeName(String value) {
        this.personContactTypeName = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the defaull property.
     * 
     */
    public int getDefaull() {
        return defaull;
    }

    /**
     * Sets the value of the defaull property.
     * 
     */
    public void setDefaull(int value) {
        this.defaull = value;
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

}
