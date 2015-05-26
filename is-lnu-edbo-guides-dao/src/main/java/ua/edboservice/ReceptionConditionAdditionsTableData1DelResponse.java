
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
 *         &lt;element name="ReceptionConditionAdditionsTableData1DelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "receptionConditionAdditionsTableData1DelResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData1DelResponse")
public class ReceptionConditionAdditionsTableData1DelResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData1DelResult")
    protected int receptionConditionAdditionsTableData1DelResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData1DelResult property.
     * 
     */
    public int getReceptionConditionAdditionsTableData1DelResult() {
        return receptionConditionAdditionsTableData1DelResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData1DelResult property.
     * 
     */
    public void setReceptionConditionAdditionsTableData1DelResult(int value) {
        this.receptionConditionAdditionsTableData1DelResult = value;
    }

}
