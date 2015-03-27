
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityFacultetSpecialitiesSubjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityFacultetSpecialitiesSubjects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityFacultetSpecialitiesSubjects" type="{http://edboservice.ua/}dUniversityFacultetSpecialitiesSubjects" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityFacultetSpecialitiesSubjects", propOrder = {
    "dUniversityFacultetSpecialitiesSubjects"
})
public class ArrayOfDUniversityFacultetSpecialitiesSubjects {

    @XmlElement(nillable = true)
    protected List<DUniversityFacultetSpecialitiesSubjects> dUniversityFacultetSpecialitiesSubjects;

    /**
     * Gets the value of the dUniversityFacultetSpecialitiesSubjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityFacultetSpecialitiesSubjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityFacultetSpecialitiesSubjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityFacultetSpecialitiesSubjects }
     * 
     * 
     */
    public List<DUniversityFacultetSpecialitiesSubjects> getDUniversityFacultetSpecialitiesSubjects() {
        if (dUniversityFacultetSpecialitiesSubjects == null) {
            dUniversityFacultetSpecialitiesSubjects = new ArrayList<DUniversityFacultetSpecialitiesSubjects>();
        }
        return this.dUniversityFacultetSpecialitiesSubjects;
    }

}
