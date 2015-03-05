
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
 *         &lt;element name="PersonCoursesGet2Result" type="{http://edboservice.ua/}ArrayOfDPersonCourses2" minOccurs="0"/>
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
    "personCoursesGet2Result"
})
@XmlRootElement(name = "PersonCoursesGet2Response")
public class PersonCoursesGet2Response {

    @XmlElement(name = "PersonCoursesGet2Result")
    protected ArrayOfDPersonCourses2 personCoursesGet2Result;

    /**
     * Gets the value of the personCoursesGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonCourses2 }
     *     
     */
    public ArrayOfDPersonCourses2 getPersonCoursesGet2Result() {
        return personCoursesGet2Result;
    }

    /**
     * Sets the value of the personCoursesGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonCourses2 }
     *     
     */
    public void setPersonCoursesGet2Result(ArrayOfDPersonCourses2 value) {
        this.personCoursesGet2Result = value;
    }

}
