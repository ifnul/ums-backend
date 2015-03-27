
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
 *         &lt;element name="PersonWorkHistoryScansDelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personWorkHistoryScansDelResult"
})
@XmlRootElement(name = "PersonWorkHistoryScansDelResponse")
public class PersonWorkHistoryScansDelResponse {

    @XmlElement(name = "PersonWorkHistoryScansDelResult")
    protected int personWorkHistoryScansDelResult;

    /**
     * Gets the value of the personWorkHistoryScansDelResult property.
     * 
     */
    public int getPersonWorkHistoryScansDelResult() {
        return personWorkHistoryScansDelResult;
    }

    /**
     * Sets the value of the personWorkHistoryScansDelResult property.
     * 
     */
    public void setPersonWorkHistoryScansDelResult(int value) {
        this.personWorkHistoryScansDelResult = value;
    }

}
