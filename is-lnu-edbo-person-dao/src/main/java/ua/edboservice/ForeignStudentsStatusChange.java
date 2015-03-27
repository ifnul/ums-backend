
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
 *         &lt;element name="Id_ForeignStudent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ForeignStudentsStatusType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ForeignStudentsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityKodeNew" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idForeignStudent",
    "idForeignStudentsStatusType",
    "foreignStudentsDescription",
    "idUniversityKodeNew"
})
@XmlRootElement(name = "ForeignStudentsStatusChange")
public class ForeignStudentsStatusChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_ForeignStudent")
    protected int idForeignStudent;
    @XmlElement(name = "Id_ForeignStudentsStatusType")
    protected int idForeignStudentsStatusType;
    @XmlElement(name = "ForeignStudentsDescription")
    protected String foreignStudentsDescription;
    @XmlElement(name = "Id_UniversityKodeNew")
    protected int idUniversityKodeNew;

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
     * Gets the value of the idForeignStudent property.
     * 
     */
    public int getIdForeignStudent() {
        return idForeignStudent;
    }

    /**
     * Sets the value of the idForeignStudent property.
     * 
     */
    public void setIdForeignStudent(int value) {
        this.idForeignStudent = value;
    }

    /**
     * Gets the value of the idForeignStudentsStatusType property.
     * 
     */
    public int getIdForeignStudentsStatusType() {
        return idForeignStudentsStatusType;
    }

    /**
     * Sets the value of the idForeignStudentsStatusType property.
     * 
     */
    public void setIdForeignStudentsStatusType(int value) {
        this.idForeignStudentsStatusType = value;
    }

    /**
     * Gets the value of the foreignStudentsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignStudentsDescription() {
        return foreignStudentsDescription;
    }

    /**
     * Sets the value of the foreignStudentsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignStudentsDescription(String value) {
        this.foreignStudentsDescription = value;
    }

    /**
     * Gets the value of the idUniversityKodeNew property.
     * 
     */
    public int getIdUniversityKodeNew() {
        return idUniversityKodeNew;
    }

    /**
     * Sets the value of the idUniversityKodeNew property.
     * 
     */
    public void setIdUniversityKodeNew(int value) {
        this.idUniversityKodeNew = value;
    }

}
