
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
 *         &lt;element name="UniversityCoursesTransferStudentsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityCoursesTransferStudents" minOccurs="0"/>
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
    "universityCoursesTransferStudentsGetResult"
})
@XmlRootElement(name = "UniversityCoursesTransferStudentsGetResponse")
public class UniversityCoursesTransferStudentsGetResponse {

    @XmlElement(name = "UniversityCoursesTransferStudentsGetResult")
    protected ArrayOfDUniversityCoursesTransferStudents universityCoursesTransferStudentsGetResult;

    /**
     * Gets the value of the universityCoursesTransferStudentsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityCoursesTransferStudents }
     *     
     */
    public ArrayOfDUniversityCoursesTransferStudents getUniversityCoursesTransferStudentsGetResult() {
        return universityCoursesTransferStudentsGetResult;
    }

    /**
     * Sets the value of the universityCoursesTransferStudentsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityCoursesTransferStudents }
     *     
     */
    public void setUniversityCoursesTransferStudentsGetResult(ArrayOfDUniversityCoursesTransferStudents value) {
        this.universityCoursesTransferStudentsGetResult = value;
    }

}
