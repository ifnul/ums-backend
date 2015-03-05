
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDExtAttestatsUz complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDExtAttestatsUz">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dExtAttestatsUz" type="{http://edboservice.ua/}dExtAttestatsUz" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDExtAttestatsUz", propOrder = {
    "dExtAttestatsUz"
})
public class ArrayOfDExtAttestatsUz {

    @XmlElement(nillable = true)
    protected List<DExtAttestatsUz> dExtAttestatsUz;

    /**
     * Gets the value of the dExtAttestatsUz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dExtAttestatsUz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDExtAttestatsUz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DExtAttestatsUz }
     * 
     * 
     */
    public List<DExtAttestatsUz> getDExtAttestatsUz() {
        if (dExtAttestatsUz == null) {
            dExtAttestatsUz = new ArrayList<DExtAttestatsUz>();
        }
        return this.dExtAttestatsUz;
    }

}
