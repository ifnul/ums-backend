
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
 *         &lt;element name="ActualDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitySpecialitiesKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntrantWaveNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CiloviyCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BudjetCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ContractCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EntrantWaveDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PozakonCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "actualDate",
    "idLanguage",
    "universitySpecialitiesKode",
    "entrantWaveNumber",
    "ciloviyCount",
    "budjetCount",
    "contractCount",
    "entrantWaveDescription",
    "pozakonCount"
})
@XmlRootElement(name = "UniversityEntrantWavesAdd")
public class UniversityEntrantWavesAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "ActualDate")
    protected String actualDate;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "UniversitySpecialitiesKode")
    protected String universitySpecialitiesKode;
    @XmlElement(name = "EntrantWaveNumber")
    protected int entrantWaveNumber;
    @XmlElement(name = "CiloviyCount")
    protected int ciloviyCount;
    @XmlElement(name = "BudjetCount")
    protected int budjetCount;
    @XmlElement(name = "ContractCount")
    protected int contractCount;
    @XmlElement(name = "EntrantWaveDescription")
    protected String entrantWaveDescription;
    @XmlElement(name = "PozakonCount")
    protected int pozakonCount;

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
     * Gets the value of the actualDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualDate() {
        return actualDate;
    }

    /**
     * Sets the value of the actualDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualDate(String value) {
        this.actualDate = value;
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
     * Gets the value of the universitySpecialitiesKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesKode() {
        return universitySpecialitiesKode;
    }

    /**
     * Sets the value of the universitySpecialitiesKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesKode(String value) {
        this.universitySpecialitiesKode = value;
    }

    /**
     * Gets the value of the entrantWaveNumber property.
     * 
     */
    public int getEntrantWaveNumber() {
        return entrantWaveNumber;
    }

    /**
     * Sets the value of the entrantWaveNumber property.
     * 
     */
    public void setEntrantWaveNumber(int value) {
        this.entrantWaveNumber = value;
    }

    /**
     * Gets the value of the ciloviyCount property.
     * 
     */
    public int getCiloviyCount() {
        return ciloviyCount;
    }

    /**
     * Sets the value of the ciloviyCount property.
     * 
     */
    public void setCiloviyCount(int value) {
        this.ciloviyCount = value;
    }

    /**
     * Gets the value of the budjetCount property.
     * 
     */
    public int getBudjetCount() {
        return budjetCount;
    }

    /**
     * Sets the value of the budjetCount property.
     * 
     */
    public void setBudjetCount(int value) {
        this.budjetCount = value;
    }

    /**
     * Gets the value of the contractCount property.
     * 
     */
    public int getContractCount() {
        return contractCount;
    }

    /**
     * Sets the value of the contractCount property.
     * 
     */
    public void setContractCount(int value) {
        this.contractCount = value;
    }

    /**
     * Gets the value of the entrantWaveDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrantWaveDescription() {
        return entrantWaveDescription;
    }

    /**
     * Sets the value of the entrantWaveDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrantWaveDescription(String value) {
        this.entrantWaveDescription = value;
    }

    /**
     * Gets the value of the pozakonCount property.
     * 
     */
    public int getPozakonCount() {
        return pozakonCount;
    }

    /**
     * Sets the value of the pozakonCount property.
     * 
     */
    public void setPozakonCount(int value) {
        this.pozakonCount = value;
    }

}
