
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dReceptionConditionAdditionsTableData5Groups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dReceptionConditionAdditionsTableData5Groups">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ReceptionConditionAdditionsTableData5Group" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReceptionConditionAdditionsTableData5GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dReceptionConditionAdditionsTableData5Groups", propOrder = {
    "idReceptionConditionAdditionsTableData5Group",
    "receptionConditionAdditionsTableData5GroupName"
})
public class DReceptionConditionAdditionsTableData5Groups {

    @XmlElement(name = "Id_ReceptionConditionAdditionsTableData5Group")
    protected int idReceptionConditionAdditionsTableData5Group;
    @XmlElement(name = "ReceptionConditionAdditionsTableData5GroupName")
    protected String receptionConditionAdditionsTableData5GroupName;

    /**
     * Gets the value of the idReceptionConditionAdditionsTableData5Group property.
     * 
     */
    public int getIdReceptionConditionAdditionsTableData5Group() {
        return idReceptionConditionAdditionsTableData5Group;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsTableData5Group property.
     * 
     */
    public void setIdReceptionConditionAdditionsTableData5Group(int value) {
        this.idReceptionConditionAdditionsTableData5Group = value;
    }

    /**
     * Gets the value of the receptionConditionAdditionsTableData5GroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceptionConditionAdditionsTableData5GroupName() {
        return receptionConditionAdditionsTableData5GroupName;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData5GroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceptionConditionAdditionsTableData5GroupName(String value) {
        this.receptionConditionAdditionsTableData5GroupName = value;
    }

}
