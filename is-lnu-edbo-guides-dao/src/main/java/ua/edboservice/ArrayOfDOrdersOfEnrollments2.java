
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDOrdersOfEnrollments2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDOrdersOfEnrollments2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dOrdersOfEnrollments2" type="{http://edboservice.ua/}dOrdersOfEnrollments2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDOrdersOfEnrollments2", propOrder = {
    "dOrdersOfEnrollments2"
})
public class ArrayOfDOrdersOfEnrollments2 {

    @XmlElement(nillable = true)
    protected List<DOrdersOfEnrollments2> dOrdersOfEnrollments2;

    /**
     * Gets the value of the dOrdersOfEnrollments2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dOrdersOfEnrollments2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOrdersOfEnrollments2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOrdersOfEnrollments2 }
     * 
     * 
     */
    public List<DOrdersOfEnrollments2> getDOrdersOfEnrollments2() {
        if (dOrdersOfEnrollments2 == null) {
            dOrdersOfEnrollments2 = new ArrayList<DOrdersOfEnrollments2>();
        }
        return this.dOrdersOfEnrollments2;
    }

}
