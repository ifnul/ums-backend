
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dSpecProfessions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dSpecProfessions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_SpecProfession" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecProfessionClassifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dSpecProfessions", propOrder = {
    "idSpecProfession",
    "specProfessionClassifierCode",
    "specProfessionCode",
    "specProfessionName"
})
public class DSpecProfessions {

    @XmlElement(name = "Id_SpecProfession")
    protected int idSpecProfession;
    @XmlElement(name = "SpecProfessionClassifierCode")
    protected String specProfessionClassifierCode;
    @XmlElement(name = "SpecProfessionCode")
    protected String specProfessionCode;
    @XmlElement(name = "SpecProfessionName")
    protected String specProfessionName;

    /**
     * Gets the value of the idSpecProfession property.
     * 
     */
    public int getIdSpecProfession() {
        return idSpecProfession;
    }

    /**
     * Sets the value of the idSpecProfession property.
     * 
     */
    public void setIdSpecProfession(int value) {
        this.idSpecProfession = value;
    }

    /**
     * Gets the value of the specProfessionClassifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionClassifierCode() {
        return specProfessionClassifierCode;
    }

    /**
     * Sets the value of the specProfessionClassifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionClassifierCode(String value) {
        this.specProfessionClassifierCode = value;
    }

    /**
     * Gets the value of the specProfessionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionCode() {
        return specProfessionCode;
    }

    /**
     * Sets the value of the specProfessionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionCode(String value) {
        this.specProfessionCode = value;
    }

    /**
     * Gets the value of the specProfessionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionName() {
        return specProfessionName;
    }

    /**
     * Sets the value of the specProfessionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionName(String value) {
        this.specProfessionName = value;
    }

}
