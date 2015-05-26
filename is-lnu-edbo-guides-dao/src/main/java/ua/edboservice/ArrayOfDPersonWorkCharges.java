
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonWorkCharges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonWorkCharges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonWorkCharges" type="{http://edboservice.ua/}dPersonWorkCharges" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonWorkCharges", propOrder = {
    "dPersonWorkCharges"
})
public class ArrayOfDPersonWorkCharges {

    @XmlElement(nillable = true)
    protected List<DPersonWorkCharges> dPersonWorkCharges;

    /**
     * Gets the value of the dPersonWorkCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonWorkCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonWorkCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonWorkCharges }
     * 
     * 
     */
    public List<DPersonWorkCharges> getDPersonWorkCharges() {
        if (dPersonWorkCharges == null) {
            dPersonWorkCharges = new ArrayList<DPersonWorkCharges>();
        }
        return this.dPersonWorkCharges;
    }

}
