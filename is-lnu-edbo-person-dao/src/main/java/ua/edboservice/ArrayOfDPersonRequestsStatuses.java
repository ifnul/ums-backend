
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonRequestsStatuses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonRequestsStatuses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonRequestsStatuses" type="{http://edboservice.ua/}dPersonRequestsStatuses" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonRequestsStatuses", propOrder = {
    "dPersonRequestsStatuses"
})
public class ArrayOfDPersonRequestsStatuses {

    @XmlElement(nillable = true)
    protected List<DPersonRequestsStatuses> dPersonRequestsStatuses;

    /**
     * Gets the value of the dPersonRequestsStatuses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonRequestsStatuses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonRequestsStatuses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonRequestsStatuses }
     * 
     * 
     */
    public List<DPersonRequestsStatuses> getDPersonRequestsStatuses() {
        if (dPersonRequestsStatuses == null) {
            dPersonRequestsStatuses = new ArrayList<DPersonRequestsStatuses>();
        }
        return this.dPersonRequestsStatuses;
    }

}
