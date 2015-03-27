
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
 *         &lt;element name="PersonRequestEdit2Result" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personRequestEdit2Result"
})
@XmlRootElement(name = "PersonRequestEdit2Response")
public class PersonRequestEdit2Response {

    @XmlElement(name = "PersonRequestEdit2Result")
    protected int personRequestEdit2Result;

    /**
     * Gets the value of the personRequestEdit2Result property.
     * 
     */
    public int getPersonRequestEdit2Result() {
        return personRequestEdit2Result;
    }

    /**
     * Sets the value of the personRequestEdit2Result property.
     * 
     */
    public void setPersonRequestEdit2Result(int value) {
        this.personRequestEdit2Result = value;
    }

}
