
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonWorkTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonWorkTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonWorkType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonWorkTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonWorkTypes", propOrder = {
    "idPersonWorkType",
    "personWorkTypeName"
})
public class DPersonWorkTypes {

    @XmlElement(name = "Id_PersonWorkType")
    protected int idPersonWorkType;
    @XmlElement(name = "PersonWorkTypeName")
    protected String personWorkTypeName;

    /**
     * Gets the value of the idPersonWorkType property.
     * 
     */
    public int getIdPersonWorkType() {
        return idPersonWorkType;
    }

    /**
     * Sets the value of the idPersonWorkType property.
     * 
     */
    public void setIdPersonWorkType(int value) {
        this.idPersonWorkType = value;
    }

    /**
     * Gets the value of the personWorkTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonWorkTypeName() {
        return personWorkTypeName;
    }

    /**
     * Sets the value of the personWorkTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkTypeName(String value) {
        this.personWorkTypeName = value;
    }

}
