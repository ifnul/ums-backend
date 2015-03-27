
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
 *         &lt;element name="Id_UniversitySpecialities" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fdel" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idUniversitySpecialities",
    "fdel"
})
@XmlRootElement(name = "UniversityFacultetSpecialitiesBlock")
public class UniversityFacultetSpecialitiesBlock {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_UniversitySpecialities")
    protected int idUniversitySpecialities;
    protected int fdel;

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
     * Gets the value of the idUniversitySpecialities property.
     * 
     */
    public int getIdUniversitySpecialities() {
        return idUniversitySpecialities;
    }

    /**
     * Sets the value of the idUniversitySpecialities property.
     * 
     */
    public void setIdUniversitySpecialities(int value) {
        this.idUniversitySpecialities = value;
    }

    /**
     * Gets the value of the fdel property.
     * 
     */
    public int getFdel() {
        return fdel;
    }

    /**
     * Sets the value of the fdel property.
     * 
     */
    public void setFdel(int value) {
        this.fdel = value;
    }

}
