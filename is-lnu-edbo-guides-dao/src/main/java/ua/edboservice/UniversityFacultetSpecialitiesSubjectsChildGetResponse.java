
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
 *         &lt;element name="UniversityFacultetSpecialitiesSubjectsChildGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityFacultetSpecialitiesSubjectsChild" minOccurs="0"/>
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
    "universityFacultetSpecialitiesSubjectsChildGetResult"
})
@XmlRootElement(name = "UniversityFacultetSpecialitiesSubjectsChildGetResponse")
public class UniversityFacultetSpecialitiesSubjectsChildGetResponse {

    @XmlElement(name = "UniversityFacultetSpecialitiesSubjectsChildGetResult")
    protected ArrayOfDUniversityFacultetSpecialitiesSubjectsChild universityFacultetSpecialitiesSubjectsChildGetResult;

    /**
     * Gets the value of the universityFacultetSpecialitiesSubjectsChildGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityFacultetSpecialitiesSubjectsChild }
     *     
     */
    public ArrayOfDUniversityFacultetSpecialitiesSubjectsChild getUniversityFacultetSpecialitiesSubjectsChildGetResult() {
        return universityFacultetSpecialitiesSubjectsChildGetResult;
    }

    /**
     * Sets the value of the universityFacultetSpecialitiesSubjectsChildGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityFacultetSpecialitiesSubjectsChild }
     *     
     */
    public void setUniversityFacultetSpecialitiesSubjectsChildGetResult(ArrayOfDUniversityFacultetSpecialitiesSubjectsChild value) {
        this.universityFacultetSpecialitiesSubjectsChildGetResult = value;
    }

}
