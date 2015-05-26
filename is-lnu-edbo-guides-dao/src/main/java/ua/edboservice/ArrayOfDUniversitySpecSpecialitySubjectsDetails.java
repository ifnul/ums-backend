
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversitySpecSpecialitySubjectsDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversitySpecSpecialitySubjectsDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversitySpecSpecialitySubjectsDetails" type="{http://edboservice.ua/}dUniversitySpecSpecialitySubjectsDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversitySpecSpecialitySubjectsDetails", propOrder = {
    "dUniversitySpecSpecialitySubjectsDetails"
})
public class ArrayOfDUniversitySpecSpecialitySubjectsDetails {

    @XmlElement(nillable = true)
    protected List<DUniversitySpecSpecialitySubjectsDetails> dUniversitySpecSpecialitySubjectsDetails;

    /**
     * Gets the value of the dUniversitySpecSpecialitySubjectsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversitySpecSpecialitySubjectsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversitySpecSpecialitySubjectsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversitySpecSpecialitySubjectsDetails }
     * 
     * 
     */
    public List<DUniversitySpecSpecialitySubjectsDetails> getDUniversitySpecSpecialitySubjectsDetails() {
        if (dUniversitySpecSpecialitySubjectsDetails == null) {
            dUniversitySpecSpecialitySubjectsDetails = new ArrayList<DUniversitySpecSpecialitySubjectsDetails>();
        }
        return this.dUniversitySpecSpecialitySubjectsDetails;
    }

}
