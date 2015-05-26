
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonDocumentsValuesFull2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonDocumentsValuesFull2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonDocumentsValuesFull2" type="{http://edboservice.ua/}dPersonDocumentsValuesFull2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonDocumentsValuesFull2", propOrder = {
    "dPersonDocumentsValuesFull2"
})
public class ArrayOfDPersonDocumentsValuesFull2 {

    @XmlElement(nillable = true)
    protected List<DPersonDocumentsValuesFull2> dPersonDocumentsValuesFull2;

    /**
     * Gets the value of the dPersonDocumentsValuesFull2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonDocumentsValuesFull2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonDocumentsValuesFull2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonDocumentsValuesFull2 }
     * 
     * 
     */
    public List<DPersonDocumentsValuesFull2> getDPersonDocumentsValuesFull2() {
        if (dPersonDocumentsValuesFull2 == null) {
            dPersonDocumentsValuesFull2 = new ArrayList<DPersonDocumentsValuesFull2>();
        }
        return this.dPersonDocumentsValuesFull2;
    }

}
