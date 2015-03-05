
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
 *         &lt;element name="ReceptionConditionAdditionsCopyResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "receptionConditionAdditionsCopyResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsCopyResponse")
public class ReceptionConditionAdditionsCopyResponse {

    @XmlElement(name = "ReceptionConditionAdditionsCopyResult")
    protected int receptionConditionAdditionsCopyResult;

    /**
     * Gets the value of the receptionConditionAdditionsCopyResult property.
     * 
     */
    public int getReceptionConditionAdditionsCopyResult() {
        return receptionConditionAdditionsCopyResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsCopyResult property.
     * 
     */
    public void setReceptionConditionAdditionsCopyResult(int value) {
        this.receptionConditionAdditionsCopyResult = value;
    }

}
