
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
 *         &lt;element name="UniversityFacultetSpecialitiesEntranceExaminationСhangeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "universityFacultetSpecialitiesEntranceExamination\u0421hangeResult"
})
@XmlRootElement(name = "UniversityFacultetSpecialitiesEntranceExamination\u0421hangeResponse")
public class UniversityFacultetSpecialitiesEntranceExaminationСhangeResponse {

    @XmlElement(name = "UniversityFacultetSpecialitiesEntranceExamination\u0421hangeResult")
    protected String universityFacultetSpecialitiesEntranceExaminationСhangeResult;

    /**
     * Gets the value of the universityFacultetSpecialitiesEntranceExaminationСhangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetSpecialitiesEntranceExaminationСhangeResult() {
        return universityFacultetSpecialitiesEntranceExaminationСhangeResult;
    }

    /**
     * Sets the value of the universityFacultetSpecialitiesEntranceExaminationСhangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetSpecialitiesEntranceExaminationСhangeResult(String value) {
        this.universityFacultetSpecialitiesEntranceExaminationСhangeResult = value;
    }

}
