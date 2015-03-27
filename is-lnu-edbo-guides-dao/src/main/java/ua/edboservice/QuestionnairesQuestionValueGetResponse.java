
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
 *         &lt;element name="QuestionnairesQuestionValueGetResult" type="{http://edboservice.ua/}ArrayOfDQuestionnairesQuestionValue" minOccurs="0"/>
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
    "questionnairesQuestionValueGetResult"
})
@XmlRootElement(name = "QuestionnairesQuestionValueGetResponse")
public class QuestionnairesQuestionValueGetResponse {

    @XmlElement(name = "QuestionnairesQuestionValueGetResult")
    protected ArrayOfDQuestionnairesQuestionValue questionnairesQuestionValueGetResult;

    /**
     * Gets the value of the questionnairesQuestionValueGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDQuestionnairesQuestionValue }
     *     
     */
    public ArrayOfDQuestionnairesQuestionValue getQuestionnairesQuestionValueGetResult() {
        return questionnairesQuestionValueGetResult;
    }

    /**
     * Sets the value of the questionnairesQuestionValueGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDQuestionnairesQuestionValue }
     *     
     */
    public void setQuestionnairesQuestionValueGetResult(ArrayOfDQuestionnairesQuestionValue value) {
        this.questionnairesQuestionValueGetResult = value;
    }

}
