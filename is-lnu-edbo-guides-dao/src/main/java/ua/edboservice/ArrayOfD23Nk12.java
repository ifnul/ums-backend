
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfD23nk_12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfD23nk_12">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="d23nk_12" type="{http://edboservice.ua/}d23nk_12" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfD23nk_12", propOrder = {
    "d23Nk12"
})
public class ArrayOfD23Nk12 {

    @XmlElement(name = "d23nk_12", nillable = true)
    protected List<D23Nk12> d23Nk12;

    /**
     * Gets the value of the d23Nk12 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the d23Nk12 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getD23Nk12().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link D23Nk12 }
     * 
     * 
     */
    public List<D23Nk12> getD23Nk12() {
        if (d23Nk12 == null) {
            d23Nk12 = new ArrayList<D23Nk12>();
        }
        return this.d23Nk12;
    }

}
