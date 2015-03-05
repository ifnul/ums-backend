
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
 *         &lt;element name="T_UniversityExtId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityExtIdsType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ExternalUniversity" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "tUniversityExtId",
    "idUniversity",
    "idUniversityExtIdsType",
    "idExternalUniversity"
})
@XmlRootElement(name = "UniversityExtIdsEdit")
public class UniversityExtIdsEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "T_UniversityExtId")
    protected int tUniversityExtId;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "Id_UniversityExtIdsType")
    protected int idUniversityExtIdsType;
    @XmlElement(name = "Id_ExternalUniversity")
    protected int idExternalUniversity;

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
     * Gets the value of the tUniversityExtId property.
     * 
     */
    public int getTUniversityExtId() {
        return tUniversityExtId;
    }

    /**
     * Sets the value of the tUniversityExtId property.
     * 
     */
    public void setTUniversityExtId(int value) {
        this.tUniversityExtId = value;
    }

    /**
     * Gets the value of the idUniversity property.
     * 
     */
    public int getIdUniversity() {
        return idUniversity;
    }

    /**
     * Sets the value of the idUniversity property.
     * 
     */
    public void setIdUniversity(int value) {
        this.idUniversity = value;
    }

    /**
     * Gets the value of the idUniversityExtIdsType property.
     * 
     */
    public int getIdUniversityExtIdsType() {
        return idUniversityExtIdsType;
    }

    /**
     * Sets the value of the idUniversityExtIdsType property.
     * 
     */
    public void setIdUniversityExtIdsType(int value) {
        this.idUniversityExtIdsType = value;
    }

    /**
     * Gets the value of the idExternalUniversity property.
     * 
     */
    public int getIdExternalUniversity() {
        return idExternalUniversity;
    }

    /**
     * Sets the value of the idExternalUniversity property.
     * 
     */
    public void setIdExternalUniversity(int value) {
        this.idExternalUniversity = value;
    }

}
