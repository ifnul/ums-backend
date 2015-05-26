
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
 *         &lt;element name="ReceptionConditionAdditionsTableData5SubjectsAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "receptionConditionAdditionsTableData5SubjectsAddResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData5SubjectsAddResponse")
public class ReceptionConditionAdditionsTableData5SubjectsAddResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData5SubjectsAddResult")
    protected int receptionConditionAdditionsTableData5SubjectsAddResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData5SubjectsAddResult property.
     * 
     */
    public int getReceptionConditionAdditionsTableData5SubjectsAddResult() {
        return receptionConditionAdditionsTableData5SubjectsAddResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData5SubjectsAddResult property.
     * 
     */
    public void setReceptionConditionAdditionsTableData5SubjectsAddResult(int value) {
        this.receptionConditionAdditionsTableData5SubjectsAddResult = value;
    }

}
