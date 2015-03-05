
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfD23nkCheckPersons complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfD23nkCheckPersons">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="d23nkCheckPersons" type="{http://edboservice.ua/}d23nkCheckPersons" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfD23nkCheckPersons", propOrder = {
    "d23NkCheckPersons"
})
public class ArrayOfD23NkCheckPersons {

    @XmlElement(name = "d23nkCheckPersons", nillable = true)
    protected List<D23NkCheckPersons> d23NkCheckPersons;

    /**
     * Gets the value of the d23NkCheckPersons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the d23NkCheckPersons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getD23NkCheckPersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link D23NkCheckPersons }
     * 
     * 
     */
    public List<D23NkCheckPersons> getD23NkCheckPersons() {
        if (d23NkCheckPersons == null) {
            d23NkCheckPersons = new ArrayList<D23NkCheckPersons>();
        }
        return this.d23NkCheckPersons;
    }

}
