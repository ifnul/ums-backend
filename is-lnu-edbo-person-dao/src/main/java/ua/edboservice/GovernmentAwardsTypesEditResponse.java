
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
 *         &lt;element name="GovernmentAwardsTypesEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "governmentAwardsTypesEditResult"
})
@XmlRootElement(name = "GovernmentAwardsTypesEditResponse")
public class GovernmentAwardsTypesEditResponse {

    @XmlElement(name = "GovernmentAwardsTypesEditResult")
    protected int governmentAwardsTypesEditResult;

    /**
     * Gets the value of the governmentAwardsTypesEditResult property.
     * 
     */
    public int getGovernmentAwardsTypesEditResult() {
        return governmentAwardsTypesEditResult;
    }

    /**
     * Sets the value of the governmentAwardsTypesEditResult property.
     * 
     */
    public void setGovernmentAwardsTypesEditResult(int value) {
        this.governmentAwardsTypesEditResult = value;
    }

}
