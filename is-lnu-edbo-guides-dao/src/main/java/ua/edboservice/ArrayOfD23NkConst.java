
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfD23nk_const complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfD23nk_const">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="d23nk_const" type="{http://edboservice.ua/}d23nk_const" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfD23nk_const", propOrder = {
    "d23NkConst"
})
public class ArrayOfD23NkConst {

    @XmlElement(name = "d23nk_const", nillable = true)
    protected List<D23NkConst> d23NkConst;

    /**
     * Gets the value of the d23NkConst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the d23NkConst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getD23NkConst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link D23NkConst }
     * 
     * 
     */
    public List<D23NkConst> getD23NkConst() {
        if (d23NkConst == null) {
            d23NkConst = new ArrayList<D23NkConst>();
        }
        return this.d23NkConst;
    }

}
