
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDEducationalCyclesDisciplinesGroups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDEducationalCyclesDisciplinesGroups">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dEducationalCyclesDisciplinesGroups" type="{http://edboservice.ua/}dEducationalCyclesDisciplinesGroups" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDEducationalCyclesDisciplinesGroups", propOrder = {
    "dEducationalCyclesDisciplinesGroups"
})
public class ArrayOfDEducationalCyclesDisciplinesGroups {

    @XmlElement(nillable = true)
    protected List<DEducationalCyclesDisciplinesGroups> dEducationalCyclesDisciplinesGroups;

    /**
     * Gets the value of the dEducationalCyclesDisciplinesGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dEducationalCyclesDisciplinesGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEducationalCyclesDisciplinesGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEducationalCyclesDisciplinesGroups }
     * 
     * 
     */
    public List<DEducationalCyclesDisciplinesGroups> getDEducationalCyclesDisciplinesGroups() {
        if (dEducationalCyclesDisciplinesGroups == null) {
            dEducationalCyclesDisciplinesGroups = new ArrayList<DEducationalCyclesDisciplinesGroups>();
        }
        return this.dEducationalCyclesDisciplinesGroups;
    }

}
