
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dEducationalCycles_Judgments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dEducationalCycles_Judgments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_EducationalCycles_Judgments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Global_EducationalCycles_Judgments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCycles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationalCycles_JudgmentsText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationalCycles_JudgmentsTextEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UserAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dEducationalCycles_Judgments", propOrder = {
    "idEducationalCyclesJudgments",
    "idGlobalEducationalCyclesJudgments",
    "idEducationalCycles",
    "educationalCyclesJudgmentsText",
    "educationalCyclesJudgmentsTextEn",
    "idUserAdd",
    "dateCreate",
    "dateLastChange"
})
public class DEducationalCyclesJudgments {

    @XmlElement(name = "Id_EducationalCycles_Judgments")
    protected int idEducationalCyclesJudgments;
    @XmlElement(name = "Id_Global_EducationalCycles_Judgments")
    protected int idGlobalEducationalCyclesJudgments;
    @XmlElement(name = "Id_EducationalCycles")
    protected int idEducationalCycles;
    @XmlElement(name = "EducationalCycles_JudgmentsText")
    protected String educationalCyclesJudgmentsText;
    @XmlElement(name = "EducationalCycles_JudgmentsTextEn")
    protected String educationalCyclesJudgmentsTextEn;
    @XmlElement(name = "Id_UserAdd")
    protected int idUserAdd;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;

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

    /**
     * Gets the value of the idUserAdd property.
     * 
     */
    public int getIdUserAdd() {
        return idUserAdd;
    }

    /**
     * Sets the value of the idUserAdd property.
     * 
     */
    public void setIdUserAdd(int value) {
        this.idUserAdd = value;
    }

    /**
     * Gets the value of the dateCreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreate() {
        return dateCreate;
    }

    /**
     * Sets the value of the dateCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreate(XMLGregorianCalendar value) {
        this.dateCreate = value;
    }

    /**
     * Gets the value of the dateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastChange() {
        return dateLastChange;
    }

    /**
     * Sets the value of the dateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastChange(XMLGregorianCalendar value) {
        this.dateLastChange = value;
    }

}
