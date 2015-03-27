
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
 *         &lt;element name="PersonWorkAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personWorkAddResult"
})
@XmlRootElement(name = "PersonWorkAddResponse")
public class PersonWorkAddResponse {

    @XmlElement(name = "PersonWorkAddResult")
    protected int personWorkAddResult;

    /**
     * Gets the value of the personWorkAddResult property.
     * 
     */
    public int getPersonWorkAddResult() {
        return personWorkAddResult;
    }

    /**
     * Sets the value of the personWorkAddResult property.
     * 
     */
    public void setPersonWorkAddResult(int value) {
        this.personWorkAddResult = value;
    }

}
