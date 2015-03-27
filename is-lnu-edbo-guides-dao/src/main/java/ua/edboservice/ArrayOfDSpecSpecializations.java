
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDSpecSpecializations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDSpecSpecializations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dSpecSpecializations" type="{http://edboservice.ua/}dSpecSpecializations" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDSpecSpecializations", propOrder = {
    "dSpecSpecializations"
})
public class ArrayOfDSpecSpecializations {

    @XmlElement(nillable = true)
    protected List<DSpecSpecializations> dSpecSpecializations;

    /**
     * Gets the value of the dSpecSpecializations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dSpecSpecializations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSpecSpecializations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSpecSpecializations }
     * 
     * 
     */
    public List<DSpecSpecializations> getDSpecSpecializations() {
        if (dSpecSpecializations == null) {
            dSpecSpecializations = new ArrayList<DSpecSpecializations>();
        }
        return this.dSpecSpecializations;
    }

}
