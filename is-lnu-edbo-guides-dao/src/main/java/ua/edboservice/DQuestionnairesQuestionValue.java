
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dQuestionnairesQuestionValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dQuestionnairesQuestionValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_QuestionnairesQuestionValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QuestionnaireValueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "dQuestionnairesQuestionValue", propOrder = {
    "idQuestionnairesQuestionValue",
    "questionnaireValueName",
    "idQuestionnairesQuestionValueType"
})
public class DQuestionnairesQuestionValue {

    @XmlElement(name = "Id_QuestionnairesQuestionValue")
    protected int idQuestionnairesQuestionValue;
    @XmlElement(name = "QuestionnaireValueName")
    protected String questionnaireValueName;
    @XmlElement(name = "Id_QuestionnairesQuestionValueType")
    protected int idQuestionnairesQuestionValueType;

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
