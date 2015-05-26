
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDOrderOfDocumentsForAddStudents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDOrderOfDocumentsForAddStudents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dOrderOfDocumentsForAddStudents" type="{http://edboservice.ua/}dOrderOfDocumentsForAddStudents" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDOrderOfDocumentsForAddStudents", propOrder = {
    "dOrderOfDocumentsForAddStudents"
})
public class ArrayOfDOrderOfDocumentsForAddStudents {

    @XmlElement(nillable = true)
    protected List<DOrderOfDocumentsForAddStudents> dOrderOfDocumentsForAddStudents;

    /**
     * Gets the value of the dOrderOfDocumentsForAddStudents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dOrderOfDocumentsForAddStudents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOrderOfDocumentsForAddStudents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOrderOfDocumentsForAddStudents }
     * 
     * 
     */
    public List<DOrderOfDocumentsForAddStudents> getDOrderOfDocumentsForAddStudents() {
        if (dOrderOfDocumentsForAddStudents == null) {
            dOrderOfDocumentsForAddStudents = new ArrayList<DOrderOfDocumentsForAddStudents>();
        }
        return this.dOrderOfDocumentsForAddStudents;
    }

}
