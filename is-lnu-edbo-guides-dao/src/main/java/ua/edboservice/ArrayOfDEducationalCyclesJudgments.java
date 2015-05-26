
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDEducationalCycles_Judgments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDEducationalCycles_Judgments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dEducationalCycles_Judgments" type="{http://edboservice.ua/}dEducationalCycles_Judgments" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDEducationalCycles_Judgments", propOrder = {
    "dEducationalCyclesJudgments"
})
public class ArrayOfDEducationalCyclesJudgments {

    @XmlElement(name = "dEducationalCycles_Judgments", nillable = true)
    protected List<DEducationalCyclesJudgments> dEducationalCyclesJudgments;

    /**
     * Gets the value of the dEducationalCyclesJudgments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dEducationalCyclesJudgments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEducationalCyclesJudgments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEducationalCyclesJudgments }
     * 
     * 
     */
    public List<DEducationalCyclesJudgments> getDEducationalCyclesJudgments() {
        if (dEducationalCyclesJudgments == null) {
            dEducationalCyclesJudgments = new ArrayList<DEducationalCyclesJudgments>();
        }
        return this.dEducationalCyclesJudgments;
    }

}
