
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityCoursesStudents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityCoursesStudents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityCoursesStudents" type="{http://edboservice.ua/}dUniversityCoursesStudents" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityCoursesStudents", propOrder = {
    "dUniversityCoursesStudents"
})
public class ArrayOfDUniversityCoursesStudents {

    @XmlElement(nillable = true)
    protected List<DUniversityCoursesStudents> dUniversityCoursesStudents;

    /**
     * Gets the value of the dUniversityCoursesStudents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityCoursesStudents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityCoursesStudents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityCoursesStudents }
     * 
     * 
     */
    public List<DUniversityCoursesStudents> getDUniversityCoursesStudents() {
        if (dUniversityCoursesStudents == null) {
            dUniversityCoursesStudents = new ArrayList<DUniversityCoursesStudents>();
        }
        return this.dUniversityCoursesStudents;
    }

}
