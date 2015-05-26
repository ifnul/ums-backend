
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityFacultetSpecialitiesWaves2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityFacultetSpecialitiesWaves2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityFacultetSpecialitiesWaves2" type="{http://edboservice.ua/}dUniversityFacultetSpecialitiesWaves2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityFacultetSpecialitiesWaves2", propOrder = {
    "dUniversityFacultetSpecialitiesWaves2"
})
public class ArrayOfDUniversityFacultetSpecialitiesWaves2 {

    @XmlElement(nillable = true)
    protected List<DUniversityFacultetSpecialitiesWaves2> dUniversityFacultetSpecialitiesWaves2;

    /**
     * Gets the value of the dUniversityFacultetSpecialitiesWaves2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityFacultetSpecialitiesWaves2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityFacultetSpecialitiesWaves2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityFacultetSpecialitiesWaves2 }
     * 
     * 
     */
    public List<DUniversityFacultetSpecialitiesWaves2> getDUniversityFacultetSpecialitiesWaves2() {
        if (dUniversityFacultetSpecialitiesWaves2 == null) {
            dUniversityFacultetSpecialitiesWaves2 = new ArrayList<DUniversityFacultetSpecialitiesWaves2>();
        }
        return this.dUniversityFacultetSpecialitiesWaves2;
    }

}
