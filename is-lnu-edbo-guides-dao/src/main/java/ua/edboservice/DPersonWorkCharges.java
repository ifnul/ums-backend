
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonWorkCharges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonWorkCharges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonWorkCharge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonWorkChargeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonWorkCharges", propOrder = {
    "idPersonWorkCharge",
    "personWorkChargeName"
})
public class DPersonWorkCharges {

    @XmlElement(name = "Id_PersonWorkCharge")
    protected int idPersonWorkCharge;
    @XmlElement(name = "PersonWorkChargeName")
    protected String personWorkChargeName;

    /**
     * Gets the value of the idPersonWorkCharge property.
     * 
     */
    public int getIdPersonWorkCharge() {
        return idPersonWorkCharge;
    }

    /**
     * Sets the value of the idPersonWorkCharge property.
     * 
     */
    public void setIdPersonWorkCharge(int value) {
        this.idPersonWorkCharge = value;
    }

    /**
     * Gets the value of the personWorkChargeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonWorkChargeName() {
        return personWorkChargeName;
    }

    /**
     * Sets the value of the personWorkChargeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkChargeName(String value) {
        this.personWorkChargeName = value;
    }

}
