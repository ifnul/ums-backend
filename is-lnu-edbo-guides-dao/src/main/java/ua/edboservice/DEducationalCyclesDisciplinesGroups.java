
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dEducationalCyclesDisciplinesGroups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dEducationalCyclesDisciplinesGroups">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_EducationalCyclesDisciplinesGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationalCyclesDisciplinesGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationalCyclesDisciplinesGroupDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_EducationalCycles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dEducationalCyclesDisciplinesGroups", propOrder = {
    "idEducationalCyclesDisciplinesGroup",
    "educationalCyclesDisciplinesGroupName",
    "educationalCyclesDisciplinesGroupDateLastChange",
    "idEducationalCycles"
})
public class DEducationalCyclesDisciplinesGroups {

    @XmlElement(name = "Id_EducationalCyclesDisciplinesGroup")
    protected int idEducationalCyclesDisciplinesGroup;
    @XmlElement(name = "EducationalCyclesDisciplinesGroupName")
    protected String educationalCyclesDisciplinesGroupName;
    @XmlElement(name = "EducationalCyclesDisciplinesGroupDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar educationalCyclesDisciplinesGroupDateLastChange;
    @XmlElement(name = "Id_EducationalCycles")
    protected int idEducationalCycles;

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

    /**
     * Gets the value of the educationalCyclesDisciplinesGroupDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEducationalCyclesDisciplinesGroupDateLastChange() {
        return educationalCyclesDisciplinesGroupDateLastChange;
    }

    /**
     * Sets the value of the educationalCyclesDisciplinesGroupDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEducationalCyclesDisciplinesGroupDateLastChange(XMLGregorianCalendar value) {
        this.educationalCyclesDisciplinesGroupDateLastChange = value;
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

}
