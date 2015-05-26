
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
 *         &lt;element name="ReceptionConditionAdditionsTableData5DelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "receptionConditionAdditionsTableData5DelResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData5DelResponse")
public class ReceptionConditionAdditionsTableData5DelResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData5DelResult")
    protected int receptionConditionAdditionsTableData5DelResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData5DelResult property.
     * 
     */
    public int getReceptionConditionAdditionsTableData5DelResult() {
        return receptionConditionAdditionsTableData5DelResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData5DelResult property.
     * 
     */
    public void setReceptionConditionAdditionsTableData5DelResult(int value) {
        this.receptionConditionAdditionsTableData5DelResult = value;
    }

}
