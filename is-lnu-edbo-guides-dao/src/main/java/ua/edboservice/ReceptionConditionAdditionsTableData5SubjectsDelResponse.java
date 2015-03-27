
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
 *         &lt;element name="ReceptionConditionAdditionsTableData5SubjectsDelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "receptionConditionAdditionsTableData5SubjectsDelResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData5SubjectsDelResponse")
public class ReceptionConditionAdditionsTableData5SubjectsDelResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData5SubjectsDelResult")
    protected int receptionConditionAdditionsTableData5SubjectsDelResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData5SubjectsDelResult property.
     * 
     */
    public int getReceptionConditionAdditionsTableData5SubjectsDelResult() {
        return receptionConditionAdditionsTableData5SubjectsDelResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData5SubjectsDelResult property.
     * 
     */
    public void setReceptionConditionAdditionsTableData5SubjectsDelResult(int value) {
        this.receptionConditionAdditionsTableData5SubjectsDelResult = value;
    }

}
