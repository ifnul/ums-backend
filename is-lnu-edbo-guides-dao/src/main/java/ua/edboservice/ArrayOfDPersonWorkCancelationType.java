
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonWorkCancelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonWorkCancelationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonWorkCancelationType" type="{http://edboservice.ua/}dPersonWorkCancelationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonWorkCancelationType", propOrder = {
    "dPersonWorkCancelationType"
})
public class ArrayOfDPersonWorkCancelationType {

    @XmlElement(nillable = true)
    protected List<DPersonWorkCancelationType> dPersonWorkCancelationType;

    /**
     * Gets the value of the dPersonWorkCancelationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonWorkCancelationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonWorkCancelationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonWorkCancelationType }
     * 
     * 
     */
    public List<DPersonWorkCancelationType> getDPersonWorkCancelationType() {
        if (dPersonWorkCancelationType == null) {
            dPersonWorkCancelationType = new ArrayList<DPersonWorkCancelationType>();
        }
        return this.dPersonWorkCancelationType;
    }

}
