
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityFacultetSpecialitiesAndRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityFacultetSpecialitiesAndRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityFacultetSpecialitiesAndRequest" type="{http://edboservice.ua/}dUniversityFacultetSpecialitiesAndRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityFacultetSpecialitiesAndRequest", propOrder = {
    "dUniversityFacultetSpecialitiesAndRequest"
})
public class ArrayOfDUniversityFacultetSpecialitiesAndRequest {

    @XmlElement(nillable = true)
    protected List<DUniversityFacultetSpecialitiesAndRequest> dUniversityFacultetSpecialitiesAndRequest;

    /**
     * Gets the value of the dUniversityFacultetSpecialitiesAndRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityFacultetSpecialitiesAndRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityFacultetSpecialitiesAndRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityFacultetSpecialitiesAndRequest }
     * 
     * 
     */
    public List<DUniversityFacultetSpecialitiesAndRequest> getDUniversityFacultetSpecialitiesAndRequest() {
        if (dUniversityFacultetSpecialitiesAndRequest == null) {
            dUniversityFacultetSpecialitiesAndRequest = new ArrayList<DUniversityFacultetSpecialitiesAndRequest>();
        }
        return this.dUniversityFacultetSpecialitiesAndRequest;
    }

}
