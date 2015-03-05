
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDWebBooksAndPublications complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDWebBooksAndPublications">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dWebBooksAndPublications" type="{http://edboservice.ua/}dWebBooksAndPublications" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDWebBooksAndPublications", propOrder = {
    "dWebBooksAndPublications"
})
public class ArrayOfDWebBooksAndPublications {

    @XmlElement(nillable = true)
    protected List<DWebBooksAndPublications> dWebBooksAndPublications;

    /**
     * Gets the value of the dWebBooksAndPublications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dWebBooksAndPublications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDWebBooksAndPublications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DWebBooksAndPublications }
     * 
     * 
     */
    public List<DWebBooksAndPublications> getDWebBooksAndPublications() {
        if (dWebBooksAndPublications == null) {
            dWebBooksAndPublications = new ArrayList<DWebBooksAndPublications>();
        }
        return this.dWebBooksAndPublications;
    }

}
