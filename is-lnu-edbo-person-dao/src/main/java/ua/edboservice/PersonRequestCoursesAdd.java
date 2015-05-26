
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
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonCourse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonRequestCourseBonus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idLanguage",
    "idPersonRequest",
    "idPersonCourse",
    "personRequestCourseBonus"
})
@XmlRootElement(name = "PersonRequestCoursesAdd")
public class PersonRequestCoursesAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "Id_PersonRequest")
    protected int idPersonRequest;
    @XmlElement(name = "Id_PersonCourse")
    protected int idPersonCourse;
    @XmlElement(name = "PersonRequestCourseBonus")
    protected String personRequestCourseBonus;

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
     * Gets the value of the idLanguage property.
     * 
     */
    public int getIdLanguage() {
        return idLanguage;
    }

    /**
     * Sets the value of the idLanguage property.
     * 
     */
    public void setIdLanguage(int value) {
        this.idLanguage = value;
    }

    /**
     * Gets the value of the idPersonRequest property.
     * 
     */
    public int getIdPersonRequest() {
        return idPersonRequest;
    }

    /**
     * Sets the value of the idPersonRequest property.
     * 
     */
    public void setIdPersonRequest(int value) {
        this.idPersonRequest = value;
    }

    /**
     * Gets the value of the idPersonCourse property.
     * 
     */
    public int getIdPersonCourse() {
        return idPersonCourse;
    }

    /**
     * Sets the value of the idPersonCourse property.
     * 
     */
    public void setIdPersonCourse(int value) {
        this.idPersonCourse = value;
    }

    /**
     * Gets the value of the personRequestCourseBonus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRequestCourseBonus() {
        return personRequestCourseBonus;
    }

    /**
     * Sets the value of the personRequestCourseBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRequestCourseBonus(String value) {
        this.personRequestCourseBonus = value;
    }

}
