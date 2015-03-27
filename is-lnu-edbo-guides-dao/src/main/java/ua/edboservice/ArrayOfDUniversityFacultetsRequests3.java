
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityFacultetsRequests3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityFacultetsRequests3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityFacultetsRequests3" type="{http://edboservice.ua/}dUniversityFacultetsRequests3" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityFacultetsRequests3", propOrder = {
    "dUniversityFacultetsRequests3"
})
public class ArrayOfDUniversityFacultetsRequests3 {

    @XmlElement(nillable = true)
    protected List<DUniversityFacultetsRequests3> dUniversityFacultetsRequests3;

    /**
     * Gets the value of the dUniversityFacultetsRequests3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityFacultetsRequests3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityFacultetsRequests3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityFacultetsRequests3 }
     * 
     * 
     */
    public List<DUniversityFacultetsRequests3> getDUniversityFacultetsRequests3() {
        if (dUniversityFacultetsRequests3 == null) {
            dUniversityFacultetsRequests3 = new ArrayList<DUniversityFacultetsRequests3>();
        }
        return this.dUniversityFacultetsRequests3;
    }

}
