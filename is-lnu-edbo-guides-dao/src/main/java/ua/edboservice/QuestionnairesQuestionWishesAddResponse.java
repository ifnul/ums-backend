
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
 *         &lt;element name="QuestionnairesQuestionWishesAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "questionnairesQuestionWishesAddResult"
})
@XmlRootElement(name = "QuestionnairesQuestionWishesAddResponse")
public class QuestionnairesQuestionWishesAddResponse {

    @XmlElement(name = "QuestionnairesQuestionWishesAddResult")
    protected int questionnairesQuestionWishesAddResult;

    /**
     * Gets the value of the questionnairesQuestionWishesAddResult property.
     * 
     */
    public int getQuestionnairesQuestionWishesAddResult() {
        return questionnairesQuestionWishesAddResult;
    }

    /**
     * Sets the value of the questionnairesQuestionWishesAddResult property.
     * 
     */
    public void setQuestionnairesQuestionWishesAddResult(int value) {
        this.questionnairesQuestionWishesAddResult = value;
    }

}
