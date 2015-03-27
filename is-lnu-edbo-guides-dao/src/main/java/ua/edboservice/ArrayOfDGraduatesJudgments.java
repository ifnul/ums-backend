
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDGraduatesJudgments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDGraduatesJudgments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dGraduatesJudgments" type="{http://edboservice.ua/}dGraduatesJudgments" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDGraduatesJudgments", propOrder = {
    "dGraduatesJudgments"
})
public class ArrayOfDGraduatesJudgments {

    @XmlElement(nillable = true)
    protected List<DGraduatesJudgments> dGraduatesJudgments;

    /**
     * Gets the value of the dGraduatesJudgments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dGraduatesJudgments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDGraduatesJudgments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DGraduatesJudgments }
     * 
     * 
     */
    public List<DGraduatesJudgments> getDGraduatesJudgments() {
        if (dGraduatesJudgments == null) {
            dGraduatesJudgments = new ArrayList<DGraduatesJudgments>();
        }
        return this.dGraduatesJudgments;
    }

}
