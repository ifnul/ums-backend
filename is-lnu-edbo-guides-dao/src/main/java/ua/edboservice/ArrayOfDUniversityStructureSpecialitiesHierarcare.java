
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityStructureSpecialitiesHierarcare complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityStructureSpecialitiesHierarcare">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityStructureSpecialitiesHierarcare" type="{http://edboservice.ua/}dUniversityStructureSpecialitiesHierarcare" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityStructureSpecialitiesHierarcare", propOrder = {
    "dUniversityStructureSpecialitiesHierarcare"
})
public class ArrayOfDUniversityStructureSpecialitiesHierarcare {

    @XmlElement(nillable = true)
    protected List<DUniversityStructureSpecialitiesHierarcare> dUniversityStructureSpecialitiesHierarcare;

    /**
     * Gets the value of the dUniversityStructureSpecialitiesHierarcare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityStructureSpecialitiesHierarcare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityStructureSpecialitiesHierarcare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityStructureSpecialitiesHierarcare }
     * 
     * 
     */
    public List<DUniversityStructureSpecialitiesHierarcare> getDUniversityStructureSpecialitiesHierarcare() {
        if (dUniversityStructureSpecialitiesHierarcare == null) {
            dUniversityStructureSpecialitiesHierarcare = new ArrayList<DUniversityStructureSpecialitiesHierarcare>();
        }
        return this.dUniversityStructureSpecialitiesHierarcare;
    }

}
