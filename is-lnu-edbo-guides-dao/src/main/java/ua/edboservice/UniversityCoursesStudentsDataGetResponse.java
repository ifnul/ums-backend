
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
 *         &lt;element name="UniversityCoursesStudentsDataGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityCoursesStudentsData" minOccurs="0"/>
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
    "universityCoursesStudentsDataGetResult"
})
@XmlRootElement(name = "UniversityCoursesStudentsDataGetResponse")
public class UniversityCoursesStudentsDataGetResponse {

    @XmlElement(name = "UniversityCoursesStudentsDataGetResult")
    protected ArrayOfDUniversityCoursesStudentsData universityCoursesStudentsDataGetResult;

    /**
     * Gets the value of the universityCoursesStudentsDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityCoursesStudentsData }
     *     
     */
    public ArrayOfDUniversityCoursesStudentsData getUniversityCoursesStudentsDataGetResult() {
        return universityCoursesStudentsDataGetResult;
    }

    /**
     * Sets the value of the universityCoursesStudentsDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityCoursesStudentsData }
     *     
     */
    public void setUniversityCoursesStudentsDataGetResult(ArrayOfDUniversityCoursesStudentsData value) {
        this.universityCoursesStudentsDataGetResult = value;
    }

}
