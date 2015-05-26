
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
 *         &lt;element name="PersonGovernmentAwardsAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personGovernmentAwardsAddResult"
})
@XmlRootElement(name = "PersonGovernmentAwardsAddResponse")
public class PersonGovernmentAwardsAddResponse {

    @XmlElement(name = "PersonGovernmentAwardsAddResult")
    protected int personGovernmentAwardsAddResult;

    /**
     * Gets the value of the personGovernmentAwardsAddResult property.
     * 
     */
    public int getPersonGovernmentAwardsAddResult() {
        return personGovernmentAwardsAddResult;
    }

    /**
     * Sets the value of the personGovernmentAwardsAddResult property.
     * 
     */
    public void setPersonGovernmentAwardsAddResult(int value) {
        this.personGovernmentAwardsAddResult = value;
    }

}
