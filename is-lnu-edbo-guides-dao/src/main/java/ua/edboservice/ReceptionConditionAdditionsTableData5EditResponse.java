
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
 *         &lt;element name="ReceptionConditionAdditionsTableData5EditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "receptionConditionAdditionsTableData5EditResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData5EditResponse")
public class ReceptionConditionAdditionsTableData5EditResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData5EditResult")
    protected int receptionConditionAdditionsTableData5EditResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData5EditResult property.
     * 
     */
    public int getReceptionConditionAdditionsTableData5EditResult() {
        return receptionConditionAdditionsTableData5EditResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData5EditResult property.
     * 
     */
    public void setReceptionConditionAdditionsTableData5EditResult(int value) {
        this.receptionConditionAdditionsTableData5EditResult = value;
    }

}
