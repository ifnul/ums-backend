
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
 *         &lt;element name="UniversityCoursesTransferCoursesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityCoursesTransferCourses" minOccurs="0"/>
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
    "universityCoursesTransferCoursesGetResult"
})
@XmlRootElement(name = "UniversityCoursesTransferCoursesGetResponse")
public class UniversityCoursesTransferCoursesGetResponse {

    @XmlElement(name = "UniversityCoursesTransferCoursesGetResult")
    protected ArrayOfDUniversityCoursesTransferCourses universityCoursesTransferCoursesGetResult;

    /**
     * Gets the value of the universityCoursesTransferCoursesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityCoursesTransferCourses }
     *     
     */
    public ArrayOfDUniversityCoursesTransferCourses getUniversityCoursesTransferCoursesGetResult() {
        return universityCoursesTransferCoursesGetResult;
    }

    /**
     * Sets the value of the universityCoursesTransferCoursesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityCoursesTransferCourses }
     *     
     */
    public void setUniversityCoursesTransferCoursesGetResult(ArrayOfDUniversityCoursesTransferCourses value) {
        this.universityCoursesTransferCoursesGetResult = value;
    }

}
