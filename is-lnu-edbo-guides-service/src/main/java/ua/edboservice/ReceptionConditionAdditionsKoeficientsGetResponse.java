
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
 *         &lt;element name="ReceptionConditionAdditionsKoeficientsGetResult" type="{http://edboservice.ua/}ArrayOfDReceptionConditionAdditionsKoeficients" minOccurs="0"/>
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
    "receptionConditionAdditionsKoeficientsGetResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsKoeficientsGetResponse")
public class ReceptionConditionAdditionsKoeficientsGetResponse {

    @XmlElement(name = "ReceptionConditionAdditionsKoeficientsGetResult")
    protected ArrayOfDReceptionConditionAdditionsKoeficients receptionConditionAdditionsKoeficientsGetResult;

    /**
     * Gets the value of the receptionConditionAdditionsKoeficientsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDReceptionConditionAdditionsKoeficients }
     *     
     */
    public ArrayOfDReceptionConditionAdditionsKoeficients getReceptionConditionAdditionsKoeficientsGetResult() {
        return receptionConditionAdditionsKoeficientsGetResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsKoeficientsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDReceptionConditionAdditionsKoeficients }
     *     
     */
    public void setReceptionConditionAdditionsKoeficientsGetResult(ArrayOfDReceptionConditionAdditionsKoeficients value) {
        this.receptionConditionAdditionsKoeficientsGetResult = value;
    }

}
