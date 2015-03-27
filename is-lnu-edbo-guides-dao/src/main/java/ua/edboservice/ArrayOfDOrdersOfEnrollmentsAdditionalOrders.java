
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDOrdersOfEnrollmentsAdditionalOrders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDOrdersOfEnrollmentsAdditionalOrders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dOrdersOfEnrollmentsAdditionalOrders" type="{http://edboservice.ua/}dOrdersOfEnrollmentsAdditionalOrders" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDOrdersOfEnrollmentsAdditionalOrders", propOrder = {
    "dOrdersOfEnrollmentsAdditionalOrders"
})
public class ArrayOfDOrdersOfEnrollmentsAdditionalOrders {

    @XmlElement(nillable = true)
    protected List<DOrdersOfEnrollmentsAdditionalOrders> dOrdersOfEnrollmentsAdditionalOrders;

    /**
     * Gets the value of the dOrdersOfEnrollmentsAdditionalOrders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dOrdersOfEnrollmentsAdditionalOrders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOrdersOfEnrollmentsAdditionalOrders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOrdersOfEnrollmentsAdditionalOrders }
     * 
     * 
     */
    public List<DOrdersOfEnrollmentsAdditionalOrders> getDOrdersOfEnrollmentsAdditionalOrders() {
        if (dOrdersOfEnrollmentsAdditionalOrders == null) {
            dOrdersOfEnrollmentsAdditionalOrders = new ArrayList<DOrdersOfEnrollmentsAdditionalOrders>();
        }
        return this.dOrdersOfEnrollmentsAdditionalOrders;
    }

}
