
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
 *         &lt;element name="ReceptionConditionAdditionsKoeficientsTypesGetResult" type="{http://edboservice.ua/}ArrayOfDReceptionConditionAdditionsKoeficientsTypes" minOccurs="0"/>
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
    "receptionConditionAdditionsKoeficientsTypesGetResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsKoeficientsTypesGetResponse")
public class ReceptionConditionAdditionsKoeficientsTypesGetResponse {

    @XmlElement(name = "ReceptionConditionAdditionsKoeficientsTypesGetResult")
    protected ArrayOfDReceptionConditionAdditionsKoeficientsTypes receptionConditionAdditionsKoeficientsTypesGetResult;

    /**
     * Gets the value of the receptionConditionAdditionsKoeficientsTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDReceptionConditionAdditionsKoeficientsTypes }
     *     
     */
    public ArrayOfDReceptionConditionAdditionsKoeficientsTypes getReceptionConditionAdditionsKoeficientsTypesGetResult() {
        return receptionConditionAdditionsKoeficientsTypesGetResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsKoeficientsTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDReceptionConditionAdditionsKoeficientsTypes }
     *     
     */
    public void setReceptionConditionAdditionsKoeficientsTypesGetResult(ArrayOfDReceptionConditionAdditionsKoeficientsTypes value) {
        this.receptionConditionAdditionsKoeficientsTypesGetResult = value;
    }

}
