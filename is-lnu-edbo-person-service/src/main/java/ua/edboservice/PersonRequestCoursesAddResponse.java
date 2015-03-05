
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
 *         &lt;element name="PersonRequestCoursesAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personRequestCoursesAddResult"
})
@XmlRootElement(name = "PersonRequestCoursesAddResponse")
public class PersonRequestCoursesAddResponse {

    @XmlElement(name = "PersonRequestCoursesAddResult")
    protected int personRequestCoursesAddResult;

    /**
     * Gets the value of the personRequestCoursesAddResult property.
     * 
     */
    public int getPersonRequestCoursesAddResult() {
        return personRequestCoursesAddResult;
    }

    /**
     * Sets the value of the personRequestCoursesAddResult property.
     * 
     */
    public void setPersonRequestCoursesAddResult(int value) {
        this.personRequestCoursesAddResult = value;
    }

}
