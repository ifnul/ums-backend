
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dExaminationSheetsPersonData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dExaminationSheetsPersonData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonRequestExamination" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExaminationSheetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitySpecialitiesSubjectsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonRequestExaminationValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dExaminationSheetsPersonData", propOrder = {
    "idPersonRequestExamination",
    "examinationSheetNumber",
    "subjectName",
    "universitySpecialitiesSubjectsName",
    "personRequestExaminationValue"
})
public class DExaminationSheetsPersonData {

    @XmlElement(name = "Id_PersonRequestExamination")
    protected int idPersonRequestExamination;
    @XmlElement(name = "ExaminationSheetNumber")
    protected String examinationSheetNumber;
    @XmlElement(name = "SubjectName")
    protected String subjectName;
    @XmlElement(name = "UniversitySpecialitiesSubjectsName")
    protected String universitySpecialitiesSubjectsName;
    @XmlElement(name = "PersonRequestExaminationValue")
    protected String personRequestExaminationValue;

    /**
     * Gets the value of the idPersonRequestExamination property.
     * 
     */
    public int getIdPersonRequestExamination() {
        return idPersonRequestExamination;
    }

    /**
     * Sets the value of the idPersonRequestExamination property.
     * 
     */
    public void setIdPersonRequestExamination(int value) {
        this.idPersonRequestExamination = value;
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
     * Gets the value of the subjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * Sets the value of the subjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName(String value) {
        this.subjectName = value;
    }

    /**
     * Gets the value of the universitySpecialitiesSubjectsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesSubjectsName() {
        return universitySpecialitiesSubjectsName;
    }

    /**
     * Sets the value of the universitySpecialitiesSubjectsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesSubjectsName(String value) {
        this.universitySpecialitiesSubjectsName = value;
    }

    /**
     * Gets the value of the personRequestExaminationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRequestExaminationValue() {
        return personRequestExaminationValue;
    }

    /**
     * Sets the value of the personRequestExaminationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRequestExaminationValue(String value) {
        this.personRequestExaminationValue = value;
    }

}
