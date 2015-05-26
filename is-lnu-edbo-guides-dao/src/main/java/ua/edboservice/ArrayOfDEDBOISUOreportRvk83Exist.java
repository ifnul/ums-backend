
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDEDBOISUOreport_rvk83Exist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDEDBOISUOreport_rvk83Exist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dEDBOISUOreport_rvk83Exist" type="{http://edboservice.ua/}dEDBOISUOreport_rvk83Exist" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDEDBOISUOreport_rvk83Exist", propOrder = {
    "dedboisuOreportRvk83Exist"
})
public class ArrayOfDEDBOISUOreportRvk83Exist {

    @XmlElement(name = "dEDBOISUOreport_rvk83Exist", nillable = true)
    protected List<DEDBOISUOreportRvk83Exist> dedboisuOreportRvk83Exist;

    /**
     * Gets the value of the dedboisuOreportRvk83Exist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dedboisuOreportRvk83Exist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEDBOISUOreportRvk83Exist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEDBOISUOreportRvk83Exist }
     * 
     * 
     */
    public List<DEDBOISUOreportRvk83Exist> getDEDBOISUOreportRvk83Exist() {
        if (dedboisuOreportRvk83Exist == null) {
            dedboisuOreportRvk83Exist = new ArrayList<DEDBOISUOreportRvk83Exist>();
        }
        return this.dedboisuOreportRvk83Exist;
    }

}
