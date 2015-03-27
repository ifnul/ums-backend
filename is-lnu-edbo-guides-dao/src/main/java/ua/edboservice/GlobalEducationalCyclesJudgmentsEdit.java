
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
 *         &lt;element name="Id_Global_EducationalCycles_Judgments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Global_EducationalCycles_Judgments_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_EducationalCycles_Judgments_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_EducationalCycles_JudgmentsText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Global_EducationalCycles_JudgmentsTextEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idGlobalEducationalCyclesJudgments",
    "globalEducationalCyclesJudgmentsName",
    "globalEducationalCyclesJudgmentsDescription",
    "globalEducationalCyclesJudgmentsText",
    "globalEducationalCyclesJudgmentsTextEn"
})
@XmlRootElement(name = "Global_EducationalCycles_JudgmentsEdit")
public class GlobalEducationalCyclesJudgmentsEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_Global_EducationalCycles_Judgments")
    protected int idGlobalEducationalCyclesJudgments;
    @XmlElement(name = "Global_EducationalCycles_Judgments_Name")
    protected String globalEducationalCyclesJudgmentsName;
    @XmlElement(name = "Global_EducationalCycles_Judgments_Description")
    protected String globalEducationalCyclesJudgmentsDescription;
    @XmlElement(name = "Global_EducationalCycles_JudgmentsText")
    protected String globalEducationalCyclesJudgmentsText;
    @XmlElement(name = "Global_EducationalCycles_JudgmentsTextEn")
    protected String globalEducationalCyclesJudgmentsTextEn;

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
     * Gets the value of the idGlobalEducationalCyclesJudgments property.
     * 
     */
    public int getIdGlobalEducationalCyclesJudgments() {
        return idGlobalEducationalCyclesJudgments;
    }

    /**
     * Sets the value of the idGlobalEducationalCyclesJudgments property.
     * 
     */
    public void setIdGlobalEducationalCyclesJudgments(int value) {
        this.idGlobalEducationalCyclesJudgments = value;
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

}
