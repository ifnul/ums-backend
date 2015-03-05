
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityCoursesStudentsRetun complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityCoursesStudentsRetun">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityCoursesStudentsRetun" type="{http://edboservice.ua/}dUniversityCoursesStudentsRetun" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityCoursesStudentsRetun", propOrder = {
    "dUniversityCoursesStudentsRetun"
})
public class ArrayOfDUniversityCoursesStudentsRetun {

    @XmlElement(nillable = true)
    protected List<DUniversityCoursesStudentsRetun> dUniversityCoursesStudentsRetun;

    /**
     * Gets the value of the dUniversityCoursesStudentsRetun property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityCoursesStudentsRetun property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityCoursesStudentsRetun().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityCoursesStudentsRetun }
     * 
     * 
     */
    public List<DUniversityCoursesStudentsRetun> getDUniversityCoursesStudentsRetun() {
        if (dUniversityCoursesStudentsRetun == null) {
            dUniversityCoursesStudentsRetun = new ArrayList<DUniversityCoursesStudentsRetun>();
        }
        return this.dUniversityCoursesStudentsRetun;
    }

}
