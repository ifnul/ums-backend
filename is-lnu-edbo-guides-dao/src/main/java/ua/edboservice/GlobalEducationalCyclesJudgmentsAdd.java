
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
 *         &lt;element name="Global_EducationalCycles_Judgments_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_EducationalCycles_Judgments_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_EducationalCycles_JudgmentsText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_EducationalCycles_JudgmentsTextEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_QualificationGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecDirectionsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "globalEducationalCyclesJudgmentsName",
    "globalEducationalCyclesJudgmentsDescription",
    "globalEducationalCyclesJudgmentsText",
    "globalEducationalCyclesJudgmentsTextEn",
    "idQualificationGroup",
    "specDirectionsCode",
    "specSpecialityCode",
    "universityKode"
})
@XmlRootElement(name = "Global_EducationalCycles_JudgmentsAdd")
public class GlobalEducationalCyclesJudgmentsAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Global_EducationalCycles_Judgments_Name")
    protected String globalEducationalCyclesJudgmentsName;
    @XmlElement(name = "Global_EducationalCycles_Judgments_Description")
    protected String globalEducationalCyclesJudgmentsDescription;
    @XmlElement(name = "Global_EducationalCycles_JudgmentsText")
    protected String globalEducationalCyclesJudgmentsText;
    @XmlElement(name = "Global_EducationalCycles_JudgmentsTextEn")
    protected String globalEducationalCyclesJudgmentsTextEn;
    @XmlElement(name = "Id_QualificationGroup")
    protected int idQualificationGroup;
    @XmlElement(name = "SpecDirectionsCode")
    protected String specDirectionsCode;
    @XmlElement(name = "SpecSpecialityCode")
    protected String specSpecialityCode;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;

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
     * Gets the value of the globalEducationalCyclesJudgmentsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalEducationalCyclesJudgmentsName() {
        return globalEducationalCyclesJudgmentsName;
    }

    /**
     * Sets the value of the globalEducationalCyclesJudgmentsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalEducationalCyclesJudgmentsName(String value) {
        this.globalEducationalCyclesJudgmentsName = value;
    }

    /**
     * Gets the value of the globalEducationalCyclesJudgmentsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalEducationalCyclesJudgmentsDescription() {
        return globalEducationalCyclesJudgmentsDescription;
    }

    /**
     * Sets the value of the globalEducationalCyclesJudgmentsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalEducationalCyclesJudgmentsDescription(String value) {
        this.globalEducationalCyclesJudgmentsDescription = value;
    }

    /**
     * Gets the value of the globalEducationalCyclesJudgmentsText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalEducationalCyclesJudgmentsText() {
        return globalEducationalCyclesJudgmentsText;
    }

    /**
     * Sets the value of the globalEducationalCyclesJudgmentsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalEducationalCyclesJudgmentsText(String value) {
        this.globalEducationalCyclesJudgmentsText = value;
    }

    /**
     * Gets the value of the globalEducationalCyclesJudgmentsTextEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalEducationalCyclesJudgmentsTextEn() {
        return globalEducationalCyclesJudgmentsTextEn;
    }

    /**
     * Sets the value of the globalEducationalCyclesJudgmentsTextEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalEducationalCyclesJudgmentsTextEn(String value) {
        this.globalEducationalCyclesJudgmentsTextEn = value;
    }

    /**
     * Gets the value of the idQualificationGroup property.
     * 
     */
    public int getIdQualificationGroup() {
        return idQualificationGroup;
    }

    /**
     * Sets the value of the idQualificationGroup property.
     * 
     */
    public void setIdQualificationGroup(int value) {
        this.idQualificationGroup = value;
    }

    /**
     * Gets the value of the specDirectionsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionsCode() {
        return specDirectionsCode;
    }

    /**
     * Sets the value of the specDirectionsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionsCode(String value) {
        this.specDirectionsCode = value;
    }

    /**
     * Gets the value of the specSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityCode() {
        return specSpecialityCode;
    }

    /**
     * Sets the value of the specSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityCode(String value) {
        this.specSpecialityCode = value;
    }

    /**
     * Gets the value of the universityKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKode() {
        return universityKode;
    }

    /**
     * Sets the value of the universityKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKode(String value) {
        this.universityKode = value;
    }

}
