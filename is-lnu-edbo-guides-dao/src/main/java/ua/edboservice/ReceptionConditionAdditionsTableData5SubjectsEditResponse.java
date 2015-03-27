
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
 *         &lt;element name="ReceptionConditionAdditionsTableData5SubjectsEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "receptionConditionAdditionsTableData5SubjectsEditResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData5SubjectsEditResponse")
public class ReceptionConditionAdditionsTableData5SubjectsEditResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData5SubjectsEditResult")
    protected int receptionConditionAdditionsTableData5SubjectsEditResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData5SubjectsEditResult property.
     * 
     */
    public int getReceptionConditionAdditionsTableData5SubjectsEditResult() {
        return receptionConditionAdditionsTableData5SubjectsEditResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData5SubjectsEditResult property.
     * 
     */
    public void setReceptionConditionAdditionsTableData5SubjectsEditResult(int value) {
        this.receptionConditionAdditionsTableData5SubjectsEditResult = value;
    }

}
