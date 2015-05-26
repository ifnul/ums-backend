
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
 *         &lt;element name="UniversityFacultetSpecialitiesSubjectsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityFacultetSpecialitiesSubjects" minOccurs="0"/>
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
    "universityFacultetSpecialitiesSubjectsGetResult"
})
@XmlRootElement(name = "UniversityFacultetSpecialitiesSubjectsGetResponse")
public class UniversityFacultetSpecialitiesSubjectsGetResponse {

    @XmlElement(name = "UniversityFacultetSpecialitiesSubjectsGetResult")
    protected ArrayOfDUniversityFacultetSpecialitiesSubjects universityFacultetSpecialitiesSubjectsGetResult;

    /**
     * Gets the value of the universityFacultetSpecialitiesSubjectsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityFacultetSpecialitiesSubjects }
     *     
     */
    public ArrayOfDUniversityFacultetSpecialitiesSubjects getUniversityFacultetSpecialitiesSubjectsGetResult() {
        return universityFacultetSpecialitiesSubjectsGetResult;
    }

    /**
     * Sets the value of the universityFacultetSpecialitiesSubjectsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityFacultetSpecialitiesSubjects }
     *     
     */
    public void setUniversityFacultetSpecialitiesSubjectsGetResult(ArrayOfDUniversityFacultetSpecialitiesSubjects value) {
        this.universityFacultetSpecialitiesSubjectsGetResult = value;
    }

}
