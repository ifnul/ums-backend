
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
 *         &lt;element name="Id_UniversityCoursesStudent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityCoursesStudentsData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idUniversityCoursesStudent",
    "universityCoursesStudentsData"
})
@XmlRootElement(name = "UniversityCoursesStudentsDataDel")
public class UniversityCoursesStudentsDataDel {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_UniversityCoursesStudent")
    protected int idUniversityCoursesStudent;
    @XmlElement(name = "UniversityCoursesStudentsData")
    protected String universityCoursesStudentsData;

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
     * Gets the value of the idUniversityCoursesStudent property.
     * 
     */
    public int getIdUniversityCoursesStudent() {
        return idUniversityCoursesStudent;
    }

    /**
     * Sets the value of the idUniversityCoursesStudent property.
     * 
     */
    public void setIdUniversityCoursesStudent(int value) {
        this.idUniversityCoursesStudent = value;
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

}
