
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDStateOrders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDStateOrders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dStateOrders" type="{http://edboservice.ua/}dStateOrders" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDStateOrders", propOrder = {
    "dStateOrders"
})
public class ArrayOfDStateOrders {

    @XmlElement(nillable = true)
    protected List<DStateOrders> dStateOrders;

    /**
     * Gets the value of the dStateOrders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dStateOrders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDStateOrders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DStateOrders }
     * 
     * 
     */
    public List<DStateOrders> getDStateOrders() {
        if (dStateOrders == null) {
            dStateOrders = new ArrayList<DStateOrders>();
        }
        return this.dStateOrders;
    }

}
