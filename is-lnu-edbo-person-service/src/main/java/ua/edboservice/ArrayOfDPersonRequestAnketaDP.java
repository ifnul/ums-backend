
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonRequestAnketaDP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonRequestAnketaDP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonRequestAnketaDP" type="{http://edboservice.ua/}dPersonRequestAnketaDP" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonRequestAnketaDP", propOrder = {
    "dPersonRequestAnketaDP"
})
public class ArrayOfDPersonRequestAnketaDP {

    @XmlElement(nillable = true)
    protected List<DPersonRequestAnketaDP> dPersonRequestAnketaDP;

    /**
     * Gets the value of the dPersonRequestAnketaDP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonRequestAnketaDP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonRequestAnketaDP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonRequestAnketaDP }
     * 
     * 
     */
    public List<DPersonRequestAnketaDP> getDPersonRequestAnketaDP() {
        if (dPersonRequestAnketaDP == null) {
            dPersonRequestAnketaDP = new ArrayList<DPersonRequestAnketaDP>();
        }
        return this.dPersonRequestAnketaDP;
    }

}
