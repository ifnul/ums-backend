
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfD23nk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfD23nk">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="d23nk" type="{http://edboservice.ua/}d23nk" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfD23nk", propOrder = {
    "d23Nk"
})
public class ArrayOfD23Nk {

    @XmlElement(name = "d23nk", nillable = true)
    protected List<D23Nk> d23Nk;

    /**
     * Gets the value of the d23Nk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the d23Nk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getD23Nk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link D23Nk }
     * 
     * 
     */
    public List<D23Nk> getD23Nk() {
        if (d23Nk == null) {
            d23Nk = new ArrayList<D23Nk>();
        }
        return this.d23Nk;
    }

}
