
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
 *         &lt;element name="PersonEducationHistoryOrdersEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personEducationHistoryOrdersEditResult"
})
@XmlRootElement(name = "PersonEducationHistoryOrdersEditResponse")
public class PersonEducationHistoryOrdersEditResponse {

    @XmlElement(name = "PersonEducationHistoryOrdersEditResult")
    protected int personEducationHistoryOrdersEditResult;

    /**
     * Gets the value of the personEducationHistoryOrdersEditResult property.
     * 
     */
    public int getPersonEducationHistoryOrdersEditResult() {
        return personEducationHistoryOrdersEditResult;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersEditResult property.
     * 
     */
    public void setPersonEducationHistoryOrdersEditResult(int value) {
        this.personEducationHistoryOrdersEditResult = value;
    }

}
