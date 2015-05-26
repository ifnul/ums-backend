
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonWorkOrders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonWorkOrders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonWorkOrders" type="{http://edboservice.ua/}dPersonWorkOrders" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonWorkOrders", propOrder = {
    "dPersonWorkOrders"
})
public class ArrayOfDPersonWorkOrders {

    @XmlElement(nillable = true)
    protected List<DPersonWorkOrders> dPersonWorkOrders;

    /**
     * Gets the value of the dPersonWorkOrders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonWorkOrders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonWorkOrders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonWorkOrders }
     * 
     * 
     */
    public List<DPersonWorkOrders> getDPersonWorkOrders() {
        if (dPersonWorkOrders == null) {
            dPersonWorkOrders = new ArrayList<DPersonWorkOrders>();
        }
        return this.dPersonWorkOrders;
    }

}
