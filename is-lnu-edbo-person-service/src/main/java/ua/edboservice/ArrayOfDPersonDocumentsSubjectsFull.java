
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonDocumentsSubjectsFull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonDocumentsSubjectsFull">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonDocumentsSubjectsFull" type="{http://edboservice.ua/}dPersonDocumentsSubjectsFull" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonDocumentsSubjectsFull", propOrder = {
    "dPersonDocumentsSubjectsFull"
})
public class ArrayOfDPersonDocumentsSubjectsFull {

    @XmlElement(nillable = true)
    protected List<DPersonDocumentsSubjectsFull> dPersonDocumentsSubjectsFull;

    /**
     * Gets the value of the dPersonDocumentsSubjectsFull property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonDocumentsSubjectsFull property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonDocumentsSubjectsFull().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonDocumentsSubjectsFull }
     * 
     * 
     */
    public List<DPersonDocumentsSubjectsFull> getDPersonDocumentsSubjectsFull() {
        if (dPersonDocumentsSubjectsFull == null) {
            dPersonDocumentsSubjectsFull = new ArrayList<DPersonDocumentsSubjectsFull>();
        }
        return this.dPersonDocumentsSubjectsFull;
    }

}
