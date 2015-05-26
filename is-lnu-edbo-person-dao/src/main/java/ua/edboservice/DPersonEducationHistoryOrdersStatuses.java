
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonEducationHistoryOrdersStatuses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonEducationHistoryOrdersStatuses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonEducationHistoryOrderStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationHistoryOrderStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonEducationHistoryOrdersStatuses", propOrder = {
    "idPersonEducationHistoryOrderStatus",
    "personEducationHistoryOrderStatusName"
})
public class DPersonEducationHistoryOrdersStatuses {

    @XmlElement(name = "Id_PersonEducationHistoryOrderStatus")
    protected int idPersonEducationHistoryOrderStatus;
    @XmlElement(name = "PersonEducationHistoryOrderStatusName")
    protected String personEducationHistoryOrderStatusName;

    /**
     * Gets the value of the idPersonEducationHistoryOrderStatus property.
     * 
     */
    public int getIdPersonEducationHistoryOrderStatus() {
        return idPersonEducationHistoryOrderStatus;
    }

    /**
     * Sets the value of the idPersonEducationHistoryOrderStatus property.
     * 
     */
    public void setIdPersonEducationHistoryOrderStatus(int value) {
        this.idPersonEducationHistoryOrderStatus = value;
    }

    /**
     * Gets the value of the personEducationHistoryOrderStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationHistoryOrderStatusName() {
        return personEducationHistoryOrderStatusName;
    }

    /**
     * Sets the value of the personEducationHistoryOrderStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationHistoryOrderStatusName(String value) {
        this.personEducationHistoryOrderStatusName = value;
    }

}
