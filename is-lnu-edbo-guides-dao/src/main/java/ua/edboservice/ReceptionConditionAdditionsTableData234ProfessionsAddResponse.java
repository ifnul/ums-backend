
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
 *         &lt;element name="ReceptionConditionAdditionsTableData234ProfessionsAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "receptionConditionAdditionsTableData234ProfessionsAddResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData234ProfessionsAddResponse")
public class ReceptionConditionAdditionsTableData234ProfessionsAddResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData234ProfessionsAddResult")
    protected int receptionConditionAdditionsTableData234ProfessionsAddResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData234ProfessionsAddResult property.
     * 
     */
    public int getReceptionConditionAdditionsTableData234ProfessionsAddResult() {
        return receptionConditionAdditionsTableData234ProfessionsAddResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData234ProfessionsAddResult property.
     * 
     */
    public void setReceptionConditionAdditionsTableData234ProfessionsAddResult(int value) {
        this.receptionConditionAdditionsTableData234ProfessionsAddResult = value;
    }

}
