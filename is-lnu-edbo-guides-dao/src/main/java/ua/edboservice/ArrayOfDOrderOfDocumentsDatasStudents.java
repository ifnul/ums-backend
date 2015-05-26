
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDOrderOfDocumentsDatasStudents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDOrderOfDocumentsDatasStudents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dOrderOfDocumentsDatasStudents" type="{http://edboservice.ua/}dOrderOfDocumentsDatasStudents" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDOrderOfDocumentsDatasStudents", propOrder = {
    "dOrderOfDocumentsDatasStudents"
})
public class ArrayOfDOrderOfDocumentsDatasStudents {

    @XmlElement(nillable = true)
    protected List<DOrderOfDocumentsDatasStudents> dOrderOfDocumentsDatasStudents;

    /**
     * Gets the value of the dOrderOfDocumentsDatasStudents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dOrderOfDocumentsDatasStudents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOrderOfDocumentsDatasStudents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOrderOfDocumentsDatasStudents }
     * 
     * 
     */
    public List<DOrderOfDocumentsDatasStudents> getDOrderOfDocumentsDatasStudents() {
        if (dOrderOfDocumentsDatasStudents == null) {
            dOrderOfDocumentsDatasStudents = new ArrayList<DOrderOfDocumentsDatasStudents>();
        }
        return this.dOrderOfDocumentsDatasStudents;
    }

}
