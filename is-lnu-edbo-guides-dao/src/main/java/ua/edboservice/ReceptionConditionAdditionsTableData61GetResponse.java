
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
 *         &lt;element name="ReceptionConditionAdditionsTableData61GetResult" type="{http://edboservice.ua/}ArrayOfDReceptionConditionAdditionsTableData61" minOccurs="0"/>
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
    "receptionConditionAdditionsTableData61GetResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData61GetResponse")
public class ReceptionConditionAdditionsTableData61GetResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData61GetResult")
    protected ArrayOfDReceptionConditionAdditionsTableData61 receptionConditionAdditionsTableData61GetResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData61GetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDReceptionConditionAdditionsTableData61 }
     *     
     */
    public ArrayOfDReceptionConditionAdditionsTableData61 getReceptionConditionAdditionsTableData61GetResult() {
        return receptionConditionAdditionsTableData61GetResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData61GetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDReceptionConditionAdditionsTableData61 }
     *     
     */
    public void setReceptionConditionAdditionsTableData61GetResult(ArrayOfDReceptionConditionAdditionsTableData61 value) {
        this.receptionConditionAdditionsTableData61GetResult = value;
    }

}
