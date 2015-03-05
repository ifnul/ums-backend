
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
 *         &lt;element name="UniversitySpecDirectionsSubjectsDetailsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversitySpecDirectionsSubjectsDetails" minOccurs="0"/>
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
    "universitySpecDirectionsSubjectsDetailsGetResult"
})
@XmlRootElement(name = "UniversitySpecDirectionsSubjectsDetailsGetResponse")
public class UniversitySpecDirectionsSubjectsDetailsGetResponse {

    @XmlElement(name = "UniversitySpecDirectionsSubjectsDetailsGetResult")
    protected ArrayOfDUniversitySpecDirectionsSubjectsDetails universitySpecDirectionsSubjectsDetailsGetResult;

    /**
     * Gets the value of the universitySpecDirectionsSubjectsDetailsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversitySpecDirectionsSubjectsDetails }
     *     
     */
    public ArrayOfDUniversitySpecDirectionsSubjectsDetails getUniversitySpecDirectionsSubjectsDetailsGetResult() {
        return universitySpecDirectionsSubjectsDetailsGetResult;
    }

    /**
     * Sets the value of the universitySpecDirectionsSubjectsDetailsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversitySpecDirectionsSubjectsDetails }
     *     
     */
    public void setUniversitySpecDirectionsSubjectsDetailsGetResult(ArrayOfDUniversitySpecDirectionsSubjectsDetails value) {
        this.universitySpecDirectionsSubjectsDetailsGetResult = value;
    }

}
