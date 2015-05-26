
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
 *         &lt;element name="ReceptionConditionAdditionsTableData234AddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "receptionConditionAdditionsTableData234AddResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData234AddResponse")
public class ReceptionConditionAdditionsTableData234AddResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData234AddResult")
    protected int receptionConditionAdditionsTableData234AddResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData234AddResult property.
     * 
     */
    public int getReceptionConditionAdditionsTableData234AddResult() {
        return receptionConditionAdditionsTableData234AddResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData234AddResult property.
     * 
     */
    public void setReceptionConditionAdditionsTableData234AddResult(int value) {
        this.receptionConditionAdditionsTableData234AddResult = value;
    }

}
