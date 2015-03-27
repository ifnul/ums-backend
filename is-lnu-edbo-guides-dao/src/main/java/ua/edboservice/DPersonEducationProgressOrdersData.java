
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonEducationProgressOrdersData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonEducationProgressOrdersData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonEducationProgressData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationProgress" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationProgressOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversitiesDisciplines" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ExaminationSheetValuesTypesDetail" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Present" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UserAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsError" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ExaminationSheetValuesTypesDetailName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExaminationSheetValuesTypesDetailValues" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="UniversitiesDisciplinesFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitiesDisciplinesSmallName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gradebook" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonEducation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NotVisited" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonEducationProgressOrdersData", propOrder = {
    "idPersonEducationProgressData",
    "idPersonEducationProgress",
    "idPersonEducationProgressOrders",
    "idUniversitiesDisciplines",
    "idPersonName",
    "idExaminationSheetValuesTypesDetail",
    "present",
    "idUserAdd",
    "dateLastChange",
    "isError",
    "error",
    "fio",
    "personCodeU",
    "birthday",
    "examinationSheetValuesTypesDetailName",
    "examinationSheetValuesTypesDetailValues",
    "universitiesDisciplinesFullName",
    "universitiesDisciplinesSmallName",
    "gradebook",
    "idPersonEducation",
    "notVisited"
})
public class DPersonEducationProgressOrdersData {

    @XmlElement(name = "Id_PersonEducationProgressData")
    protected int idPersonEducationProgressData;
    @XmlElement(name = "Id_PersonEducationProgress")
    protected int idPersonEducationProgress;
    @XmlElement(name = "Id_PersonEducationProgressOrders")
    protected int idPersonEducationProgressOrders;
    @XmlElement(name = "Id_UniversitiesDisciplines")
    protected int idUniversitiesDisciplines;
    @XmlElement(name = "Id_PersonName")
    protected int idPersonName;
    @XmlElement(name = "Id_ExaminationSheetValuesTypesDetail")
    protected int idExaminationSheetValuesTypesDetail;
    @XmlElement(name = "Present")
    protected int present;
    @XmlElement(name = "Id_UserAdd")
    protected int idUserAdd;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "IsError")
    protected int isError;
    @XmlElement(name = "Error")
    protected String error;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "Birthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "ExaminationSheetValuesTypesDetailName")
    protected String examinationSheetValuesTypesDetailName;
    @XmlElement(name = "ExaminationSheetValuesTypesDetailValues", required = true)
    protected BigDecimal examinationSheetValuesTypesDetailValues;
    @XmlElement(name = "UniversitiesDisciplinesFullName")
    protected String universitiesDisciplinesFullName;
    @XmlElement(name = "UniversitiesDisciplinesSmallName")
    protected String universitiesDisciplinesSmallName;
    @XmlElement(name = "Gradebook")
    protected String gradebook;
    @XmlElement(name = "Id_PersonEducation")
    protected int idPersonEducation;
    @XmlElement(name = "NotVisited")
    protected int notVisited;

    /**
     * Gets the value of the idPersonEducationProgressData property.
     * 
     */
    public int getIdPersonEducationProgressData() {
        return idPersonEducationProgressData;
    }

    /**
     * Sets the value of the idPersonEducationProgressData property.
     * 
     */
    public void setIdPersonEducationProgressData(int value) {
        this.idPersonEducationProgressData = value;
    }

    /**
     * Gets the value of the idPersonEducationProgress property.
     * 
     */
    public int getIdPersonEducationProgress() {
        return idPersonEducationProgress;
    }

    /**
     * Sets the value of the idPersonEducationProgress property.
     * 
     */
    public void setIdPersonEducationProgress(int value) {
        this.idPersonEducationProgress = value;
    }

    /**
     * Gets the value of the idPersonEducationProgressOrders property.
     * 
     */
    public int getIdPersonEducationProgressOrders() {
        return idPersonEducationProgressOrders;
    }

    /**
     * Sets the value of the idPersonEducationProgressOrders property.
     * 
     */
    public void setIdPersonEducationProgressOrders(int value) {
        this.idPersonEducationProgressOrders = value;
    }

    /**
     * Gets the value of the idUniversitiesDisciplines property.
     * 
     */
    public int getIdUniversitiesDisciplines() {
        return idUniversitiesDisciplines;
    }

    /**
     * Sets the value of the idUniversitiesDisciplines property.
     * 
     */
    public void setIdUniversitiesDisciplines(int value) {
        this.idUniversitiesDisciplines = value;
    }

    /**
     * Gets the value of the idPersonName property.
     * 
     */
    public int getIdPersonName() {
        return idPersonName;
    }

    /**
     * Sets the value of the idPersonName property.
     * 
     */
    public void setIdPersonName(int value) {
        this.idPersonName = value;
    }

    /**
     * Gets the value of the idExaminationSheetValuesTypesDetail property.
     * 
     */
    public int getIdExaminationSheetValuesTypesDetail() {
        return idExaminationSheetValuesTypesDetail;
    }

    /**
     * Sets the value of the idExaminationSheetValuesTypesDetail property.
     * 
     */
    public void setIdExaminationSheetValuesTypesDetail(int value) {
        this.idExaminationSheetValuesTypesDetail = value;
    }

    /**
     * Gets the value of the present property.
     * 
     */
    public int getPresent() {
        return present;
    }

    /**
     * Sets the value of the present property.
     * 
     */
    public void setPresent(int value) {
        this.present = value;
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
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
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
     * Gets the value of the examinationSheetValuesTypesDetailName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetValuesTypesDetailName() {
        return examinationSheetValuesTypesDetailName;
    }

    /**
     * Sets the value of the examinationSheetValuesTypesDetailName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetValuesTypesDetailName(String value) {
        this.examinationSheetValuesTypesDetailName = value;
    }

    /**
     * Gets the value of the examinationSheetValuesTypesDetailValues property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExaminationSheetValuesTypesDetailValues() {
        return examinationSheetValuesTypesDetailValues;
    }

    /**
     * Sets the value of the examinationSheetValuesTypesDetailValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExaminationSheetValuesTypesDetailValues(BigDecimal value) {
        this.examinationSheetValuesTypesDetailValues = value;
    }

    /**
     * Gets the value of the universitiesDisciplinesFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesDisciplinesFullName() {
        return universitiesDisciplinesFullName;
    }

    /**
     * Sets the value of the universitiesDisciplinesFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesDisciplinesFullName(String value) {
        this.universitiesDisciplinesFullName = value;
    }

    /**
     * Gets the value of the universitiesDisciplinesSmallName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesDisciplinesSmallName() {
        return universitiesDisciplinesSmallName;
    }

    /**
     * Sets the value of the universitiesDisciplinesSmallName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesDisciplinesSmallName(String value) {
        this.universitiesDisciplinesSmallName = value;
    }

    /**
     * Gets the value of the gradebook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradebook() {
        return gradebook;
    }

    /**
     * Sets the value of the gradebook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradebook(String value) {
        this.gradebook = value;
    }

    /**
     * Gets the value of the idPersonEducation property.
     * 
     */
    public int getIdPersonEducation() {
        return idPersonEducation;
    }

    /**
     * Sets the value of the idPersonEducation property.
     * 
     */
    public void setIdPersonEducation(int value) {
        this.idPersonEducation = value;
    }

    /**
     * Gets the value of the notVisited property.
     * 
     */
    public int getNotVisited() {
        return notVisited;
    }

    /**
     * Sets the value of the notVisited property.
     * 
     */
    public void setNotVisited(int value) {
        this.notVisited = value;
    }

}
