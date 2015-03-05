
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDQuestionnairesQuestionValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDQuestionnairesQuestionValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dQuestionnairesQuestionValue" type="{http://edboservice.ua/}dQuestionnairesQuestionValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDQuestionnairesQuestionValue", propOrder = {
    "dQuestionnairesQuestionValue"
})
public class ArrayOfDQuestionnairesQuestionValue {

    @XmlElement(nillable = true)
    protected List<DQuestionnairesQuestionValue> dQuestionnairesQuestionValue;

    /**
     * Gets the value of the dQuestionnairesQuestionValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dQuestionnairesQuestionValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDQuestionnairesQuestionValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DQuestionnairesQuestionValue }
     * 
     * 
     */
    public List<DQuestionnairesQuestionValue> getDQuestionnairesQuestionValue() {
        if (dQuestionnairesQuestionValue == null) {
            dQuestionnairesQuestionValue = new ArrayList<DQuestionnairesQuestionValue>();
        }
        return this.dQuestionnairesQuestionValue;
    }

}
