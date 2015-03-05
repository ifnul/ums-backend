
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonRequestsStatuses2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonRequestsStatuses2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonRequestsStatuses2" type="{http://edboservice.ua/}dPersonRequestsStatuses2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonRequestsStatuses2", propOrder = {
    "dPersonRequestsStatuses2"
})
public class ArrayOfDPersonRequestsStatuses2 {

    @XmlElement(nillable = true)
    protected List<DPersonRequestsStatuses2> dPersonRequestsStatuses2;

    /**
     * Gets the value of the dPersonRequestsStatuses2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonRequestsStatuses2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonRequestsStatuses2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonRequestsStatuses2 }
     * 
     * 
     */
    public List<DPersonRequestsStatuses2> getDPersonRequestsStatuses2() {
        if (dPersonRequestsStatuses2 == null) {
            dPersonRequestsStatuses2 = new ArrayList<DPersonRequestsStatuses2>();
        }
        return this.dPersonRequestsStatuses2;
    }

}
