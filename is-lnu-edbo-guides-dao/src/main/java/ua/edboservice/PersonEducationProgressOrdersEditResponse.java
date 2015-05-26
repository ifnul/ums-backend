
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
 *         &lt;element name="PersonEducationProgressOrdersEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personEducationProgressOrdersEditResult"
})
@XmlRootElement(name = "PersonEducationProgressOrdersEditResponse")
public class PersonEducationProgressOrdersEditResponse {

    @XmlElement(name = "PersonEducationProgressOrdersEditResult")
    protected int personEducationProgressOrdersEditResult;

    /**
     * Gets the value of the personEducationProgressOrdersEditResult property.
     * 
     */
    public int getPersonEducationProgressOrdersEditResult() {
        return personEducationProgressOrdersEditResult;
    }

    /**
     * Sets the value of the personEducationProgressOrdersEditResult property.
     * 
     */
    public void setPersonEducationProgressOrdersEditResult(int value) {
        this.personEducationProgressOrdersEditResult = value;
    }

}
