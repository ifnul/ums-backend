
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDKOATUU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDKOATUU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dKOATUU" type="{http://edboservice.ua/}dKOATUU" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDKOATUU", propOrder = {
    "dkoatuu"
})
public class ArrayOfDKOATUU {

    @XmlElement(name = "dKOATUU", nillable = true)
    protected List<DKOATUU> dkoatuu;

    /**
     * Gets the value of the dkoatuu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dkoatuu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDKOATUU().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DKOATUU }
     * 
     * 
     */
    public List<DKOATUU> getDKOATUU() {
        if (dkoatuu == null) {
            dkoatuu = new ArrayList<DKOATUU>();
        }
        return this.dkoatuu;
    }

}
