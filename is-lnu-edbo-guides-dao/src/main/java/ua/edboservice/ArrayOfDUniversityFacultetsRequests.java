
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityFacultetsRequests complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityFacultetsRequests">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityFacultetsRequests" type="{http://edboservice.ua/}dUniversityFacultetsRequests" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityFacultetsRequests", propOrder = {
    "dUniversityFacultetsRequests"
})
public class ArrayOfDUniversityFacultetsRequests {

    @XmlElement(nillable = true)
    protected List<DUniversityFacultetsRequests> dUniversityFacultetsRequests;

    /**
     * Gets the value of the dUniversityFacultetsRequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityFacultetsRequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityFacultetsRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityFacultetsRequests }
     * 
     * 
     */
    public List<DUniversityFacultetsRequests> getDUniversityFacultetsRequests() {
        if (dUniversityFacultetsRequests == null) {
            dUniversityFacultetsRequests = new ArrayList<DUniversityFacultetsRequests>();
        }
        return this.dUniversityFacultetsRequests;
    }

}
