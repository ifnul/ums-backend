
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDGlobal_EducationalCycles_Knowledge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDGlobal_EducationalCycles_Knowledge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dGlobal_EducationalCycles_Knowledge" type="{http://edboservice.ua/}dGlobal_EducationalCycles_Knowledge" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDGlobal_EducationalCycles_Knowledge", propOrder = {
    "dGlobalEducationalCyclesKnowledge"
})
public class ArrayOfDGlobalEducationalCyclesKnowledge {

    @XmlElement(name = "dGlobal_EducationalCycles_Knowledge", nillable = true)
    protected List<DGlobalEducationalCyclesKnowledge> dGlobalEducationalCyclesKnowledge;

    /**
     * Gets the value of the dGlobalEducationalCyclesKnowledge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dGlobalEducationalCyclesKnowledge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDGlobalEducationalCyclesKnowledge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DGlobalEducationalCyclesKnowledge }
     * 
     * 
     */
    public List<DGlobalEducationalCyclesKnowledge> getDGlobalEducationalCyclesKnowledge() {
        if (dGlobalEducationalCyclesKnowledge == null) {
            dGlobalEducationalCyclesKnowledge = new ArrayList<DGlobalEducationalCyclesKnowledge>();
        }
        return this.dGlobalEducationalCyclesKnowledge;
    }

}
