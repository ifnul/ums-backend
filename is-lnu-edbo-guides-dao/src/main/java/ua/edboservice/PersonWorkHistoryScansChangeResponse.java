
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
 *         &lt;element name="PersonWorkHistoryScansChangeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personWorkHistoryScansChangeResult"
})
@XmlRootElement(name = "PersonWorkHistoryScansChangeResponse")
public class PersonWorkHistoryScansChangeResponse {

    @XmlElement(name = "PersonWorkHistoryScansChangeResult")
    protected int personWorkHistoryScansChangeResult;

    /**
     * Gets the value of the personWorkHistoryScansChangeResult property.
     * 
     */
    public int getPersonWorkHistoryScansChangeResult() {
        return personWorkHistoryScansChangeResult;
    }

    /**
     * Sets the value of the personWorkHistoryScansChangeResult property.
     * 
     */
    public void setPersonWorkHistoryScansChangeResult(int value) {
        this.personWorkHistoryScansChangeResult = value;
    }

}
