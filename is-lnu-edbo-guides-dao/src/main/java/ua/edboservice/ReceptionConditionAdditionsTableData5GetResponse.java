
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
 *         &lt;element name="ReceptionConditionAdditionsTableData5GetResult" type="{http://edboservice.ua/}ArrayOfDReceptionConditionAdditionsTableData5" minOccurs="0"/>
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
    "receptionConditionAdditionsTableData5GetResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData5GetResponse")
public class ReceptionConditionAdditionsTableData5GetResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData5GetResult")
    protected ArrayOfDReceptionConditionAdditionsTableData5 receptionConditionAdditionsTableData5GetResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData5GetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDReceptionConditionAdditionsTableData5 }
     *     
     */
    public ArrayOfDReceptionConditionAdditionsTableData5 getReceptionConditionAdditionsTableData5GetResult() {
        return receptionConditionAdditionsTableData5GetResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData5GetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDReceptionConditionAdditionsTableData5 }
     *     
     */
    public void setReceptionConditionAdditionsTableData5GetResult(ArrayOfDReceptionConditionAdditionsTableData5 value) {
        this.receptionConditionAdditionsTableData5GetResult = value;
    }

}
