
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
 *         &lt;element name="UniversityCoursesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityCourses" minOccurs="0"/>
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
    "universityCoursesGetResult"
})
@XmlRootElement(name = "UniversityCoursesGetResponse")
public class UniversityCoursesGetResponse {

    @XmlElement(name = "UniversityCoursesGetResult")
    protected ArrayOfDUniversityCourses universityCoursesGetResult;

    /**
     * Gets the value of the universityCoursesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityCourses }
     *     
     */
    public ArrayOfDUniversityCourses getUniversityCoursesGetResult() {
        return universityCoursesGetResult;
    }

    /**
     * Sets the value of the universityCoursesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityCourses }
     *     
     */
    public void setUniversityCoursesGetResult(ArrayOfDUniversityCourses value) {
        this.universityCoursesGetResult = value;
    }

}
