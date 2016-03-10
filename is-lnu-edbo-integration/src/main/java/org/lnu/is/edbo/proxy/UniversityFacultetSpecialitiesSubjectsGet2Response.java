
package org.lnu.is.edbo.proxy;

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
 *         &lt;element name="UniversityFacultetSpecialitiesSubjectsGet2Result" type="{http://edboservice.ua/}ArrayOfDUniversityFacultetSpecialitiesSubjects2" minOccurs="0"/>
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
    "universityFacultetSpecialitiesSubjectsGet2Result"
})
@XmlRootElement(name = "UniversityFacultetSpecialitiesSubjectsGet2Response")
public class UniversityFacultetSpecialitiesSubjectsGet2Response {

    @XmlElement(name = "UniversityFacultetSpecialitiesSubjectsGet2Result")
    protected ArrayOfDUniversityFacultetSpecialitiesSubjects2 universityFacultetSpecialitiesSubjectsGet2Result;

    /**
     * Gets the value of the universityFacultetSpecialitiesSubjectsGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityFacultetSpecialitiesSubjects2 }
     *     
     */
    public ArrayOfDUniversityFacultetSpecialitiesSubjects2 getUniversityFacultetSpecialitiesSubjectsGet2Result() {
        return universityFacultetSpecialitiesSubjectsGet2Result;
    }

    /**
     * Sets the value of the universityFacultetSpecialitiesSubjectsGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityFacultetSpecialitiesSubjects2 }
     *     
     */
    public void setUniversityFacultetSpecialitiesSubjectsGet2Result(ArrayOfDUniversityFacultetSpecialitiesSubjects2 value) {
        this.universityFacultetSpecialitiesSubjectsGet2Result = value;
    }

}
