
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityStructureSpecialities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityStructureSpecialities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityStructureSpecialities" type="{http://edboservice.ua/}dUniversityStructureSpecialities" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityStructureSpecialities", propOrder = {
    "dUniversityStructureSpecialities"
})
public class ArrayOfDUniversityStructureSpecialities {

    @XmlElement(nillable = true)
    protected List<DUniversityStructureSpecialities> dUniversityStructureSpecialities;

    /**
     * Gets the value of the dUniversityStructureSpecialities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityStructureSpecialities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityStructureSpecialities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityStructureSpecialities }
     * 
     * 
     */
    public List<DUniversityStructureSpecialities> getDUniversityStructureSpecialities() {
        if (dUniversityStructureSpecialities == null) {
            dUniversityStructureSpecialities = new ArrayList<DUniversityStructureSpecialities>();
        }
        return this.dUniversityStructureSpecialities;
    }

}
