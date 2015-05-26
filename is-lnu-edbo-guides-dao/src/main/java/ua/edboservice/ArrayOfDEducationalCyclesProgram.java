
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDEducationalCycles_Program complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDEducationalCycles_Program">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dEducationalCycles_Program" type="{http://edboservice.ua/}dEducationalCycles_Program" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDEducationalCycles_Program", propOrder = {
    "dEducationalCyclesProgram"
})
public class ArrayOfDEducationalCyclesProgram {

    @XmlElement(name = "dEducationalCycles_Program", nillable = true)
    protected List<DEducationalCyclesProgram> dEducationalCyclesProgram;

    /**
     * Gets the value of the dEducationalCyclesProgram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dEducationalCyclesProgram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEducationalCyclesProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEducationalCyclesProgram }
     * 
     * 
     */
    public List<DEducationalCyclesProgram> getDEducationalCyclesProgram() {
        if (dEducationalCyclesProgram == null) {
            dEducationalCyclesProgram = new ArrayList<DEducationalCyclesProgram>();
        }
        return this.dEducationalCyclesProgram;
    }

}
