
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonRequestAnketaDS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonRequestAnketaDS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonRequestAnketaDS" type="{http://edboservice.ua/}dPersonRequestAnketaDS" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonRequestAnketaDS", propOrder = {
    "dPersonRequestAnketaDS"
})
public class ArrayOfDPersonRequestAnketaDS {

    @XmlElement(nillable = true)
    protected List<DPersonRequestAnketaDS> dPersonRequestAnketaDS;

    /**
     * Gets the value of the dPersonRequestAnketaDS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonRequestAnketaDS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonRequestAnketaDS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonRequestAnketaDS }
     * 
     * 
     */
    public List<DPersonRequestAnketaDS> getDPersonRequestAnketaDS() {
        if (dPersonRequestAnketaDS == null) {
            dPersonRequestAnketaDS = new ArrayList<DPersonRequestAnketaDS>();
        }
        return this.dPersonRequestAnketaDS;
    }

}
