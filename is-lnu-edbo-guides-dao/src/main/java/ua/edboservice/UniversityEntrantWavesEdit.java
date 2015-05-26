
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
 *         &lt;element name="Id_UniversityEntrantWave" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idUniversityEntrantWave",
    "ciloviyCount",
    "budjetCount",
    "contractCount",
    "entrantWaveDescription",
    "pozakonCount"
})
@XmlRootElement(name = "UniversityEntrantWavesEdit")
public class UniversityEntrantWavesEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_UniversityEntrantWave")
    protected int idUniversityEntrantWave;
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
     * Gets the value of the idUniversityEntrantWave property.
     * 
     */
    public int getIdUniversityEntrantWave() {
        return idUniversityEntrantWave;
    }

    /**
     * Sets the value of the idUniversityEntrantWave property.
     * 
     */
    public void setIdUniversityEntrantWave(int value) {
        this.idUniversityEntrantWave = value;
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
