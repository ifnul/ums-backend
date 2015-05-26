
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonEducationHistoryOrders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonEducationHistoryOrders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonEducationHistoryOrders" type="{http://edboservice.ua/}dPersonEducationHistoryOrders" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonEducationHistoryOrders", propOrder = {
    "dPersonEducationHistoryOrders"
})
public class ArrayOfDPersonEducationHistoryOrders {

    @XmlElement(nillable = true)
    protected List<DPersonEducationHistoryOrders> dPersonEducationHistoryOrders;

    /**
     * Gets the value of the dPersonEducationHistoryOrders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonEducationHistoryOrders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonEducationHistoryOrders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonEducationHistoryOrders }
     * 
     * 
     */
    public List<DPersonEducationHistoryOrders> getDPersonEducationHistoryOrders() {
        if (dPersonEducationHistoryOrders == null) {
            dPersonEducationHistoryOrders = new ArrayList<DPersonEducationHistoryOrders>();
        }
        return this.dPersonEducationHistoryOrders;
    }

}
