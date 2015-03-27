
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonWorkCancelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonWorkCancelationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonWorkCancelationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonWorkCancelationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonWorkCancelationType", propOrder = {
    "idPersonWorkCancelationType",
    "personWorkCancelationTypeName"
})
public class DPersonWorkCancelationType {

    @XmlElement(name = "Id_PersonWorkCancelationType")
    protected int idPersonWorkCancelationType;
    @XmlElement(name = "PersonWorkCancelationTypeName")
    protected String personWorkCancelationTypeName;

    /**
     * Gets the value of the idPersonWorkCancelationType property.
     * 
     */
    public int getIdPersonWorkCancelationType() {
        return idPersonWorkCancelationType;
    }

    /**
     * Sets the value of the idPersonWorkCancelationType property.
     * 
     */
    public void setIdPersonWorkCancelationType(int value) {
        this.idPersonWorkCancelationType = value;
    }

    /**
     * Gets the value of the personWorkCancelationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonWorkCancelationTypeName() {
        return personWorkCancelationTypeName;
    }

    /**
     * Sets the value of the personWorkCancelationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkCancelationTypeName(String value) {
        this.personWorkCancelationTypeName = value;
    }

}
