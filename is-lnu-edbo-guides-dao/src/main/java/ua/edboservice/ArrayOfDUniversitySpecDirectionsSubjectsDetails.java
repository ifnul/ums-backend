
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversitySpecDirectionsSubjectsDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversitySpecDirectionsSubjectsDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversitySpecDirectionsSubjectsDetails" type="{http://edboservice.ua/}dUniversitySpecDirectionsSubjectsDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversitySpecDirectionsSubjectsDetails", propOrder = {
    "dUniversitySpecDirectionsSubjectsDetails"
})
public class ArrayOfDUniversitySpecDirectionsSubjectsDetails {

    @XmlElement(nillable = true)
    protected List<DUniversitySpecDirectionsSubjectsDetails> dUniversitySpecDirectionsSubjectsDetails;

    /**
     * Gets the value of the dUniversitySpecDirectionsSubjectsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversitySpecDirectionsSubjectsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversitySpecDirectionsSubjectsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversitySpecDirectionsSubjectsDetails }
     * 
     * 
     */
    public List<DUniversitySpecDirectionsSubjectsDetails> getDUniversitySpecDirectionsSubjectsDetails() {
        if (dUniversitySpecDirectionsSubjectsDetails == null) {
            dUniversitySpecDirectionsSubjectsDetails = new ArrayList<DUniversitySpecDirectionsSubjectsDetails>();
        }
        return this.dUniversitySpecDirectionsSubjectsDetails;
    }

}
