
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dQuestionnairesQuestion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dQuestionnairesQuestion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_QuestionnairesQuestion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Questionnaire" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_QuestionnairesQuestionValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QuestionnaireName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuestionnaireDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UseValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_User" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QuestionnaireValueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_QuestionnairesQuestionWishe" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QuestionnaireWishe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuestionnaireWisheSmall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_QuestionnairesQuestionValueType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dQuestionnairesQuestion", propOrder = {
    "idQuestionnairesQuestion",
    "idQuestionnaire",
    "idQuestionnairesQuestionValue",
    "questionnaireName",
    "questionnaireDateLastChange",
    "useValue",
    "idUser",
    "questionnaireValueName",
    "idQuestionnairesQuestionWishe",
    "questionnaireWishe",
    "questionnaireWisheSmall",
    "idQuestionnairesQuestionValueType"
})
public class DQuestionnairesQuestion {

    @XmlElement(name = "Id_QuestionnairesQuestion")
    protected int idQuestionnairesQuestion;
    @XmlElement(name = "Id_Questionnaire")
    protected int idQuestionnaire;
    @XmlElement(name = "Id_QuestionnairesQuestionValue")
    protected int idQuestionnairesQuestionValue;
    @XmlElement(name = "QuestionnaireName")
    protected String questionnaireName;
    @XmlElement(name = "QuestionnaireDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar questionnaireDateLastChange;
    @XmlElement(name = "UseValue")
    protected int useValue;
    @XmlElement(name = "Id_User")
    protected int idUser;
    @XmlElement(name = "QuestionnaireValueName")
    protected String questionnaireValueName;
    @XmlElement(name = "Id_QuestionnairesQuestionWishe")
    protected int idQuestionnairesQuestionWishe;
    @XmlElement(name = "QuestionnaireWishe")
    protected String questionnaireWishe;
    @XmlElement(name = "QuestionnaireWisheSmall")
    protected String questionnaireWisheSmall;
    @XmlElement(name = "Id_QuestionnairesQuestionValueType")
    protected int idQuestionnairesQuestionValueType;

    /**
     * Gets the value of the idQuestionnairesQuestion property.
     * 
     */
    public int getIdQuestionnairesQuestion() {
        return idQuestionnairesQuestion;
    }

    /**
     * Sets the value of the idQuestionnairesQuestion property.
     * 
     */
    public void setIdQuestionnairesQuestion(int value) {
        this.idQuestionnairesQuestion = value;
    }

    /**
     * Gets the value of the idQuestionnaire property.
     * 
     */
    public int getIdQuestionnaire() {
        return idQuestionnaire;
    }

    /**
     * Sets the value of the idQuestionnaire property.
     * 
     */
    public void setIdQuestionnaire(int value) {
        this.idQuestionnaire = value;
    }

    /**
     * Gets the value of the idQuestionnairesQuestionValue property.
     * 
     */
    public int getIdQuestionnairesQuestionValue() {
        return idQuestionnairesQuestionValue;
    }

    /**
     * Sets the value of the idQuestionnairesQuestionValue property.
     * 
     */
    public void setIdQuestionnairesQuestionValue(int value) {
        this.idQuestionnairesQuestionValue = value;
    }

    /**
     * Gets the value of the questionnaireName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionnaireName() {
        return questionnaireName;
    }

    /**
     * Sets the value of the questionnaireName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionnaireName(String value) {
        this.questionnaireName = value;
    }

    /**
     * Gets the value of the questionnaireDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQuestionnaireDateLastChange() {
        return questionnaireDateLastChange;
    }

    /**
     * Sets the value of the questionnaireDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQuestionnaireDateLastChange(XMLGregorianCalendar value) {
        this.questionnaireDateLastChange = value;
    }

    /**
     * Gets the value of the useValue property.
     * 
     */
    public int getUseValue() {
        return useValue;
    }

    /**
     * Sets the value of the useValue property.
     * 
     */
    public void setUseValue(int value) {
        this.useValue = value;
    }

    /**
     * Gets the value of the idUser property.
     * 
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * Sets the value of the idUser property.
     * 
     */
    public void setIdUser(int value) {
        this.idUser = value;
    }

    /**
     * Gets the value of the questionnaireValueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionnaireValueName() {
        return questionnaireValueName;
    }

    /**
     * Sets the value of the questionnaireValueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionnaireValueName(String value) {
        this.questionnaireValueName = value;
    }

    /**
     * Gets the value of the idQuestionnairesQuestionWishe property.
     * 
     */
    public int getIdQuestionnairesQuestionWishe() {
        return idQuestionnairesQuestionWishe;
    }

    /**
     * Sets the value of the idQuestionnairesQuestionWishe property.
     * 
     */
    public void setIdQuestionnairesQuestionWishe(int value) {
        this.idQuestionnairesQuestionWishe = value;
    }

    /**
     * Gets the value of the questionnaireWishe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionnaireWishe() {
        return questionnaireWishe;
    }

    /**
     * Sets the value of the questionnaireWishe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionnaireWishe(String value) {
        this.questionnaireWishe = value;
    }

    /**
     * Gets the value of the questionnaireWisheSmall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionnaireWisheSmall() {
        return questionnaireWisheSmall;
    }

    /**
     * Sets the value of the questionnaireWisheSmall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionnaireWisheSmall(String value) {
        this.questionnaireWisheSmall = value;
    }

    /**
     * Gets the value of the idQuestionnairesQuestionValueType property.
     * 
     */
    public int getIdQuestionnairesQuestionValueType() {
        return idQuestionnairesQuestionValueType;
    }

    /**
     * Sets the value of the idQuestionnairesQuestionValueType property.
     * 
     */
    public void setIdQuestionnairesQuestionValueType(int value) {
        this.idQuestionnairesQuestionValueType = value;
    }

}
