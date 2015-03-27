
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dExaminationSheetsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dExaminationSheetsData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequestExamination" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversitySpecialitiesSubject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExaminationSheetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonRequestExaminationValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsError" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonRequestStatusTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dExaminationSheetsData", propOrder = {
    "idPersonRequest",
    "idPersonRequestExamination",
    "idUniversitySpecialitiesSubject",
    "personCodeU",
    "birthday",
    "fio",
    "examinationSheetCode",
    "personRequestExaminationValue",
    "isError",
    "errorDescription",
    "personRequestStatusTypeName"
})
public class DExaminationSheetsData {

    @XmlElement(name = "Id_PersonRequest")
    protected int idPersonRequest;
    @XmlElement(name = "Id_PersonRequestExamination")
    protected int idPersonRequestExamination;
    @XmlElement(name = "Id_UniversitySpecialitiesSubject")
    protected int idUniversitySpecialitiesSubject;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "Birthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "ExaminationSheetCode")
    protected String examinationSheetCode;
    @XmlElement(name = "PersonRequestExaminationValue")
    protected String personRequestExaminationValue;
    @XmlElement(name = "IsError")
    protected int isError;
    @XmlElement(name = "ErrorDescription")
    protected String errorDescription;
    @XmlElement(name = "PersonRequestStatusTypeName")
    protected String personRequestStatusTypeName;

    /**
     * Gets the value of the idPersonRequest property.
     * 
     */
    public int getIdPersonRequest() {
        return idPersonRequest;
    }

    /**
     * Sets the value of the idPersonRequest property.
     * 
     */
    public void setIdPersonRequest(int value) {
        this.idPersonRequest = value;
    }

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
     * Gets the value of the personCodeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeU() {
        return personCodeU;
    }

    /**
     * Sets the value of the personCodeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeU(String value) {
        this.personCodeU = value;
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIO() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIO(String value) {
        this.fio = value;
    }

    /**
     * Gets the value of the examinationSheetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetCode() {
        return examinationSheetCode;
    }

    /**
     * Sets the value of the examinationSheetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetCode(String value) {
        this.examinationSheetCode = value;
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

    /**
     * Gets the value of the isError property.
     * 
     */
    public int getIsError() {
        return isError;
    }

    /**
     * Sets the value of the isError property.
     * 
     */
    public void setIsError(int value) {
        this.isError = value;
    }

    /**
     * Gets the value of the errorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Sets the value of the errorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescription(String value) {
        this.errorDescription = value;
    }

    /**
     * Gets the value of the personRequestStatusTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRequestStatusTypeName() {
        return personRequestStatusTypeName;
    }

    /**
     * Sets the value of the personRequestStatusTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRequestStatusTypeName(String value) {
        this.personRequestStatusTypeName = value;
    }

}
