
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_SpecScecializationRequestsGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_SpecScecializationRequestsGroupStatuses" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionGUID",
    "idSpecScecializationRequestsGroup",
    "idSpecScecializationRequestsGroupStatuses"
})
@XmlRootElement(name = "SpecSpecializationRequestsGroupStatusChange")
public class SpecSpecializationRequestsGroupStatusChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_SpecScecializationRequestsGroup")
    protected int idSpecScecializationRequestsGroup;
    @XmlElement(name = "Id_SpecScecializationRequestsGroupStatuses")
    protected int idSpecScecializationRequestsGroupStatuses;

    /**
     * Gets the value of the sessionGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionGUID() {
        return sessionGUID;
    }

    /**
     * Sets the value of the sessionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionGUID(String value) {
        this.sessionGUID = value;
    }

    /**
     * Gets the value of the idSpecScecializationRequestsGroup property.
     * 
     */
    public int getIdSpecScecializationRequestsGroup() {
        return idSpecScecializationRequestsGroup;
    }

    /**
     * Sets the value of the idSpecScecializationRequestsGroup property.
     * 
     */
    public void setIdSpecScecializationRequestsGroup(int value) {
        this.idSpecScecializationRequestsGroup = value;
    }

    /**
     * Gets the value of the idSpecScecializationRequestsGroupStatuses property.
     * 
     */
    public int getIdSpecScecializationRequestsGroupStatuses() {
        return idSpecScecializationRequestsGroupStatuses;
    }

    /**
     * Sets the value of the idSpecScecializationRequestsGroupStatuses property.
     * 
     */
    public void setIdSpecScecializationRequestsGroupStatuses(int value) {
        this.idSpecScecializationRequestsGroupStatuses = value;
    }

}
