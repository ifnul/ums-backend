
package org.lnu.is.edbo.guides_min;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityFacultetSpecialitiesSubjects2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityFacultetSpecialitiesSubjects2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityFacultetSpecialitiesSubjects2" type="{http://edboservice.ua/}dUniversityFacultetSpecialitiesSubjects2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityFacultetSpecialitiesSubjects2", propOrder = {
    "dUniversityFacultetSpecialitiesSubjects2"
})
public class ArrayOfDUniversityFacultetSpecialitiesSubjects2 {

    @XmlElement(nillable = true)
    protected List<DUniversityFacultetSpecialitiesSubjects2> dUniversityFacultetSpecialitiesSubjects2;

    /**
     * Gets the value of the dUniversityFacultetSpecialitiesSubjects2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityFacultetSpecialitiesSubjects2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityFacultetSpecialitiesSubjects2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityFacultetSpecialitiesSubjects2 }
     * 
     * 
     */
    public List<DUniversityFacultetSpecialitiesSubjects2> getDUniversityFacultetSpecialitiesSubjects2() {
        if (dUniversityFacultetSpecialitiesSubjects2 == null) {
            dUniversityFacultetSpecialitiesSubjects2 = new ArrayList<DUniversityFacultetSpecialitiesSubjects2>();
        }
        return this.dUniversityFacultetSpecialitiesSubjects2;
    }

}
