
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
 *         &lt;element name="UniversitySpecDirectionsSubjectsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversitySpecDirectionsSubjects" minOccurs="0"/>
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
    "universitySpecDirectionsSubjectsGetResult"
})
@XmlRootElement(name = "UniversitySpecDirectionsSubjectsGetResponse")
public class UniversitySpecDirectionsSubjectsGetResponse {

    @XmlElement(name = "UniversitySpecDirectionsSubjectsGetResult")
    protected ArrayOfDUniversitySpecDirectionsSubjects universitySpecDirectionsSubjectsGetResult;

    /**
     * Gets the value of the universitySpecDirectionsSubjectsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversitySpecDirectionsSubjects }
     *     
     */
    public ArrayOfDUniversitySpecDirectionsSubjects getUniversitySpecDirectionsSubjectsGetResult() {
        return universitySpecDirectionsSubjectsGetResult;
    }

    /**
     * Sets the value of the universitySpecDirectionsSubjectsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversitySpecDirectionsSubjects }
     *     
     */
    public void setUniversitySpecDirectionsSubjectsGetResult(ArrayOfDUniversitySpecDirectionsSubjects value) {
        this.universitySpecDirectionsSubjectsGetResult = value;
    }

}
