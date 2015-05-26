
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
 *         &lt;element name="PersonSubjectsOrdersDataAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personSubjectsOrdersDataAddResult"
})
@XmlRootElement(name = "PersonSubjectsOrdersDataAddResponse")
public class PersonSubjectsOrdersDataAddResponse {

    @XmlElement(name = "PersonSubjectsOrdersDataAddResult")
    protected int personSubjectsOrdersDataAddResult;

    /**
     * Gets the value of the personSubjectsOrdersDataAddResult property.
     * 
     */
    public int getPersonSubjectsOrdersDataAddResult() {
        return personSubjectsOrdersDataAddResult;
    }

    /**
     * Sets the value of the personSubjectsOrdersDataAddResult property.
     * 
     */
    public void setPersonSubjectsOrdersDataAddResult(int value) {
        this.personSubjectsOrdersDataAddResult = value;
    }

}
