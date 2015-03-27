
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
 *         &lt;element name="UniversityCourseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonRequestSeasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityCoursesStudentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityCoursesStudentsData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Subject1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Subject2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Subject3" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityCourseCode",
    "idPersonRequestSeasons",
    "universityCoursesStudentName",
    "universityCoursesStudentsData",
    "idSubject1",
    "idSubject2",
    "idSubject3"
})
@XmlRootElement(name = "UniversityCoursesStudentsAdd")
public class UniversityCoursesStudentsAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityCourseCode")
    protected String universityCourseCode;
    @XmlElement(name = "Id_PersonRequestSeasons")
    protected int idPersonRequestSeasons;
    @XmlElement(name = "UniversityCoursesStudentName")
    protected String universityCoursesStudentName;
    @XmlElement(name = "UniversityCoursesStudentsData")
    protected String universityCoursesStudentsData;
    @XmlElement(name = "Id_Subject1")
    protected int idSubject1;
    @XmlElement(name = "Id_Subject2")
    protected int idSubject2;
    @XmlElement(name = "Id_Subject3")
    protected int idSubject3;

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
    public void setUniversityKode(String value) {
        this.universityKode = value;
    }

    /**
     * Gets the value of the universityCourseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCourseCode() {
        return universityCourseCode;
    }

    /**
     * Sets the value of the universityCourseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCourseCode(String value) {
        this.universityCourseCode = value;
    }

    /**
     * Gets the value of the idPersonRequestSeasons property.
     * 
     */
    public int getIdPersonRequestSeasons() {
        return idPersonRequestSeasons;
    }

    /**
     * Sets the value of the idPersonRequestSeasons property.
     * 
     */
    public void setIdPersonRequestSeasons(int value) {
        this.idPersonRequestSeasons = value;
    }

    /**
     * Gets the value of the universityCoursesStudentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCoursesStudentName() {
        return universityCoursesStudentName;
    }

    /**
     * Sets the value of the universityCoursesStudentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCoursesStudentName(String value) {
        this.universityCoursesStudentName = value;
    }

    /**
     * Gets the value of the universityCoursesStudentsData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCoursesStudentsData() {
        return universityCoursesStudentsData;
    }

    /**
     * Sets the value of the universityCoursesStudentsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCoursesStudentsData(String value) {
        this.universityCoursesStudentsData = value;
    }

    /**
     * Gets the value of the idSubject1 property.
     * 
     */
    public int getIdSubject1() {
        return idSubject1;
    }

    /**
     * Sets the value of the idSubject1 property.
     * 
     */
    public void setIdSubject1(int value) {
        this.idSubject1 = value;
    }

    /**
     * Gets the value of the idSubject2 property.
     * 
     */
    public int getIdSubject2() {
        return idSubject2;
    }

    /**
     * Sets the value of the idSubject2 property.
     * 
     */
    public void setIdSubject2(int value) {
        this.idSubject2 = value;
    }

    /**
     * Gets the value of the idSubject3 property.
     * 
     */
    public int getIdSubject3() {
        return idSubject3;
    }

    /**
     * Sets the value of the idSubject3 property.
     * 
     */
    public void setIdSubject3(int value) {
        this.idSubject3 = value;
    }

}
