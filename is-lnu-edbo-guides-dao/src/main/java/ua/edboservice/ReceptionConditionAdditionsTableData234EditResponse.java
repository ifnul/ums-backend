
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
 *         &lt;element name="ReceptionConditionAdditionsTableData234EditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "receptionConditionAdditionsTableData234EditResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData234EditResponse")
public class ReceptionConditionAdditionsTableData234EditResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData234EditResult")
    protected int receptionConditionAdditionsTableData234EditResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData234EditResult property.
     * 
     */
    public int getReceptionConditionAdditionsTableData234EditResult() {
        return receptionConditionAdditionsTableData234EditResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData234EditResult property.
     * 
     */
    public void setReceptionConditionAdditionsTableData234EditResult(int value) {
        this.receptionConditionAdditionsTableData234EditResult = value;
    }

}
