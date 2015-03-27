
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonDocumentCancellation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonDocumentCancellation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonDocumentCancellation" type="{http://edboservice.ua/}dPersonDocumentCancellation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonDocumentCancellation", propOrder = {
    "dPersonDocumentCancellation"
})
public class ArrayOfDPersonDocumentCancellation {

    @XmlElement(nillable = true)
    protected List<DPersonDocumentCancellation> dPersonDocumentCancellation;

    /**
     * Gets the value of the dPersonDocumentCancellation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonDocumentCancellation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonDocumentCancellation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonDocumentCancellation }
     * 
     * 
     */
    public List<DPersonDocumentCancellation> getDPersonDocumentCancellation() {
        if (dPersonDocumentCancellation == null) {
            dPersonDocumentCancellation = new ArrayList<DPersonDocumentCancellation>();
        }
        return this.dPersonDocumentCancellation;
    }

}
