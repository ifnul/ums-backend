
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDGlobal_EducationalCycles_Judgments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDGlobal_EducationalCycles_Judgments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dGlobal_EducationalCycles_Judgments" type="{http://edboservice.ua/}dGlobal_EducationalCycles_Judgments" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDGlobal_EducationalCycles_Judgments", propOrder = {
    "dGlobalEducationalCyclesJudgments"
})
public class ArrayOfDGlobalEducationalCyclesJudgments {

    @XmlElement(name = "dGlobal_EducationalCycles_Judgments", nillable = true)
    protected List<DGlobalEducationalCyclesJudgments> dGlobalEducationalCyclesJudgments;

    /**
     * Gets the value of the dGlobalEducationalCyclesJudgments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dGlobalEducationalCyclesJudgments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDGlobalEducationalCyclesJudgments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DGlobalEducationalCyclesJudgments }
     * 
     * 
     */
    public List<DGlobalEducationalCyclesJudgments> getDGlobalEducationalCyclesJudgments() {
        if (dGlobalEducationalCyclesJudgments == null) {
            dGlobalEducationalCyclesJudgments = new ArrayList<DGlobalEducationalCyclesJudgments>();
        }
        return this.dGlobalEducationalCyclesJudgments;
    }

}
