
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
 *         &lt;element name="PersonDeleteRequestEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personDeleteRequestEditResult"
})
@XmlRootElement(name = "PersonDeleteRequestEditResponse")
public class PersonDeleteRequestEditResponse {

    @XmlElement(name = "PersonDeleteRequestEditResult")
    protected int personDeleteRequestEditResult;

    /**
     * Gets the value of the personDeleteRequestEditResult property.
     * 
     */
    public int getPersonDeleteRequestEditResult() {
        return personDeleteRequestEditResult;
    }

    /**
     * Sets the value of the personDeleteRequestEditResult property.
     * 
     */
    public void setPersonDeleteRequestEditResult(int value) {
        this.personDeleteRequestEditResult = value;
    }

}
