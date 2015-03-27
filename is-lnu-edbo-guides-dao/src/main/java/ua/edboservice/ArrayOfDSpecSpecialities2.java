
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDSpecSpecialities2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDSpecSpecialities2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dSpecSpecialities2" type="{http://edboservice.ua/}dSpecSpecialities2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDSpecSpecialities2", propOrder = {
    "dSpecSpecialities2"
})
public class ArrayOfDSpecSpecialities2 {

    @XmlElement(nillable = true)
    protected List<DSpecSpecialities2> dSpecSpecialities2;

    /**
     * Gets the value of the dSpecSpecialities2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dSpecSpecialities2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSpecSpecialities2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSpecSpecialities2 }
     * 
     * 
     */
    public List<DSpecSpecialities2> getDSpecSpecialities2() {
        if (dSpecSpecialities2 == null) {
            dSpecSpecialities2 = new ArrayList<DSpecSpecialities2>();
        }
        return this.dSpecSpecialities2;
    }

}
