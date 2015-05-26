
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDOlympiads2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDOlympiads2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dOlympiads2" type="{http://edboservice.ua/}dOlympiads2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDOlympiads2", propOrder = {
    "dOlympiads2"
})
public class ArrayOfDOlympiads2 {

    @XmlElement(nillable = true)
    protected List<DOlympiads2> dOlympiads2;

    /**
     * Gets the value of the dOlympiads2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dOlympiads2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOlympiads2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOlympiads2 }
     * 
     * 
     */
    public List<DOlympiads2> getDOlympiads2() {
        if (dOlympiads2 == null) {
            dOlympiads2 = new ArrayList<DOlympiads2>();
        }
        return this.dOlympiads2;
    }

}
