
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
 *         &lt;element name="UniversityCoursesStudentsDataSubjectsChangeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityCoursesStudentsDataSubjectsChangeResult"
})
@XmlRootElement(name = "UniversityCoursesStudentsDataSubjectsChangeResponse")
public class UniversityCoursesStudentsDataSubjectsChangeResponse {

    @XmlElement(name = "UniversityCoursesStudentsDataSubjectsChangeResult")
    protected int universityCoursesStudentsDataSubjectsChangeResult;

    /**
     * Gets the value of the universityCoursesStudentsDataSubjectsChangeResult property.
     * 
     */
    public int getUniversityCoursesStudentsDataSubjectsChangeResult() {
        return universityCoursesStudentsDataSubjectsChangeResult;
    }

    /**
     * Sets the value of the universityCoursesStudentsDataSubjectsChangeResult property.
     * 
     */
    public void setUniversityCoursesStudentsDataSubjectsChangeResult(int value) {
        this.universityCoursesStudentsDataSubjectsChangeResult = value;
    }

}
