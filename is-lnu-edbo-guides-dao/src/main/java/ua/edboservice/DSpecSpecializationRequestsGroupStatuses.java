
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dSpecSpecializationRequestsGroupStatuses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dSpecSpecializationRequestsGroupStatuses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_SpecScecializationRequestsGroupStatuse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecScecializationRequestsGroupStatuseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dSpecSpecializationRequestsGroupStatuses", propOrder = {
    "idSpecScecializationRequestsGroupStatuse",
    "specScecializationRequestsGroupStatuseName"
})
public class DSpecSpecializationRequestsGroupStatuses {

    @XmlElement(name = "Id_SpecScecializationRequestsGroupStatuse")
    protected int idSpecScecializationRequestsGroupStatuse;
    @XmlElement(name = "SpecScecializationRequestsGroupStatuseName")
    protected String specScecializationRequestsGroupStatuseName;

    /**
     * Gets the value of the idSpecScecializationRequestsGroupStatuse property.
     * 
     */
    public int getIdSpecScecializationRequestsGroupStatuse() {
        return idSpecScecializationRequestsGroupStatuse;
    }

    /**
     * Sets the value of the idSpecScecializationRequestsGroupStatuse property.
     * 
     */
    public void setIdSpecScecializationRequestsGroupStatuse(int value) {
        this.idSpecScecializationRequestsGroupStatuse = value;
    }

    /**
     * Gets the value of the specScecializationRequestsGroupStatuseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecScecializationRequestsGroupStatuseName() {
        return specScecializationRequestsGroupStatuseName;
    }

    /**
     * Sets the value of the specScecializationRequestsGroupStatuseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecScecializationRequestsGroupStatuseName(String value) {
        this.specScecializationRequestsGroupStatuseName = value;
    }

}
