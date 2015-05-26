
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDOrderOfDocumentsTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDOrderOfDocumentsTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dOrderOfDocumentsTypes" type="{http://edboservice.ua/}dOrderOfDocumentsTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDOrderOfDocumentsTypes", propOrder = {
    "dOrderOfDocumentsTypes"
})
public class ArrayOfDOrderOfDocumentsTypes {

    @XmlElement(nillable = true)
    protected List<DOrderOfDocumentsTypes> dOrderOfDocumentsTypes;

    /**
     * Gets the value of the dOrderOfDocumentsTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dOrderOfDocumentsTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOrderOfDocumentsTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOrderOfDocumentsTypes }
     * 
     * 
     */
    public List<DOrderOfDocumentsTypes> getDOrderOfDocumentsTypes() {
        if (dOrderOfDocumentsTypes == null) {
            dOrderOfDocumentsTypes = new ArrayList<DOrderOfDocumentsTypes>();
        }
        return this.dOrderOfDocumentsTypes;
    }

}
