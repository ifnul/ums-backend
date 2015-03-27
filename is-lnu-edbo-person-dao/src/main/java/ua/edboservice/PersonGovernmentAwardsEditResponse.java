
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
 *         &lt;element name="PersonGovernmentAwardsEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personGovernmentAwardsEditResult"
})
@XmlRootElement(name = "PersonGovernmentAwardsEditResponse")
public class PersonGovernmentAwardsEditResponse {

    @XmlElement(name = "PersonGovernmentAwardsEditResult")
    protected int personGovernmentAwardsEditResult;

    /**
     * Gets the value of the personGovernmentAwardsEditResult property.
     * 
     */
    public int getPersonGovernmentAwardsEditResult() {
        return personGovernmentAwardsEditResult;
    }

    /**
     * Sets the value of the personGovernmentAwardsEditResult property.
     * 
     */
    public void setPersonGovernmentAwardsEditResult(int value) {
        this.personGovernmentAwardsEditResult = value;
    }

}
