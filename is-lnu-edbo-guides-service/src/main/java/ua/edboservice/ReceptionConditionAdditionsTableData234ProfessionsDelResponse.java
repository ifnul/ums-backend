
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
 *         &lt;element name="ReceptionConditionAdditionsTableData234ProfessionsDelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "receptionConditionAdditionsTableData234ProfessionsDelResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData234ProfessionsDelResponse")
public class ReceptionConditionAdditionsTableData234ProfessionsDelResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData234ProfessionsDelResult")
    protected int receptionConditionAdditionsTableData234ProfessionsDelResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData234ProfessionsDelResult property.
     * 
     */
    public int getReceptionConditionAdditionsTableData234ProfessionsDelResult() {
        return receptionConditionAdditionsTableData234ProfessionsDelResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData234ProfessionsDelResult property.
     * 
     */
    public void setReceptionConditionAdditionsTableData234ProfessionsDelResult(int value) {
        this.receptionConditionAdditionsTableData234ProfessionsDelResult = value;
    }

}
