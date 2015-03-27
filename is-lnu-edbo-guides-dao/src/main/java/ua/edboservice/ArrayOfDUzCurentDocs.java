
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUzCurentDocs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUzCurentDocs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUzCurentDocs" type="{http://edboservice.ua/}dUzCurentDocs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUzCurentDocs", propOrder = {
    "dUzCurentDocs"
})
public class ArrayOfDUzCurentDocs {

    @XmlElement(nillable = true)
    protected List<DUzCurentDocs> dUzCurentDocs;

    /**
     * Gets the value of the dUzCurentDocs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUzCurentDocs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUzCurentDocs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUzCurentDocs }
     * 
     * 
     */
    public List<DUzCurentDocs> getDUzCurentDocs() {
        if (dUzCurentDocs == null) {
            dUzCurentDocs = new ArrayList<DUzCurentDocs>();
        }
        return this.dUzCurentDocs;
    }

}
