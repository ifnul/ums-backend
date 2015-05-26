
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonsFind2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonsFind2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonsFind2" type="{http://edboservice.ua/}dPersonsFind2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonsFind2", propOrder = {
    "dPersonsFind2"
})
public class ArrayOfDPersonsFind2 {

    @XmlElement(nillable = true)
    protected List<DPersonsFind2> dPersonsFind2;

    /**
     * Gets the value of the dPersonsFind2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonsFind2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonsFind2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonsFind2 }
     * 
     * 
     */
    public List<DPersonsFind2> getDPersonsFind2() {
        if (dPersonsFind2 == null) {
            dPersonsFind2 = new ArrayList<DPersonsFind2>();
        }
        return this.dPersonsFind2;
    }

}
