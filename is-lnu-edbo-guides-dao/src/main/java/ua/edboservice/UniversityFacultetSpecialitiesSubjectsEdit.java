
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
 *         &lt;element name="Id_UniversitySpecialitiesSubject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitySpecialitiesSubjectsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idUniversitySpecialitiesSubject",
    "universitySpecialitiesSubjectsName"
})
@XmlRootElement(name = "UniversityFacultetSpecialitiesSubjectsEdit")
public class UniversityFacultetSpecialitiesSubjectsEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_UniversitySpecialitiesSubject")
    protected int idUniversitySpecialitiesSubject;
    @XmlElement(name = "UniversitySpecialitiesSubjectsName")
    protected String universitySpecialitiesSubjectsName;

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
    public void setSessionGUID(String value) {
        this.sessionGUID = value;
    }

    /**
     * Gets the value of the idUniversitySpecialitiesSubject property.
     * 
     */
    public int getIdUniversitySpecialitiesSubject() {
        return idUniversitySpecialitiesSubject;
    }

    /**
     * Sets the value of the idUniversitySpecialitiesSubject property.
     * 
     */
    public void setIdUniversitySpecialitiesSubject(int value) {
        this.idUniversitySpecialitiesSubject = value;
    }

    /**
     * Gets the value of the universitySpecialitiesSubjectsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesSubjectsName() {
        return universitySpecialitiesSubjectsName;
    }

    /**
     * Sets the value of the universitySpecialitiesSubjectsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesSubjectsName(String value) {
        this.universitySpecialitiesSubjectsName = value;
    }

}
