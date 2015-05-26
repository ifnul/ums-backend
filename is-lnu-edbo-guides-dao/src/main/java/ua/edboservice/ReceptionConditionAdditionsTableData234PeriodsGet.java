
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
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ReceptionConditionAdditionsTableData234" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "type",
    "idReceptionConditionAdditionsTableData234"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData234PeriodsGet")
public class ReceptionConditionAdditionsTableData234PeriodsGet {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Type")
    protected int type;
    @XmlElement(name = "Id_ReceptionConditionAdditionsTableData234")
    protected int idReceptionConditionAdditionsTableData234;

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
     * Gets the value of the type property.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

    /**
     * Gets the value of the idReceptionConditionAdditionsTableData234 property.
     * 
     */
    public int getIdReceptionConditionAdditionsTableData234() {
        return idReceptionConditionAdditionsTableData234;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsTableData234 property.
     * 
     */
    public void setIdReceptionConditionAdditionsTableData234(int value) {
        this.idReceptionConditionAdditionsTableData234 = value;
    }

}
