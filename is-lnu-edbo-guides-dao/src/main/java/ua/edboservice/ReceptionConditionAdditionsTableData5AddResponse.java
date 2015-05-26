
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
 *         &lt;element name="ReceptionConditionAdditionsTableData5AddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "receptionConditionAdditionsTableData5AddResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData5AddResponse")
public class ReceptionConditionAdditionsTableData5AddResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData5AddResult")
    protected int receptionConditionAdditionsTableData5AddResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData5AddResult property.
     * 
     */
    public int getReceptionConditionAdditionsTableData5AddResult() {
        return receptionConditionAdditionsTableData5AddResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData5AddResult property.
     * 
     */
    public void setReceptionConditionAdditionsTableData5AddResult(int value) {
        this.receptionConditionAdditionsTableData5AddResult = value;
    }

}
