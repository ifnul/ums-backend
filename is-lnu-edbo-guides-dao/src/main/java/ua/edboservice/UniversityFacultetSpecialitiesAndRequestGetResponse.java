
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
 *         &lt;element name="UniversityFacultetSpecialitiesAndRequestGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityFacultetSpecialitiesAndRequest" minOccurs="0"/>
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
    "universityFacultetSpecialitiesAndRequestGetResult"
})
@XmlRootElement(name = "UniversityFacultetSpecialitiesAndRequestGetResponse")
public class UniversityFacultetSpecialitiesAndRequestGetResponse {

    @XmlElement(name = "UniversityFacultetSpecialitiesAndRequestGetResult")
    protected ArrayOfDUniversityFacultetSpecialitiesAndRequest universityFacultetSpecialitiesAndRequestGetResult;

    /**
     * Gets the value of the universityFacultetSpecialitiesAndRequestGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityFacultetSpecialitiesAndRequest }
     *     
     */
    public ArrayOfDUniversityFacultetSpecialitiesAndRequest getUniversityFacultetSpecialitiesAndRequestGetResult() {
        return universityFacultetSpecialitiesAndRequestGetResult;
    }

    /**
     * Sets the value of the universityFacultetSpecialitiesAndRequestGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityFacultetSpecialitiesAndRequest }
     *     
     */
    public void setUniversityFacultetSpecialitiesAndRequestGetResult(ArrayOfDUniversityFacultetSpecialitiesAndRequest value) {
        this.universityFacultetSpecialitiesAndRequestGetResult = value;
    }

}
