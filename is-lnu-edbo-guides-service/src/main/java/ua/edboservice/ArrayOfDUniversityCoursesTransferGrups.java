
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityCoursesTransferGrups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityCoursesTransferGrups">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityCoursesTransferGrups" type="{http://edboservice.ua/}dUniversityCoursesTransferGrups" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityCoursesTransferGrups", propOrder = {
    "dUniversityCoursesTransferGrups"
})
public class ArrayOfDUniversityCoursesTransferGrups {

    @XmlElement(nillable = true)
    protected List<DUniversityCoursesTransferGrups> dUniversityCoursesTransferGrups;

    /**
     * Gets the value of the dUniversityCoursesTransferGrups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityCoursesTransferGrups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityCoursesTransferGrups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityCoursesTransferGrups }
     * 
     * 
     */
    public List<DUniversityCoursesTransferGrups> getDUniversityCoursesTransferGrups() {
        if (dUniversityCoursesTransferGrups == null) {
            dUniversityCoursesTransferGrups = new ArrayList<DUniversityCoursesTransferGrups>();
        }
        return this.dUniversityCoursesTransferGrups;
    }

}
