
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
 *         &lt;element name="SessionGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitySpecialitiesKodes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_EntranceExamination" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "sessionGUID",
    "universityKode",
    "universitySpecialitiesKodes",
    "idEntranceExamination"
})
@XmlRootElement(name = "UniversityFacultetSpecialitiesEntranceExaminationChange")
public class UniversityFacultetSpecialitiesEntranceExaminationChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversitySpecialitiesKodes")
    protected String universitySpecialitiesKodes;
    @XmlElement(name = "Id_EntranceExamination")
    protected int idEntranceExamination;

    /**
     * Gets the value of the sessionGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionGUID() {
        return sessionGUID;
    }

    /**
     * Sets the value of the sessionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionGUID(final String value) {
        this.sessionGUID = value;
    }

    /**
     * Gets the value of the universityKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKode() {
        return universityKode;
    }

    /**
     * Sets the value of the universityKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKode(final String value) {
        this.universityKode = value;
    }

    /**
     * Gets the value of the universitySpecialitiesKodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesKodes() {
        return universitySpecialitiesKodes;
    }

    /**
     * Sets the value of the universitySpecialitiesKodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesKodes(final String value) {
        this.universitySpecialitiesKodes = value;
    }

    /**
     * Gets the value of the idEntranceExamination property.
     * 
     */
    public int getIdEntranceExamination() {
        return idEntranceExamination;
    }

    /**
     * Sets the value of the idEntranceExamination property.
     * 
     */
    public void setIdEntranceExamination(final int value) {
        this.idEntranceExamination = value;
    }

}
