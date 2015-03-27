
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
 *         &lt;element name="PersonCoursesGet3Result" type="{http://edboservice.ua/}ArrayOfDPersonCourses3" minOccurs="0"/>
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
    "personCoursesGet3Result"
})
@XmlRootElement(name = "PersonCoursesGet3Response")
public class PersonCoursesGet3Response {

    @XmlElement(name = "PersonCoursesGet3Result")
    protected ArrayOfDPersonCourses3 personCoursesGet3Result;

    /**
     * Gets the value of the personCoursesGet3Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonCourses3 }
     *     
     */
    public ArrayOfDPersonCourses3 getPersonCoursesGet3Result() {
        return personCoursesGet3Result;
    }

    /**
     * Sets the value of the personCoursesGet3Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonCourses3 }
     *     
     */
    public void setPersonCoursesGet3Result(ArrayOfDPersonCourses3 value) {
        this.personCoursesGet3Result = value;
    }

}
