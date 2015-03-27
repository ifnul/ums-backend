
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
 *         &lt;element name="UniversityCoursesStudentsDataDelResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "universityCoursesStudentsDataDelResult"
})
@XmlRootElement(name = "UniversityCoursesStudentsDataDelResponse")
public class UniversityCoursesStudentsDataDelResponse {

    @XmlElement(name = "UniversityCoursesStudentsDataDelResult")
    protected String universityCoursesStudentsDataDelResult;

    /**
     * Gets the value of the universityCoursesStudentsDataDelResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCoursesStudentsDataDelResult() {
        return universityCoursesStudentsDataDelResult;
    }

    /**
     * Sets the value of the universityCoursesStudentsDataDelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCoursesStudentsDataDelResult(String value) {
        this.universityCoursesStudentsDataDelResult = value;
    }

}
