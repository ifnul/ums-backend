
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
 *         &lt;element name="PersonEducationHistoryOrdersAdd2Result" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personEducationHistoryOrdersAdd2Result"
})
@XmlRootElement(name = "PersonEducationHistoryOrdersAdd2Response")
public class PersonEducationHistoryOrdersAdd2Response {

    @XmlElement(name = "PersonEducationHistoryOrdersAdd2Result")
    protected int personEducationHistoryOrdersAdd2Result;

    /**
     * Gets the value of the personEducationHistoryOrdersAdd2Result property.
     * 
     */
    public int getPersonEducationHistoryOrdersAdd2Result() {
        return personEducationHistoryOrdersAdd2Result;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersAdd2Result property.
     * 
     */
    public void setPersonEducationHistoryOrdersAdd2Result(int value) {
        this.personEducationHistoryOrdersAdd2Result = value;
    }

}
