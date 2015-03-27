
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonDocumentsValues2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonDocumentsValues2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonDocumentsValues2" type="{http://edboservice.ua/}dPersonDocumentsValues2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonDocumentsValues2", propOrder = {
    "dPersonDocumentsValues2"
})
public class ArrayOfDPersonDocumentsValues2 {

    @XmlElement(nillable = true)
    protected List<DPersonDocumentsValues2> dPersonDocumentsValues2;

    /**
     * Gets the value of the dPersonDocumentsValues2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonDocumentsValues2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonDocumentsValues2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonDocumentsValues2 }
     * 
     * 
     */
    public List<DPersonDocumentsValues2> getDPersonDocumentsValues2() {
        if (dPersonDocumentsValues2 == null) {
            dPersonDocumentsValues2 = new ArrayList<DPersonDocumentsValues2>();
        }
        return this.dPersonDocumentsValues2;
    }

}
