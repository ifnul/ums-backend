
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonRequestsAllPriorityGetEz complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonRequestsAllPriorityGetEz">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonRequestsAllPriorityGetEz" type="{http://edboservice.ua/}dPersonRequestsAllPriorityGetEz" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonRequestsAllPriorityGetEz", propOrder = {
    "dPersonRequestsAllPriorityGetEz"
})
public class ArrayOfDPersonRequestsAllPriorityGetEz {

    @XmlElement(nillable = true)
    protected List<DPersonRequestsAllPriorityGetEz> dPersonRequestsAllPriorityGetEz;

    /**
     * Gets the value of the dPersonRequestsAllPriorityGetEz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonRequestsAllPriorityGetEz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonRequestsAllPriorityGetEz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonRequestsAllPriorityGetEz }
     * 
     * 
     */
    public List<DPersonRequestsAllPriorityGetEz> getDPersonRequestsAllPriorityGetEz() {
        if (dPersonRequestsAllPriorityGetEz == null) {
            dPersonRequestsAllPriorityGetEz = new ArrayList<DPersonRequestsAllPriorityGetEz>();
        }
        return this.dPersonRequestsAllPriorityGetEz;
    }

}
