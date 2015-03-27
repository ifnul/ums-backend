
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dGraduatesProgram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dGraduatesProgram">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Graduates_Program" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Graduate" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "dGraduatesProgram", propOrder = {
    "idGraduatesProgram",
    "idGraduate",
    "idEducationalCyclesProgram",
    "educationalCyclesProgramText",
    "educationalCyclesProgramTextEn"
})
public class DGraduatesProgram {

    @XmlElement(name = "Id_Graduates_Program")
    protected int idGraduatesProgram;
    @XmlElement(name = "Id_Graduate")
    protected int idGraduate;
    @XmlElement(name = "Id_EducationalCycles_Program")
    protected int idEducationalCyclesProgram;
    @XmlElement(name = "EducationalCycles_ProgramText")
    protected String educationalCyclesProgramText;
    @XmlElement(name = "EducationalCycles_ProgramTextEn")
    protected String educationalCyclesProgramTextEn;

    /**
     * Gets the value of the idGraduatesProgram property.
     * 
     */
    public int getIdGraduatesProgram() {
        return idGraduatesProgram;
    }

    /**
     * Sets the value of the idGraduatesProgram property.
     * 
     */
    public void setIdGraduatesProgram(int value) {
        this.idGraduatesProgram = value;
    }

    /**
     * Gets the value of the idGraduate property.
     * 
     */
    public int getIdGraduate() {
        return idGraduate;
    }

    /**
     * Sets the value of the idGraduate property.
     * 
     */
    public void setIdGraduate(int value) {
        this.idGraduate = value;
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
