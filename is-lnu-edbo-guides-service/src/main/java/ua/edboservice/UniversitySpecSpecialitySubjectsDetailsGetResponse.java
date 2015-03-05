
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
 *         &lt;element name="UniversitySpecSpecialitySubjectsDetailsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversitySpecSpecialitySubjectsDetails" minOccurs="0"/>
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
    "universitySpecSpecialitySubjectsDetailsGetResult"
})
@XmlRootElement(name = "UniversitySpecSpecialitySubjectsDetailsGetResponse")
public class UniversitySpecSpecialitySubjectsDetailsGetResponse {

    @XmlElement(name = "UniversitySpecSpecialitySubjectsDetailsGetResult")
    protected ArrayOfDUniversitySpecSpecialitySubjectsDetails universitySpecSpecialitySubjectsDetailsGetResult;

    /**
     * Gets the value of the universitySpecSpecialitySubjectsDetailsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversitySpecSpecialitySubjectsDetails }
     *     
     */
    public ArrayOfDUniversitySpecSpecialitySubjectsDetails getUniversitySpecSpecialitySubjectsDetailsGetResult() {
        return universitySpecSpecialitySubjectsDetailsGetResult;
    }

    /**
     * Sets the value of the universitySpecSpecialitySubjectsDetailsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversitySpecSpecialitySubjectsDetails }
     *     
     */
    public void setUniversitySpecSpecialitySubjectsDetailsGetResult(ArrayOfDUniversitySpecSpecialitySubjectsDetails value) {
        this.universitySpecSpecialitySubjectsDetailsGetResult = value;
    }

}
