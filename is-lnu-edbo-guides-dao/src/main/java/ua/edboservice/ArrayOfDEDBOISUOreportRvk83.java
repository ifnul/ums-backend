
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDEDBOISUOreport_rvk83 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDEDBOISUOreport_rvk83">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dEDBOISUOreport_rvk83" type="{http://edboservice.ua/}dEDBOISUOreport_rvk83" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDEDBOISUOreport_rvk83", propOrder = {
    "dedboisuOreportRvk83"
})
public class ArrayOfDEDBOISUOreportRvk83 {

    @XmlElement(name = "dEDBOISUOreport_rvk83", nillable = true)
    protected List<DEDBOISUOreportRvk83> dedboisuOreportRvk83;

    /**
     * Gets the value of the dedboisuOreportRvk83 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dedboisuOreportRvk83 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEDBOISUOreportRvk83().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEDBOISUOreportRvk83 }
     * 
     * 
     */
    public List<DEDBOISUOreportRvk83> getDEDBOISUOreportRvk83() {
        if (dedboisuOreportRvk83 == null) {
            dedboisuOreportRvk83 = new ArrayList<DEDBOISUOreportRvk83>();
        }
        return this.dedboisuOreportRvk83;
    }

}
