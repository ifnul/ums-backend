
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDOrderOfDocumentsGroups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDOrderOfDocumentsGroups">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dOrderOfDocumentsGroups" type="{http://edboservice.ua/}dOrderOfDocumentsGroups" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDOrderOfDocumentsGroups", propOrder = {
    "dOrderOfDocumentsGroups"
})
public class ArrayOfDOrderOfDocumentsGroups {

    @XmlElement(nillable = true)
    protected List<DOrderOfDocumentsGroups> dOrderOfDocumentsGroups;

    /**
     * Gets the value of the dOrderOfDocumentsGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dOrderOfDocumentsGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOrderOfDocumentsGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOrderOfDocumentsGroups }
     * 
     * 
     */
    public List<DOrderOfDocumentsGroups> getDOrderOfDocumentsGroups() {
        if (dOrderOfDocumentsGroups == null) {
            dOrderOfDocumentsGroups = new ArrayList<DOrderOfDocumentsGroups>();
        }
        return this.dOrderOfDocumentsGroups;
    }

}
