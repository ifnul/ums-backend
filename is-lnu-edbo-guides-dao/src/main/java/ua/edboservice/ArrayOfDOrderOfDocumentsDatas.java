
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDOrderOfDocumentsDatas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDOrderOfDocumentsDatas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dOrderOfDocumentsDatas" type="{http://edboservice.ua/}dOrderOfDocumentsDatas" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDOrderOfDocumentsDatas", propOrder = {
    "dOrderOfDocumentsDatas"
})
public class ArrayOfDOrderOfDocumentsDatas {

    @XmlElement(nillable = true)
    protected List<DOrderOfDocumentsDatas> dOrderOfDocumentsDatas;

    /**
     * Gets the value of the dOrderOfDocumentsDatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dOrderOfDocumentsDatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOrderOfDocumentsDatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOrderOfDocumentsDatas }
     * 
     * 
     */
    public List<DOrderOfDocumentsDatas> getDOrderOfDocumentsDatas() {
        if (dOrderOfDocumentsDatas == null) {
            dOrderOfDocumentsDatas = new ArrayList<DOrderOfDocumentsDatas>();
        }
        return this.dOrderOfDocumentsDatas;
    }

}
