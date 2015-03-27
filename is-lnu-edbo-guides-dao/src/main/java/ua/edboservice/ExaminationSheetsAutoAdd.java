
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
 *         &lt;element name="Id_PersonRequestSeasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ExaminationSheetExamenType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ExaminationSheeValuesType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversitySpecialitiesSubject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitySpecialitiesKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExaminationSheetDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExaminationSheetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExaminationSheetGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExaminationSheetStreemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExaminationSheetExaminer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExaminationSheetDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExaminationSheetDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_LanguageEx" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CountPerGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SplitByLanguages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SortType" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idPersonRequestSeasons",
    "idExaminationSheetExamenType",
    "idExaminationSheeValuesType",
    "idUniversitySpecialitiesSubject",
    "universityKode",
    "universitySpecialitiesKode",
    "examinationSheetDate",
    "examinationSheetNumber",
    "examinationSheetGroupName",
    "examinationSheetStreemName",
    "examinationSheetExaminer",
    "examinationSheetDateBegin",
    "examinationSheetDateEnd",
    "idLanguageEx",
    "countPerGroup",
    "splitByLanguages",
    "sortType"
})
@XmlRootElement(name = "ExaminationSheetsAutoAdd")
public class ExaminationSheetsAutoAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_PersonRequestSeasons")
    protected int idPersonRequestSeasons;
    @XmlElement(name = "Id_ExaminationSheetExamenType")
    protected int idExaminationSheetExamenType;
    @XmlElement(name = "Id_ExaminationSheeValuesType")
    protected int idExaminationSheeValuesType;
    @XmlElement(name = "Id_UniversitySpecialitiesSubject")
    protected int idUniversitySpecialitiesSubject;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversitySpecialitiesKode")
    protected String universitySpecialitiesKode;
    @XmlElement(name = "ExaminationSheetDate")
    protected String examinationSheetDate;
    @XmlElement(name = "ExaminationSheetNumber")
    protected String examinationSheetNumber;
    @XmlElement(name = "ExaminationSheetGroupName")
    protected String examinationSheetGroupName;
    @XmlElement(name = "ExaminationSheetStreemName")
    protected String examinationSheetStreemName;
    @XmlElement(name = "ExaminationSheetExaminer")
    protected String examinationSheetExaminer;
    @XmlElement(name = "ExaminationSheetDateBegin")
    protected String examinationSheetDateBegin;
    @XmlElement(name = "ExaminationSheetDateEnd")
    protected String examinationSheetDateEnd;
    @XmlElement(name = "Id_LanguageEx")
    protected int idLanguageEx;
    @XmlElement(name = "CountPerGroup")
    protected int countPerGroup;
    @XmlElement(name = "SplitByLanguages")
    protected int splitByLanguages;
    @XmlElement(name = "SortType")
    protected int sortType;

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
     * Gets the value of the idPersonRequestSeasons property.
     * 
     */
    public int getIdPersonRequestSeasons() {
        return idPersonRequestSeasons;
    }

    /**
     * Sets the value of the idPersonRequestSeasons property.
     * 
     */
    public void setIdPersonRequestSeasons(int value) {
        this.idPersonRequestSeasons = value;
    }

    /**
     * Gets the value of the idExaminationSheetExamenType property.
     * 
     */
    public int getIdExaminationSheetExamenType() {
        return idExaminationSheetExamenType;
    }

    /**
     * Sets the value of the idExaminationSheetExamenType property.
     * 
     */
    public void setIdExaminationSheetExamenType(int value) {
        this.idExaminationSheetExamenType = value;
    }

    /**
     * Gets the value of the idExaminationSheeValuesType property.
     * 
     */
    public int getIdExaminationSheeValuesType() {
        return idExaminationSheeValuesType;
    }

    /**
     * Sets the value of the idExaminationSheeValuesType property.
     * 
     */
    public void setIdExaminationSheeValuesType(int value) {
        this.idExaminationSheeValuesType = value;
    }

    /**
     * Gets the value of the idUniversitySpecialitiesSubject property.
     * 
     */
    public int getIdUniversitySpecialitiesSubject() {
        return idUniversitySpecialitiesSubject;
    }

    /**
     * Sets the value of the idUniversitySpecialitiesSubject property.
     * 
     */
    public void setIdUniversitySpecialitiesSubject(int value) {
        this.idUniversitySpecialitiesSubject = value;
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

    /**
     * Gets the value of the universitySpecialitiesKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesKode() {
        return universitySpecialitiesKode;
    }

    /**
     * Sets the value of the universitySpecialitiesKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesKode(String value) {
        this.universitySpecialitiesKode = value;
    }

    /**
     * Gets the value of the examinationSheetDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetDate() {
        return examinationSheetDate;
    }

    /**
     * Sets the value of the examinationSheetDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetDate(String value) {
        this.examinationSheetDate = value;
    }

    /**
     * Gets the value of the examinationSheetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetNumber() {
        return examinationSheetNumber;
    }

    /**
     * Sets the value of the examinationSheetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetNumber(String value) {
        this.examinationSheetNumber = value;
    }

    /**
     * Gets the value of the examinationSheetGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetGroupName() {
        return examinationSheetGroupName;
    }

    /**
     * Sets the value of the examinationSheetGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetGroupName(String value) {
        this.examinationSheetGroupName = value;
    }

    /**
     * Gets the value of the examinationSheetStreemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetStreemName() {
        return examinationSheetStreemName;
    }

    /**
     * Sets the value of the examinationSheetStreemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetStreemName(String value) {
        this.examinationSheetStreemName = value;
    }

    /**
     * Gets the value of the examinationSheetExaminer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetExaminer() {
        return examinationSheetExaminer;
    }

    /**
     * Sets the value of the examinationSheetExaminer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetExaminer(String value) {
        this.examinationSheetExaminer = value;
    }

    /**
     * Gets the value of the examinationSheetDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetDateBegin() {
        return examinationSheetDateBegin;
    }

    /**
     * Sets the value of the examinationSheetDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetDateBegin(String value) {
        this.examinationSheetDateBegin = value;
    }

    /**
     * Gets the value of the examinationSheetDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetDateEnd() {
        return examinationSheetDateEnd;
    }

    /**
     * Sets the value of the examinationSheetDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetDateEnd(String value) {
        this.examinationSheetDateEnd = value;
    }

    /**
     * Gets the value of the idLanguageEx property.
     * 
     */
    public int getIdLanguageEx() {
        return idLanguageEx;
    }

    /**
     * Sets the value of the idLanguageEx property.
     * 
     */
    public void setIdLanguageEx(int value) {
        this.idLanguageEx = value;
    }

    /**
     * Gets the value of the countPerGroup property.
     * 
     */
    public int getCountPerGroup() {
        return countPerGroup;
    }

    /**
     * Sets the value of the countPerGroup property.
     * 
     */
    public void setCountPerGroup(int value) {
        this.countPerGroup = value;
    }

    /**
     * Gets the value of the splitByLanguages property.
     * 
     */
    public int getSplitByLanguages() {
        return splitByLanguages;
    }

    /**
     * Sets the value of the splitByLanguages property.
     * 
     */
    public void setSplitByLanguages(int value) {
        this.splitByLanguages = value;
    }

    /**
     * Gets the value of the sortType property.
     * 
     */
    public int getSortType() {
        return sortType;
    }

    /**
     * Sets the value of the sortType property.
     * 
     */
    public void setSortType(int value) {
        this.sortType = value;
    }

}
