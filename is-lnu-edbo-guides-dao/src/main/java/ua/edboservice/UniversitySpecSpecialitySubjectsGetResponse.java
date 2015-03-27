
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
 *         &lt;element name="UniversitySpecSpecialitySubjectsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversitySpecSpecialitySubjects" minOccurs="0"/>
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
    "universitySpecSpecialitySubjectsGetResult"
})
@XmlRootElement(name = "UniversitySpecSpecialitySubjectsGetResponse")
public class UniversitySpecSpecialitySubjectsGetResponse {

    @XmlElement(name = "UniversitySpecSpecialitySubjectsGetResult")
    protected ArrayOfDUniversitySpecSpecialitySubjects universitySpecSpecialitySubjectsGetResult;

    /**
     * Gets the value of the universitySpecSpecialitySubjectsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversitySpecSpecialitySubjects }
     *     
     */
    public ArrayOfDUniversitySpecSpecialitySubjects getUniversitySpecSpecialitySubjectsGetResult() {
        return universitySpecSpecialitySubjectsGetResult;
    }

    /**
     * Sets the value of the universitySpecSpecialitySubjectsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversitySpecSpecialitySubjects }
     *     
     */
    public void setUniversitySpecSpecialitySubjectsGetResult(ArrayOfDUniversitySpecSpecialitySubjects value) {
        this.universitySpecSpecialitySubjectsGetResult = value;
    }

}
