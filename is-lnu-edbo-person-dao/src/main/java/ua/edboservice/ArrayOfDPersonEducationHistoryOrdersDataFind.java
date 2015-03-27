
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonEducationHistoryOrdersDataFind complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonEducationHistoryOrdersDataFind">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonEducationHistoryOrdersDataFind" type="{http://edboservice.ua/}dPersonEducationHistoryOrdersDataFind" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonEducationHistoryOrdersDataFind", propOrder = {
    "dPersonEducationHistoryOrdersDataFind"
})
public class ArrayOfDPersonEducationHistoryOrdersDataFind {

    @XmlElement(nillable = true)
    protected List<DPersonEducationHistoryOrdersDataFind> dPersonEducationHistoryOrdersDataFind;

    /**
     * Gets the value of the dPersonEducationHistoryOrdersDataFind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonEducationHistoryOrdersDataFind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonEducationHistoryOrdersDataFind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonEducationHistoryOrdersDataFind }
     * 
     * 
     */
    public List<DPersonEducationHistoryOrdersDataFind> getDPersonEducationHistoryOrdersDataFind() {
        if (dPersonEducationHistoryOrdersDataFind == null) {
            dPersonEducationHistoryOrdersDataFind = new ArrayList<DPersonEducationHistoryOrdersDataFind>();
        }
        return this.dPersonEducationHistoryOrdersDataFind;
    }

}
