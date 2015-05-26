
package ua.edboservice;

import java.math.BigDecimal;
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
 *         &lt;element name="Id_EducationalCyclesDiscipline" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCyclesDisciplinesGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="YearBegin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="YearEnd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ECSTCredit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Id_EducationalCyclesDisciplinesTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idEducationalCyclesDiscipline",
    "idEducationalCyclesDisciplinesGroup",
    "yearBegin",
    "yearEnd",
    "ecstCredit",
    "idEducationalCyclesDisciplinesTypes",
    "educationalCyclesDisciplinesGroupName"
})
@XmlRootElement(name = "EducationalCyclesDisciplinesEdit")
public class EducationalCyclesDisciplinesEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_EducationalCyclesDiscipline")
    protected int idEducationalCyclesDiscipline;
    @XmlElement(name = "Id_EducationalCyclesDisciplinesGroup")
    protected int idEducationalCyclesDisciplinesGroup;
    @XmlElement(name = "YearBegin")
    protected int yearBegin;
    @XmlElement(name = "YearEnd")
    protected int yearEnd;
    @XmlElement(name = "ECSTCredit", required = true)
    protected BigDecimal ecstCredit;
    @XmlElement(name = "Id_EducationalCyclesDisciplinesTypes")
    protected int idEducationalCyclesDisciplinesTypes;
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
     * Gets the value of the idEducationalCyclesDiscipline property.
     * 
     */
    public int getIdEducationalCyclesDiscipline() {
        return idEducationalCyclesDiscipline;
    }

    /**
     * Sets the value of the idEducationalCyclesDiscipline property.
     * 
     */
    public void setIdEducationalCyclesDiscipline(int value) {
        this.idEducationalCyclesDiscipline = value;
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
     * Gets the value of the ecstCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getECSTCredit() {
        return ecstCredit;
    }

    /**
     * Sets the value of the ecstCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setECSTCredit(BigDecimal value) {
        this.ecstCredit = value;
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
