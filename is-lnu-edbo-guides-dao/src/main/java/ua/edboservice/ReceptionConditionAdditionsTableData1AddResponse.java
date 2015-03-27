
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
 *         &lt;element name="ReceptionConditionAdditionsTableData1AddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "receptionConditionAdditionsTableData1AddResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData1AddResponse")
public class ReceptionConditionAdditionsTableData1AddResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData1AddResult")
    protected int receptionConditionAdditionsTableData1AddResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData1AddResult property.
     * 
     */
    public int getReceptionConditionAdditionsTableData1AddResult() {
        return receptionConditionAdditionsTableData1AddResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData1AddResult property.
     * 
     */
    public void setReceptionConditionAdditionsTableData1AddResult(int value) {
        this.receptionConditionAdditionsTableData1AddResult = value;
    }

}
