
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
 *         &lt;element name="PersonRequestCoursesFullGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestCoursesFull" minOccurs="0"/>
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
    "personRequestCoursesFullGetResult"
})
@XmlRootElement(name = "PersonRequestCoursesFullGetResponse")
public class PersonRequestCoursesFullGetResponse {

    @XmlElement(name = "PersonRequestCoursesFullGetResult")
    protected ArrayOfDPersonRequestCoursesFull personRequestCoursesFullGetResult;

    /**
     * Gets the value of the personRequestCoursesFullGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestCoursesFull }
     *     
     */
    public ArrayOfDPersonRequestCoursesFull getPersonRequestCoursesFullGetResult() {
        return personRequestCoursesFullGetResult;
    }

    /**
     * Sets the value of the personRequestCoursesFullGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestCoursesFull }
     *     
     */
    public void setPersonRequestCoursesFullGetResult(ArrayOfDPersonRequestCoursesFull value) {
        this.personRequestCoursesFullGetResult = value;
    }

}
