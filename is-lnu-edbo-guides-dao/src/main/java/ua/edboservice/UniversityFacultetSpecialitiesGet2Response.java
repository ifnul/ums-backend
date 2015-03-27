
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
 *         &lt;element name="UniversityFacultetSpecialitiesGet2Result" type="{http://edboservice.ua/}ArrayOfDUniversityFacultetSpecialities2" minOccurs="0"/>
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
    "universityFacultetSpecialitiesGet2Result"
})
@XmlRootElement(name = "UniversityFacultetSpecialitiesGet2Response")
public class UniversityFacultetSpecialitiesGet2Response {

    @XmlElement(name = "UniversityFacultetSpecialitiesGet2Result")
    protected ArrayOfDUniversityFacultetSpecialities2 universityFacultetSpecialitiesGet2Result;

    /**
     * Gets the value of the universityFacultetSpecialitiesGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityFacultetSpecialities2 }
     *     
     */
    public ArrayOfDUniversityFacultetSpecialities2 getUniversityFacultetSpecialitiesGet2Result() {
        return universityFacultetSpecialitiesGet2Result;
    }

    /**
     * Sets the value of the universityFacultetSpecialitiesGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityFacultetSpecialities2 }
     *     
     */
    public void setUniversityFacultetSpecialitiesGet2Result(ArrayOfDUniversityFacultetSpecialities2 value) {
        this.universityFacultetSpecialitiesGet2Result = value;
    }

}
