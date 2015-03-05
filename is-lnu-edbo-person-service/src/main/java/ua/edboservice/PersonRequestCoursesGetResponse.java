
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
 *         &lt;element name="PersonRequestCoursesGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestCourses" minOccurs="0"/>
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
    "personRequestCoursesGetResult"
})
@XmlRootElement(name = "PersonRequestCoursesGetResponse")
public class PersonRequestCoursesGetResponse {

    @XmlElement(name = "PersonRequestCoursesGetResult")
    protected ArrayOfDPersonRequestCourses personRequestCoursesGetResult;

    /**
     * Gets the value of the personRequestCoursesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestCourses }
     *     
     */
    public ArrayOfDPersonRequestCourses getPersonRequestCoursesGetResult() {
        return personRequestCoursesGetResult;
    }

    /**
     * Sets the value of the personRequestCoursesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestCourses }
     *     
     */
    public void setPersonRequestCoursesGetResult(ArrayOfDPersonRequestCourses value) {
        this.personRequestCoursesGetResult = value;
    }

}
