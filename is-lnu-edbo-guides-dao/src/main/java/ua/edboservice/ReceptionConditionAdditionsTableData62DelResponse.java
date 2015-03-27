
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
 *         &lt;element name="ReceptionConditionAdditionsTableData62DelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "receptionConditionAdditionsTableData62DelResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData62DelResponse")
public class ReceptionConditionAdditionsTableData62DelResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData62DelResult")
    protected int receptionConditionAdditionsTableData62DelResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData62DelResult property.
     * 
     */
    public int getReceptionConditionAdditionsTableData62DelResult() {
        return receptionConditionAdditionsTableData62DelResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData62DelResult property.
     * 
     */
    public void setReceptionConditionAdditionsTableData62DelResult(int value) {
        this.receptionConditionAdditionsTableData62DelResult = value;
    }

}
