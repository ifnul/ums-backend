
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonDocumentTypes2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonDocumentTypes2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonDocumentTypes2" type="{http://edboservice.ua/}dPersonDocumentTypes2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonDocumentTypes2", propOrder = {
    "dPersonDocumentTypes2"
})
public class ArrayOfDPersonDocumentTypes2 {

    @XmlElement(nillable = true)
    protected List<DPersonDocumentTypes2> dPersonDocumentTypes2;

    /**
     * Gets the value of the dPersonDocumentTypes2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonDocumentTypes2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonDocumentTypes2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonDocumentTypes2 }
     * 
     * 
     */
    public List<DPersonDocumentTypes2> getDPersonDocumentTypes2() {
        if (dPersonDocumentTypes2 == null) {
            dPersonDocumentTypes2 = new ArrayList<DPersonDocumentTypes2>();
        }
        return this.dPersonDocumentTypes2;
    }

}
