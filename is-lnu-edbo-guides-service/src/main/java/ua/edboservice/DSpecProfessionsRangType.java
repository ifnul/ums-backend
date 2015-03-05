
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dSpecProfessionsRangType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dSpecProfessionsRangType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_SpecProfessionsRangType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecProfessionsRangTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dSpecProfessionsRangType", propOrder = {
    "idSpecProfessionsRangType",
    "specProfessionsRangTypeName"
})
public class DSpecProfessionsRangType {

    @XmlElement(name = "Id_SpecProfessionsRangType")
    protected int idSpecProfessionsRangType;
    @XmlElement(name = "SpecProfessionsRangTypeName")
    protected String specProfessionsRangTypeName;

    /**
     * Gets the value of the idSpecProfessionsRangType property.
     * 
     */
    public int getIdSpecProfessionsRangType() {
        return idSpecProfessionsRangType;
    }

    /**
     * Sets the value of the idSpecProfessionsRangType property.
     * 
     */
    public void setIdSpecProfessionsRangType(int value) {
        this.idSpecProfessionsRangType = value;
    }

    /**
     * Gets the value of the specProfessionsRangTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionsRangTypeName() {
        return specProfessionsRangTypeName;
    }

    /**
     * Sets the value of the specProfessionsRangTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionsRangTypeName(String value) {
        this.specProfessionsRangTypeName = value;
    }

}
