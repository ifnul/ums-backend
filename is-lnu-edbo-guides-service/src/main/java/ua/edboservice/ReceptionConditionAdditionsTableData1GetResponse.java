
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
 *         &lt;element name="ReceptionConditionAdditionsTableData1GetResult" type="{http://edboservice.ua/}ArrayOfDReceptionConditionAdditionsTableData1" minOccurs="0"/>
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
    "receptionConditionAdditionsTableData1GetResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData1GetResponse")
public class ReceptionConditionAdditionsTableData1GetResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData1GetResult")
    protected ArrayOfDReceptionConditionAdditionsTableData1 receptionConditionAdditionsTableData1GetResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData1GetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDReceptionConditionAdditionsTableData1 }
     *     
     */
    public ArrayOfDReceptionConditionAdditionsTableData1 getReceptionConditionAdditionsTableData1GetResult() {
        return receptionConditionAdditionsTableData1GetResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData1GetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDReceptionConditionAdditionsTableData1 }
     *     
     */
    public void setReceptionConditionAdditionsTableData1GetResult(ArrayOfDReceptionConditionAdditionsTableData1 value) {
        this.receptionConditionAdditionsTableData1GetResult = value;
    }

}
