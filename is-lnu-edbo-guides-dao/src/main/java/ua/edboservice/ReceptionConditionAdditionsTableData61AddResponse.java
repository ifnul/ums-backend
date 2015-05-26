
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
 *         &lt;element name="ReceptionConditionAdditionsTableData61AddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "receptionConditionAdditionsTableData61AddResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData61AddResponse")
public class ReceptionConditionAdditionsTableData61AddResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData61AddResult")
    protected int receptionConditionAdditionsTableData61AddResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData61AddResult property.
     * 
     */
    public int getReceptionConditionAdditionsTableData61AddResult() {
        return receptionConditionAdditionsTableData61AddResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData61AddResult property.
     * 
     */
    public void setReceptionConditionAdditionsTableData61AddResult(int value) {
        this.receptionConditionAdditionsTableData61AddResult = value;
    }

}
