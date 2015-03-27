
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
 *         &lt;element name="Id_UniversitySpecialitiesQuota" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitySpecialitiesQuotaPriority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitySpecialitiesQuotaDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitySpecialitiesQuotaValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idUniversitySpecialitiesQuota",
    "universitySpecialitiesQuotaPriority",
    "universitySpecialitiesQuotaDescription",
    "universitySpecialitiesQuotaValue"
})
@XmlRootElement(name = "UniversityFacultetSpecialitiesQuotasEdit")
public class UniversityFacultetSpecialitiesQuotasEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_UniversitySpecialitiesQuota")
    protected int idUniversitySpecialitiesQuota;
    @XmlElement(name = "UniversitySpecialitiesQuotaPriority")
    protected int universitySpecialitiesQuotaPriority;
    @XmlElement(name = "UniversitySpecialitiesQuotaDescription")
    protected String universitySpecialitiesQuotaDescription;
    @XmlElement(name = "UniversitySpecialitiesQuotaValue")
    protected int universitySpecialitiesQuotaValue;

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
     * Gets the value of the idUniversitySpecialitiesQuota property.
     * 
     */
    public int getIdUniversitySpecialitiesQuota() {
        return idUniversitySpecialitiesQuota;
    }

    /**
     * Sets the value of the idUniversitySpecialitiesQuota property.
     * 
     */
    public void setIdUniversitySpecialitiesQuota(int value) {
        this.idUniversitySpecialitiesQuota = value;
    }

    /**
     * Gets the value of the universitySpecialitiesQuotaPriority property.
     * 
     */
    public int getUniversitySpecialitiesQuotaPriority() {
        return universitySpecialitiesQuotaPriority;
    }

    /**
     * Sets the value of the universitySpecialitiesQuotaPriority property.
     * 
     */
    public void setUniversitySpecialitiesQuotaPriority(int value) {
        this.universitySpecialitiesQuotaPriority = value;
    }

    /**
     * Gets the value of the universitySpecialitiesQuotaDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesQuotaDescription() {
        return universitySpecialitiesQuotaDescription;
    }

    /**
     * Sets the value of the universitySpecialitiesQuotaDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesQuotaDescription(String value) {
        this.universitySpecialitiesQuotaDescription = value;
    }

    /**
     * Gets the value of the universitySpecialitiesQuotaValue property.
     * 
     */
    public int getUniversitySpecialitiesQuotaValue() {
        return universitySpecialitiesQuotaValue;
    }

    /**
     * Sets the value of the universitySpecialitiesQuotaValue property.
     * 
     */
    public void setUniversitySpecialitiesQuotaValue(int value) {
        this.universitySpecialitiesQuotaValue = value;
    }

}
