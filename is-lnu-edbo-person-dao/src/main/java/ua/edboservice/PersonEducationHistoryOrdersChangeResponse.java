
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
 *         &lt;element name="PersonEducationHistoryOrdersChangeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personEducationHistoryOrdersChangeResult"
})
@XmlRootElement(name = "PersonEducationHistoryOrdersChangeResponse")
public class PersonEducationHistoryOrdersChangeResponse {

    @XmlElement(name = "PersonEducationHistoryOrdersChangeResult")
    protected int personEducationHistoryOrdersChangeResult;

    /**
     * Gets the value of the personEducationHistoryOrdersChangeResult property.
     * 
     */
    public int getPersonEducationHistoryOrdersChangeResult() {
        return personEducationHistoryOrdersChangeResult;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersChangeResult property.
     * 
     */
    public void setPersonEducationHistoryOrdersChangeResult(int value) {
        this.personEducationHistoryOrdersChangeResult = value;
    }

}
