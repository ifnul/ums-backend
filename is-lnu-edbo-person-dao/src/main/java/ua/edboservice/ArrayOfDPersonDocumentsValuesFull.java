
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonDocumentsValuesFull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonDocumentsValuesFull">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonDocumentsValuesFull" type="{http://edboservice.ua/}dPersonDocumentsValuesFull" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonDocumentsValuesFull", propOrder = {
    "dPersonDocumentsValuesFull"
})
public class ArrayOfDPersonDocumentsValuesFull {

    @XmlElement(nillable = true)
    protected List<DPersonDocumentsValuesFull> dPersonDocumentsValuesFull;

    /**
     * Gets the value of the dPersonDocumentsValuesFull property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonDocumentsValuesFull property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonDocumentsValuesFull().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonDocumentsValuesFull }
     * 
     * 
     */
    public List<DPersonDocumentsValuesFull> getDPersonDocumentsValuesFull() {
        if (dPersonDocumentsValuesFull == null) {
            dPersonDocumentsValuesFull = new ArrayList<DPersonDocumentsValuesFull>();
        }
        return this.dPersonDocumentsValuesFull;
    }

}
