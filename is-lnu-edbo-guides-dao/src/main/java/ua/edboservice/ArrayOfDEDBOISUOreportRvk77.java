
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDEDBOISUOreport_rvk77 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDEDBOISUOreport_rvk77">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dEDBOISUOreport_rvk77" type="{http://edboservice.ua/}dEDBOISUOreport_rvk77" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDEDBOISUOreport_rvk77", propOrder = {
    "dedboisuOreportRvk77"
})
public class ArrayOfDEDBOISUOreportRvk77 {

    @XmlElement(name = "dEDBOISUOreport_rvk77", nillable = true)
    protected List<DEDBOISUOreportRvk77> dedboisuOreportRvk77;

    /**
     * Gets the value of the dedboisuOreportRvk77 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dedboisuOreportRvk77 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEDBOISUOreportRvk77().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEDBOISUOreportRvk77 }
     * 
     * 
     */
    public List<DEDBOISUOreportRvk77> getDEDBOISUOreportRvk77() {
        if (dedboisuOreportRvk77 == null) {
            dedboisuOreportRvk77 = new ArrayList<DEDBOISUOreportRvk77>();
        }
        return this.dedboisuOreportRvk77;
    }

}
