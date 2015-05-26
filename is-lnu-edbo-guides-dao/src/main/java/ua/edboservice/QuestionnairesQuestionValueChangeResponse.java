
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
 *         &lt;element name="QuestionnairesQuestionValueChangeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "questionnairesQuestionValueChangeResult"
})
@XmlRootElement(name = "QuestionnairesQuestionValueChangeResponse")
public class QuestionnairesQuestionValueChangeResponse {

    @XmlElement(name = "QuestionnairesQuestionValueChangeResult")
    protected int questionnairesQuestionValueChangeResult;

    /**
     * Gets the value of the questionnairesQuestionValueChangeResult property.
     * 
     */
    public int getQuestionnairesQuestionValueChangeResult() {
        return questionnairesQuestionValueChangeResult;
    }

    /**
     * Sets the value of the questionnairesQuestionValueChangeResult property.
     * 
     */
    public void setQuestionnairesQuestionValueChangeResult(int value) {
        this.questionnairesQuestionValueChangeResult = value;
    }

}
