
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dStateOrderOsnovaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dStateOrderOsnovaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_StateOrdersOsnovaType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_QualificationGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StateOrdersOsnovaTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dStateOrderOsnovaType", propOrder = {
    "idStateOrdersOsnovaType",
    "idQualificationGroup",
    "stateOrdersOsnovaTypeName"
})
public class DStateOrderOsnovaType {

    @XmlElement(name = "Id_StateOrdersOsnovaType")
    protected int idStateOrdersOsnovaType;
    @XmlElement(name = "Id_QualificationGroup")
    protected int idQualificationGroup;
    @XmlElement(name = "StateOrdersOsnovaTypeName")
    protected String stateOrdersOsnovaTypeName;

    /**
     * Gets the value of the idStateOrdersOsnovaType property.
     * 
     */
    public int getIdStateOrdersOsnovaType() {
        return idStateOrdersOsnovaType;
    }

    /**
     * Sets the value of the idStateOrdersOsnovaType property.
     * 
     */
    public void setIdStateOrdersOsnovaType(int value) {
        this.idStateOrdersOsnovaType = value;
    }

    /**
     * Gets the value of the idQualificationGroup property.
     * 
     */
    public int getIdQualificationGroup() {
        return idQualificationGroup;
    }

    /**
     * Sets the value of the idQualificationGroup property.
     * 
     */
    public void setIdQualificationGroup(int value) {
        this.idQualificationGroup = value;
    }

    /**
     * Gets the value of the stateOrdersOsnovaTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrdersOsnovaTypeName() {
        return stateOrdersOsnovaTypeName;
    }

    /**
     * Sets the value of the stateOrdersOsnovaTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrdersOsnovaTypeName(String value) {
        this.stateOrdersOsnovaTypeName = value;
    }

}
