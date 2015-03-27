
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonContactTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonContactTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonContactType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonContactTypeName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonContactTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "dPersonContactTypes", propOrder = {
    "idPersonContactType",
    "idPersonContactTypeName",
    "personContactTypeName",
    "idLanguage"
})
public class DPersonContactTypes {

    @XmlElement(name = "Id_PersonContactType")
    protected int idPersonContactType;
    @XmlElement(name = "Id_PersonContactTypeName")
    protected int idPersonContactTypeName;
    @XmlElement(name = "PersonContactTypeName")
    protected String personContactTypeName;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;

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
     * Gets the value of the idPersonContactTypeName property.
     * 
     */
    public int getIdPersonContactTypeName() {
        return idPersonContactTypeName;
    }

    /**
     * Sets the value of the idPersonContactTypeName property.
     * 
     */
    public void setIdPersonContactTypeName(int value) {
        this.idPersonContactTypeName = value;
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
