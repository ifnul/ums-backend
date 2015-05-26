
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityCoursesAdd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityCoursesAdd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityCoursesAdd" type="{http://edboservice.ua/}dUniversityCoursesAdd" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityCoursesAdd", propOrder = {
    "dUniversityCoursesAdd"
})
public class ArrayOfDUniversityCoursesAdd {

    @XmlElement(nillable = true)
    protected List<DUniversityCoursesAdd> dUniversityCoursesAdd;

    /**
     * Gets the value of the dUniversityCoursesAdd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityCoursesAdd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityCoursesAdd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityCoursesAdd }
     * 
     * 
     */
    public List<DUniversityCoursesAdd> getDUniversityCoursesAdd() {
        if (dUniversityCoursesAdd == null) {
            dUniversityCoursesAdd = new ArrayList<DUniversityCoursesAdd>();
        }
        return this.dUniversityCoursesAdd;
    }

}
