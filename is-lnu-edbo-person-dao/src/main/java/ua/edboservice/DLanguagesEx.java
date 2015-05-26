
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dLanguagesEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dLanguagesEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_LanguageEx" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LanguageExName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dLanguagesEx", propOrder = {
    "idLanguageEx",
    "languageExName"
})
public class DLanguagesEx {

    @XmlElement(name = "Id_LanguageEx")
    protected int idLanguageEx;
    @XmlElement(name = "LanguageExName")
    protected String languageExName;

    /**
     * Gets the value of the idLanguageEx property.
     * 
     */
    public int getIdLanguageEx() {
        return idLanguageEx;
    }

    /**
     * Sets the value of the idLanguageEx property.
     * 
     */
    public void setIdLanguageEx(int value) {
        this.idLanguageEx = value;
    }

    /**
     * Gets the value of the languageExName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageExName() {
        return languageExName;
    }

    /**
     * Sets the value of the languageExName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageExName(String value) {
        this.languageExName = value;
    }

}
