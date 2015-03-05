
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
 *         &lt;element name="PersonCoursesFullGetResult" type="{http://edboservice.ua/}ArrayOfDPersonCoursesFull" minOccurs="0"/>
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
    "personCoursesFullGetResult"
})
@XmlRootElement(name = "PersonCoursesFullGetResponse")
public class PersonCoursesFullGetResponse {

    @XmlElement(name = "PersonCoursesFullGetResult")
    protected ArrayOfDPersonCoursesFull personCoursesFullGetResult;

    /**
     * Gets the value of the personCoursesFullGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonCoursesFull }
     *     
     */
    public ArrayOfDPersonCoursesFull getPersonCoursesFullGetResult() {
        return personCoursesFullGetResult;
    }

    /**
     * Sets the value of the personCoursesFullGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonCoursesFull }
     *     
     */
    public void setPersonCoursesFullGetResult(ArrayOfDPersonCoursesFull value) {
        this.personCoursesFullGetResult = value;
    }

}
