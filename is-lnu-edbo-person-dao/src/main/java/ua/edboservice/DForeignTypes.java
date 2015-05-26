
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dForeignTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dForeignTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ForeignType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ForeignTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dForeignTypes", propOrder = {
    "idForeignType",
    "foreignTypeName"
})
public class DForeignTypes {

    @XmlElement(name = "Id_ForeignType")
    protected int idForeignType;
    @XmlElement(name = "ForeignTypeName")
    protected String foreignTypeName;

    /**
     * Gets the value of the idForeignType property.
     * 
     */
    public int getIdForeignType() {
        return idForeignType;
    }

    /**
     * Sets the value of the idForeignType property.
     * 
     */
    public void setIdForeignType(int value) {
        this.idForeignType = value;
    }

    /**
     * Gets the value of the foreignTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignTypeName() {
        return foreignTypeName;
    }

    /**
     * Sets the value of the foreignTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignTypeName(String value) {
        this.foreignTypeName = value;
    }

}
