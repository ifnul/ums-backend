
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
 *         &lt;element name="PersonRequestExaminationsValueChangeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personRequestExaminationsValueChangeResult"
})
@XmlRootElement(name = "PersonRequestExaminationsValueChangeResponse")
public class PersonRequestExaminationsValueChangeResponse {

    @XmlElement(name = "PersonRequestExaminationsValueChangeResult")
    protected int personRequestExaminationsValueChangeResult;

    /**
     * Gets the value of the personRequestExaminationsValueChangeResult property.
     * 
     */
    public int getPersonRequestExaminationsValueChangeResult() {
        return personRequestExaminationsValueChangeResult;
    }

    /**
     * Sets the value of the personRequestExaminationsValueChangeResult property.
     * 
     */
    public void setPersonRequestExaminationsValueChangeResult(int value) {
        this.personRequestExaminationsValueChangeResult = value;
    }

}
