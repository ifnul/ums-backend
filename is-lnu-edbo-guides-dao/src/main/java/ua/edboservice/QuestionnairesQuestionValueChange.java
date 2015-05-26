
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
 *         &lt;element name="Id_QuestionnairesQuestion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_QuestionnairesQuestionValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idQuestionnairesQuestion",
    "idQuestionnairesQuestionValue"
})
@XmlRootElement(name = "QuestionnairesQuestionValueChange")
public class QuestionnairesQuestionValueChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_QuestionnairesQuestion")
    protected int idQuestionnairesQuestion;
    @XmlElement(name = "Id_QuestionnairesQuestionValue")
    protected int idQuestionnairesQuestionValue;

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

}
