
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
 *         &lt;element name="ReceptionConditionAdditionsTableData1EditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "receptionConditionAdditionsTableData1EditResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData1EditResponse")
public class ReceptionConditionAdditionsTableData1EditResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData1EditResult")
    protected int receptionConditionAdditionsTableData1EditResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData1EditResult property.
     * 
     */
    public int getReceptionConditionAdditionsTableData1EditResult() {
        return receptionConditionAdditionsTableData1EditResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData1EditResult property.
     * 
     */
    public void setReceptionConditionAdditionsTableData1EditResult(int value) {
        this.receptionConditionAdditionsTableData1EditResult = value;
    }

}
