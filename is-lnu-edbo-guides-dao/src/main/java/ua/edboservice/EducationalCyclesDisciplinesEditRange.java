
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
 *         &lt;element name="Mode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCycles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCyclesDisciplinesGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="YearBegin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="YearEnd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCyclesDisciplinesTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCyclesDisciplines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationalCyclesDisciplinesGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "mode",
    "idEducationalCycles",
    "idEducationalCyclesDisciplinesGroup",
    "yearBegin",
    "yearEnd",
    "idEducationalCyclesDisciplinesTypes",
    "idEducationalCyclesDisciplines",
    "educationalCyclesDisciplinesGroupName"
})
@XmlRootElement(name = "EducationalCyclesDisciplinesEditRange")
public class EducationalCyclesDisciplinesEditRange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Mode")
    protected int mode;
    @XmlElement(name = "Id_EducationalCycles")
    protected int idEducationalCycles;
    @XmlElement(name = "Id_EducationalCyclesDisciplinesGroup")
    protected int idEducationalCyclesDisciplinesGroup;
    @XmlElement(name = "YearBegin")
    protected int yearBegin;
    @XmlElement(name = "YearEnd")
    protected int yearEnd;
    @XmlElement(name = "Id_EducationalCyclesDisciplinesTypes")
    protected int idEducationalCyclesDisciplinesTypes;
    @XmlElement(name = "Id_EducationalCyclesDisciplines")
    protected String idEducationalCyclesDisciplines;
    @XmlElement(name = "EducationalCyclesDisciplinesGroupName")
    protected String educationalCyclesDisciplinesGroupName;

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
     * Gets the value of the mode property.
     * 
     */
    public int getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     */
    public void setMode(int value) {
        this.mode = value;
    }

    /**
     * Gets the value of the idEducationalCycles property.
     * 
     */
    public int getIdEducationalCycles() {
        return idEducationalCycles;
    }

    /**
     * Sets the value of the idEducationalCycles property.
     * 
     */
    public void setIdEducationalCycles(int value) {
        this.idEducationalCycles = value;
    }

    /**
     * Gets the value of the idEducationalCyclesDisciplinesGroup property.
     * 
     */
    public int getIdEducationalCyclesDisciplinesGroup() {
        return idEducationalCyclesDisciplinesGroup;
    }

    /**
     * Sets the value of the idEducationalCyclesDisciplinesGroup property.
     * 
     */
    public void setIdEducationalCyclesDisciplinesGroup(int value) {
        this.idEducationalCyclesDisciplinesGroup = value;
    }

    /**
     * Gets the value of the yearBegin property.
     * 
     */
    public int getYearBegin() {
        return yearBegin;
    }

    /**
     * Sets the value of the yearBegin property.
     * 
     */
    public void setYearBegin(int value) {
        this.yearBegin = value;
    }

    /**
     * Gets the value of the yearEnd property.
     * 
     */
    public int getYearEnd() {
        return yearEnd;
    }

    /**
     * Sets the value of the yearEnd property.
     * 
     */
    public void setYearEnd(int value) {
        this.yearEnd = value;
    }

    /**
     * Gets the value of the idEducationalCyclesDisciplinesTypes property.
     * 
     */
    public int getIdEducationalCyclesDisciplinesTypes() {
        return idEducationalCyclesDisciplinesTypes;
    }

    /**
     * Sets the value of the idEducationalCyclesDisciplinesTypes property.
     * 
     */
    public void setIdEducationalCyclesDisciplinesTypes(int value) {
        this.idEducationalCyclesDisciplinesTypes = value;
    }

    /**
     * Gets the value of the idEducationalCyclesDisciplines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEducationalCyclesDisciplines() {
        return idEducationalCyclesDisciplines;
    }

    /**
     * Sets the value of the idEducationalCyclesDisciplines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEducationalCyclesDisciplines(String value) {
        this.idEducationalCyclesDisciplines = value;
    }

    /**
     * Gets the value of the educationalCyclesDisciplinesGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesDisciplinesGroupName() {
        return educationalCyclesDisciplinesGroupName;
    }

    /**
     * Sets the value of the educationalCyclesDisciplinesGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesDisciplinesGroupName(String value) {
        this.educationalCyclesDisciplinesGroupName = value;
    }

}
