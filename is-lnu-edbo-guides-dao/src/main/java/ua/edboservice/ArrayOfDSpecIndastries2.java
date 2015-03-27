
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDSpecIndastries2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDSpecIndastries2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dSpecIndastries2" type="{http://edboservice.ua/}dSpecIndastries2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDSpecIndastries2", propOrder = {
    "dSpecIndastries2"
})
public class ArrayOfDSpecIndastries2 {

    @XmlElement(nillable = true)
    protected List<DSpecIndastries2> dSpecIndastries2;

    /**
     * Gets the value of the dSpecIndastries2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dSpecIndastries2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSpecIndastries2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSpecIndastries2 }
     * 
     * 
     */
    public List<DSpecIndastries2> getDSpecIndastries2() {
        if (dSpecIndastries2 == null) {
            dSpecIndastries2 = new ArrayList<DSpecIndastries2>();
        }
        return this.dSpecIndastries2;
    }

}
