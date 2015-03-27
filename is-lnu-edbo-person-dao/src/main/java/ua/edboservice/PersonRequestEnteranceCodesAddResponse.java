
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
 *         &lt;element name="PersonRequestEnteranceCodesAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personRequestEnteranceCodesAddResult"
})
@XmlRootElement(name = "PersonRequestEnteranceCodesAddResponse")
public class PersonRequestEnteranceCodesAddResponse {

    @XmlElement(name = "PersonRequestEnteranceCodesAddResult")
    protected int personRequestEnteranceCodesAddResult;

    /**
     * Gets the value of the personRequestEnteranceCodesAddResult property.
     * 
     */
    public int getPersonRequestEnteranceCodesAddResult() {
        return personRequestEnteranceCodesAddResult;
    }

    /**
     * Sets the value of the personRequestEnteranceCodesAddResult property.
     * 
     */
    public void setPersonRequestEnteranceCodesAddResult(int value) {
        this.personRequestEnteranceCodesAddResult = value;
    }

}
