
package org.lnu.is.edbo.guides_min;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dLanguages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dLanguages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dLanguages", propOrder = {
    "idLanguage",
    "code",
    "nameLanguage"
})
public class DLanguages {

    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "NameLanguage")
    protected String nameLanguage;

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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the nameLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameLanguage() {
        return nameLanguage;
    }

    /**
     * Sets the value of the nameLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameLanguage(String value) {
        this.nameLanguage = value;
    }

}
