
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
 *         &lt;element name="PersonRequestEdit3Result" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personRequestEdit3Result"
})
@XmlRootElement(name = "PersonRequestEdit3Response")
public class PersonRequestEdit3Response {

    @XmlElement(name = "PersonRequestEdit3Result")
    protected int personRequestEdit3Result;

    /**
     * Gets the value of the personRequestEdit3Result property.
     * 
     */
    public int getPersonRequestEdit3Result() {
        return personRequestEdit3Result;
    }

    /**
     * Sets the value of the personRequestEdit3Result property.
     * 
     */
    public void setPersonRequestEdit3Result(int value) {
        this.personRequestEdit3Result = value;
    }

}
