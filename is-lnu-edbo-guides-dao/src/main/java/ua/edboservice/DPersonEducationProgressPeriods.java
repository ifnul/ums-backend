
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonEducationProgressPeriods complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonEducationProgressPeriods">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonEducationProgressPeriods" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationProgressPeriodType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationProgressPeriodsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonEducationProgressPeriods", propOrder = {
    "idPersonEducationProgressPeriods",
    "idPersonEducationProgressPeriodType",
    "personEducationProgressPeriodsName"
})
public class DPersonEducationProgressPeriods {

    @XmlElement(name = "Id_PersonEducationProgressPeriods")
    protected int idPersonEducationProgressPeriods;
    @XmlElement(name = "Id_PersonEducationProgressPeriodType")
    protected int idPersonEducationProgressPeriodType;
    @XmlElement(name = "PersonEducationProgressPeriodsName")
    protected String personEducationProgressPeriodsName;

    /**
     * Gets the value of the idPersonEducationProgressPeriods property.
     * 
     */
    public int getIdPersonEducationProgressPeriods() {
        return idPersonEducationProgressPeriods;
    }

    /**
     * Sets the value of the idPersonEducationProgressPeriods property.
     * 
     */
    public void setIdPersonEducationProgressPeriods(int value) {
        this.idPersonEducationProgressPeriods = value;
    }

    /**
     * Gets the value of the idPersonEducationProgressPeriodType property.
     * 
     */
    public int getIdPersonEducationProgressPeriodType() {
        return idPersonEducationProgressPeriodType;
    }

    /**
     * Sets the value of the idPersonEducationProgressPeriodType property.
     * 
     */
    public void setIdPersonEducationProgressPeriodType(int value) {
        this.idPersonEducationProgressPeriodType = value;
    }

    /**
     * Gets the value of the personEducationProgressPeriodsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationProgressPeriodsName() {
        return personEducationProgressPeriodsName;
    }

    /**
     * Sets the value of the personEducationProgressPeriodsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationProgressPeriodsName(String value) {
        this.personEducationProgressPeriodsName = value;
    }

}
