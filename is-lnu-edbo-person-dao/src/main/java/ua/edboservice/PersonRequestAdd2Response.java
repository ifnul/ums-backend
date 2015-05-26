
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
 *         &lt;element name="PersonRequestAdd2Result" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personRequestAdd2Result"
})
@XmlRootElement(name = "PersonRequestAdd2Response")
public class PersonRequestAdd2Response {

    @XmlElement(name = "PersonRequestAdd2Result")
    protected int personRequestAdd2Result;

    /**
     * Gets the value of the personRequestAdd2Result property.
     * 
     */
    public int getPersonRequestAdd2Result() {
        return personRequestAdd2Result;
    }

    /**
     * Sets the value of the personRequestAdd2Result property.
     * 
     */
    public void setPersonRequestAdd2Result(int value) {
        this.personRequestAdd2Result = value;
    }

}
