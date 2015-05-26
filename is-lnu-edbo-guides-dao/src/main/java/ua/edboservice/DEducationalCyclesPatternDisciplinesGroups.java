
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dEducationalCyclesPatternDisciplinesGroups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dEducationalCyclesPatternDisciplinesGroups">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_EducationalCyclesPatternDisciplinesGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationalCyclesPatternDisciplinesGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationalCyclesPatternDisciplinesGroupDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_EducationalCyclesPattern" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dEducationalCyclesPatternDisciplinesGroups", propOrder = {
    "idEducationalCyclesPatternDisciplinesGroup",
    "educationalCyclesPatternDisciplinesGroupName",
    "educationalCyclesPatternDisciplinesGroupDateLastChange",
    "idEducationalCyclesPattern"
})
public class DEducationalCyclesPatternDisciplinesGroups {

    @XmlElement(name = "Id_EducationalCyclesPatternDisciplinesGroup")
    protected int idEducationalCyclesPatternDisciplinesGroup;
    @XmlElement(name = "EducationalCyclesPatternDisciplinesGroupName")
    protected String educationalCyclesPatternDisciplinesGroupName;
    @XmlElement(name = "EducationalCyclesPatternDisciplinesGroupDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar educationalCyclesPatternDisciplinesGroupDateLastChange;
    @XmlElement(name = "Id_EducationalCyclesPattern")
    protected int idEducationalCyclesPattern;

    /**
     * Gets the value of the idEducationalCyclesPatternDisciplinesGroup property.
     * 
     */
    public int getIdEducationalCyclesPatternDisciplinesGroup() {
        return idEducationalCyclesPatternDisciplinesGroup;
    }

    /**
     * Sets the value of the idEducationalCyclesPatternDisciplinesGroup property.
     * 
     */
    public void setIdEducationalCyclesPatternDisciplinesGroup(int value) {
        this.idEducationalCyclesPatternDisciplinesGroup = value;
    }

    /**
     * Gets the value of the educationalCyclesPatternDisciplinesGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesPatternDisciplinesGroupName() {
        return educationalCyclesPatternDisciplinesGroupName;
    }

    /**
     * Sets the value of the educationalCyclesPatternDisciplinesGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesPatternDisciplinesGroupName(String value) {
        this.educationalCyclesPatternDisciplinesGroupName = value;
    }

    /**
     * Gets the value of the educationalCyclesPatternDisciplinesGroupDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEducationalCyclesPatternDisciplinesGroupDateLastChange() {
        return educationalCyclesPatternDisciplinesGroupDateLastChange;
    }

    /**
     * Sets the value of the educationalCyclesPatternDisciplinesGroupDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEducationalCyclesPatternDisciplinesGroupDateLastChange(XMLGregorianCalendar value) {
        this.educationalCyclesPatternDisciplinesGroupDateLastChange = value;
    }

    /**
     * Gets the value of the idEducationalCyclesPattern property.
     * 
     */
    public int getIdEducationalCyclesPattern() {
        return idEducationalCyclesPattern;
    }

    /**
     * Sets the value of the idEducationalCyclesPattern property.
     * 
     */
    public void setIdEducationalCyclesPattern(int value) {
        this.idEducationalCyclesPattern = value;
    }

}
