
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dGraduatesJudgments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dGraduatesJudgments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Graduates_Judgments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Graduate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCycles_Judgments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationalCycles_JudgmentsText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationalCycles_JudgmentsTextEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dGraduatesJudgments", propOrder = {
    "idGraduatesJudgments",
    "idGraduate",
    "idEducationalCyclesJudgments",
    "educationalCyclesJudgmentsText",
    "educationalCyclesJudgmentsTextEn"
})
public class DGraduatesJudgments {

    @XmlElement(name = "Id_Graduates_Judgments")
    protected int idGraduatesJudgments;
    @XmlElement(name = "Id_Graduate")
    protected int idGraduate;
    @XmlElement(name = "Id_EducationalCycles_Judgments")
    protected int idEducationalCyclesJudgments;
    @XmlElement(name = "EducationalCycles_JudgmentsText")
    protected String educationalCyclesJudgmentsText;
    @XmlElement(name = "EducationalCycles_JudgmentsTextEn")
    protected String educationalCyclesJudgmentsTextEn;

    /**
     * Gets the value of the idGraduatesJudgments property.
     * 
     */
    public int getIdGraduatesJudgments() {
        return idGraduatesJudgments;
    }

    /**
     * Sets the value of the idGraduatesJudgments property.
     * 
     */
    public void setIdGraduatesJudgments(int value) {
        this.idGraduatesJudgments = value;
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
     * Gets the value of the idEducationalCyclesJudgments property.
     * 
     */
    public int getIdEducationalCyclesJudgments() {
        return idEducationalCyclesJudgments;
    }

    /**
     * Sets the value of the idEducationalCyclesJudgments property.
     * 
     */
    public void setIdEducationalCyclesJudgments(int value) {
        this.idEducationalCyclesJudgments = value;
    }

    /**
     * Gets the value of the educationalCyclesJudgmentsText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesJudgmentsText() {
        return educationalCyclesJudgmentsText;
    }

    /**
     * Sets the value of the educationalCyclesJudgmentsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesJudgmentsText(String value) {
        this.educationalCyclesJudgmentsText = value;
    }

    /**
     * Gets the value of the educationalCyclesJudgmentsTextEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesJudgmentsTextEn() {
        return educationalCyclesJudgmentsTextEn;
    }

    /**
     * Sets the value of the educationalCyclesJudgmentsTextEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesJudgmentsTextEn(String value) {
        this.educationalCyclesJudgmentsTextEn = value;
    }

}
