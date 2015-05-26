
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDEDBOISUOreport_rvk77Exist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDEDBOISUOreport_rvk77Exist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dEDBOISUOreport_rvk77Exist" type="{http://edboservice.ua/}dEDBOISUOreport_rvk77Exist" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDEDBOISUOreport_rvk77Exist", propOrder = {
    "dedboisuOreportRvk77Exist"
})
public class ArrayOfDEDBOISUOreportRvk77Exist {

    @XmlElement(name = "dEDBOISUOreport_rvk77Exist", nillable = true)
    protected List<DEDBOISUOreportRvk77Exist> dedboisuOreportRvk77Exist;

    /**
     * Gets the value of the dedboisuOreportRvk77Exist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dedboisuOreportRvk77Exist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEDBOISUOreportRvk77Exist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEDBOISUOreportRvk77Exist }
     * 
     * 
     */
    public List<DEDBOISUOreportRvk77Exist> getDEDBOISUOreportRvk77Exist() {
        if (dedboisuOreportRvk77Exist == null) {
            dedboisuOreportRvk77Exist = new ArrayList<DEDBOISUOreportRvk77Exist>();
        }
        return this.dedboisuOreportRvk77Exist;
    }

}
