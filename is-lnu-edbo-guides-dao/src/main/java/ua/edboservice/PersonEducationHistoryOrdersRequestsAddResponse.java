
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
 *         &lt;element name="PersonEducationHistoryOrdersRequestsAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personEducationHistoryOrdersRequestsAddResult"
})
@XmlRootElement(name = "PersonEducationHistoryOrdersRequestsAddResponse")
public class PersonEducationHistoryOrdersRequestsAddResponse {

    @XmlElement(name = "PersonEducationHistoryOrdersRequestsAddResult")
    protected int personEducationHistoryOrdersRequestsAddResult;

    /**
     * Gets the value of the personEducationHistoryOrdersRequestsAddResult property.
     * 
     */
    public int getPersonEducationHistoryOrdersRequestsAddResult() {
        return personEducationHistoryOrdersRequestsAddResult;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersRequestsAddResult property.
     * 
     */
    public void setPersonEducationHistoryOrdersRequestsAddResult(int value) {
        this.personEducationHistoryOrdersRequestsAddResult = value;
    }

}
