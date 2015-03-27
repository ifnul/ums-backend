
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
 *         &lt;element name="GovernmentAwardsEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "governmentAwardsEditResult"
})
@XmlRootElement(name = "GovernmentAwardsEditResponse")
public class GovernmentAwardsEditResponse {

    @XmlElement(name = "GovernmentAwardsEditResult")
    protected int governmentAwardsEditResult;

    /**
     * Gets the value of the governmentAwardsEditResult property.
     * 
     */
    public int getGovernmentAwardsEditResult() {
        return governmentAwardsEditResult;
    }

    /**
     * Sets the value of the governmentAwardsEditResult property.
     * 
     */
    public void setGovernmentAwardsEditResult(int value) {
        this.governmentAwardsEditResult = value;
    }

}
