
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonWorkOtherStatsGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonWorkOtherStatsGet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonWorkOtherStat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_WorkOtherStatType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonWorkOtherStatValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WorkOtherStatTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonWorkOtherStatsGet", propOrder = {
    "idPersonWorkOtherStat",
    "personCodeU",
    "idWorkOtherStatType",
    "personWorkOtherStatValue",
    "workOtherStatTypeName"
})
public class DPersonWorkOtherStatsGet {

    @XmlElement(name = "Id_PersonWorkOtherStat")
    protected int idPersonWorkOtherStat;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "Id_WorkOtherStatType")
    protected int idWorkOtherStatType;
    @XmlElement(name = "PersonWorkOtherStatValue")
    protected int personWorkOtherStatValue;
    @XmlElement(name = "WorkOtherStatTypeName")
    protected String workOtherStatTypeName;

    /**
     * Gets the value of the idPersonWorkOtherStat property.
     * 
     */
    public int getIdPersonWorkOtherStat() {
        return idPersonWorkOtherStat;
    }

    /**
     * Sets the value of the idPersonWorkOtherStat property.
     * 
     */
    public void setIdPersonWorkOtherStat(int value) {
        this.idPersonWorkOtherStat = value;
    }

    /**
     * Gets the value of the personCodeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeU() {
        return personCodeU;
    }

    /**
     * Sets the value of the personCodeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeU(String value) {
        this.personCodeU = value;
    }

    /**
     * Gets the value of the idWorkOtherStatType property.
     * 
     */
    public int getIdWorkOtherStatType() {
        return idWorkOtherStatType;
    }

    /**
     * Sets the value of the idWorkOtherStatType property.
     * 
     */
    public void setIdWorkOtherStatType(int value) {
        this.idWorkOtherStatType = value;
    }

    /**
     * Gets the value of the personWorkOtherStatValue property.
     * 
     */
    public int getPersonWorkOtherStatValue() {
        return personWorkOtherStatValue;
    }

    /**
     * Sets the value of the personWorkOtherStatValue property.
     * 
     */
    public void setPersonWorkOtherStatValue(int value) {
        this.personWorkOtherStatValue = value;
    }

    /**
     * Gets the value of the workOtherStatTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOtherStatTypeName() {
        return workOtherStatTypeName;
    }

    /**
     * Sets the value of the workOtherStatTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOtherStatTypeName(String value) {
        this.workOtherStatTypeName = value;
    }

}
