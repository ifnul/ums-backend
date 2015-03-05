
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonFindByAttestat2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonFindByAttestat2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonFindByAttestat2" type="{http://edboservice.ua/}dPersonFindByAttestat2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonFindByAttestat2", propOrder = {
    "dPersonFindByAttestat2"
})
public class ArrayOfDPersonFindByAttestat2 {

    @XmlElement(nillable = true)
    protected List<DPersonFindByAttestat2> dPersonFindByAttestat2;

    /**
     * Gets the value of the dPersonFindByAttestat2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonFindByAttestat2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonFindByAttestat2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonFindByAttestat2 }
     * 
     * 
     */
    public List<DPersonFindByAttestat2> getDPersonFindByAttestat2() {
        if (dPersonFindByAttestat2 == null) {
            dPersonFindByAttestat2 = new ArrayList<DPersonFindByAttestat2>();
        }
        return this.dPersonFindByAttestat2;
    }

}
