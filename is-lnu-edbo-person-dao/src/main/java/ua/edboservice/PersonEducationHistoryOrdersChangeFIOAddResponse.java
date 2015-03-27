
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
 *         &lt;element name="PersonEducationHistoryOrdersChangeFIOAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personEducationHistoryOrdersChangeFIOAddResult"
})
@XmlRootElement(name = "PersonEducationHistoryOrdersChangeFIOAddResponse")
public class PersonEducationHistoryOrdersChangeFIOAddResponse {

    @XmlElement(name = "PersonEducationHistoryOrdersChangeFIOAddResult")
    protected int personEducationHistoryOrdersChangeFIOAddResult;

    /**
     * Gets the value of the personEducationHistoryOrdersChangeFIOAddResult property.
     * 
     */
    public int getPersonEducationHistoryOrdersChangeFIOAddResult() {
        return personEducationHistoryOrdersChangeFIOAddResult;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersChangeFIOAddResult property.
     * 
     */
    public void setPersonEducationHistoryOrdersChangeFIOAddResult(int value) {
        this.personEducationHistoryOrdersChangeFIOAddResult = value;
    }

}
