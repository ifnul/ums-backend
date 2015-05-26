
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
 *         &lt;element name="Id_UniversityDopUgodas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StudentsCountFromUniversity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idUniversityDopUgodas",
    "studentsCountFromUniversity"
})
@XmlRootElement(name = "UniveristyDopUgodaClientEdit")
public class UniveristyDopUgodaClientEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_UniversityDopUgodas")
    protected int idUniversityDopUgodas;
    @XmlElement(name = "StudentsCountFromUniversity")
    protected String studentsCountFromUniversity;

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
     * Gets the value of the idUniversityDopUgodas property.
     * 
     */
    public int getIdUniversityDopUgodas() {
        return idUniversityDopUgodas;
    }

    /**
     * Sets the value of the idUniversityDopUgodas property.
     * 
     */
    public void setIdUniversityDopUgodas(int value) {
        this.idUniversityDopUgodas = value;
    }

    /**
     * Gets the value of the studentsCountFromUniversity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentsCountFromUniversity() {
        return studentsCountFromUniversity;
    }

    /**
     * Sets the value of the studentsCountFromUniversity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentsCountFromUniversity(String value) {
        this.studentsCountFromUniversity = value;
    }

}
