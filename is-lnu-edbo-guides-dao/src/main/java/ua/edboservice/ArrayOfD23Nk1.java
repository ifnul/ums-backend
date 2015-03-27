
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfD23nk_1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfD23nk_1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="d23nk_1" type="{http://edboservice.ua/}d23nk_1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfD23nk_1", propOrder = {
    "d23Nk1"
})
public class ArrayOfD23Nk1 {

    @XmlElement(name = "d23nk_1", nillable = true)
    protected List<D23Nk1> d23Nk1;

    /**
     * Gets the value of the d23Nk1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the d23Nk1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getD23Nk1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link D23Nk1 }
     * 
     * 
     */
    public List<D23Nk1> getD23Nk1() {
        if (d23Nk1 == null) {
            d23Nk1 = new ArrayList<D23Nk1>();
        }
        return this.d23Nk1;
    }

}
