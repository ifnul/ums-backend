
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
 *         &lt;element name="UniversityCoursesDelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityCoursesDelResult"
})
@XmlRootElement(name = "UniversityCoursesDelResponse")
public class UniversityCoursesDelResponse {

    @XmlElement(name = "UniversityCoursesDelResult")
    protected int universityCoursesDelResult;

    /**
     * Gets the value of the universityCoursesDelResult property.
     * 
     */
    public int getUniversityCoursesDelResult() {
        return universityCoursesDelResult;
    }

    /**
     * Sets the value of the universityCoursesDelResult property.
     * 
     */
    public void setUniversityCoursesDelResult(int value) {
        this.universityCoursesDelResult = value;
    }

}
