
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonRequestsAllPriority complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonRequestsAllPriority">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonRequestsAllPriority" type="{http://edboservice.ua/}dPersonRequestsAllPriority" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonRequestsAllPriority", propOrder = {
    "dPersonRequestsAllPriority"
})
public class ArrayOfDPersonRequestsAllPriority {

    @XmlElement(nillable = true)
    protected List<DPersonRequestsAllPriority> dPersonRequestsAllPriority;

    /**
     * Gets the value of the dPersonRequestsAllPriority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonRequestsAllPriority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonRequestsAllPriority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonRequestsAllPriority }
     * 
     * 
     */
    public List<DPersonRequestsAllPriority> getDPersonRequestsAllPriority() {
        if (dPersonRequestsAllPriority == null) {
            dPersonRequestsAllPriority = new ArrayList<DPersonRequestsAllPriority>();
        }
        return this.dPersonRequestsAllPriority;
    }

}
