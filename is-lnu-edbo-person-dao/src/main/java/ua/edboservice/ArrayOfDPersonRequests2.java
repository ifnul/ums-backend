
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonRequests2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonRequests2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonRequests2" type="{http://edboservice.ua/}dPersonRequests2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonRequests2", propOrder = {
    "dPersonRequests2"
})
public class ArrayOfDPersonRequests2 {

    @XmlElement(nillable = true)
    protected List<DPersonRequests2> dPersonRequests2;

    /**
     * Gets the value of the dPersonRequests2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonRequests2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonRequests2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonRequests2 }
     * 
     * 
     */
    public List<DPersonRequests2> getDPersonRequests2() {
        if (dPersonRequests2 == null) {
            dPersonRequests2 = new ArrayList<DPersonRequests2>();
        }
        return this.dPersonRequests2;
    }

}
