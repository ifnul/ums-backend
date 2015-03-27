
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDOrderOfDocumentsSendPackage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDOrderOfDocumentsSendPackage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dOrderOfDocumentsSendPackage" type="{http://edboservice.ua/}dOrderOfDocumentsSendPackage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDOrderOfDocumentsSendPackage", propOrder = {
    "dOrderOfDocumentsSendPackage"
})
public class ArrayOfDOrderOfDocumentsSendPackage {

    @XmlElement(nillable = true)
    protected List<DOrderOfDocumentsSendPackage> dOrderOfDocumentsSendPackage;

    /**
     * Gets the value of the dOrderOfDocumentsSendPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dOrderOfDocumentsSendPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOrderOfDocumentsSendPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOrderOfDocumentsSendPackage }
     * 
     * 
     */
    public List<DOrderOfDocumentsSendPackage> getDOrderOfDocumentsSendPackage() {
        if (dOrderOfDocumentsSendPackage == null) {
            dOrderOfDocumentsSendPackage = new ArrayList<DOrderOfDocumentsSendPackage>();
        }
        return this.dOrderOfDocumentsSendPackage;
    }

}
