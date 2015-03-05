
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
 *         &lt;element name="Id_PersonAcademicRank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonAcademicRankScan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idPersonAcademicRank",
    "personAcademicRankScan"
})
@XmlRootElement(name = "PersonAcademicRankScanChange")
public class PersonAcademicRankScanChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_PersonAcademicRank")
    protected int idPersonAcademicRank;
    @XmlElement(name = "PersonAcademicRankScan")
    protected String personAcademicRankScan;

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
     * Gets the value of the idPersonAcademicRank property.
     * 
     */
    public int getIdPersonAcademicRank() {
        return idPersonAcademicRank;
    }

    /**
     * Sets the value of the idPersonAcademicRank property.
     * 
     */
    public void setIdPersonAcademicRank(int value) {
        this.idPersonAcademicRank = value;
    }

    /**
     * Gets the value of the personAcademicRankScan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonAcademicRankScan() {
        return personAcademicRankScan;
    }

    /**
     * Sets the value of the personAcademicRankScan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonAcademicRankScan(String value) {
        this.personAcademicRankScan = value;
    }

}
