
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonEducationHistoryOrdersStatuses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonEducationHistoryOrdersStatuses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonEducationHistoryOrdersStatuses" type="{http://edboservice.ua/}dPersonEducationHistoryOrdersStatuses" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonEducationHistoryOrdersStatuses", propOrder = {
    "dPersonEducationHistoryOrdersStatuses"
})
public class ArrayOfDPersonEducationHistoryOrdersStatuses {

    @XmlElement(nillable = true)
    protected List<DPersonEducationHistoryOrdersStatuses> dPersonEducationHistoryOrdersStatuses;

    /**
     * Gets the value of the dPersonEducationHistoryOrdersStatuses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonEducationHistoryOrdersStatuses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonEducationHistoryOrdersStatuses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonEducationHistoryOrdersStatuses }
     * 
     * 
     */
    public List<DPersonEducationHistoryOrdersStatuses> getDPersonEducationHistoryOrdersStatuses() {
        if (dPersonEducationHistoryOrdersStatuses == null) {
            dPersonEducationHistoryOrdersStatuses = new ArrayList<DPersonEducationHistoryOrdersStatuses>();
        }
        return this.dPersonEducationHistoryOrdersStatuses;
    }

}
