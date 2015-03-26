
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
 *         &lt;element name="Id_EducationalCycles_Program" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationalCycles_ProgramText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationalCycles_ProgramTextEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idEducationalCyclesProgram",
    "educationalCyclesProgramText",
    "educationalCyclesProgramTextEn"
})
@XmlRootElement(name = "EducationalCycles_ProgramEdit")
public class EducationalCyclesProgramEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_EducationalCycles_Program")
    protected int idEducationalCyclesProgram;
    @XmlElement(name = "EducationalCycles_ProgramText")
    protected String educationalCyclesProgramText;
    @XmlElement(name = "EducationalCycles_ProgramTextEn")
    protected String educationalCyclesProgramTextEn;

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
     * Gets the value of the idEducationalCyclesProgram property.
     * 
     */
    public int getIdEducationalCyclesProgram() {
        return idEducationalCyclesProgram;
    }

    /**
     * Sets the value of the idEducationalCyclesProgram property.
     * 
     */
    public void setIdEducationalCyclesProgram(int value) {
        this.idEducationalCyclesProgram = value;
    }

    /**
     * Gets the value of the educationalCyclesProgramText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesProgramText() {
        return educationalCyclesProgramText;
    }

    /**
     * Sets the value of the educationalCyclesProgramText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesProgramText(String value) {
        this.educationalCyclesProgramText = value;
    }

    /**
     * Gets the value of the educationalCyclesProgramTextEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesProgramTextEn() {
        return educationalCyclesProgramTextEn;
    }

    /**
     * Sets the value of the educationalCyclesProgramTextEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesProgramTextEn(String value) {
        this.educationalCyclesProgramTextEn = value;
    }

}
