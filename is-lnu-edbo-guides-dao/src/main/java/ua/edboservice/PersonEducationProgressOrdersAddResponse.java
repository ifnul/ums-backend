
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
 *         &lt;element name="PersonEducationProgressOrdersAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personEducationProgressOrdersAddResult"
})
@XmlRootElement(name = "PersonEducationProgressOrdersAddResponse")
public class PersonEducationProgressOrdersAddResponse {

    @XmlElement(name = "PersonEducationProgressOrdersAddResult")
    protected int personEducationProgressOrdersAddResult;

    /**
     * Gets the value of the personEducationProgressOrdersAddResult property.
     * 
     */
    public int getPersonEducationProgressOrdersAddResult() {
        return personEducationProgressOrdersAddResult;
    }

    /**
     * Sets the value of the personEducationProgressOrdersAddResult property.
     * 
     */
    public void setPersonEducationProgressOrdersAddResult(int value) {
        this.personEducationProgressOrdersAddResult = value;
    }

}
