
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dReceptionConditionAdditionsKoeficientsTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dReceptionConditionAdditionsKoeficientsTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ReceptionConditionAdditionsKoeficientsTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReceptionConditionAdditionsKoeficientsTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dReceptionConditionAdditionsKoeficientsTypes", propOrder = {
    "idReceptionConditionAdditionsKoeficientsTypes",
    "receptionConditionAdditionsKoeficientsTypesName"
})
public class DReceptionConditionAdditionsKoeficientsTypes {

    @XmlElement(name = "Id_ReceptionConditionAdditionsKoeficientsTypes")
    protected int idReceptionConditionAdditionsKoeficientsTypes;
    @XmlElement(name = "ReceptionConditionAdditionsKoeficientsTypesName")
    protected String receptionConditionAdditionsKoeficientsTypesName;

    /**
     * Gets the value of the idReceptionConditionAdditionsKoeficientsTypes property.
     * 
     */
    public int getIdReceptionConditionAdditionsKoeficientsTypes() {
        return idReceptionConditionAdditionsKoeficientsTypes;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsKoeficientsTypes property.
     * 
     */
    public void setIdReceptionConditionAdditionsKoeficientsTypes(int value) {
        this.idReceptionConditionAdditionsKoeficientsTypes = value;
    }

    /**
     * Gets the value of the receptionConditionAdditionsKoeficientsTypesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceptionConditionAdditionsKoeficientsTypesName() {
        return receptionConditionAdditionsKoeficientsTypesName;
    }

    /**
     * Sets the value of the receptionConditionAdditionsKoeficientsTypesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceptionConditionAdditionsKoeficientsTypesName(String value) {
        this.receptionConditionAdditionsKoeficientsTypesName = value;
    }

}
