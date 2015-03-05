
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
 *         &lt;element name="PersonEducationHistoryOrdersDelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personEducationHistoryOrdersDelResult"
})
@XmlRootElement(name = "PersonEducationHistoryOrdersDelResponse")
public class PersonEducationHistoryOrdersDelResponse {

    @XmlElement(name = "PersonEducationHistoryOrdersDelResult")
    protected int personEducationHistoryOrdersDelResult;

    /**
     * Gets the value of the personEducationHistoryOrdersDelResult property.
     * 
     */
    public int getPersonEducationHistoryOrdersDelResult() {
        return personEducationHistoryOrdersDelResult;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersDelResult property.
     * 
     */
    public void setPersonEducationHistoryOrdersDelResult(int value) {
        this.personEducationHistoryOrdersDelResult = value;
    }

}
