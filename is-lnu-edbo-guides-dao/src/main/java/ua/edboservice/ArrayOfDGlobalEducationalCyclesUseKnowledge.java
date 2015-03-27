
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDGlobal_EducationalCycles_UseKnowledge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDGlobal_EducationalCycles_UseKnowledge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dGlobal_EducationalCycles_UseKnowledge" type="{http://edboservice.ua/}dGlobal_EducationalCycles_UseKnowledge" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDGlobal_EducationalCycles_UseKnowledge", propOrder = {
    "dGlobalEducationalCyclesUseKnowledge"
})
public class ArrayOfDGlobalEducationalCyclesUseKnowledge {

    @XmlElement(name = "dGlobal_EducationalCycles_UseKnowledge", nillable = true)
    protected List<DGlobalEducationalCyclesUseKnowledge> dGlobalEducationalCyclesUseKnowledge;

    /**
     * Gets the value of the dGlobalEducationalCyclesUseKnowledge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dGlobalEducationalCyclesUseKnowledge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDGlobalEducationalCyclesUseKnowledge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DGlobalEducationalCyclesUseKnowledge }
     * 
     * 
     */
    public List<DGlobalEducationalCyclesUseKnowledge> getDGlobalEducationalCyclesUseKnowledge() {
        if (dGlobalEducationalCyclesUseKnowledge == null) {
            dGlobalEducationalCyclesUseKnowledge = new ArrayList<DGlobalEducationalCyclesUseKnowledge>();
        }
        return this.dGlobalEducationalCyclesUseKnowledge;
    }

}
