
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonDocumentValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonDocumentValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonDocumentValueType" type="{http://edboservice.ua/}dPersonDocumentValueType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonDocumentValueType", propOrder = {
    "dPersonDocumentValueType"
})
public class ArrayOfDPersonDocumentValueType {

    @XmlElement(nillable = true)
    protected List<DPersonDocumentValueType> dPersonDocumentValueType;

    /**
     * Gets the value of the dPersonDocumentValueType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonDocumentValueType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonDocumentValueType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonDocumentValueType }
     * 
     * 
     */
    public List<DPersonDocumentValueType> getDPersonDocumentValueType() {
        if (dPersonDocumentValueType == null) {
            dPersonDocumentValueType = new ArrayList<DPersonDocumentValueType>();
        }
        return this.dPersonDocumentValueType;
    }

}
