
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
 *         &lt;element name="UniversityCoursesAddResult" type="{http://edboservice.ua/}ArrayOfDUniversityCoursesAdd" minOccurs="0"/>
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
    "universityCoursesAddResult"
})
@XmlRootElement(name = "UniversityCoursesAddResponse")
public class UniversityCoursesAddResponse {

    @XmlElement(name = "UniversityCoursesAddResult")
    protected ArrayOfDUniversityCoursesAdd universityCoursesAddResult;

    /**
     * Gets the value of the universityCoursesAddResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityCoursesAdd }
     *     
     */
    public ArrayOfDUniversityCoursesAdd getUniversityCoursesAddResult() {
        return universityCoursesAddResult;
    }

    /**
     * Sets the value of the universityCoursesAddResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityCoursesAdd }
     *     
     */
    public void setUniversityCoursesAddResult(ArrayOfDUniversityCoursesAdd value) {
        this.universityCoursesAddResult = value;
    }

}
