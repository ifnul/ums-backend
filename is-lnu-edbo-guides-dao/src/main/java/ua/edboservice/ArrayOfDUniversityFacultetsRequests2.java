
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityFacultetsRequests2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityFacultetsRequests2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityFacultetsRequests2" type="{http://edboservice.ua/}dUniversityFacultetsRequests2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityFacultetsRequests2", propOrder = {
    "dUniversityFacultetsRequests2"
})
public class ArrayOfDUniversityFacultetsRequests2 {

    @XmlElement(nillable = true)
    protected List<DUniversityFacultetsRequests2> dUniversityFacultetsRequests2;

    /**
     * Gets the value of the dUniversityFacultetsRequests2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityFacultetsRequests2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityFacultetsRequests2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityFacultetsRequests2 }
     * 
     * 
     */
    public List<DUniversityFacultetsRequests2> getDUniversityFacultetsRequests2() {
        if (dUniversityFacultetsRequests2 == null) {
            dUniversityFacultetsRequests2 = new ArrayList<DUniversityFacultetsRequests2>();
        }
        return this.dUniversityFacultetsRequests2;
    }

}
