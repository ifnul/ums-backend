
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityEntrantWavesRequests2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityEntrantWavesRequests2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityEntrantWavesRequests2" type="{http://edboservice.ua/}dUniversityEntrantWavesRequests2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityEntrantWavesRequests2", propOrder = {
    "dUniversityEntrantWavesRequests2"
})
public class ArrayOfDUniversityEntrantWavesRequests2 {

    @XmlElement(nillable = true)
    protected List<DUniversityEntrantWavesRequests2> dUniversityEntrantWavesRequests2;

    /**
     * Gets the value of the dUniversityEntrantWavesRequests2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityEntrantWavesRequests2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityEntrantWavesRequests2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityEntrantWavesRequests2 }
     * 
     * 
     */
    public List<DUniversityEntrantWavesRequests2> getDUniversityEntrantWavesRequests2() {
        if (dUniversityEntrantWavesRequests2 == null) {
            dUniversityEntrantWavesRequests2 = new ArrayList<DUniversityEntrantWavesRequests2>();
        }
        return this.dUniversityEntrantWavesRequests2;
    }

}
