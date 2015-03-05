
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDEducationalCyclesPatternDisciplinesGroups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDEducationalCyclesPatternDisciplinesGroups">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dEducationalCyclesPatternDisciplinesGroups" type="{http://edboservice.ua/}dEducationalCyclesPatternDisciplinesGroups" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDEducationalCyclesPatternDisciplinesGroups", propOrder = {
    "dEducationalCyclesPatternDisciplinesGroups"
})
public class ArrayOfDEducationalCyclesPatternDisciplinesGroups {

    @XmlElement(nillable = true)
    protected List<DEducationalCyclesPatternDisciplinesGroups> dEducationalCyclesPatternDisciplinesGroups;

    /**
     * Gets the value of the dEducationalCyclesPatternDisciplinesGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dEducationalCyclesPatternDisciplinesGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEducationalCyclesPatternDisciplinesGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEducationalCyclesPatternDisciplinesGroups }
     * 
     * 
     */
    public List<DEducationalCyclesPatternDisciplinesGroups> getDEducationalCyclesPatternDisciplinesGroups() {
        if (dEducationalCyclesPatternDisciplinesGroups == null) {
            dEducationalCyclesPatternDisciplinesGroups = new ArrayList<DEducationalCyclesPatternDisciplinesGroups>();
        }
        return this.dEducationalCyclesPatternDisciplinesGroups;
    }

}
