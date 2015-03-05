
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
 *         &lt;element name="PersonTextbooksEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personTextbooksEditResult"
})
@XmlRootElement(name = "PersonTextbooksEditResponse")
public class PersonTextbooksEditResponse {

    @XmlElement(name = "PersonTextbooksEditResult")
    protected int personTextbooksEditResult;

    /**
     * Gets the value of the personTextbooksEditResult property.
     * 
     */
    public int getPersonTextbooksEditResult() {
        return personTextbooksEditResult;
    }

    /**
     * Sets the value of the personTextbooksEditResult property.
     * 
     */
    public void setPersonTextbooksEditResult(int value) {
        this.personTextbooksEditResult = value;
    }

}
