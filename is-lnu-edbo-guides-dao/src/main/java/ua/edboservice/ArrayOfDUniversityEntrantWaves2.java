
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityEntrantWaves2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityEntrantWaves2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityEntrantWaves2" type="{http://edboservice.ua/}dUniversityEntrantWaves2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityEntrantWaves2", propOrder = {
    "dUniversityEntrantWaves2"
})
public class ArrayOfDUniversityEntrantWaves2 {

    @XmlElement(nillable = true)
    protected List<DUniversityEntrantWaves2> dUniversityEntrantWaves2;

    /**
     * Gets the value of the dUniversityEntrantWaves2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityEntrantWaves2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityEntrantWaves2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityEntrantWaves2 }
     * 
     * 
     */
    public List<DUniversityEntrantWaves2> getDUniversityEntrantWaves2() {
        if (dUniversityEntrantWaves2 == null) {
            dUniversityEntrantWaves2 = new ArrayList<DUniversityEntrantWaves2>();
        }
        return this.dUniversityEntrantWaves2;
    }

}
