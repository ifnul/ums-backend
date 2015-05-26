
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDOrderOfDocumentsForAddRequestsFind complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDOrderOfDocumentsForAddRequestsFind">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dOrderOfDocumentsForAddRequestsFind" type="{http://edboservice.ua/}dOrderOfDocumentsForAddRequestsFind" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDOrderOfDocumentsForAddRequestsFind", propOrder = {
    "dOrderOfDocumentsForAddRequestsFind"
})
public class ArrayOfDOrderOfDocumentsForAddRequestsFind {

    @XmlElement(nillable = true)
    protected List<DOrderOfDocumentsForAddRequestsFind> dOrderOfDocumentsForAddRequestsFind;

    /**
     * Gets the value of the dOrderOfDocumentsForAddRequestsFind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dOrderOfDocumentsForAddRequestsFind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOrderOfDocumentsForAddRequestsFind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOrderOfDocumentsForAddRequestsFind }
     * 
     * 
     */
    public List<DOrderOfDocumentsForAddRequestsFind> getDOrderOfDocumentsForAddRequestsFind() {
        if (dOrderOfDocumentsForAddRequestsFind == null) {
            dOrderOfDocumentsForAddRequestsFind = new ArrayList<DOrderOfDocumentsForAddRequestsFind>();
        }
        return this.dOrderOfDocumentsForAddRequestsFind;
    }

}
