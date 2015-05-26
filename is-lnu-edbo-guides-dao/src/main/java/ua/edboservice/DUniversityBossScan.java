
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityBossScan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityBossScan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScanPasport" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScanEducations" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademikRang" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScienseDegree" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BossOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityBossScan", propOrder = {
    "scanPasport",
    "scanEducations",
    "academikRang",
    "scienseDegree",
    "bossOrder"
})
public class DUniversityBossScan {

    @XmlElement(name = "ScanPasport")
    protected int scanPasport;
    @XmlElement(name = "ScanEducations")
    protected int scanEducations;
    @XmlElement(name = "AcademikRang")
    protected int academikRang;
    @XmlElement(name = "ScienseDegree")
    protected int scienseDegree;
    @XmlElement(name = "BossOrder")
    protected int bossOrder;

    /**
     * Gets the value of the scanPasport property.
     * 
     */
    public int getScanPasport() {
        return scanPasport;
    }

    /**
     * Sets the value of the scanPasport property.
     * 
     */
    public void setScanPasport(int value) {
        this.scanPasport = value;
    }

    /**
     * Gets the value of the scanEducations property.
     * 
     */
    public int getScanEducations() {
        return scanEducations;
    }

    /**
     * Sets the value of the scanEducations property.
     * 
     */
    public void setScanEducations(int value) {
        this.scanEducations = value;
    }

    /**
     * Gets the value of the academikRang property.
     * 
     */
    public int getAcademikRang() {
        return academikRang;
    }

    /**
     * Sets the value of the academikRang property.
     * 
     */
    public void setAcademikRang(int value) {
        this.academikRang = value;
    }

    /**
     * Gets the value of the scienseDegree property.
     * 
     */
    public int getScienseDegree() {
        return scienseDegree;
    }

    /**
     * Sets the value of the scienseDegree property.
     * 
     */
    public void setScienseDegree(int value) {
        this.scienseDegree = value;
    }

    /**
     * Gets the value of the bossOrder property.
     * 
     */
    public int getBossOrder() {
        return bossOrder;
    }

    /**
     * Sets the value of the bossOrder property.
     * 
     */
    public void setBossOrder(int value) {
        this.bossOrder = value;
    }

}
