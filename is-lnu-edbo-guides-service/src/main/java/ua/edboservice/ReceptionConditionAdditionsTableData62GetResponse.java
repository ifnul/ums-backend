
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
 *         &lt;element name="ReceptionConditionAdditionsTableData62GetResult" type="{http://edboservice.ua/}ArrayOfDReceptionConditionAdditionsTableData62" minOccurs="0"/>
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
    "receptionConditionAdditionsTableData62GetResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData62GetResponse")
public class ReceptionConditionAdditionsTableData62GetResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData62GetResult")
    protected ArrayOfDReceptionConditionAdditionsTableData62 receptionConditionAdditionsTableData62GetResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData62GetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDReceptionConditionAdditionsTableData62 }
     *     
     */
    public ArrayOfDReceptionConditionAdditionsTableData62 getReceptionConditionAdditionsTableData62GetResult() {
        return receptionConditionAdditionsTableData62GetResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData62GetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDReceptionConditionAdditionsTableData62 }
     *     
     */
    public void setReceptionConditionAdditionsTableData62GetResult(ArrayOfDReceptionConditionAdditionsTableData62 value) {
        this.receptionConditionAdditionsTableData62GetResult = value;
    }

}
