
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
 *         &lt;element name="Id_ReceptionConditionAdditionsTableData7" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idReceptionConditionAdditionsTableData7"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData62Del")
public class ReceptionConditionAdditionsTableData62Del {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_ReceptionConditionAdditionsTableData7")
    protected int idReceptionConditionAdditionsTableData7;

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
     * Gets the value of the idReceptionConditionAdditionsTableData7 property.
     * 
     */
    public int getIdReceptionConditionAdditionsTableData7() {
        return idReceptionConditionAdditionsTableData7;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsTableData7 property.
     * 
     */
    public void setIdReceptionConditionAdditionsTableData7(int value) {
        this.idReceptionConditionAdditionsTableData7 = value;
    }

}
