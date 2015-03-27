
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityOperatorStateOrders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityOperatorStateOrders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityOperatorStateOrders" type="{http://edboservice.ua/}dUniversityOperatorStateOrders" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityOperatorStateOrders", propOrder = {
    "dUniversityOperatorStateOrders"
})
public class ArrayOfDUniversityOperatorStateOrders {

    @XmlElement(nillable = true)
    protected List<DUniversityOperatorStateOrders> dUniversityOperatorStateOrders;

    /**
     * Gets the value of the dUniversityOperatorStateOrders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityOperatorStateOrders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityOperatorStateOrders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityOperatorStateOrders }
     * 
     * 
     */
    public List<DUniversityOperatorStateOrders> getDUniversityOperatorStateOrders() {
        if (dUniversityOperatorStateOrders == null) {
            dUniversityOperatorStateOrders = new ArrayList<DUniversityOperatorStateOrders>();
        }
        return this.dUniversityOperatorStateOrders;
    }

}
