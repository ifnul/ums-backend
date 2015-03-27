
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dSpecProfessionsRang complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dSpecProfessionsRang">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Rang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_SpecProfessionsRangTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dSpecProfessionsRang", propOrder = {
    "idRang",
    "idSpecProfessionsRangTypes"
})
public class DSpecProfessionsRang {

    @XmlElement(name = "Id_Rang")
    protected String idRang;
    @XmlElement(name = "Id_SpecProfessionsRangTypes")
    protected String idSpecProfessionsRangTypes;

    /**
     * Gets the value of the idRang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRang() {
        return idRang;
    }

    /**
     * Sets the value of the idRang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRang(String value) {
        this.idRang = value;
    }

    /**
     * Gets the value of the idSpecProfessionsRangTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSpecProfessionsRangTypes() {
        return idSpecProfessionsRangTypes;
    }

    /**
     * Sets the value of the idSpecProfessionsRangTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSpecProfessionsRangTypes(String value) {
        this.idSpecProfessionsRangTypes = value;
    }

}
