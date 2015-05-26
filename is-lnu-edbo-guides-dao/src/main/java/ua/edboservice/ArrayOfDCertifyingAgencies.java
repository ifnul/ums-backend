
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDCertifyingAgencies complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDCertifyingAgencies">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dCertifyingAgencies" type="{http://edboservice.ua/}dCertifyingAgencies" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDCertifyingAgencies", propOrder = {
    "dCertifyingAgencies"
})
public class ArrayOfDCertifyingAgencies {

    @XmlElement(nillable = true)
    protected List<DCertifyingAgencies> dCertifyingAgencies;

    /**
     * Gets the value of the dCertifyingAgencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dCertifyingAgencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDCertifyingAgencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DCertifyingAgencies }
     * 
     * 
     */
    public List<DCertifyingAgencies> getDCertifyingAgencies() {
        if (dCertifyingAgencies == null) {
            dCertifyingAgencies = new ArrayList<DCertifyingAgencies>();
        }
        return this.dCertifyingAgencies;
    }

}
