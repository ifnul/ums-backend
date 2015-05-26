
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDEDBOISUOZNZ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDEDBOISUOZNZ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dEDBOISUOZNZ" type="{http://edboservice.ua/}dEDBOISUOZNZ" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDEDBOISUOZNZ", propOrder = {
    "dedboisuoznz"
})
public class ArrayOfDEDBOISUOZNZ {

    @XmlElement(name = "dEDBOISUOZNZ", nillable = true)
    protected List<DEDBOISUOZNZ> dedboisuoznz;

    /**
     * Gets the value of the dedboisuoznz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dedboisuoznz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEDBOISUOZNZ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEDBOISUOZNZ }
     * 
     * 
     */
    public List<DEDBOISUOZNZ> getDEDBOISUOZNZ() {
        if (dedboisuoznz == null) {
            dedboisuoznz = new ArrayList<DEDBOISUOZNZ>();
        }
        return this.dedboisuoznz;
    }

}
