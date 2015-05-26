
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
 *         &lt;element name="Id_UniversityStructureSpecCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityStructureSpecCodeDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityStructureSpecCodeDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityStructureSpecCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idUniversityStructureSpecCode",
    "specCode",
    "universityStructureSpecCodeDateBegin",
    "universityStructureSpecCodeDateEnd",
    "universityStructureSpecCodeDescription"
})
@XmlRootElement(name = "UniversityStructureSpecialitiesEdit")
public class UniversityStructureSpecialitiesEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_UniversityStructureSpecCode")
    protected int idUniversityStructureSpecCode;
    @XmlElement(name = "SpecCode")
    protected String specCode;
    @XmlElement(name = "UniversityStructureSpecCodeDateBegin")
    protected String universityStructureSpecCodeDateBegin;
    @XmlElement(name = "UniversityStructureSpecCodeDateEnd")
    protected String universityStructureSpecCodeDateEnd;
    @XmlElement(name = "UniversityStructureSpecCodeDescription")
    protected String universityStructureSpecCodeDescription;

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
     * Gets the value of the idUniversityStructureSpecCode property.
     * 
     */
    public int getIdUniversityStructureSpecCode() {
        return idUniversityStructureSpecCode;
    }

    /**
     * Sets the value of the idUniversityStructureSpecCode property.
     * 
     */
    public void setIdUniversityStructureSpecCode(int value) {
        this.idUniversityStructureSpecCode = value;
    }

    /**
     * Gets the value of the specCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecCode() {
        return specCode;
    }

    /**
     * Sets the value of the specCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecCode(String value) {
        this.specCode = value;
    }

    /**
     * Gets the value of the universityStructureSpecCodeDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityStructureSpecCodeDateBegin() {
        return universityStructureSpecCodeDateBegin;
    }

    /**
     * Sets the value of the universityStructureSpecCodeDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityStructureSpecCodeDateBegin(String value) {
        this.universityStructureSpecCodeDateBegin = value;
    }

    /**
     * Gets the value of the universityStructureSpecCodeDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityStructureSpecCodeDateEnd() {
        return universityStructureSpecCodeDateEnd;
    }

    /**
     * Sets the value of the universityStructureSpecCodeDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityStructureSpecCodeDateEnd(String value) {
        this.universityStructureSpecCodeDateEnd = value;
    }

    /**
     * Gets the value of the universityStructureSpecCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityStructureSpecCodeDescription() {
        return universityStructureSpecCodeDescription;
    }

    /**
     * Sets the value of the universityStructureSpecCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityStructureSpecCodeDescription(String value) {
        this.universityStructureSpecCodeDescription = value;
    }

}
